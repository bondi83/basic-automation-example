package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends AbstractPage {

  @FindBy(name = "q")
  private WebElement searchTextBar;
  @FindBy(name = "btnK")
  private WebElement searchButton;
  @FindBy(name = "btnI")
  private WebElement feelingLuckyButton;

  public GoogleSearchPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }

  public WebElement getSearchTextBar() {
    return searchTextBar;
  }

  public GoogleSearchPage inputSearchText(String searchQuery) {
    searchTextBar.sendKeys(searchQuery);
    return this;
  }

  public WebElement getSearchButton() {
    return searchButton;
  }

  public GoogleResultsPage clickSearch() {
    searchButton.click();
    return new GoogleResultsPage(driver);
  }

  public WebElement getFeelingLuckyButton() {
    return feelingLuckyButton;
  }

  public GoogleResultsPage feelingLucky() {
    feelingLuckyButton.click();
    return new GoogleResultsPage(driver);
  }
}
