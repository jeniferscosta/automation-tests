Feature: To test click on the add task button when errors were found

  Scenario: Check if the Add Task button is providind a input field to user
    Given I am on the main page of the app
    When I click on My Task link
    And I will be redirected to my tasks page
    Then Click on Add Task button to add a new task;
    And I try to find a input field to add my text description

Scenario: Check if hitting the Enter key button on oyur keyboard will provide a input field to user
    Given I am on the main page of the app
    When I click on My Task link
    And I will be redirected to my tasks page
    Then Hit the Enter button
    And I try to find a input field to add my text description
    