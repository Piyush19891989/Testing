#Author

@SmokeFeature
Feature: feature to test login functonality

   @smoketest
  Scenario: Check login is successfully with valid credential
  
 
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  