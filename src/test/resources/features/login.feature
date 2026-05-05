Feature: Login Functionality


  Scenario Outline: as a user i want to login to ndosi website
    Given i am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then i should be logged in successfully
    Examples:
      | email | password |
      | email | password |