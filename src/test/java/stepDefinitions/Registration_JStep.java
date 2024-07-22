package stepDefinitions;

import appPages.Registartion_JPage;
import drivers.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_JStep {

    public Registartion_JPage page;
    @When("user click on registration button")
    public void user_click_on_registration_button() {
        page = new Registartion_JPage(DriverManager.getDriver());
        page.clickOnRegitrationLink();
    }
    @Then("user can see the regstartion page")
    public void user_can_see_the_regstartion_page() {
        page.verifyRegrationPageOpened();
    }

}
