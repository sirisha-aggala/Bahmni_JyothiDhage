package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProgramsPage extends BaseAction {
            //@FindBy  replacement of driver.findElement method
        public  WebDriver driver;
        @FindBy(xpath = "//a[@id = 'bahmni.programs']")    private WebElement programsButton;
        @FindBy(id ="patientIdentifier") WebElement enterPatientNameField;
        @FindBy(xpath = "//a[@class ='back-btn']")   private WebElement programsPageHomeIcon;


        public ProgramsPage(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }

        public void clickOnProgramsLink() throws InterruptedException { programsButton.click();
            Thread.sleep(6000);
        }

        public void verifyProgramsPageOpened(){ Assert.assertTrue(enterPatientNameField.isDisplayed()); }

        public void clickOnProgramsPageHomeIcon(){ programsPageHomeIcon.click(); }
}
