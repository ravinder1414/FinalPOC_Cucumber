
Feature: Google Search and Gmail user sign-in
@wip
  Scenario: Text Search through Google Search
    Given I am in google home page
    When  I search text in google search box
    Then  I should able to see the searched result
    
@Smoke
  Scenario: Gmail sign in using correct userdetails
    Given I am in google home page
    When I click on Gmail link
    And  I have enter correct username and password in sign-in page
    Then I should be able to logged-in successfully
 @Smoke  
 Scenario: Gmail sign in using Incorrect userdetails
    Given I am in google home page
    When  I click on Gmail link
    And   I have enter incorrect username and password
    Then I should be able to see error message and not logged-in