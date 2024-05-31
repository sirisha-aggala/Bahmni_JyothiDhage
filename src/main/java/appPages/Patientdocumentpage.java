package appPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Patientdocumentpage {
    public WebDriver driver;

    public Patientdocumentpage(WebDriver driver) {
        this.driver = driver;
    }

    public By PatientDocumentsbutton = By.id("bahmni.patient.document.upload");
    public By PatientNamebutton = By.className("patient-name");
    public By visitdropdownbutton = By.xpath("//select[@ng-model='newVisit.visitType']");
    public By visitdate = By.cssSelector("input[name=startDate]");
    public By visitenddate = By.cssSelector("input[name=endDate]");
    public By scanbutton = By.xpath("//button[@ng-click='upload()']");

    public void clickonPatientDocumentssbutton() {
        driver.findElement(PatientDocumentsbutton).click();
    }

    public void clickPatientNamebutton() { driver.findElement(PatientNamebutton).sendKeys("Rudra Kaul"); }

//    public void visitdropdownbutton() {
//        Select select = new Select(driver.findElement(visitdropdownbutton));
//        select.selectByVisibleText("OPD");//need to map
//    }
//    public void visitdate() {
//        Select select = new Select(driver.findElement(visitdate));
//        select.selectByVisibleText("11-08-2023");
//    }
//
//    public void visitenddate() {
//        Select select = new Select(driver.findElement(visitenddate));
//        select.selectByVisibleText("11-08-2023");
//    }
//
//    public void clickscanbutton() {
//        driver.findElement(scanbutton).click();
//    }
//
//    public void patientdocumentpage() {
//
//        driver.findElement(PatientNamebutton).sendKeys("Rudra Kaul");
//        driver.findElement(visitdropdownbutton).sendKeys("OPD");
//        driver.findElement(visitdate).sendKeys("2023-08-11");
//        driver.findElement(visitenddate).sendKeys("2023-08-11");
//    }
}




