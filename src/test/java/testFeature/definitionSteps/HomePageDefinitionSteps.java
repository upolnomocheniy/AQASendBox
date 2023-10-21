package testFeature.definitionSteps;

import testFeature.steps.HomePageSteps;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;

import java.util.List;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static org.assertj.core.api.Assertions.assertThat;


@AllArgsConstructor
public class HomePageDefinitionSteps {

    private final HomePageSteps homePageSteps;

    @Given("^User opens home page$")
    public void openHomePage() {
        homePageSteps.openPage();
    }

    @Then("^User can see header with '(.*)' text for statistic per day$")
    public void userCabSeeHeaderWithTextForStatisticsPerDat(String text) {
        assertThat(text)
                .as("Text isn't equal and need to check")
                .isEqualTo(homePageSteps.checkHeaderOfTheBlog(text.toLowerCase()));
    }

    @Then("^User check sub menu on the home page:$")
    public void userCheckSubMenuOnTheHomePage(List<String> subMenuElements) {
        assertThat(subMenuElements)
                .as("Sub Menu elements not the same and need to check")
                .containsExactlyInAnyOrderElementsOf(homePageSteps.getElementOfTheMainSubMenu());
    }

    @Then("^User click to the sub-menu button$")
    public void userClickToTheSubMenuButton() {
        homePageSteps.clickToTheSubMenuButton();
    }

    @Then("^User check menu on the home page:$")
    public void userCheckMenuOnTheHomePage(List<String> menuElements) {
        assertThat(menuElements)
                .as("Sub Menu elements not the same and need to check")
                .containsExactlyInAnyOrderElementsOf(homePageSteps.getElementOfTheMainMenu());
    }

    @Then("^User click to the change language button$")
    public void userClickToTheChangeLanguageButton() {
        homePageSteps.clickToTheChangeLanguageButton();
    }

    @Then("^User click En button for open English version$")
    public void userClickENButtonForOpenEnglishVersion() {
        homePageSteps.clickToTheEnglishTranslateButton();
    }

    @Then("^User check title the page is: '(.*)'$")
    public void userCheckTitleThePageIs(String titleName) {
        assertThat(titleName)
                .as("Title is not equal")
                .isEqualTo(homePageSteps.getPageTitle());
    }

    @After(value = "@ui")
    public void teaDownDriver() {
        closeWebDriver();
    }
}
