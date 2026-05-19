@CreateGroup @Regression


Feature: Create Group

  Scenario Outline: As admin user I want to create a group on NDOSI website
    Given I am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then I should be logged in successfully
    And I click on the logged in user
    And I click on the admin panel
    And I click on the groups tab
    And I click on the create group button
    And I enter group name <groupName>
    And I enter group description <groupDescription>
    And I enter year <year>
    And I enter max capacity <maxCapacity>
    And I enter start date <startDate>
    And I enter end date <endDate>
    When I click on the create group button
    Then I should see the group created successfully

    Examples:
      | email             | password  | groupName | groupDescription | year | maxCapacity | startDate  | endDate    |
      |melsa@gmail.com   | @12345678 | some name | some description | 2026 |  65456      |  05182026  |  05182027  |
