
Feature: To validate Clinical feature
  Background:
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

#  @Clinicaltest1
#
#  Scenario: User should be able to order drug from medication
#    And User clicks on Medication tab
#    And User Should able to see Medication details of patient on Medication page
#    And User enter "Paracetamol 500mg (Tablet)" and "2" and "Tablet" and "Twice a day" and "Oral" and "4" and "Before meals" and "Take medication as per instruction"
#    And User clicks on Accept button
#    And User clicks on Add button
#    Then User clicks on Save button

  @Clinicaltest2

   Scenario: User should be able to order test from Order
    And User clicks on Order tab
    And User is able to see all types of tests
    And User clicks on Serum tab
    And User selects Basic Serology from Panel
    And User selects Liver Function from panel
    And User selects B HCG from Lab tests
    And User selects Calcium from Lab tests
    And User scrolls down
    And User clicks on Radiology
    And User selects Chest View x-ray
    Then User clicks on Save Btn









