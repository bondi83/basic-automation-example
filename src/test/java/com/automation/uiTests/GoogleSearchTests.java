package com.automation.uiTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTests extends AbstractUITest {

  @Test
  public void testItIsTheCorrectPage() {
    Assert.assertTrue(googleSearchPage.getCurrentPageTitle().equals("Google"));
  }

  @Test
  public void doingASimpleSearch() {
    googleSearchPage.inputSearchText("test");
    googleSearchPage.clickSearch();
    Assert.assertTrue(googleSearchPage.getCurrentPageTitle().contains("test"));
  }

  @Test
  public void doingAComplexSearch() {
    googleSearchPage.inputSearchText("mulesoft").submit();
    Assert.assertTrue(googleSearchPage.getCurrentPageTitle().contains("mulesoft"));
    googleSearchPage.getLink().click();
    Assert.assertTrue(googleSearchPage.getCurrentURL().contains("careers"));
  }

}
