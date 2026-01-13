
@feature_schedule_panel_interview
Feature: SchedulePanelInterview

  Background: 
    Given the recruiter is on the Schedule Interview section

  @schedule-panel-interview
  Scenario Outline: Schedule Panel Interview
    When I click on Create Interview
    And I select "<job_opening>"
    And I select "<location>"
    And I enter "<candidate_email>"
    And I choose the Panel Interview option
    And I select "<interview_date>" and "<start_time>"
    And I select "<attendees>" and "<interview_round>"
    And I select "<interview_provider>"
    And I click on Next
    And I attach "<required_files>"
    And I click on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview

    Examples:
      | job_opening         | location         | candidate_email      | interview_date | start_time | attendees          | interview_round | interview_provider | required_files |
      | job opening value   | location value   | candidate@example.com | 2023-10-15     | 10:00 AM  | attendee@example.com | Round 1       | Provider Name     | file.pdf       |

  @verify_panel_interview_scheduling
  Scenario Outline: Schedule Panel Interview
    When the recruiter clicks on Create Interview
    And the recruiter selects "<job_opening>" from the dropdown
    And the recruiter selects "<location>" from the available options
    And the recruiter enters the Candidate's email address "<candidate_email>" and selects the candidate
    And the recruiter chooses the Panel Interview option
    And the recruiter selects the Interview Date "<interview_date>" and Start Time "<start_time>"
    And the recruiter selects "<attendees>" and Interview Round "<interview_round>"
    And the recruiter selects the Interview Provider "<interview_provider>"
    And the recruiter fills in optional fields with "<interview_notes>" and "<special_instructions>"
    And the recruiter clicks on Next
    And the recruiter attaches required files
    And the recruiter clicks on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview
    And all optional fields are saved and displayed correctly in the interview details
    And notifications are sent to all participants with the additional information included
    And the interview appears in the calendar of all attendees with all details
    And the candidate receives an email notification with all details
    And the recruiter can view the scheduled interview in their dashboard with all information

    Examples:
      | job_opening     | location         | candidate_email       | interview_date | start_time | attendees                  | interview_round | interview_provider | interview_notes                      | special_instructions                   |
      | Job Opening 1   | Location 1       | candidate@example.com  | 2023-10-15     | 10:00 AM   | Attendee 1, Attendee 2     | Round 1        | Provider Name      | Interview notes a * 100              | Special instructions a * 100          |

@edit-panel-interview
Scenario Outline: Schedule Panel Interview
  When the user selects a scheduled panel interview to edit
  And the user clicks on Edit Interview
  And the user makes changes to the Interview Date, Start Time, or Attendees
  And the user clicks on Save Changes
  Then the system displays a confirmation message indicating that the interview has been updated
  And the updated interview details are reflected in the system
  And notifications are sent to all attendees regarding the changes
  And the candidate receives an email notification with updated interview details
  And the recruiter can view the updated interview in their dashboard

Examples:
  | Interview Date | Start Time | Attendees         |
  | 2023-10-01     | 10:00 AM   | John Doe, Jane Doe |

  @notification_verification
  Scenario Outline: Schedule Panel Interview
    When the user schedules a panel interview with multiple attendees
    Then each attendee should receive an email notification with the interview details
    And the email should contain the correct Interview Date, Start Time, and Location
    And the email should include a calendar invite for the interview

    Examples:
      | attendees                                               |
      | attendee1@example.com, attendee2@example.com, attendee3@example.com |

@cancel_panel_interview
Scenario Outline: Schedule Panel Interview
  When the user selects a scheduled panel interview to cancel
  And the user clicks on Cancel Interview
  And the user confirms the cancellation
  Then the system displays a confirmation message indicating that the interview has been canceled
  And the interview is removed from the scheduled interviews list
  And notifications are sent to all attendees regarding the cancellation
  And the candidate receives an email notification about the cancellation

  Examples:
    | title                     |
    | Schedule Panel Interview   |

  @error-message
  Scenario Outline: Schedule Panel Interview without Job Opening
    When the user clicks on Create Interview
    And the user leaves the Job Opening field empty
    And the user selects "<location>"
    And the user enters the Candidate's email address "<email>"
    And the user selects the candidate "<candidate>"
    And the user chooses the Panel Interview option
    And the user selects the Interview Date "<interview_date>" and Start Time "<start_time>"
    And the user clicks on Next
    Then the system displays an error message indicating that the Job Opening must be selected
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | location  | email                 | candidate  | interview_date | start_time |
      | New York  | candidate@example.com  | John Doe   | 15/11/2023     | 10:00 AM   |

@candidate-not-selected
Scenario Outline: Schedule Panel Interview Without Selecting a Candidate
  When the user clicks on Create Interview
  And selects a Job Opening from the dropdown
  And selects a Location from the available options
  And leaves the Candidate field empty
  And chooses the Panel Interview option
  And selects the Interview Date and Start Time
  And clicks on Next
  Then the system displays an error message indicating that a Candidate must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | Job Opening | Location    | Interview Date | Start Time |
    | Job 1      | Location A  | 2023-10-10     | 10:00 AM   |

  @error-message
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects "<job_opening>" from the dropdown
    And the user selects "<location>" from the available options
    And the user enters the Candidate's email address "<candidate_email>" and selects the candidate
    And the user chooses the Panel Interview option
    And the user leaves the Interview Date field empty
    And the user clicks on Next
    Then the system displays an error message indicating that an Interview Date must be selected
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | job_opening         | location        | candidate_email         |
      | Software Engineer    | New York       | candidate1@example.com   |
      | Data Scientist       | San Francisco   | candidate2@example.com   |

