package org.com.utils.ui;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@UtilityClass
public class WaitUntil {

    public void waitForCondition (Function<WebDriver, ?> condition, long timeToWait, long timeForPolling) {
        new FluentWait<>(getWebDriver()).withTimeout(Duration.ofMillis(timeToWait))
                .pollingEvery(Duration.ofMillis(timeForPolling))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .until(condition);
    }
}
