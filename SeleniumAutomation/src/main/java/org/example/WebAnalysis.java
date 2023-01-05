package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    default List<String> collectTitles(List<String> links) {
        List<String> titles = new ArrayList<>();

        ChromeDriver driver = setUp(links.get(0));
        titles.add(driver.getTitle());

        for (int i = 1; i < links.size(); i++) {
            driver.switchTo().newWindow(WindowType.TAB).get(links.get(i));
            titles.add(driver.getTitle());
        }

        driver.quit();

        return titles;
    }

    default List<String> getBooksTitle(String url) {
        ChromeDriver driver = setUp(url);

        driver.findElement(By.xpath("//body[1]/main[1]/header[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();
        driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Ord.: Nume - descrescator')]")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> booksElements = driver.findElements(By.xpath("//h2//a"));
        List<String> booksTitle = booksElements.stream().map(WebElement::getText).collect(Collectors.toList());
        return booksTitle;
    }

    default boolean isOrdered(List<String> booksTitle) {
        List<String> booksTitleSorted = booksTitle.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("extract from website: ");
        System.out.println(booksTitle);

        System.out.println("manually ordered: ");
        System.out.println(booksTitleSorted);

        boolean flag = true;
        for (int i = 0; i < booksTitle.size(); i++) {
            if (!booksTitle.get(i).equals(booksTitleSorted.get(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
