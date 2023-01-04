package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebAnalysisApp implements WebAnalysis{
    public void startApp() {
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
}
