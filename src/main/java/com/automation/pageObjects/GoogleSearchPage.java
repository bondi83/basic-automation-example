package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchPage extends AbstractPage {

  @FindBy(name = "q")
  private WebElement searchTextBar;
  @FindBy(name = "btnK")
  private WebElement searchButton;
  @FindBy(name = "btnI")
  private WebElement feelingLuckyButton;
  @FindBy(partialLinkText = "Careers")
  private List<WebElement> links;

  public GoogleSearchPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }

  public WebElement getSearchTextBar() {
    return searchTextBar;
  }

  public WebElement inputSearchText(String searchQuery) {
    searchTextBar.sendKeys(searchQuery);
    return searchTextBar;
  }

  public WebElement getSearchButton() {
    return searchButton;
  }

  public GoogleSearchPage clickSearch() {
    searchButton.click();
    return this;//new GoogleResultsPage(driver);
  }

  public WebElement getLink() {
    return links.get(0);
  }

  public WebElement getFeelingLuckyButton() {
    return feelingLuckyButton;
  }

  public GoogleResultsPage feelingLucky() {
    feelingLuckyButton.click();
    return new GoogleResultsPage(driver);
  }
}
