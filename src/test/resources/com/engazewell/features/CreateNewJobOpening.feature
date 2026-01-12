
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

  @navigate_to_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Job Openings" module from the main menu
    Then the Job Opening page is displayed with an "Add Job Opening" button visible

  Examples:
    |   |
    |   |

  @verify_create_job_opening_form
  Scenario Outline: Create New Job Opening
    When the admin clicks on the "Add Job Opening" button
    Then the Create New Job Opening form is displayed
    And all required fields are present

  Examples:
    | job_title       | job_description | department     |
    | Software Engineer| Develop software| IT Department  |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user fills in the Job Title field with "<job_title>"
    And the user fills in the Job Description field with "<job_description>"
    And the user selects "<department>" from the dropdown
    And the user fills in the Location field with "<location>"
    And the user fills in the Employment Type field with "<employment_type>"
    When the user clicks the "Save" button
    Then the new job opening should be created successfully
    And the user should be redirected to the Job Openings listing page
    And the newly created job opening should be displayed in the listing

    Examples:
      | job_title          | job_description                                                                 | department | location  | employment_type |
      | Software Engineer   | Develop and maintain software applications, ensuring high performance and responsiveness. | Engineering | New York  | Full-time       |

  @required-fields-validation
  Scenario Outline: Create New Job Opening with All Required Fields Empty
    When the user leaves all required fields empty
    And the user clicks the Save button
    Then the system displays error messages for each required field that is empty
    And the user remains on the Create New Job Opening form

    Examples:
      | <empty_fields> |
      |                 |

  @create-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create New Job Opening Page
    When I fill in the Job Title field with "<job_title>"
    And I fill in the Job Description field with "<job_description>"
    And I select "<department>" from the Department dropdown
    And I leave optional fields empty
    And I click the Save button
    Then the new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title            | job_description                                                                     | department  |
      | Software Engineer     | Develop and maintain software applications, ensuring high performance and responsiveness. | Engineering  |

  @cancel-job-opening
  Scenario Outline: Create New Job Opening
    When the user clicks the "Cancel" button on the Create New Job Opening form
    Then the user is redirected back to the Job Openings listing page
    And no new job opening is created

    Examples:
      |    |
      |    |

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
    | job_opening |
    | new_job     |

