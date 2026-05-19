@Login @Regression


Feature: Login Functionality


  Scenario Outline: as a user i want to login to ndosi website
    Given i am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then i should be logged in successfully
    And i navigate to admin panel
    Then i admin dashboard should be displayed


    Examples:
      | email           | password  |
      | melsa@gmail.com | @12345678 |