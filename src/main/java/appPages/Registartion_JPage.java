package appPages;

import drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Registartion_JPage {
            //@FindBy  replacement of driver.findElement method
        public  WebDriver driver;
        @FindBy(xpath = "//a[@id='bahmni.registration']")  WebElement registraionButton;
        @FindBy(id="registrationNumber") WebElement emailField;

        public Registartion_JPage(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }

        public void clickOnRegitrationLink(){
            registraionButton.click();
        }

        public void verifyRegrationPageOpened(){
            Assert.assertTrue(emailField.isDisplayed());
        }
}
