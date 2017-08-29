package com.automation.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;


public class AbstractPage {


  WebDriver driver;


  public String getCurrentPageTitle() {
    return driver.getTitle();
  }
  public String getCurrentURL() {return driver.getCurrentUrl();}

  public void focusNewTab(){
    Set<String> handles = driver.getWindowHandles();
    String currentHandle = driver.getWindowHandle();
    for (String handle : handles) {

      if (!handle .equals(currentHandle))
      {
        driver.switchTo().window(handle);
      }
    }
  }
}
