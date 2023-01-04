// Ex. 1
// 1. Find the number of links in the page
// 2. Print the text for all the links
// 3. Check how many links does not have the "href" attribute and mark them as "broken links"

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //setting up the environment
        ChromeDriver driver = setUp("https://demowebshop.tricentis.com/");

        //finding the anchor tags by tagName and mapping the WebElements into String by text and counting them
        List<String> anchorsText = getAnchorsText(getAnchorsElements(driver));
        long numberOfAnchors = getNumberOfAnchors(anchorsText);
        System.out.println("In this page, we've found " + numberOfAnchors + " anchor tags!\n");
        System.out.println(anchorsText + "\n");

        //checking if the links contains "href"
        long numberOfAnchorTagsWithoutHrefAttribute = getNumberOfAnchorTagsWithoutHrefAttribute(getAnchorsElements(driver));
        System.out.println("There are " + numberOfAnchorTagsWithoutHrefAttribute + " broken links (doesn't contain href attribute)");

        //closing the chrome driver
        driver.quit();
    }


    private static ChromeDriver setUp(String url) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    private static List<WebElement> getAnchorsElements(ChromeDriver driver) {
        List<WebElement> anchorsElements = driver.findElements(By.tagName("a"));
        return anchorsElements;
    }
    private static List<String> getAnchorsText(List<WebElement> anchorsElements) {
        //finding the anchor tags by tagName and mapping the WebElements into String by text and counting them
        List<String> anchorsText = anchorsElements.stream()
                .map(webElement -> webElement.getText().replace("\n", ""))
                .toList();
        return anchorsText;
    }

    private static long getNumberOfAnchors(List<String> anchorsText) {
        return anchorsText.size();
    }

    private static long getNumberOfAnchorTagsWithoutHrefAttribute(List<WebElement> anchorsElements) {
        long result = anchorsElements.stream().filter(element -> element.getAttribute("href") == null).count();
        return result;
    }
}