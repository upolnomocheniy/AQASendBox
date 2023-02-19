package org.com.TestFeature;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


@Getter
public class HomePage {

    private final SelenideElement statisticBlockHeader = $(byXpath("//div[@class='span-4']//div[@class='pull-left']/a[1]"));
    private final SelenideElement turnEnglishTranslateButton = $(byXpath("/html/body/div[4]/div[1]/div/nav/ul[1]/li[10]/a"));
    private final List<SelenideElement> subMenu = $$(byXpath("//ul[@class = 'submenu']/li[contains(@class, 'hld')]"));
    private final List<SelenideElement> menu = $$(byXpath("//ul[@class = 'menu']/li[contains(@class, 'hld')]/a"));

}
