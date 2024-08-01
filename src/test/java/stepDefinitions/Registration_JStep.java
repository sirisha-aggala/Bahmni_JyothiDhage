package stepDefinitions;


import appPages.Registration_JPage;
import drivers.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_JStep {

    public Registration_JPage page;
    @When("user click on registration button")
    public void user_click_on_registration_button() {
        page = new Registration_JPage(DriverManager.getDriver());
        page.clickOnRegistrationLink();
    }
    @Then("user can see the registration page")
    public void user_can_see_the_registration_page() {
        page.verifyRegistrationPageOpened();
    }

}
