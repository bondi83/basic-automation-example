package com.automation.SF2;

import Helper.Credentials;
import com.automation.pageObjects.SalesToolPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SalesforcePurchaseTest extends AbstractUITest{
    private static final String LEAD_RECORD_TYPE_B2B = "B2B Company";
    private static final String LEAD_RECORD_TYPE_STUDENT = "Student";
    private static final String PHONE_NUMBER="8456561";
    private static final String PHONE_TYPE_MOBILE="Mobile";
    private static final String PHONE_TYPE_MHOME="HOME";
    private static final String LEAD_OWNER_SALES_LEADS_LAT_PEOPLE="Sales Leads LAT People";
    private static final String PAYMENT_METHOD_CREDIT_CARD="Credit Card";
    private static final String CURRENCY_UDS="USD";


    @Test
    public void createNewOELead() {
        salesforcePage.username(Credentials.getUsername());
        salesforcePage.password(Credentials.getPassword()).submit();
        salesforcePage.clickLeads();
        salesforcePage.newLeadButton().click();
        salesforcePage.selectLeadRecordType(LEAD_RECORD_TYPE_STUDENT);
        salesforcePage.newLeadContinueButton().click();
        Assert.assertTrue(salesforcePage.getCurrentPageTitle().contains("Lead Edit"));
        leadFormPage.firstName();
        leadFormPage.lastName();
        leadFormPage.email();
        leadFormPage.phone(PHONE_NUMBER);
        leadFormPage.phoneType(PHONE_TYPE_MOBILE);
        leadFormPage.setOrganizationDropDown(OPEN_ENGLISH);
        leadFormPage.company();
        leadFormPage.setCountryOfResidenceDropDown(PAIS_CHILE);
        leadFormPage.clickSaveButton();
        Assert.assertEquals(leadPage.getLeadName(),leadFormPage.personal.getAName()+" "+leadFormPage.personal.getAName());
        Assert.assertEquals(leadPage.getLeadOwner(),LEAD_OWNER_SALES_LEADS_LAT_PEOPLE);

    }
    @Test
    public void makeTheSale(){
        createNewOELead();
        leadPage.clickSalesToolButton();
        leadPage.focusNewTab();
        Assert.assertTrue(salesToolPage.getCurrentURL().contains("SalesToolLead"));
        salesToolPage.clicCloseTheDealButton();
        salesToolPage.setPaymentMethodsDrowDown(PAYMENT_METHOD_CREDIT_CARD);
        salesToolPage.setCurrenciesDrowDown(CURRENCY_UDS);

    }
}
