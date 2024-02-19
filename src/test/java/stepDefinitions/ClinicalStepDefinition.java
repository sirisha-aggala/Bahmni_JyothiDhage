package stepDefinitions;

import appPages.Clinical;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClinicalStepDefinition
{

   Clinical clinicalmodule=new Clinical(DriverManager.getDriver());
    @Given("User is on Bahmani dashboard")
    public void user_is_on_bahmani_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }
    @When("User click on Clinical feature")
    public void user_click_on_clinical_feature()
    {
        clinicalmodule.clinical_tab();
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enter Patient search page")
    public void user_enter_patient_search_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click on Patients name")
    public void click_on_patients_name()
    {

        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be able to login and enter Patients valid nameID and see hisher treatment history details")
    public void user_should_be_able_to_login_and_enter_patients_valid_name_id_and_see_hisher_treatment_history_details()
    {   clinicalmodule.Patientfindertextfield();
        throw new io.cucumber.java.PendingException();
    }






}

