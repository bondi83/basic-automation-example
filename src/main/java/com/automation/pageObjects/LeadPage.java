package com.automation.pageObjects;

import Helper.General;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeadPage extends AbstractPage{


    //leadform
    @FindBy(xpath = "//input[@name ='name_lastlea2']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@name ='name_firstlea2']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name ='lea11']")
    private WebElement email;
    @FindBy(xpath = "//input[@name ='lea8']")
    private WebElement phone;
    @FindBy(id = "00N3100000Fuzzn")
    private WebElement organizationDropDown;
    @FindBy(xpath = "//input[@name ='lea3']")
    private WebElement company;
    @FindBy(id = "00Ni0000002plvL")
    private WebElement countryOfResidenceDropDown;
    @FindBy(xpath = "//input[@value =' Save']")
    private WebElement saveButton;

    public LeadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    General g =new General();
    public void lastName() {
        lastName.sendKeys(g.getAName());
        //return lastName;
    }
    public void firstName() {
        firstName.sendKeys(g.getAName());
        //return firstName;
    }
    public void email() {
        email.sendKeys(g.getAMail());
        //return email;
    }
    public void phone() {
        phone.sendKeys(g.getPhone());
        //return phone;
    }
    public void company() {
        company.sendKeys(g.getAName());
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
