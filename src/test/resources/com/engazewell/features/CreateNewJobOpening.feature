
@feature_create_new_job_opening
Feature: CreateNewJobOpening

Background: 
  Given the user is logged in 

@verify_job_opening_navigation
Scenario Outline: Create New Job Opening
  Given the user clicks on the "Job Openings" menu item in the application
  When the user waits for the Job Opening screen to load
  Then the Job Opening page is displayed
  And the "Add Job Opening" button is visible and clickable

Examples:
  |  |
  |  |

  @verify_create_new_job_opening_form
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Add Job Opening" button
    Then the Create New Job Opening form is displayed
    And all required fields are present

    Examples:
      |  |
      |  |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user enters a valid Job Title "<job_title>"
    And the user enters a valid Job Description "<job_description>"
    And the user selects a valid Department "<department>"
    And the user enters a valid Location "<location>"
    When the user clicks the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing

    Examples:
      | job_title          | job_description                                                  | department  | location   |
      | Software Engineer   | Develop and maintain software applications. Collaborate with cross-functional teams to define, design, and ship new features. |
      | Engineering        | New York                                                       |

  @empty_job_title
  Scenario Outline: Create New Job Opening with Empty Job Title
    Given the user leaves the Job Title field empty
    When the user fills in the Job Description with "<job_description>"
    And the user selects the Department "<department>"
    And the user enters the Location "<location>"
    And the user clicks the "Save" button
    Then an error message is displayed indicating that the Job Title is required
    And the job opening is not created

    Examples:
      | job_description                                                 | department   | location   |
      | A challenging position that requires strong analytical skills and teamwork. | Engineering  | New York   |

  @create_job_opening
  Scenario Outline: Create New Job Opening
    Given the user enters a valid Job Title "<job_title>"
    And the user enters a valid Job Description "<job_description>"
    And the user selects a valid Department "<department>"
    And the user leaves optional fields empty
    When the user clicks the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with only the filled fields

    Examples:
      | job_title          | job_description                          | department   |
      | Software Engineer   | Develop and maintain software applications. | Engineering   |

  @cancel_job_creation
  Scenario Outline: Create New Job Opening
    Given the user is on the Job Opening Creation Page
    When I enter valid details in the form
    And I click the "Cancel" button
    Then the user should be redirected back to the Job Openings listing
    And no new job opening is created

    Examples:
      | valid_details |
      | valid details |

  @edit_job_opening
  Scenario Outline: Create New Job Opening
    When the user clicks on the newly created job opening
    And the user clicks the "Edit" button
    And the user modifies the Job Description to <job_description>
    And the user clicks the "Save" button
    Then a success message is displayed confirming the job opening update
    And the updated job opening details are reflected in the Job Openings listing

    Examples:
      | job_description         |
      | New Job Description 1   |
      | New Job Description 2   |

