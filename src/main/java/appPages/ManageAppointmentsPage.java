package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageAppointmentsPage extends BaseAction {
    public WebDriver driver;


    public ManageAppointmentsPage(WebDriver driver) {

        this.driver = driver;
    }
    // to store the locators
    // top perform the actions on the locators

    private By appointmentSchedulingButton = By.id("bahmni.appointment.scheduling");
    private By homeManageTextDisplay = By.xpath("//a[@href='#/home/manage']");
    private By appointmentsListButton = By.xpath("//a[contains(text(), 'Appointments List')]");
    private By calendarButton = By.xpath("//a[contains(text(), 'Calendar')]");
    private By weekbutton = By.xpath("//button[@ng-click='$parent.toggleWeekView()'][normalize-space()='Week']");

    private By weeklyDate = By.xpath("//label[@for='weeklyDate']");

    public void assertHomePageElements() {
        verifyIsElementDisplayed(appointmentSchedulingButton);
    }

    public void clickOnAppointmentSchedulingButton() {
        clickElementUsingJs(appointmentSchedulingButton);
    }

    public void verifyHomeManagePageElements(){
    verifyIsElementDisplayed(homeManageTextDisplay);
    }
    public void clickOnAppointmentsListButton(){
        verifyIsElementDisplayed(appointmentsListButton);
        clickElementUsingJs(appointmentsListButton);
    }
    public void clickOnWeekButton(){
        clickElement(weekbutton);
    }
    public void assertCalendarView(){
        verifyIsElementDisplayed(calendarButton);
    }

    public void verifyCurrentWeeklyDate(){
        waitUntilElementIsDisplayed(weeklyDate);
    }

}