package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebAnalysisApp implements WebAnalysis{
    public void analysisApp(String url) {
        //setting up the environment
        ChromeDriver driver = setUp(url);

        //finding the anchor tags by tagName and mapping the WebElements into String by text and counting them
        List<String> anchorsText = getAnchorsText(getAnchorsElements(driver));
        System.out.println("In this page, we've found " + getNumberOfAnchors(anchorsText) + " anchor tags!\n");
        System.out.println(anchorsText + "\n");

        //checking if the links contains "href"
        long numberOfAnchorTagsWithoutHrefAttribute = getNumberOfAnchorTagsWithoutHrefAttribute(getAnchorsElements(driver));
        System.out.println("There are " + numberOfAnchorTagsWithoutHrefAttribute + " broken links (doesn't contain href attribute)");

        //closing the chrome driver
        driver.quit();
    }

    public void printTitlesApp(List<String> links) {
        List<String> titles = collectTitles(links);
        System.out.println(titles);
    }

    public void printBooksTitleInReverseOrder(String url) {
        List<String> booksTitle = getBooksTitle(url);
        boolean isOrdered = isOrdered(booksTitle);
        if (isOrdered) {
            System.out.println("Titles are ordered!");
        } else {
            System.out.println("Error");
        }
    }

}