@view_job_openings
Scenario Outline: Create New Job Opening
  When the user clicks on the "Job Openings" module
  Then the user observes the list of job openings
  And the newly created job opening is displayed in the list
  And the job opening details are correct and match the entered data

  Examples:
    | job_opening_title | job_opening_description |
    | Software Engineer  | Responsible for developing software solutions. |

  @filter_job_openings
  Scenario Outline: Create New Job Opening
    When I click on the filter options
    And I select a <Department> from the filter dropdown
    And I click the Apply Filters button
    Then job openings are filtered based on the selected criteria
    And only relevant job openings are displayed in the listing

    Examples:
      | Department   |
      | Engineering  |
      | Marketing    |

  @view_job_details
  Scenario Outline: Create New Job Opening
    Given the user navigates to the Job Openings listing page
    When the user clicks on the newly created job opening
    Then job opening details should be displayed correctly
    And all fields should match the data entered during creation

    Examples:
      | job_opening_title |
      | New Job Opening   |

  @invalid-job-title
  Scenario Outline: Create New Job Opening with Invalid Job Title
    Given the user enters "<jobTitle>"
    And the user fills in the Company Name with "<companyName>"
    And the user fills in the Location with "<location>"
    And the user fills in the Description with "<description>"
    And the user fills in the Salary with "<salary>"
    When the user clicks the Save button
    Then the system displays an error message indicating the Job Title is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | jobTitle | companyName      | location      | description         | salary |
      | ab       | validCompanyName | validLocation | validDescription     | validSalary |

  @invalid-job_description
  Scenario Outline: Create New Job Opening
    When I enter "<job_description>"
    And I enter "<title>"
    And I enter "<location>"
    And I enter "<salary>"
    And I select "<employment_type>"
    And I click the "Save" button
    Then the system displays an error message indicating the Job Description is too long
    And the user remains on the Create New Job Opening form

    Examples:
      | job_description                                                                                                                                                                                                                     | title             | location   | salary | employment_type |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          | Software Engineer | New York | 80000 | Full-time       |

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
      | department         | job_title         | description           | location         | salary        |
      | Invalid Department  | Valid Job Title    | Valid Description     | Valid Location   | Valid Salary   |

  @job-title-exists
  Scenario Outline: Create New Job Opening with Existing Job Title
    Given I enter "<job_title>" as the Job Title
    And I enter "<company_name>" as the Company Name
    And I enter "<location>" as the Location
    And I enter "<description>" as the Job Description
    And I enter "<salary>" as the Salary
    When I click the "Save" button
    Then the system displays an error message indicating the Job Title already exists
    And the user remains on the Create New Job Opening form

    Examples:
      | job_title          | company_name       | location   | description | salary |
      | Software Engineer   | Tech Solutions Inc. | New York   | a * 100     | 80000  |

  @invalid-data-type
  Scenario Outline: Create New Job Opening with Invalid Data Types
    When I enter "<salary>" in the Salary field
    And I enter "<job_title>" in the Job Title field
    And I enter "<location>" in the Location field
    And I enter "<description>" in the Description field
    And I enter "<company>" in the Company field
    And I click the Save button
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
      |   |
      |   |

  @invalid-location
  Scenario Outline: Create New Job Opening with Invalid Location
    When I enter "<location>"
    And I enter "<title>"
    And I enter "<description>"
    And I enter "<company>"
    And I enter "<salary>"
    And I click the Save button
    Then the system displays an error message indicating the location is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | location         | title             | description                       | company                | salary |
      | !@#$%^&*()      | Software Engineer  | Develop and maintain software applications. | Tech Innovations Inc. | 80000  |

  @create_job_opening_max_characters
  Scenario Outline: Create New Job Opening
    Given I fill in the Job Title field with the maximum allowed characters
    And I fill in the Job Description field with the maximum allowed characters
    And I select "<department>" from the dropdown
    And I fill in other required fields with maximum allowed characters
    When I click the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | department   |
      | Engineering  |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    When I create a new job opening with title "<title>", employment type "<employment_type>", experience "<experience>", salary "<salary>", description "<description>", location "<location>", start date "<start_date>", and end date "<end_date>"
    And I click "Save"
    And I quickly click "Add Job Opening" again
    And I create a new job opening with title "<title2>", employment type "<employment_type2>", experience "<experience2>", salary "<salary2>", description "<description2>", location "<location2>", start date "<start_date2>", and end date "<end_date2>"
    And I click "Save" for the second job opening
    Then both job openings should be created successfully
    And the user should be redirected to the Job Openings listing page after each save
    And both job openings should be displayed in the listing

    Examples:
      | title             | employment_type | experience | salary  | description                             | location  | start_date | end_date   | title2            | employment_type2 | experience2 | salary2 | description2                             | location2  | start_date2 | end_date2   |
      | Software Engineer | Full-time       | 5 years    | 100000  | Develop and maintain software applications. | New York  | 2023-10-01 | 2023-10-31 | Product Manager   | Part-time      | 3 years    | 80000   | Oversee product development and strategy. | Los Angeles | 2023-10-02  | 2023-10-30  |

  @valid-job-creation
  Scenario Outline: Create New Job Opening
    Given the user fills in the Job Title field with "<job_title>"
    And the user fills in the Job Description field with "<job_description>"
    And the user selects "<department>" from the dropdown
    And the user fills in other required fields with valid data
    When the user clicks the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title                         | job_description                                                                                                                                  | department  |
      | Software Engineer @ Tech Co.      | We are looking for a Software Engineer who can develop & maintain applications, ensuring high performance & responsiveness. | Engineering  |
