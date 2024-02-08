package stepDefinitions;

import appPages.HomePage;
import appPages.RegistrationPage;
import drivers.DriverManager;

public class AdminCSVUploadStepDefinition {
	 HomePage homepage =new HomePage(DriverManager.getDriver());
	 RegistrationPage registrationPage = new RegistrationPage(DriverManager.getDriver());
}
