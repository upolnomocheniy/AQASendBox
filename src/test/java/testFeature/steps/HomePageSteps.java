package testFeature.steps;

import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.com.test_feature.HomePage;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static java.time.Duration.ofSeconds;
import static java.util.stream.Collectors.toList;
import static org.com.utils.ui.WaitUntil.waitForCondition;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@AllArgsConstructor
@Getter
public class HomePageSteps {

    public final String homeUrl = "https://gordonua.com/ukr/";
    private final HomePage homePage;

    public void openPage() {
        open(homeUrl);
    }

    public String checkHeaderOfTheBlog(String text) {
        return homePage.getStatisticBlockHeader().shouldHave(text(text), ofSeconds(10)).getText().toLowerCase();
    }

    public List<String> getElementOfTheMainSubMenu() {
        return homePage.getSubMenu().stream()
                .map(SelenideElement::getText)
                .map(String::toLowerCase)
                .collect(toList());
    }

    public void clickToTheSubMenuButton() {
        homePage.getMenuButton().click();
    }

    public void clickToTheChangeLanguageButton() {
        homePage.getChangeLanguageButton().click();
    }


    public List<String> getElementOfTheMainMenu() {
        return homePage.getMenu().stream()
                .map(text -> text.shouldBe(visible).getText())
                .map(String::toLowerCase)
                .collect(toList());
    }

    public void clickToTheEnglishTranslateButton() {
        waitForCondition(visibilityOf(homePage.getTurnEnglishTranslateButton()), 30000, 100);
        homePage.getTurnEnglishTranslateButton().shouldBe(visible).click();
    }

    public String getPageTitle() {
        return title();
    }
}
