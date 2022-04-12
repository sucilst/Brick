@Login
@sequence

Feature: Login

  Background: : Register Success
    Given User open the Register page
    When Do Register
    And Click Register
    Then Register Successfully

  Scenario: Login Success
    Given User open the Login page
    When Do Login
    And Click Login
    Then Login Successfully