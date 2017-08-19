package com.automation.uiTests;

import com.automation.pageObjects.GoogleSearchPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class AbstractUITest {

  private static final String GOOGLE_SEARCH_PAGE_URL = "https://www.google.com/";

  GoogleSearchPage googleSearchPage;
  private WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void beforeMethodSetUp() {
    System
        .setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    this.initialize();
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethodTearDown() {
    driver.quit();
  }

  private void initialize() {
    driver.get(GOOGLE_SEARCH_PAGE_URL);
    googleSearchPage = new GoogleSearchPage(driver);
  }
}
