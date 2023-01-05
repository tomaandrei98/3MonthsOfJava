// Ex. 1
// 1. Find the number of links in the page
// 2. Print the text for all the links
// 3. Check how many links does not have the "href" attribute and mark them as "broken links"

// Ex. 2
// 1. Open the browser and open more tabs
// 2. Collect the titles of the pages and print them out

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new WebAnalysisApp().analysisApp("https://open.spotify.com/");

        List<String> links = new ArrayList<>(List.of("https://www.facebook.com", "https://www.google.com", "https://www.amazon.com"));
        new WebAnalysisApp().printTitlesApp(links);

    }
}