package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Clinical
{

    public WebDriver driver;


    public Clinical(WebDriver driver)
    {
        this.driver = driver;
    }


    By ClickonClinicalfeature = By.id("bahmni.clinical");

    public void clinical_tab()
    {
        driver.findElement(ClickonClinicalfeature).click();
    }

    By PatientFinder = By.xpath("//div[@class='patient-name']");

    public void Patientfindertextfield()
    {
        PatientFinder.equals("John Doe");
        PatientFinder.equals(Keys.ENTER);
    }





}
