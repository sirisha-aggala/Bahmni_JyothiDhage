package stepDefinitions;

import appPages.AdminModule;
import appPages.LoginPage;
import appPages.saitejapatientpage;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SrihanuStepDefinition {

    saitejapatientpage saitejapatientpage = new saitejapatientpage(DriverManager.getDriver());
    LoginPage  LoginPage = new LoginPage(DriverManager.getDriver());
    AdminModule adminModule = new AdminModule(DriverManager.getDriver());

    @Given("user launches the website")
    public void userlaunchesthewebsite() throws InterruptedException {
        DriverManager.getDriver().get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/login");
        Thread.sleep(3000);
        LoginPage.loginToBahmniApp("Superman","Admin123");
    }

    @And("user upload the file")
    public void useruploadthefile() throws InterruptedException {
        saitejapatientpage.uploadfn();
    }
}

