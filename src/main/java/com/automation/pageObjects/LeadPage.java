package com.automation.pageObjects;

import Helper.Personal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeadPage extends AbstractPage{

    @FindBy(xpath = "//input[@name ='name_lastlea2']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@name ='name_firstlea2']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name ='lea11']")
    private WebElement email;
    @FindBy(id = "lea8")
    private WebElement phone;
    @FindBy(id = "00Ni000000869KU")
    private WebElement phoneType;
    @FindBy(id = "00N3100000Fuzzn")
    private WebElement organizationDropDown;
    @FindBy(id = "lea3")
    private WebElement company;
    @FindBy(id = "00Ni0000002plvL")
    private WebElement countryOfResidenceDropDown;
    @FindBy(css = "#bottomButtonRow > input[name=\"save\"]")
    private WebElement saveButton;
    @FindBy(className = "topName")
    private WebElement leadNameTop;
    @FindBy(xpath = "//a[contains(@href,'/setup/own')]")
    private WebElement leadOwner;
    @FindBy(name = "sales_tool")
    private WebElement salesToolButton;

    public void clickSalesToolButton(){
        salesToolButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getLeadName(){
        return leadNameTop.getText();
    }
    public String getLeadOwner(){
        return leadOwner.getText();
    }

    public LeadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    Personal personal =new Personal();
    public void lastName() {
        lastName.sendKeys(personal.getAName());
        //return lastName;
    }
    public void firstName() {
        firstName.sendKeys(personal.getAName());
        //return firstName;
    }
    public void email() {
        email.sendKeys(personal.getAMail());
        //return email;
    }
    public void phone(String phoneNumer) {
        phone.sendKeys(phoneNumer);
        //return phone;
    }
    public void phoneType(String type){
        new Select(phoneType).selectByVisibleText(type);
    }
    public void company() {
        company.sendKeys(personal.getAName());
    }
    public void setOrganizationDropDown(String selection)
    {
        Select dropdownLeadRecordTypeSelect = new Select(organizationDropDown);
        dropdownLeadRecordTypeSelect.selectByVisibleText(selection);
    }
    public void setCountryOfResidenceDropDown(String selection)
    {
        Select dropdownLeadRecordTypeSelect = new Select(countryOfResidenceDropDown);
        dropdownLeadRecordTypeSelect.selectByVisibleText(selection);
    }
    public void clickSaveButton(){
        saveButton.click();
    }

}
