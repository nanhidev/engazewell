
@feature_create_new_job_opening
Feature: CreateNewJobOpening

  Background: 
    Given the user is logged into the application

  @navigate_to_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Job Openings" module from the main menu
    Then the Job Opening page is displayed with an "Add Job Opening" button visible

  Examples:
    |   |
    |   |

  @verify_add_job_opening_form
  Scenario Outline: Create New Job Opening
    When the admin clicks on the "Add Job Opening" button
    Then the Create New Job Opening form is displayed
    And all required fields are present

  Examples:
    | job_title          | job_description                     | department       |
    | Software Engineer   | Design and develop applications     | IT Department    |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create New Job Opening Page
    When I fill in the Job Title field with "<job_title>"
    And I fill in the Job Description field with "<job_description>"
    And I select "<department>" from the Department dropdown
    And I fill in the Location field with "<location>"
    And I select "<employment_type>" as Employment Type
    And I click the "Save" button
    Then a new job opening should be created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title          | job_description                                                                 | department | location | employment_type |
      | Software Engineer   | Develop and maintain software applications, ensuring high performance and responsiveness. | Engineering | New York | Full-time       |

  @validate_required_fields
  Scenario Outline: Create New Job Opening
    When the user leaves all required fields empty
    And the user clicks the Save button
    Then the system displays error messages for each required field that is empty
    And the user remains on the Create New Job Opening form

    Examples:
      |   |
      |   |

  @create-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create New Job Opening Page
    When I fill in the Job Title field with "<job_title>"
    And I fill in the Job Description field with "<job_description>"
    And I select "<department>" from the Department dropdown
    And I leave optional fields empty
    And I click the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title           | job_description                                                | department   |
      | Software Engineer    | Develop and maintain software applications, ensuring high performance and responsiveness. | Engineering   |

  @cancel_job_opening_creation
  Scenario Outline: Create New Job Opening
    When the user clicks the Cancel button on the Create New Job Opening form
    Then the user should be redirected back to the Job Openings listing page
    And no new job opening is created

    Examples:
      |   |
      |   |

