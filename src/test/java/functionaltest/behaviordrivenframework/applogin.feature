Feature: Login to the application
  As a user
  I want to log in to the application
  So that I can access the features after successful authentication

  Background:
    Given I am on the login page at "https://rahulshettyacademy.com/locatorspractice/"

  @positive
  Scenario Outline: Successful login with valid credentials
    When I enter username "<username>" in the username field
    And I enter password "<password>" in the password field
    And I click on the Sign In button
    Then I should be successfully logged into the application
    And I should see the welcome message "<welcome_message>"

    Examples:
      | username | password             | welcome_message          |
      | rahul    | rahulshettyacademy   | Welcome Rahul!           |

  @negative
  Scenario Outline: Login fails with invalid credentials
    When I enter username "<username>" in the username field
    And I enter password "<password>" in the password field
    And I click on the Sign In button
    Then I should see an error message "<error_message>"

    Examples:
      | username | password             | error_message                     |
      | rahul    | wrongpassword        | Incorrect username or password.   |
      | wrong    | rahulshettyacademy   | Incorrect username or password.   |
      |          | rahulshettyacademy   | Username cannot be empty.         |
      | rahul    |                     | Password cannot be empty.         |
      |          |                     | Username and password are required.|

  @negative
  Scenario: Login fails when no credentials are provided
    When I leave the username field empty
    And I leave the password field empty
    And I click on the Sign In button
    Then I should see an error message "Username and password are required."

  @negative
  Scenario: Login fails when only username is provided
    When I enter username "rahul" in the username field
    And I leave the password field empty
    And I click on the Sign In button
    Then I should see an error message "Password cannot be empty."

  @negative
  Scenario: Login fails when