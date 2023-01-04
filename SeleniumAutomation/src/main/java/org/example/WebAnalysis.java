package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public interface WebAnalysis {
    default ChromeDriver setUp(String url) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    default List<WebElement> getAnchorsElements(ChromeDriver driver) {
        return driver.findElements(By.tagName("a"));
    }

    default List<String> getAnchorsText(List<WebElement> anchorsElements) {
        //finding the anchor tags by tagName and mapping the WebElements into String by text and counting them
        return anchorsElements.stream()
                .map(webElement -> webElement.getText().replace("\n", ""))
                .toList();
    }

    default long getNumberOfAnchors(List<String> anchorsText) {
        return anchorsText.size();
    }

    default long getNumberOfAnchorTagsWithoutHrefAttribute(List<WebElement> anchorsElements) {
        return anchorsElements.stream().filter(element -> element.getAttribute("href") == null).count();
    }
}
