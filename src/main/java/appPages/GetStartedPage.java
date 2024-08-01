package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetStartedPage extends BaseAction {
    public WebDriver driver;


    public GetStartedPage(WebDriver driver){

        this.driver=driver;
    }

    private By getStartedText = By.xpath("//h4[contains(text(), 'GET STARTED')]");
    private By clinicalServiceButton = By.xpath("//span[contains(text(), 'Clinical Service')]");


    public void verifyGetStartedPage(){
        verifyIsElementDisplayed((WebElement) getStartedText);

    }

    public void clickClinicalServiceButton(){
        driver.findElement(clinicalServiceButton).click();
    }







}
