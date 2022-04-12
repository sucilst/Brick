@Register
@sequence

Feature: Register

  Scenario: Register Success
    Given User open the Register page
    When Do Register
    And Click Register
    Then Register Successfully