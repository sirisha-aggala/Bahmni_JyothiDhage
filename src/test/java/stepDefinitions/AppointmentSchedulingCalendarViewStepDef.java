package stepDefinitions;

import appPages.LoginPage;
import appPages.ManageAppointmentsPage;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppointmentSchedulingCalendarViewStepDef {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver());
    ManageAppointmentsPage manageAppointmentsPage = new ManageAppointmentsPage(DriverManager.getDriver());

    @Given("on the Home page the user clicks on the Appointment Scheduling button")
    public void onTheHomePageTheUserClicksOnTheButton() {
        manageAppointmentsPage.assertHomePageElements();
        manageAppointmentsPage.clickOnAppointmentSchedulingButton();
    }

    @Given("user navigates to the Manage Appointments page")
    public void user_navigates_to_the_page() {
        manageAppointmentsPage.verifyHomeManagePageElements();
    }

    @When("the user clicks on Appointments List")
    public void the_user_clicks_on() {
        manageAppointmentsPage.clickOnAppointmentsListButton();
    }

    @When("user clicks on the week button")
    public void user_clicks_on_the_week_button() {
        manageAppointmentsPage.clickOnWeekButton(); // Call the method directly
    }

    @Then("the calendar should display the appointments for the current week")
    public void the_calendar_should_display_the_appointments_for_the_current_week() {
        manageAppointmentsPage.assertCalendarView();
        manageAppointmentsPage.verifyCurrentWeeklyDate();
    }
}
