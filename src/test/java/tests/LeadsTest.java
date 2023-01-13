package tests;

import dataModels.Lead;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeadsTest extends BaseTest {

    @Test
    public void LeadsTest() {
        loginPage.setUsername(BASE_USERNAME);
        loginPage.setPassword(BASE_PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserIconIsDisplayed();
        homePage.openLeadsTab();
        leadsPage.clickNewButton();
        Lead testLead = new Lead.LeadBuilder().setFirstName("Maksim").setLastName("Max").setCompany("QA22").setPhone("1234567")
                .setLeadStatus("Contacted").setSalutation("Mr.").setRating("Hot").setIndustry("Agriculture")
                .setLeadSource("Advertisement").setEmail("qwe@Gmail.com").setDescription("qwe").setWebsite("qwe.com")
                .setCity("Minsk").setState("Minsk").setZipCode("12345").setCountry("Belarus").setEmployees("1")
                .setAnnualRevenue("$1,000").setStreet("Qwer").build();
        newLeadModal.fillForm(testLead);
        baseModals.clickSaveButton();

        Assert.assertEquals(leadsDetailsPage.getLeadDetails(), testLead);
    }
}