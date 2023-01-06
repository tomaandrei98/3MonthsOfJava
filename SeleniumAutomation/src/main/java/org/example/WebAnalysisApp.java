package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class WebAnalysisApp implements WebAnalysis{
    public void analysisApp(String url) {
        ChromeDriver driver = setUp(url);

        List<String> anchorsText = getAnchorsText(getAnchorsElements(driver));
        System.out.println("In this page, we've found " + getNumberOfAnchors(anchorsText) + " anchor tags!\n");
        System.out.println(anchorsText + "\n");

        long numberOfAnchorTagsWithoutHrefAttribute = getNumberOfAnchorTagsWithoutHrefAttribute(getAnchorsElements(driver));
        System.out.println("There are " + numberOfAnchorTagsWithoutHrefAttribute + " broken links (doesn't contain href attribute)");

        driver.quit();
    }

    public void printTitlesApp(List<String> links) {
        List<String> titles = collectTitles(links);
        System.out.println(titles);
    }

    public void printBooksTitleInReverseOrder(String url) {
        List<String> booksTitle = getBooksTitle(url);
        String result = (isOrdered(booksTitle)) ? "Titles are ordered!" : "Error";
        System.out.println(result);
    }

    public void printTableWithBooksAndPrices(String url) {
        ChromeDriver driver = setUp(url);
        driver.manage().window().maximize();

        List<WebElement> titleElements = getTitleElements(driver);
        List<WebElement> priceElements = getPriceElements(driver);

        Map<String, String> productsMap = getMapWithTitleAndPrices(titleElements, priceElements);

        productsMap.forEach((t, p) -> System.out.printf("%-100s | %-10s\n", t, p));

        driver.quit();
    }

}
