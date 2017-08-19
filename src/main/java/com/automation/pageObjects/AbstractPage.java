package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

  WebDriver driver;

  public String getCurrentPageTitle() {
    return driver.getTitle();
  }

}
