package com.automation.SF2;

import com.automation.pageObjects.SalesforcePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

abstract public class AbstractUITest  {

   private static final String TEST_SALESFORCE = "https://test.salesforce.com/";

  SalesforcePage salesforcePage;
  private WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void beforeMethodSetUp() {
    System
        .setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    this.initialize(TEST_SALESFORCE);
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethodTearDown() {
    driver.quit();
  }

  private void initialize(String URL) {
    driver.get(URL);
    salesforcePage = new SalesforcePage(driver);
  }
}
