package appPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Patientdocumentpage {
    public WebDriver driver;

    public Patientdocumentpage(WebDriver driver) {
        this.driver = driver;
    }

    public By PatientDocumentsbutton = By.xpath("//a[@id='bahmni.patient.document.upload']");
    public By PatientNamebutton = By.xpath("//div[text()='Rudra Kaul']");
    public By visitbutton = By.xpath("//h5[@ng-click='resetCurrentVisit(newVisit)']");
    public By savebutton = By.xpath("//button[@type='submit']");
    public void clickonPatientDocumentssbutton() {
        driver.findElement(PatientDocumentsbutton).click();
    }

    public void clickonPatientNamebutton() {
        driver.findElement(PatientNamebutton).click();
    }


    public void visitbutton() {
        driver.findElement(visitbutton).sendKeys("OPD,22/01/2022");
    }

    public void savebutton() {driver.findElement(savebutton).click();
    }

    public void Patientdocumentpage() {

        driver.findElement(PatientNamebutton).sendKeys("Rudra Kaul");
        driver.findElement(visitbutton).sendKeys("OPD,22/01/2022");
        driver.findElement(savebutton).click();
    }
}