@edit_job_opening
Scenario Outline: Create New Job Opening
  When the user clicks on the newly created job opening
  And the user clicks the "Edit" button
  And the user modifies the Job Description field
  And the user clicks the "Save" button
  Then the job opening is updated successfully
  And the user is redirected to the Job Openings listing page
  And the updated job opening details are displayed in the listing

  Examples:
    | job_description       |
    | Updated Job Description |

  @view_job_openings
  Scenario Outline: Create New Job Opening
    Given the user is on the Job Openings module
    When the user observes the list of job openings
    Then the newly created job opening should be displayed in the list
    And the job opening details should match the entered data

    Examples:
      | job_opening_title | job_opening_details |
      | New Job Opening    | Details of the new job opening |

  @filter_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the filter options
    And the user selects a <Department> from the filter dropdown
    And the user clicks the "Apply Filters" button
    Then job openings are filtered based on the selected criteria
    And only relevant job openings are displayed in the listing

    Examples:
      | Department  |
      | Sales       |
      | Marketing   |

  @view_job_opening_details
  Scenario Outline: Create New Job Opening
    When the user clicks on the newly created job opening
    Then the job opening details are displayed correctly
    And all fields match the data entered during creation

    Examples:
      | job_title         | job_description       |
      | Software Engineer  | Develop and maintain software applications. |

  @invalid-job-title
  Scenario Outline: Create New Job Opening with Invalid Job Title
    Given I enter "<job_title>" as the Job Title
    And I enter "<company_name>" as the Company Name
    And I enter "<location>" as the Location
    And I enter "<description>" as the Description
    And I enter "<salary>" as the Salary
    When the user clicks the "Save" button
    Then the system displays an error message indicating the Job Title is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | job_title | company_name      | location      | description      | salary       |
      | ab        | validCompanyName  | validLocation | validDescription  | validSalary  |

  @invalid-job-description
  Scenario Outline: Create New Job Opening with Invalid Job Description
    Given the user enters a Job Description that exceeds the maximum character limit
    And the user enters "<title>"
    And the user enters "<location>"
    And the user enters "<salary>"
    And the user selects "<employment_type>"
    When the user clicks the Save button
    Then the system displays an error message indicating the Job Description is too long
    And the user remains on the Create New Job Opening form

    Examples:
      | title            | location | salary | employment_type |
      | Software Engineer | New York | 80000  | Full-time       |

  @invalid-department
  Scenario Outline: Create New Job Opening with Invalid Department
    Given the user selects "<department>" from the Department dropdown
    And the user fills in the Job Title with "<job_title>"
    And the user fills in the Description with "<description>"
    And the user fills in the Location with "<location>"
    And the user fills in the Salary with "<salary>"
    When the user clicks the "Save" button
    Then the system displays an error message indicating the selected Department is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | department          | job_title         | description         | location          | salary        |
      | Invalid Department  | Valid Job Title   | Valid Description    | Valid Location     | Valid Salary   |

  @duplicate-job-title
  Scenario Outline: Create New Job Opening with Existing Job Title
    Given the user enters "<job_title>"
    And the user fills in the company name "<company_name>"
    And the user fills in the location "<location>"
    And the user fills in the job description "<description>"
    And the user fills in the salary "<salary>"
    When the user clicks the "Save" button
    Then the system displays an error message indicating the Job Title already exists
    And the user remains on the Create New Job Opening form

    Examples:
      | job_title          | company_name        | location   | description | salary  |
      | Software Engineer   | Tech Solutions Inc. | New York   | a * 100     | 80000   |

  @invalid-data-type
  Scenario Outline: Create New Job Opening with Invalid Data Type
    Given the user enters "<salary>" in the Salary field
    And the user enters "<job_title>" in the Job Title field
    And the user enters "<location>" in the Location field
    And the user enters "<description>" in the Description field
    And the user enters "<company>" in the Company field
    When the user clicks the "Save" button
    Then the system displays an error message indicating invalid data type
    And the user remains on the Create New Job Opening form

    Examples:
      | salary | job_title         | location  | description | company          |
      | abc    | Software Engineer  | New York  | a * 100     | Tech Innovations  |

  @unsaved_changes_warning
  Scenario Outline: Create New Job Opening
    When the user makes changes to the form without saving
    And the user attempts to navigate to another module
    Then the system displays a warning message about unsaved changes
    And the user remains on the Create New Job Opening form until they confirm to leave

    Examples:
      |  |
      |  |

  @invalid-location
  Scenario Outline: Create New Job Opening with Invalid Location
    When I enter "<title>" as the job title
    And I enter "<description>" as the job description
    And I enter "<company>" as the company name
    And I enter "<salary>" as the salary
    And I enter "<location>" as the job location
    And I click the "Save" button
    Then the system displays an error message indicating the location is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | title               | description                               | company                | salary | location      |
      | Software Engineer    | Develop and maintain software applications | Tech Innovations Inc.  | 80000  | !@#$%^&*()    |

  @max_character_limits
  Scenario Outline: Create New Job Opening
    Given the user fills in the Job Title field with maximum allowed characters
    And the user fills in the Job Description field with maximum allowed characters
    And the user selects "<department>" from the dropdown
    And the user fills in other required fields with maximum allowed characters
    When the user clicks the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | department  |
      | Engineering |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    When the user fills in the job title as "<job_title>"
    And the user fills in the job type as "<job_type>"
    And the user fills in the experience required as "<experience_required>"
    And the user fills in the salary as "<salary>"
    And the user fills in the job description as "<job_description>"
    And the user fills in the location as "<location>"
    And the user fills in the start date as "<start_date>"
    And the user fills in the end date as "<end_date>"
    And the user clicks the Save button
    And the user quickly clicks the Add Job Opening button again
    And the user fills in the job title as "<job_title_2>"
    And the user fills in the job type as "<job_type_2>"
    And the user fills in the experience required as "<experience_required_2>"
    And the user fills in the salary as "<salary_2>"
    And the user fills in the job description as "<job_description_2>"
    And the user fills in the location as "<location_2>"
    And the user fills in the start date as "<start_date_2>"
    And the user fills in the end date as "<end_date_2>"
    And the user clicks the Save button again
    Then both job openings should be created successfully
    And the user should be redirected to the Job Openings listing page after each save
    And both job openings should be displayed in the listing

    Examples:
      | job_title       | job_type | experience_required | salary  | job_description                      | location | start_date | end_date   | job_title_2       | job_type_2 | experience_required_2 | salary_2 | job_description_2                 | location_2 | start_date_2 | end_date_2 |
      | Software Engineer| Full-time| 5 years            | 100000  | Develop and maintain software applications.| New York| 2023-10-01 | 2023-10-31 | Software Engineer  | Full-time  | 5 years                | 100000   | Develop and maintain software applications.| New York  | 2023-10-01 | 2023-10-31 |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user fills in the Job Title field with "<job_title>"
    And the user fills in the Job Description field with "<job_description>"
    And the user selects "<department>" from the dropdown
    And the user fills in other required fields with valid data
    When the user clicks the "Save" button
    Then the new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title                        | job_description                                                                                                                     | department  |
      | Software Engineer @ Tech Co.     | We are looking for a Software Engineer who can develop & maintain applications, ensuring high performance & responsiveness.         | Engineering  |

  @navigate_to_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Job Openings" menu item
    And the user waits for the Job Opening screen to load
    Then the Job Opening page is displayed
    And the "Add Job Opening" button is visible and clickable

    Examples:
      |     |
      |     |

  @verify_form_display
  Scenario Outline: Create New Job Opening
    When I click on the Add Job Opening button
    And I wait for the Create New Job Opening form to load
    Then the Create New Job Opening form is displayed
    And all required fields are present

    Examples:
      | title                     |
      | Create New Job Opening    |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create Job Opening Page
    When I enter "<job_title>"
    And I enter "<job_description>"
    And I select "<department>" from the dropdown
    And I enter "<location>"
    And I click the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing

    Examples:
      | job_title          | job_description                                                        | department | location  |
      | Software Engineer   | Develop and maintain software applications. Collaborate with cross-functional teams to define, design, and ship new features. a * 100 | Engineering | New York  |

  @empty_job_title
  Scenario Outline: Create New Job Opening With Empty Job Title
    Given the job title field is empty
    When I fill in the job description with "<job_description>"
    And I select the department "<department>"
    And I enter the location "<location>"
    And I click the "Save" button
    Then an error message should be displayed indicating that the Job Title is required
    And the job opening should not be created

    Examples:
      | job_description                                         | department    | location   |
      | A challenging position that requires strong analytical skills and teamwork. | Engineering   | New York   |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create Job Opening Page
    When I enter "<job_title>"
    And I enter "<job_description>"
    And I select the "<department>"
    And I leave optional fields empty
    And I click the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with only the filled fields

    Examples:
      | job_title           | job_description                          | department  |
      | Software Engineer    | Develop and maintain software applications. | Engineering   |

  @cancel_job_creation
  Scenario Outline: Create New Job Opening - Cancel Process
    Given the user is on the Create New Job Opening Page
    When the user enters valid details in the form
    And the user clicks the Cancel button
    Then the user is redirected back to the Job Openings listing
    And no new job opening is created

    Examples:
      | <valid_details> |
      | valid details    |

  @edit_job_opening
  Scenario Outline: Create New Job Opening
    When the user clicks on the newly created job opening
    And the user clicks the "Edit" button
    And the user modifies the Job Description
    And the user clicks the "Save" button
    Then a success message is displayed confirming the job opening update
    And the updated job opening details are reflected in the Job Openings listing

    Examples:
      | job_description          |
      | Updated job description  |

