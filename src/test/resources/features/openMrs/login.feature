Feature: Open MRS Log In Test
  Scenario: Validate Login Functionality
    Given user is on OpenMrs login page
    When user logs in with valid cred
      | admin | pass |
    Then user validates logged in user is "Villy Smith"