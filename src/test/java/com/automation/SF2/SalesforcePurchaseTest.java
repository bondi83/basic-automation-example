package com.automation.SF2;

import Helper.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SalesforcePurchaseTest extends AbstractUITest{
    private static final String LEAD_RECORD_TYPE_B2B = "B2B Company";
    private static final String LEAD_RECORD_TYPE_STUDENT = "Student";

    @Test
    public void logInToSalesforceSTGInstance() {
        salesforcePage.username(Credentials.getUsername());
        salesforcePage.password(Credentials.getPassword()).submit();
        Assert.assertTrue(salesforcePage.getCurrentURL().contains("cs60"));
    }
    @Test
    public void salesforceLeadsTab() {
        salesforcePage.username(Credentials.getUsername());
        salesforcePage.password(Credentials.getPassword()).submit();
        salesforcePage.clickLeads();
        Assert.assertTrue(salesforcePage.getCurrentPageTitle().contains("Leads"));
    }
    @Test
    public void createNewLead() {
        salesforcePage.username(Credentials.getUsername());
        salesforcePage.password(Credentials.getPassword()).submit();
        salesforcePage.clickLeads();
        salesforcePage.newLeadButton().click();
        salesforcePage.selectLeadRecordType(LEAD_RECORD_TYPE_B2B);
        salesforcePage.newLeadContinueButton().click();
        salesforcePage.leadFirstName();
        salesforcePage.leadLastName();
        salesforcePage.leadEmail();


        Assert.assertTrue(salesforcePage.getCurrentPageTitle().contains("Lead Edit"));
    }
}
