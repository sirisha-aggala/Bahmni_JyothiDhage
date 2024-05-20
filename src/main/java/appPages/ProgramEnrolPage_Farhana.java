package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProgramEnrolPage_Farhana extends BaseAction{

    public WebDriver driver;


    public ProgramEnrolPage_Farhana(WebDriver driver) {
        this.driver = driver;
    }

    public By ProgramEnrolbutton = By.id("bahmni.programs");
    public By Userenrolprogram = By.className("smallImages");
    public By Selectpatiant = By.id("programEnrollmentContainer");
    public By selectPatientDropDown = By.xpath("//select[@ng-model='programSelected']");
    public By Idnumber = By.id("ID_Number");
    public By Date = By.id("Date");
    public By Co_morbidites=By.id("Co-morbidites");
    public By Dropdownstage=By.id("Stage");
    public By Enrol=By.cssSelector("input[value=Enroll]");



    public void clickonProgram() {
        driver.findElement(ProgramEnrolbutton).isDisplayed();
        driver.findElement(ProgramEnrolbutton).click();
    }

    public void enrolprogram() throws InterruptedException {
        driver.findElement(Userenrolprogram).isDisplayed();
        Thread.sleep(200);
        driver.findElement(Userenrolprogram).click();


        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", driver.findElement(Selectpatiant));
        Thread.sleep(2000);
        driver.findElement(Selectpatiant).click();
      //driver.findElement(By.xpath("//input[@id='ID_Number']")).sendKeys("1234");
        driver.findElement(selectPatientDropDown).isDisplayed();
        selectDropDownValue(driver.findElement(selectPatientDropDown),"TB Program");
        Thread.sleep(3000);
        driver.findElement(Idnumber).sendKeys("ABC2234");
        Thread.sleep(2000);
        driver.findElement(Date).sendKeys("17/05/2024");
        Thread.sleep(2000);
        driver.findElement(Co_morbidites).click();
        Thread.sleep(3000);
        selectDropDownValue(driver.findElement(Dropdownstage),"Final Stage");
        Thread.sleep(3000);
        driver.findElement(Enrol).click();
        Thread.sleep(3000);


    }




    }







