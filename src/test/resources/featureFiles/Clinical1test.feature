
Feature: Verify if user is able to click on Clinical feature

  @Clinical1test
  Scenario: User should be able to click on Clinical feature
    Given User is on Bahmani dashboard
    When User click on Clinical feature
    Then User enter Patient search page
    And Click on Patients name
    Then User should be able to login and enter Patients valid nameID and see hisher treatment history details