package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProgramEnrolPF_SD {
    public WebDriver driver;
public ProgramEnrolPF_SD(WebDriver driver){
    this.driver= driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[@id='bahmni.programs']")
    private WebElement programs;
@FindBy(xpath = "//span[normalize-space()='All']")
private WebElement allPatients;
@FindBy(id = "patientIdentifier")
private WebElement searchPatient;
@FindBy(css = "div.reg-srch-btn.left")
private WebElement searchbutton;
@FindBy(xpath = "//a[@class='section-title active']")
private WebElement newProgramEnrollment;
@FindBy(xpath="//select[@ng-model='programSelected']")
private WebElement chooseProgram;
@FindBy(xpath = "//Select[@class='ng-valid ng-dirty ng-valid-parse ng-touched']/option[text()='TB Program']")
private WebElement tbProgram;
@FindBy(xpath = "//input[@id='ID_Number']")
private WebElement idNumber;
@FindBy(xpath = "//input[@value='Enroll']")
private WebElement enroll;
@FindBy(xpath = "//h2[normalize-space()='Active Programs']")
private WebElement verifyPatientActiveProgram;
@FindBy(xpath = "//div[@class='msg']")
private WebElement errorMessage;
@FindBy(css="input#delete_btn")
//@FindBy(xpath = "//input[@id='delete_btn']")
private WebElement deleteButton;
@FindBy(css="textarea[placeholder='Reason to delete the program']")
private WebElement deleteReason;
@FindBy(xpath = "//input[@value='Delete']")
private WebElement deleteButton2;
@FindBy(xpath = "//button[@id='delete']")
private WebElement deleteButton3;
    public void NavigateToProgramPage() throws InterruptedException {
    programs.click();
    Thread.sleep(2000);
    allPatients.click();
    Thread.sleep(2000);
    }
    public boolean VerifyProgramPage(){
        return allPatients.isDisplayed();
    }
    public void NavigateToPatientPage() throws InterruptedException {
        searchPatient.sendKeys("john");
        Thread.sleep(2000);
        searchbutton.click();
        Thread.sleep(2000);
    }
    public boolean VerifyPatientPage(){
        return newProgramEnrollment.isDisplayed();
    }
    public void AddProgram() throws InterruptedException {
        Thread.sleep(2000);
        newProgramEnrollment.click();
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath("//select[@ng-model='programSelected']"))).selectByVisibleText("TB Program");
        Thread.sleep(5000);
        idNumber.sendKeys("200001");
        Thread.sleep(2000);
        enroll.click();
        Thread.sleep(2000);
            }
    public boolean VerifyError(){
        return errorMessage.isDisplayed();
    }
    public void DeletePatient() throws InterruptedException {
        Thread.sleep(2000);
        deleteButton.click();
        Thread.sleep(2000);
        deleteReason.sendKeys("Testing");
        Thread.sleep(2000);
        deleteButton2.click();
        Thread.sleep(2000);
        deleteButton3.click();
        Thread.sleep(2000);
    }
}

