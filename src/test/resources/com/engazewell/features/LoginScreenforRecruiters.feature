
@feature_user_login
Feature: LoginScreenforRecruiters

Background: 
  Given the user is on the Login Screen

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter a valid email ID "<email>" in the Email ID field
  And I enter a valid password "<password>" in the Password field
  And I click on the 'Show Password' option
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard loads without errors

Examples:
  | email                | password          |
  | recruiter@example.com | SecurePassword123 |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  Then the Login button should be enabled

  Examples:
    | email               | password           |
    | krishna@gmail.com   | ValidPassword123   |

@valid-password
Scenario Outline: Login Screen for Recruiters
  Given the user enters a valid password in the Password field
  When the user clicks on the 'Show Password' option
  Then the password should be visible
  When the user clicks on the 'Hide Password' option
  Then the password should be hidden

  Examples:
    | password            |
    | ValidPassword123!   |

  @feature_user_login
  @failed_login_attempt
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>" in the Email ID field
    And I enter "<password>" in the Password field
    And I click the Login button
    Then the error message 'Incorrect email ID or password.' is displayed
    And the user remains on the login screen
    When I enter "<valid_email>" in the Email ID field
    And I enter "<valid_password>" in the Password field
    And I click the Login button again
    Then the user is redirected to the dashboard

    Examples:
      | email                   | password | valid_email              | valid_password     |
      | invalid_email@domain    | short    | valid_email@example.com  | ValidPassword123   |

@valid-login-chrome
Scenario Outline: Login Screen for Recruiters in Chrome
  When I open the application in Chrome
  And I enter a valid email ID <email> in the Email ID field
  And I enter a valid password <password> in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard in Chrome

@valid-login-firefox
Scenario Outline: Login Screen for Recruiters in Firefox
  When I open the application in Firefox
  And I enter a valid email ID <email> in the Email ID field
  And I enter a valid password <password> in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard in Firefox

@valid-login-safari
Scenario Outline: Login Screen for Recruiters in Safari
  When I open the application in Safari
  And I enter a valid email ID <email> in the Email ID field
  And I enter a valid password <password> in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard in Safari

Examples:
  | email              | password           |
  | krishna@gmail.com  | ValidPassword123   |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                | password          |
    | user123@domain.com  | validPassword123  |

@valid_uppercase_login
Scenario Outline: Login Screen for Recruiters
  Given the recruiter enters a valid email ID "<email>" in the Email ID field
  And the recruiter enters the corresponding valid password "<password>" in the Password field
  When the recruiter clicks the Login button
  Then the recruiter should be redirected to the dashboard

  Examples:
    | email               | password           |
    | USER@DOMAIN.COM    | ValidPassword123   |

@successful-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                   | password    |
    | user123@domain.com     | Passw0rd!   |

@invalid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the error message "Incorrect email ID or password." should be displayed
  And the user should remain on the Login Screen

  Examples:
    | email                   | password |
    | invalid_email@domain    | short    |

@valid-login
Scenario Outline: Verify that the Login button is disabled when Email ID is empty
  Given the Email ID field is <email_id>
  And I enter <password> in the Password field
  Then the Login button should be disabled

  Examples:
    | email_id | password            |
    |          | valid_password123   |

@empty_email_error
Scenario Outline: Login Screen for Recruiters
  When the user leaves the Email ID field empty
  And the user enters a valid password in the Password field
  And the user clicks the Login button
  Then an error message 'Please enter your email ID.' is displayed
  And the user remains on the login screen

Examples:
  | email_id | password        |
  |          | valid_password   |

@empty_password_error
Scenario Outline: Login Screen for Recruiters
  Given the user enters <email> in the Email ID field
  And the user leaves the Password field empty
  When the user clicks the Login button
  Then an error message 'Please enter your password.' is displayed
  And the user remains on the login screen

  Examples:
    | email              |
    | krishna@gmail.com  |

@invalid_email_format
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Please enter a valid email ID.' should be displayed
  And the user remains on the Login Screen

  Examples:
    | email          | password           |
    | user@domain   | validPassword123   |

@invalid_password
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Password must be at least 6 characters long.' is displayed
  And the user remains on the login screen

  Examples:
    | email              | password |
    | krishna@gmail.com  | 123      |

@invalid_email
Scenario Outline: Login Screen for Recruiters
  When the user enters "<email>" in the Email ID field
  And the user enters "<password>" in the Password field
  And the user clicks the Login button
  Then an error message 'Please enter a valid email ID.' is displayed
  And the user remains on the Login Screen

  Examples:
    | email               | password            |
    | user@domain#.com   | ValidPassword123    |

@empty_fields_error
Scenario Outline: Login Screen for Recruiters
  Given the user enters only spaces in the Email ID field
  And the user enters only spaces in the Password field
  When the user clicks the Login button
  Then an error message 'Please enter your email ID.' is displayed
  And the user remains on the login screen

Examples:
  | Email ID | Password |
  |    " "   |    " "   |

@max_character_login
Scenario Outline: Login Screen for Recruiters
  When I enter an email ID with maximum characters
  And I enter a password with maximum characters
  And I click the Login button
  Then the user should be redirected to the dashboard

Examples:
  | email_id                       | password                       |
  | <email_id>                    | <password>                    |
  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@valid_login_special_characters
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email              | password        |
    | krishna@gmail.com  | !@#$%^&*()      |

@valid_login_with_spaces
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email              | password      |
    | " user@domain.com " | " password123 " |
