package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAppointmentsPage extends BaseAction {
    public WebDriver driver;
    // WebElement declarations using @FindBy annotation
    @FindBy(id = "bahmni.appointment.scheduling")
    private WebElement appointmentSchedulingButton;
    @FindBy(xpath = "//a[@href='#/home/manage']")
    private WebElement homeManageTextDisplay;
    @FindBy(xpath = "//a[contains(text(), 'Appointments List')]")
    private WebElement appointmentsListButton;
    @FindBy(xpath = "//a[contains(text(), 'Calendar')]")
    private WebElement calendarButton;
    @FindBy(xpath = "//button[@ng-click='$parent.toggleWeekView()'][normalize-space()='Week']")
    private WebElement weekButton;
    @FindBy(xpath = "//label[@for='weeklyDate']")
    private WebElement weeklyDate;

    public ManageAppointmentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize PageFactory elements
    }

    // Methods to interact with the elements
    public void assertHomePageElements() {
        verifyIsElementDisplayed(appointmentSchedulingButton);
    }

    public void clickOnAppointmentSchedulingButton() {
        clickElementUsingJs(appointmentSchedulingButton);
    }

    public void verifyHomeManagePageElements() {
        verifyIsElementDisplayed(homeManageTextDisplay);
    }

    public void clickOnAppointmentsListButton() {
        verifyIsElementDisplayed(appointmentsListButton);
        clickElementUsingJs(appointmentsListButton);
    }

    public void clickOnWeekButton() {
        clickElementUsingJs(weekButton); // Use clickElementUsingJs for better reliability
    }

    public void assertCalendarView() {
        verifyIsElementDisplayed(calendarButton);
    }

    public void verifyCurrentWeeklyDate() {
        waitUntilElementIsDisplayed(weeklyDate);
    }
}