@empty_start_time
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address and selects the candidate
  And the user chooses the Panel Interview option
  And the user selects the Interview Date
  And the user leaves the Start Time field empty
  And the user clicks on Next
  Then the system displays an error message indicating that a Start Time must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | candidate_email       |
    | candidate@example.com  |

  @error_message_no_attendees
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects a Job Opening from the dropdown
    And the user selects a Location from the available options
    And the user enters the Candidate's email address and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects the Interview Date and Start Time
    And the user leaves the Attendees field empty
    And the user clicks on Next
    Then the system displays an error message indicating that at least one Attendee must be selected
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | Job Opening | Location   | Candidate Email          |
      | Job1       | Location1  | candidate1@example.com    |
      | Job2       | Location2  | candidate2@example.com    |

  @error_past_interview_date
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And selects a Job Opening from the dropdown
    And selects a Location from the available options
    And enters the Candidate's email address "<email>"
    And selects the candidate
    And chooses the Panel Interview option
    And selects a past Interview Date "<interview_date>"
    And selects a Start Time
    And clicks on Next
    Then the system displays an error message indicating that the Interview Date cannot be in the past
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | email  | interview_date |
      | abc@   | 01/01/2020     |

  @overlapping_interview
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects "<job_opening>" from the dropdown
    And the user selects "<location>" from the available options
    And the user enters the Candidate's email address "<candidate_email>" and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects an Interview Date "<interview_date>" and Start Time "<start_time>" that overlaps with an existing interview
    And the user selects Attendees "<attendees>" and Interview Round "<interview_round>"
    And the user clicks on Next
    Then the system displays an error message indicating that the interview time overlaps with an existing interview
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | job_opening          | location      | candidate_email              | interview_date | start_time | attendees                 | interview_round |
      | Job Opening 1       | Location 1    | overlapping_candidate@gmail.com | 10/10/2023     | 10:00 AM  | Attendee 1, Attendee 2    | Round 1        |

@invalid-email-scheduling
Scenario Outline: Schedule Panel Interview with Invalid Email Format
  Given the user clicks on Create Interview
  When the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters an invalid email format for the Candidate as "<email>"
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system displays an error message indicating that the email format is invalid
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | email         |
    | invalidemail  |

  @schedule-panel-interview
  Scenario Outline: Schedule Panel Interview
    When the recruiter clicks on Create Interview
    And the recruiter selects the Job Opening "<job_opening>"
    And the recruiter selects the Location "<location>"
    And the recruiter enters the Candidate's email address "<candidate_email>"
    And the recruiter chooses the Panel Interview option "<panel_option>"
    And the recruiter selects the Interview Date "<interview_date>"
    And the recruiter selects the Start Time "<start_time>"
    And the recruiter selects the maximum number of Attendees "<max_attendees>"
    And the recruiter clicks on Next
    And the recruiter attaches the required files "<required_files>"
    And the recruiter clicks on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview
    And all attendees receive notifications
    And the interview appears in the calendar of all attendees
    And the candidate receives an email notification with interview details
    And the recruiter can view the scheduled interview in their dashboard

    Examples:
      | job_opening      | location         | candidate_email       | panel_option      | interview_date | start_time | max_attendees | required_files |
      | job opening value | location value   | candidate@example.com | Panel Interview   | 2023-10-30    | 10:00 AM   | 10            | file.pdf       |

@valid-panel-interview
Scenario Outline: Schedule Panel Interview
  Given the recruiter clicks on Create Interview
  When the recruiter selects a Job Opening "<job_opening>"
  And the recruiter selects a Location "<location>"
  And the recruiter enters the Candidate's email address "<candidate_email>"
  And the recruiter selects the candidate
  And the recruiter chooses the Panel Interview option
  And the recruiter selects the Interview Date "<interview_date>"
  And the recruiter selects the Start Time "<start_time>"
  And the recruiter selects the minimum number of Attendees "<min_attendees>"
  And the recruiter clicks on Next
  And the recruiter attaches required files "<required_files>"
  And the recruiter clicks on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview

  Examples:
    | job_opening      | location        | candidate_email       | interview_date | start_time | min_attendees | required_files |
    | job opening value | location value | candidate@example.com | 2023-10-15    | 10:00 AM   | 2             | file.pdf       |

@maximum_character_email
Scenario Outline: Schedule Panel Interview with Maximum Character Email
  When the user clicks on Create Interview
  And the user selects "<job_opening>" from the dropdown
  And the user selects "<location>" from the available options
  And the user enters a candidate email address that is at the maximum character limit
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system accepts the email address without errors
  And the interview can be scheduled successfully
  And notifications are sent to all participants

  Examples:
    | job_opening  | location       |
    | Software Dev | New York Office |

@valid-email-address
Scenario Outline: Schedule Panel Interview with Minimum Email Character Limit
  When the user clicks on Create Interview
  And the user selects "<job_opening>" from the dropdown
  And the user selects "<location>" from the available options
  And the user enters the candidate email address "<email_address>"
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system should accept the email address without errors
  And the interview should be scheduled successfully
  And notifications should be sent to all participants

  Examples:
    | job_opening   | location      | email_address |
    | Software Dev  | New York      | a@b.c         |
