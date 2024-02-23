Feature: To validate order test

  @Testclinical2
  Scenario: User should be able to order test from order
    Given user launches the application
    When user enters the login credentials and click on login button
    Then user should be able to login to the app
    And  User is on Bahmani dashboard
    And User click on Clinical feature
    And User enter Patient name "mehedi hasan"
    And Click on Patients name
    And User should able to see patient details
    And User click on Consultation button
    And User should see Consultation page
    And User clicks on Order tab
    And User is able to see all types of tests
    And User clicks on Serum tab
    And User selects Basic Serology from Panel
    And User selects Liver Function from panel
    And User selects B HCG from Lab tests
    And User selects Calcium from Lab tests
    And User selects Glucose(R) from Lab tests
    And User scrolls down
    And User clicks on Radiology
    And User selects Chest 1 View x-ray
    And User selects Chest 2 View x-ray
    And User clicks on Save button
    And User clicks on menu button
    And User clicks on Logout

