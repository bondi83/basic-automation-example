package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesforcePage extends AbstractPage{

    @FindBy(name = "username")
    private WebElement username;
    @FindBy(name = "pw")
    private WebElement password;
    @FindBy(linkText = "Leads")
    private WebElement leadsTab;
    @FindBy(name = "new")
    private WebElement newLeadButton;
    /*@FindBys({
            @FindBy(className = "btn"),
            @FindBy(name = "save")
    })*/
    @FindBy(xpath = "//*[@value='Continue']")
    private WebElement newLeadContinueButton;
    @FindBy(name = "p3")
    private WebElement leadRecordTypeSelect;

        public SalesforcePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement username(String searchQuery) {
        username.sendKeys(searchQuery);
        return username;
    }
    public WebElement password(String searchQuery) {
        password.sendKeys(searchQuery);
        return password;
    }
    public SalesforcePage clickLeads() {
        leadsTab.click();
        return this;//new GoogleResultsPage(driver);
    }
    public WebElement newLeadButton() {return newLeadButton;}
    public WebElement newLeadContinueButton() {return newLeadContinueButton;}
    public WebElement leadRecordTypeSelect() {return leadRecordTypeSelect;}

    public void selectLeadRecordType(String rType){
        Select dropdownLeadRecordTypeSelect = new Select(leadRecordTypeSelect);
        dropdownLeadRecordTypeSelect.selectByVisibleText(rType);
        //dropdownLeadRecordTypeSelect.selectByIndex(1);
        //dropdownLeadRecordTypeSelect.selectByValue("prog");
    }

}
