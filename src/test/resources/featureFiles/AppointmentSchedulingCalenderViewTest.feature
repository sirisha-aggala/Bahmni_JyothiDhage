Feature: Appointment Scheduling- Calendar View

 Background:
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
@AptTest01
 Scenario: Display appointments for the current week in Calendar view
    Given on the Home page the user clicks on the Appointment Scheduling button
    And user navigates to the "<Manage Appointments>" page
    When the user clicks on "<Appointments List>"
    And user clicks on the week button
    Then the calendar should display the appointments for the current week


