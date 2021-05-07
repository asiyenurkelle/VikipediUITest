package com.vikipedia;

import com.vikipedia.pages.SearchPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTest{
    @Test
    public void shouldSearch() {
        String keyword = "Telefon";
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage = searchPage.search(keyword);

        String resultText = searchPage.getResultText();
        assertEquals(resultText, keyword);
    }
}
