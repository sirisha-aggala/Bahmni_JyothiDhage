Feature: Patient Documentation
Background:
  Given user launches the application
  And user enters the login credentials and click on login button
  Then user should be able to login to the app
@Patientdoc
  Scenario: User should be able to upload document under the Patient Documents module
  Given verified user clicks on the Patient Documents button
  When   select the patient
  Then  select visit
  Then select typedropdown
  Then visitdate
  Then visit enddate
  Then user uploads the documents by clicking on scan button

