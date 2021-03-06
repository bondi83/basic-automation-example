package com.automation.SF2;

import Helper.Products;
import com.automation.pageObjects.LeadFormPage;
import com.automation.pageObjects.LeadPage;
import com.automation.pageObjects.SalesToolPage;
import com.automation.pageObjects.SalesforcePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

abstract public class AbstractUITest  {

   private static final String TEST_SALESFORCE = "https://test.salesforce.com/";
   public static final String OPEN_ENGLISH="Open English";
   public static final String OPEN_ENGLISH_JR="Open English Junior";
   public static final String NEXTU="NextU";
   public static final String COUNTRY_CHILE="Chile";
  public static final String COUNTRY_ARGENTINA="Argentina";
  public static final String COUNTRY_BRL="Brazil";
  public static final String COUNTRY_USA="USA";

  SalesforcePage salesforcePage;
  LeadFormPage leadFormPage;
  SalesToolPage salesToolPage;
  LeadPage leadPage;
  private WebDriver driver;
  public Products products;

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
    leadFormPage=new LeadFormPage(driver);
    leadPage=new LeadPage(driver);
    salesToolPage=new SalesToolPage(driver);
    products=new Products();
  }
}
