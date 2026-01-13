
@feature_user_login
Feature: LoginScreenforRecruiters

Background: 
  Given the user is on the Login Screen

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click on the 'Show Password' option
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard should load without errors

  Examples:
    | email_id            | password            |
    | recruiter@example.com | SecurePassword123   |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  Then the Login button should be enabled

  Examples:
    | email_id          | password          |
    | krishna@gmail.com | ValidPassword123  |

@toggle_password_visibility
Scenario Outline: Login Screen for Recruiters
  When I enter a valid password "<password>" in the Password field
  And I click on the 'Show Password' option
  Then the password should be visible
  And I click on the 'Hide Password' option
  Then the password should be hidden

  Examples:
    | password         |
    | ValidPassword123! |

@failed_login_attempt
Scenario Outline: Login Screen for Recruiters
  When I enter "<invalid_email>"
  And I enter "<invalid_password>"
  And I click the Login button
  Then the error message 'Incorrect email ID or password.' should be displayed
  And the user remains on the login screen
  When I enter "<valid_email>"
  And I enter "<valid_password>"
  And I click the Login button again
  Then the user should be redirected to the dashboard

  Examples:
    | invalid_email        | invalid_password | valid_email             | valid_password      |
    | invalid_email@domain | short            | valid_email@example.com | ValidPassword123    |

@valid-login-chrome
Scenario Outline: Login Screen for Recruiters
  When I open the application in "<browser>"
  And I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user is redirected to the dashboard in "<browser>"

  Examples:
    | browser | email               | password          |
    | Chrome  | krishna@gmail.com   | ValidPassword123  |
    | Firefox | krishna@gmail.com   | ValidPassword123  |
    | Safari  | krishna@gmail.com   | ValidPassword123  |

@valid_login_with_email_numbers
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id             | password           |
    | user123@domain.com   | validPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id            | password          |
    | USER@DOMAIN.COM     | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id               | password   |
    | user123@domain.com     | Passw0rd!  |

@invalid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Incorrect email ID or password.' is displayed
  And the user remains on the Login Screen

  Examples:
    | email                  | password |
    | invalid_email@domain   | short    |

@login_button_disabled
Scenario Outline: Login Screen for Recruiters
  When I leave the Email ID field empty
  And I enter "<password>" in the Password field
  Then the Login button should be disabled

  Examples:
    | password           |
    | valid_password123  |

@empty_email
Scenario Outline: Login Screen for Recruiters
  Given the Email ID field is empty
  And I enter "<password>" in the Password field
  When I click the Login button
  Then an error message 'Please enter your email ID.' is displayed
  And the user remains on the Login Screen

  Examples:
    | password        |
    | valid_password  |

@error_empty_password
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I leave the Password field empty
  And I click the Login button
  Then an error message 'Please enter your password.' is displayed
  And the user remains on the login screen

  Examples:
    | email               |
    | krishna@gmail.com   |

@invalid-email
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Please enter a valid email ID.' is displayed
  And the user remains on the login screen

  Examples:
    | email          | password          |
    | user@domain    | validPassword123   |

@short_password_error
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the user should see the error message 'Password must be at least 6 characters long.'
  And the user remains on the Login Screen

  Examples:
    | email               | password |
    | krishna@gmail.com   | 123      |

@invalid-email-id
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And the user clicks the Login button
  Then an error message 'Please enter a valid email ID.' is displayed
  And the user remains on the login screen

  Examples:
    | email_id         | password           |
    | user@domain#.com | ValidPassword123   |

@spaces-input
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the user should see an error message 'Please enter your email ID.'
  And the user remains on the login screen

  Examples:
    | email_id | password |
    | " "      | " "     |

@max-character-login
Scenario Outline: Login Screen for Recruiters
  When I enter an email ID with maximum allowed characters "<email>"
  And I enter a password with maximum allowed characters "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                                                                                      | password                                                                                   |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id          | password        |
    | krishna@gmail.com | !@#$%^&*()      |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  When I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id            | password          |
    | " user@domain.com " | " password123 "   |
