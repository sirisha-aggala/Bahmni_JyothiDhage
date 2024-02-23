package appPages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class Clinical {

    public WebDriver driver;

    public Clinical(WebDriver driver) {
        this.driver = driver;
    }


    public By Clinicalfeature = By.id("bahmni.clinical");

    public By Patientidentifiertextbox = By.id("patientIdentifier");

    public By Patientname = By.xpath("(//div[@class='patient-name'])[1]");

    public By CheckconsultationDisplayed = By.xpath("//a[@class='btn--left btn--success']");

    public By ClickConsultation = By.xpath("//a[@class='btn--left btn--success']");

    public By CheckMedicationDisplayed = By.xpath("(//li[@class='tab-item'])[5]");

    public By ClickonMedicationtab = By.xpath("(//li[@class='tab-item'])[5]");

    public By PatientHistoryDisplayed = By.xpath("//span[text()='Order Drug']");

    public By DrugNameText = By.id("drug-name");
    public By DoseText = By.id("uniform-dose");
    public By UnitText = By.id("uniform-dose-unit");
    public By FrequencyText = By.id("frequency");
    public By RouteText = By.id("route");
    public By DurationText = By.id("duration");
    public By InstructionText = By.id("instructions");
    public By AdditionalInstructionsText = By.id("additional-instructions");

    public By ClicksonAccept = By.id("accept-button");

    public By ClickonAdd = By.cssSelector("button[class='add-drug-btn secondary-button fl']");

    // public By ClicksonRefill = By.id("modal-refill-button");

    public By SaveButton = By.xpath("//button[@class='confirm save-consultation hideSaveText']");


    public WebElement Clinical() {
        return driver.findElement(Clinicalfeature);
    }

    public void clickonclinicalfeature() {
        driver.findElement(Clinicalfeature).click();
    }

    public void Patientidentifier(String Patientname) {
        driver.findElement(Patientidentifiertextbox).sendKeys(Patientname);

    }

    public void ClickonPatientname() throws InterruptedException {
        driver.findElement(Patientname).click();
        Thread.sleep(5000);
    }

    public WebElement CheckConsultation() {
        return driver.findElement(CheckconsultationDisplayed);
    }

    public void ClickonConsultation() {
        driver.findElement(ClickConsultation).click();
    }

    public WebElement CheckMedicationDis() {
        return driver.findElement(CheckMedicationDisplayed);
    }

    public void ClickonMedication() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(ClickonMedicationtab).click();

    }

    public WebElement CheckPatientHistory() throws InterruptedException {
        return driver.findElement(PatientHistoryDisplayed);

    }

    public void OrderDrugForm(String Drugname, String Dose, String Unit, String Frequency, String Route, String Duration, String Instructions, String AdditionalInstructions) throws InterruptedException {
        Thread.sleep(9000);
        driver.findElement(DrugNameText).sendKeys(Drugname);
        driver.findElement(DrugNameText).sendKeys(Keys.ENTER);

        driver.findElement(DoseText).click();
        driver.findElement(DoseText).sendKeys(Keys.ARROW_UP);
        driver.findElement(DoseText).sendKeys(Keys.ARROW_UP);
        driver.findElement(DoseText).sendKeys(Keys.ENTER);

        Select s2 = new Select(driver.findElement(UnitText));
        s2.selectByValue("string:Tablet(s)");

        Select s3 = new Select(driver.findElement(FrequencyText));
        s3.selectByValue("string:Twice a day");

        Select s4 = new Select(driver.findElement(RouteText));
        s4.selectByValue("string:Oral");

        driver.findElement(DurationText).click();
        driver.findElement(DurationText).sendKeys(Keys.ARROW_UP);
        driver.findElement(DurationText).sendKeys(Keys.ARROW_UP);
        driver.findElement(DurationText).sendKeys(Keys.ARROW_UP);
        driver.findElement(DurationText).sendKeys(Keys.ARROW_UP);
        driver.findElement(DurationText).sendKeys(Keys.ENTER);

        Select s5 = new Select(driver.findElement(InstructionText));
        s5.selectByValue("string:Before meals");

        driver.findElement(AdditionalInstructionsText).sendKeys(AdditionalInstructions);
        driver.findElement(AdditionalInstructionsText).sendKeys(Keys.ENTER);


    }

    public void ClickAcceptButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(ClicksonAccept).click();
    }

    public void ClickAddButton() throws InterruptedException {
        driver.findElement(ClickonAdd).click();
        Thread.sleep(9000);
    }

    public void ClickonSaveButton() {
        driver.findElement(SaveButton).click();
    }


    public By Ordertab = By.xpath("//a[text()='Orders']");

    public By BloodTab =By.xpath("//a[contains(text(), 'Blood')]");

    public By SerumTab = By.xpath("//a[contains(text(), 'Serum')]");

    public By BasicSerology = By.xpath("(//a[@class='grid-row-element button orderBtn ng-binding ng-scope'])[6]");

    public By LiverFunction = By.xpath("(//a[@class='grid-row-element button orderBtn ng-binding ng-scope'])[8]");

    public By Bhcg = By.xpath("(//a[@class='grid-row-element button orderBtn ng-binding ng-scope'])[17]");

    public By Calcium= By.xpath("(//a[@class='grid-row-element button orderBtn ng-binding ng-scope'])[37]");

    public By Radiology= By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/div/div[2]/div/h2/i[1]");

    public By Xray =By.xpath("//a[@class='grid-row-element button orderBtn ng-binding ng-scope']");

    public By SaveBtn= By.xpath("//button[@class='confirm save-consultation hideSaveText']");



    public void ClickonOrderTab() throws InterruptedException
    {  Thread.sleep(9000);
        driver.findElement(Ordertab).click();
    }


    public WebElement ClickonBloodTab() throws InterruptedException
    {   Thread.sleep(9000);
        return driver.findElement(BloodTab);
    }

    public void ClickonSerumTab ()
    {
        driver.findElement(SerumTab).click();
    }

    public void ClickOnSerology ()
    {
        driver.findElement(BasicSerology).click();
    }

    public void ClickonLiver()
    {
        driver.findElement(LiverFunction).click();
    }

    public void ClickonBHCG ()
    {
        driver.findElement(Bhcg).click();
    }
    public void Clickonalcium () throws InterruptedException {
        driver.findElement(Calcium).click();
        Thread.sleep(5000);
    }

    public void Scroll()
    {
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("scroll(0,1500);");
    }

    public void SelectRadiology() throws InterruptedException
    {  Thread.sleep(5000);
        driver.findElement(Radiology).click();
    }

    public void SelectXray ()
    {
        driver.findElement(Xray).click();
    }

    public void ClickonSave()
    {
        driver.findElement(SaveBtn).click();
    }










}












