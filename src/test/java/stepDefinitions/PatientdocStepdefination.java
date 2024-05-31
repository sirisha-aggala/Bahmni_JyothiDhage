package stepDefinitions;
import appPages.Patientdocumentpage;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PatientdocStepdefination {

Patientdocumentpage patientdocumentpage = new Patientdocumentpage(DriverManager.getDriver());
    @Given("verified user clicks on the Patient Documents button")
    public void verified_user_clicks_on_the_patient_documents_button() {
        patientdocumentpage.clickonPatientDocumentssbutton();

    }
    @When("select the patient")
    public void select_the_patient() {
        patientdocumentpage.clickPatientNamebutton();
        }

//    @Then("select visit")
//    public void select_visit() {
//        patientdocumentpage.visitdropdownbutton();
//        }
//    @Then("select typedropdown")
//    public void select_typedropdown() {
//        patientdocumentpage.visitdropdownbutton();
//    }
//     @Then("visitdate")
//    public void visit_date() {
//        patientdocumentpage.visitdate();
//    }
//
//    @Then("visit enddate")
//    public void visit_enddate() {
//        patientdocumentpage.visitenddate();
//    }
//    @Then("user uploads the documents by clicking on scan button")
//    public void user_uploads_the_documents_by_clicking_on_scan_button() {
//        patientdocumentpage.clickscanbutton();
//    }

}
