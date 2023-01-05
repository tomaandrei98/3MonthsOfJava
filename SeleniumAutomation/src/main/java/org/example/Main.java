// Ex. 1
// 1. Find the number of links in the page
// 2. Print the text for all the links
// 3. Check how many links does not have the "href" attribute and mark them as "broken links"

// Ex. 2
// 1. Open the browser and open more tabs
// 2. Collect the titles of the pages and print them out

// Ex. 3
// 1. Open an online library in the browser
// 2. Enter in books section and sort the books by name in descendant order
// 3. Collect the names of books and verify if it's sorted

// Ex. 4
// 1. Open an online library in the browser
// 2. Collect the titles and prices in a map


package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new WebAnalysisApp().analysisApp("https://open.spotify.com/");

        List<String> links = new ArrayList<>(List.of("https://www.facebook.com", "https://www.google.com", "https://www.amazon.com"));
        new WebAnalysisApp().printTitlesApp(links);

        new WebAnalysisApp().printBooksTitleInReverseOrder("https://librariaeminescu.ro/");

        new WebAnalysisApp().printTableWithBooksAndPrices("https://librariaeminescu.ro/");
    }
}