@view-job-opening
Scenario Outline: Create New Job Opening
  When the user clicks on the newly created job opening
  Then the job opening details are displayed correctly
  And all fields (Job Title, Job Description, Department, Location) are visible and accurate

  Examples:
    | job_title       | job_description       | department     | location       |
    | Software Engineer| Develop software      | Engineering     | New York      |

  @filter_job_openings
  Scenario Outline: Create New Job Opening
    When I click on the filter options
    And I select <Department> from the filter dropdown
    And I click the Apply Filter button
    Then the Job Openings listing updates to show only job openings that match the selected Department
    And the filter criteria are displayed on the page

    Examples:
      | Department   |
      | Engineering  |
      | Marketing    |

  @verify_sorting_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the sorting options
    And the user selects the sorting order "<sortingOrder>"
    Then the Job Openings listing updates to show job openings sorted by the selected criteria
    And the sorting order is visually indicated on the page

    Examples:
      | sortingOrder   |
      | Ascending      |
      | Descending     |

  @navigate_job_openings
  Scenario Outline: Create New Job Opening
    Given the user observes the pagination controls at the bottom of the listing
    When the user clicks on the next page button
    Then the Job Openings listing updates to show the next set of job openings
    And the pagination controls reflect the current page number

    Examples:
      |   |
      |   |

  @successful-job-opening
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
    And the user fills in the Job Description with "<job_description>"
    And the user selects the Department "<department>"
    And the user enters the Location "<location>"
    When the user clicks the "Save" button
    Then an error message should be displayed indicating that the Job Title already exists
    And the job opening should not be created

    Examples:
      | job_title         | job_description                                                                                  | department | location  |
      | Duplicate Job Title | This is a job description that provides details about the responsibilities and requirements of the position. It should be comprehensive and clear. | Sales      | New York  |

  @job_description_exceeds_limit
  Scenario Outline: Create New Job Opening
    Given the user enters a valid Job Title "<job_title>"
    And the user enters a Job Description "<job_description>"
    And the user selects a valid Department "<department>"
    And the user enters a valid Location "<location>"
    When the user clicks the "Save" button
    Then an error message should be displayed indicating that the Job Description exceeds the maximum length
    And the job opening should not be created

    Examples:
      | job_title          | job_description                                                                 | department   | location   |
      | Software Engineer   | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Engineering | New York |

  @invalid-location
  Scenario Outline: Create New Job Opening with Invalid Location
    Given the user enters a valid Job Title "<job_title>"
    And the user enters a valid Job Description "<job_description>"
    And the user selects a valid Department "<department>"
    And the user enters an invalid Location "<location>"
    When the user clicks the "Save" button
    Then an error message is displayed indicating that the Location format is invalid

    Examples:
      | job_title          | job_description                             | department  | location          |
      | Software Engineer   | Develop and maintain software applications. | Engineering  | @InvalidLocation! |

  @invalid_department
  Scenario Outline: Create New Job Opening with Invalid Department
    Given the user enters a valid Job Title "<job_title>"
    And the user enters a valid Job Description "<job_description>"
    And the user selects an invalid Department "<department>"
    And the user enters a valid Location "<location>"
    When the user clicks the "Save" button
    Then an error message should be displayed indicating that the selected Department is invalid
    And the job opening should not be created

    Examples:
      | job_title             | job_description                                                  | department | location  |
      | Software Engineer     | Develop and maintain software applications, ensuring high quality and performance. | InvalidDept | New York  |

  @invalid-job-title
  Scenario Outline: Create New Job Opening with Invalid Job Title
    When I enter "<job_title>"
    And I enter "<job_description>"
    And I select "<department>"
    And I enter "<location>"
    And I click the "Save" button
    Then an error message is displayed indicating that the Job Title contains invalid characters
    And the job opening is not created

    Examples:
      | job_title         | job_description                                          | department  | location   |
      | !@#$%^&*()        | This is a valid job description for the position.      | Engineering  | New York   |

  @missing_required_fields
  Scenario Outline: Create New Job Opening with Missing Required Fields
    When the user leaves all required fields empty
    And the user clicks the "Save" button
    Then error messages are displayed for all required fields indicating they must be filled
    And the job opening is not created

    Examples:
      | <field1> | <field2> |
      |          |          |

  @max-character-job-description
  Scenario Outline: Create New Job Opening
    Given the user is on the Create Job Opening Page
    When the user enters a valid Job Title "<job_title>"
    And the user enters a Job Description with the maximum allowed characters "<job_description>"
    And the user selects a valid Department "<department>"
    And the user enters a valid Location "<location>"
    And the user clicks the Save button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with the correct details

    Examples:
      | job_title         | job_description                                                                 | department  | location   |
      | Software Engineer  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Engineering | New York   |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given I enter a Job Title with the minimum allowed characters "<job_title>"
    And I enter a Job Description with the minimum allowed characters "<job_description>"
    And I select a valid Department "<department>"
    And I enter a valid Location "<location>"
    When I click the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with the correct details

    Examples:
      | job_title | job_description      | department  | location   |
      | Dev       | Develop software     | Engineering | New York   |
