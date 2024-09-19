package stepDefinitions;

import appPages.AdminModule;
import appPages.LoginPage;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminSuvarchala {
    AdminModule adminModule = new AdminModule(DriverManager.getDriver());
    LoginPage obj = new LoginPage(DriverManager.getDriver());
    @Given("user enters the login credentials and click on login button1")
        public void user_enters_the_login_credentials_and_click_on_login_button1() throws InterruptedException {
        DriverManager.getDriver().get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/login");
        obj.loginToBahmniApp("Superman","Admin123");
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click on the Admin module from the home page")
    public void user_click_on_the_admin_module_from_the_home_page() {
        adminModule.clickOnAdminModule();
    }
    @Then("user is on the admin module page")
    public void user_is_on_the_admin_module_page() {
        Assert.assertTrue(adminModule.csvUpload().isDisplayed());
    }
    @Then("user click on the {string}")
    public void user_click_on_the(String tabName) {
        adminModule.getElemntByLinkText(tabName).click();
    }

    @Then("user select file type as {string}")
    public void user_select_file_type(String fileType){
        adminModule.selectFile(fileType);
    }

    @Then(("user upload the csv file"))
    public void uploadFile(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        adminModule.uploadFile(DriverManager.getDriver().findElement(By.xpath("//input[@type='file']")));
    }

}

