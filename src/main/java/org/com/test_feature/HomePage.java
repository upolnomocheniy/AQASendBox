package org.com.test_feature;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


@Getter
public class HomePage {

    private final SelenideElement statisticBlockHeader = $(byXpath("//div[contains(@class, 'item-lw')][1]"));
    private final SelenideElement menuButton = $(".menu-show");
    private final SelenideElement changeLanguageButton = $(".languages");
    private final SelenideElement turnEnglishTranslateButton = $(byXpath("//div[contains(@class, 'languages-change')]/div[2]/a"));
    private final List<SelenideElement> subMenu = $$(byXpath("//div[contains(@class, 'menu-rubric')]//li"));
    private final List<SelenideElement> menu = $$(byXpath("//a[@class = 'header_rubric__link']"));
}
