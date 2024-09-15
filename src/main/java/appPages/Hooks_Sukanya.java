package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Hooks_Sukanya extends BaseAction{
    public WebDriver driver;
    public Hooks_Sukanya(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

    }
    @FindBy(xpath = "//span[text()=' Clinical Service']")
    private WebElement clinicalServices;
    @FindBy(css = "input#username")
    private WebElement userName;
    @FindBy(css = "input#password")
    private WebElement password;
    @FindBy(xpath= "//button[text()= 'Login']")
    private WebElement login;
    @FindBy(xpath = "//Select[@id='location']/option[text()='General Ward']")
    private WebElement generalWard;
    @FindBy(xpath = "//Select[@id='location']")
    private WebElement location;
    @FindBy(css = "button.confirm")
    private WebElement continueButton;
    public void EMRHomePage() throws InterruptedException {
        clinicalServices.click();
        userName.sendKeys("Superman");
        password.sendKeys("Admin123");
        login.click();
    }

}


