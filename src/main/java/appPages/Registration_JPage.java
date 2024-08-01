package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Registration_JPage {
            //@FindBy  replacement of driver.findElement method
        public  WebDriver driver;
        @FindBy(xpath = "//a[@id='bahmni.registration']")  WebElement registrationButton;
        @FindBy(id="registrationNumber") WebElement enterIdField;
        @FindBy(xpath = "//header/ul[1]/a[1]/i[1]")   private WebElement regPageHomeIcon;


        public Registration_JPage(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }

        public void clickOnRegistrationLink(){
            registrationButton.click();
        }

        public void verifyRegistrationPageOpened(){
            Assert.assertTrue(enterIdField.isDisplayed());
        }

        public void clickOnRegPageHomeIcon(){ regPageHomeIcon.click(); }
}
