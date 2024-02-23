package stepDefinitions;

import appPages.Clinical;
import appPages.RegistrationPage;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClinicalStepDefinition
{
    Clinical clinical = new Clinical (DriverManager.getDriver());


    @Then("User is on Bahmani dashboard")
    public void user_is_on_bahmani_dashboard()
    {
        Assert.assertTrue(clinical.Clinical().isDisplayed());
    }
    @Then("User click on Clinical feature")
    public void user_click_on_clinical_feature()
    {
           clinical.clickonclinicalfeature();
    }
    @Then("User enter Patient name {string}")
    public void user_enter_patient_name(String Patientname)
    {
        clinical.Patientidentifier(Patientname);
    }

    @Then("Click on Patients name")
    public void click_on_patients_name() throws InterruptedException {
         clinical.ClickonPatientname();
    }
    @Then("User should able to see patient details")
    public void user_should_able_to_see_patient_details()
    {
        Assert.assertTrue(clinical.CheckConsultation().isDisplayed());
    }
    @Then("User click on Consultation button")
    public void user_click_on_consultation_button()
    {
          clinical.ClickonConsultation();
    }
    @Then("User should see Consultation page")
    public void user_should_see_consultation_page()
    {
        Assert.assertTrue(clinical.CheckMedicationDis().isDisplayed());
    }
    @Then("User clicks on Medication tab")
    public void user_clicks_on_medication_tab() throws InterruptedException {
           clinical.ClickonMedication();
    }
    @Then("User Should able to see Medication details of patient on Medication page")
    public void user_should_able_to_see_medication_details_of_patient_on_medication_page() throws InterruptedException {
         Assert.assertTrue(clinical.CheckPatientHistory().isDisplayed());
    }
    @Then("User enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void user_enter_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
        clinical.OrderDrugForm(string,string2,string3,string4,string5,string6,string7,string8);
    }

    @Then("User clicks on Accept button")
    public void user_clicks_on_accept_button() throws InterruptedException {
           clinical.ClickAcceptButton();
    }
    @Then("User clicks on Add button")
    public void user_clicks_on_add_button() throws InterruptedException {
        clinical.ClickAddButton();
    }

    @Then("User clicks on Save button")
    public void user_clicks_on_save_button()
    {
         clinical.ClickonSaveButton();
    }





    @Then("User clicks on Order tab")
    public void user_clicks_on_order_tab() throws InterruptedException
    {
          clinical.ClickonOrderTab();
    }
    @Then("User is able to see all types of tests")
    public void user_is_able_to_see_all_types_of_tests() throws InterruptedException {
         Assert.assertTrue(clinical.ClickonBloodTab().isDisplayed());
    }
    @Then("User clicks on Serum tab")
    public void user_clicks_on_serum_tab()
    {
         clinical.ClickonSerumTab();
    }
    @Then("User selects Basic Serology from Panel")
    public void user_selects_basic_serology_from_panel()
    {
        clinical.ClickOnSerology();
    }
    @Then("User selects Liver Function from panel")
    public void user_selects_liver_function_from_panel()
    {
         clinical.ClickonLiver();
    }
    @Then("User selects B HCG from Lab tests")
    public void user_selects_b_hcg_from_lab_tests()
    {
         clinical.ClickonBHCG();
    }
    @Then("User selects Calcium from Lab tests")
    public void user_selects_calcium_from_lab_tests() throws InterruptedException {
         clinical.Clickonalcium();
    }

    @Then("User scrolls down")
    public void user_scrolls_down() throws InterruptedException
    {
        clinical.Scroll();
    }
    @Then("User clicks on Radiology")
    public void user_clicks_on_radiology() throws InterruptedException
    {
        clinical.SelectRadiology();
    }
    @Then("User selects Chest View x-ray")
    public void user_selects_chest_view_x_ray()
    {
          clinical.SelectXray();
    }

    @Then("User clicks on Save Btn")
    public void user_clicks_on_Save_Btn()
    {
        clinical.ClickonSave();
    }



}

