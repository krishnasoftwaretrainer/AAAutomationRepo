Feature: SwagLabs Signup
Scenario: Valid Login on SwagLabs
    Given The user is on the signup page
    When The user enters a username "testuser"
    And The user enters a password "password123"
    And The user clicks the signup button
    Then The user should see a signup successful alert
