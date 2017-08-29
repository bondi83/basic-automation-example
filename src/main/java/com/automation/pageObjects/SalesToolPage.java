package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesToolPage extends AbstractPage{

    @FindBy(xpath = "//input[contains(@name,'button-process-order-page')]")
    private WebElement closeTheDealButton;
    @FindBy(xpath = "//input[contains(@name,'paymentMethods')]")
    private WebElement paymentMethodsDrowDown;
    @FindBy(xpath = "//input[contains(@name,'currencies')]")
    private WebElement currenciesDrowDown;

    public SalesToolPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clicCloseTheDealButton(){
        closeTheDealButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setPaymentMethodsDrowDown(String selection)
    {
        Select dropdownLeadRecordTypeSelect = new Select(paymentMethodsDrowDown);
        dropdownLeadRecordTypeSelect.selectByVisibleText(selection);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setCurrenciesDrowDown(String selection)
    {
        Select dropdownLeadRecordTypeSelect = new Select(currenciesDrowDown);
        dropdownLeadRecordTypeSelect.selectByVisibleText(selection);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
