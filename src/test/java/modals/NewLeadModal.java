package modals;

import dataModels.Lead;
import elements.Dropdown;
import elements.Input;
import elements.Textarea;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModals {

    public void fillForm(Lead lead)  {

        new Input(driver, "firstName").setValue(lead.getFirstName());
        new Input(driver, "lastName").setValue(lead.getLastName());
        new Input(driver, "Phone").setValue(lead.getPhone());
        new Input(driver, "Company").setValue(lead.getCompany());
        new Input(driver, "Email").setValue(lead.getEmail());
        new Input(driver, "Title").setValue(lead.getTitle());
        new Input(driver, "Website").setValue(lead.getWebsite());
        new Input(driver, "city").setValue(lead.getCity());
        new Input(driver, "province").setValue(lead.getState());
        new Input(driver, "postalCode").setValue(lead.getZipCode());
        new Input(driver, "country").setValue(lead.getCountry());
        new Input(driver, "NumberOfEmployees").setValue(lead.getEmployees());
        new Input(driver, "AnnualRevenue").setValue(lead.getAnnualRevenue());
        new Textarea(driver, "Street").setTextareaText(lead.getStreet());
        new Textarea(driver, "Description").setTextareaText(lead.getDescription());
        new Dropdown(driver, "Salutation").selectDropdownValue(String.valueOf(lead.getSalutation()));
        new Dropdown(driver, "Lead Status").selectDropdownValue(String.valueOf(lead.getLeadStatus()));
        new Dropdown(driver, "Rating").selectDropdownValue(String.valueOf(lead.getRating()));
        new Dropdown(driver, "Lead Source").selectDropdownValue(String.valueOf(lead.getLeadSource()));
        new Dropdown(driver, "Industry").selectDropdownValue(String.valueOf(lead.getIndustry()));
    }

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
}