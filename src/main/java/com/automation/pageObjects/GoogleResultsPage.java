package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPage extends AbstractPage {

  GoogleResultsPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }

}
