package com.automation.uiTests;

import com.automation.pageObjects.GoogleResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTests extends AbstractUITest {

  @Test
  public void testItIsTheCorrectPage() {
    Assert.assertTrue(googleSearchPage.getCurrentPageTitle().equals("Google"));
  }

  @Test
  public void doingASimpleSearch() {
    GoogleResultsPage googleResultsPage = googleSearchPage.inputSearchText("test").clickSearch();
    Assert.assertTrue(googleResultsPage.getCurrentPageTitle().contains("test"));
  }

}