@view_job_details
Scenario Outline: Create New Job Opening
  When the user clicks on the newly created job opening
  Then the job opening details are displayed correctly
  And all fields (Job Title, Job Description, Department, Location) are visible and accurate

  Examples:
    | job_opening_id |
    | 1               |

  @filter_job_openings
  Scenario Outline: Create New Job Opening
    When I click on the filter options
    And I select <Department> from the filter dropdown
    And I click the Apply Filter button
    Then the Job Openings listing updates to show only job openings that match the selected Department
    And the filter criteria are displayed on the page

    Examples:
      | Department     |
      | Engineering     |
      | Marketing       |

  @sort_job_openings
  Scenario Outline: Verify sorting of job openings
    When the user clicks on the sorting option "<sorting_option>"
    And the user selects the sorting order "<sorting_order>"
    Then the Job Openings listing should update to show job openings sorted by the selected criteria
    And the sorting order should be visually indicated on the page

    Examples:
      | sorting_option | sorting_order |
      | Job Title      | Ascending     |
      | Date Created   | Descending    |

  @observe_pagination
  Scenario Outline: Create New Job Opening
    Given the user observes the pagination controls at the bottom of the listing
    When the user clicks on the next page button
    Then the Job Openings listing updates to show the next set of job openings
    And the pagination controls reflect the current page number

    Examples:
      |   |
      |   |

  @job-opening-creation
  Scenario Outline: Create New Job Opening
    When the user creates a new job opening with valid details
    And the user clicks the "Save" button
    Then a confirmation message is displayed indicating the job opening was created successfully
    And the user is redirected to the Job Openings listing

    Examples:
      | valid_details |
      | valid_data    |

  @duplicate-job-title
  Scenario Outline: Create New Job Opening with Duplicate Job Title
    Given the user enters "<job_title>"
    And the user enters "<job_description>"
    And the user selects "<department>"
    And the user enters "<location>"
    When the user clicks the "Save" button
    Then an error message is displayed indicating that the Job Title already exists
    And the job opening is not created

    Examples:
      | job_title          | job_description                                                                                     | department | location   |
      | Duplicate Job Title | This is a job description that provides details about the responsibilities and requirements of the position. It should be comprehensive and clear. | Sales      | New York   |

  @job_description_too_long
  Scenario Outline: Create New Job Opening with Job Description Exceeding Limit
    Given the user is on the Create Job Opening Page
    When I enter "<job_title>"
    And I enter "<job_description>"
    And I select "<department>"
    And I enter "<location>"
    And I click the "Save" button
    Then an error message is displayed indicating that the Job Description exceeds the maximum length
    And the job opening is not created

    Examples:
      | job_title         | job_description                                                                 | department   | location    |
      | Software Engineer  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Engineering  | New York    |

  @invalid-location
  Scenario Outline: Create New Job Opening with Invalid Location
    Given I enter a valid Job Title "<job_title>"
    And I enter a valid Job Description "<job_description>"
    And I select a valid Department "<department>"
    And I enter an invalid Location "<location>"
    When I click the "Save" button
    Then an error message is displayed indicating that the Location format is invalid
    And the job opening is not created

    Examples:
      | job_title          | job_description                             | department   | location          |
      | Software Engineer   | Develop and maintain software applications. | Engineering   | @InvalidLocation!  |

  @invalid-department
  Scenario Outline: Create New Job Opening
    Given the user enters a valid Job Title "<job_title>"
    And the user enters a valid Job Description "<job_description>"
    And the user selects an invalid Department "<department>"
    And the user enters a valid Location "<location>"
    When the user clicks the "Save" button
    Then the user should see an error message indicating that the selected Department is invalid
    And the job opening should not be created

    Examples:
      | job_title             | job_description                                                | department         | location  |
      | Software Engineer     | Develop and maintain software applications, ensuring high quality and performance. | InvalidDepartment   | New York  |

  @invalid-job-title
  Scenario Outline: Create New Job Opening with Invalid Job Title
    Given I enter "<job_title>"
    And I enter "<job_description>"
    And I select "<department>"
    And I enter "<location>"
    When I click the "Save" button
    Then an error message is displayed indicating that the Job Title contains invalid characters
    And the job opening is not created

    Examples:
      | job_title       | job_description                                           | department  | location   |
      | !@#$%^&*()      | This is a valid job description for the position.       | Engineering  | New York   |

  @error-messages
  Scenario Outline: Create New Job Opening with Missing Required Fields
    When the user leaves all required fields empty
    And the user clicks the "Save" button
    Then error messages should be displayed for all required fields indicating they must be filled
    And the job opening should not be created

    Examples:
      |   |
      |   |

  @max-character-job-description
  Scenario Outline: Create New Job Opening
    Given the user has entered a valid Job Title "<job_title>"
    And the user has entered a Job Description "<job_description>"
    And the user has selected a valid Department "<department>"
    And the user has entered a valid Location "<location>"
    When the user clicks the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with the correct details

    Examples:
      | job_title         | job_description                                                                 | department  | location   |
      | Software Engineer  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Engineering | New York   |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given I enter a Job Title with the minimum allowed characters
    And I enter a Job Description with the minimum allowed characters
    And I select a valid Department
    And I enter a valid Location
    When I click the Save button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with the correct details

    Examples:
      | job_title | job_description      | department  | location   |
      | Dev       | Develop software     | Engineering | New York   |
