package stepDefinitions;

import appPages.ProgramEnrolPage_Farhana;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class
ProgramEnrolStep {

    ProgramEnrolPage_Farhana ProgramPage = new ProgramEnrolPage_Farhana(DriverManager.getDriver());

    @Given("Go to the program management page on the patient dashboard")
    public void go_to_the_program_management_page_on_the_patient_dashboard() {

        ProgramPage.clickonProgram();
    }

    @When("User enrol for a program")
    public void user_enrol_for_a_program() throws InterruptedException {

        ProgramPage.enrolprogram();


    }
}
