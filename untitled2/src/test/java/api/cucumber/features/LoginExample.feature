Feature: Login Action

  Scenario Outline: Successful Login with Valid credentials
    Given user on the Home page
    When User Navigate to Login Page
    And User enters <username> and <password>
    Then Message displayed Login Successfully

    Examples:
      | username                | password    |
      | standard_user           | secret_user |
      | locked_out_user         | secret_user |
      | problem_user            | secret_user |
      | performance_glitch_user | secret_user |