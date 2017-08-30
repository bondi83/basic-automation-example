package com.automation.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class SalesToolPage extends AbstractPage{

    @FindBy(xpath = "//input[contains(@name,'button-process-order-page')]")
    private WebElement closeTheDealButton;
    @FindBy(xpath = "//select[contains(@name,'paymentMethods')]")
    private WebElement paymentMethodsDrowDown;
    @FindBy(xpath = "//select[contains(@name,'currencies')]")
    private WebElement currenciesDrowDown;
    @FindBy(xpath = "//select[contains(@name,'plans')]")
    private WebElement frequencyDrowDown;
    @FindBy(xpath = "//input[contains(@name,'commandButtonShowAvailableProducts')]")
    private WebElement showProductsButton;
    @FindBy(xpath = "//select[contains(@name,'products')]")
    private WebElement productsDrowDown;
    @FindBy(xpath = "//select[contains(@name,'Discount')]")
    private WebElement discountsDrowDown;
    @FindBy(xpath = "//input[contains(@name,'input-quantity')]")
    private WebElement quantity;
    @FindBy(xpath = "//input[contains(@name,'AddProduct')]")
    private WebElement selectProductButton;
    @FindBy(xpath = "//input[contains(@name,'input-assign-license-to-buyer')]")
    private WebElement assingToBuyerCheck;
    @FindBy(xpath = "//td/b")
    private WebElement confirmationRatePlan;

    public SalesToolPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public String getConfirmationRatePlan(){
        return confirmationRatePlan.getText();
    }
    public void clicAssingToBuyer() {
        assingToBuyerCheck.click();
    }
    public void setQuantity(String _quantity){
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys(_quantity);
    }
    public void clicSelectProductButton(){
        selectProductButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicCloseTheDealButton(){
        closeTheDealButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickShowProductsButton(){
        showProductsButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectProduct(String selection)
    {
        Select dropdown = new Select(productsDrowDown);
        dropdown.selectByVisibleText(selection);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectDiscount()
    {
        Select dropdown = new Select(discountsDrowDown);
        int size =dropdown.getOptions().size();
        if (size>0) {
            dropdown.selectByIndex(size - 1);
            //dropdown.selectByVisibleText(selection);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void selectPaymentMethod(String selection)
    {
        Select dropdown = new Select(paymentMethodsDrowDown);
        dropdown.selectByVisibleText(selection);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectFrequency(String selection)
    {
        Select dropdown = new Select(frequencyDrowDown);
        dropdown.selectByVisibleText(selection);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectCurrency(String selection)
    {
        Select dropdownLeadRecordTypeSelect = new Select(currenciesDrowDown);
        dropdownLeadRecordTypeSelect.selectByVisibleText(selection);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
