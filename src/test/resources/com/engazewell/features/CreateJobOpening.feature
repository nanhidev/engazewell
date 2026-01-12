
@feature_create_job_opening
Feature: CreateJobOpening

  Background: 
    Given the recruiter is on the Dashboard

  @navigate-to-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter clicks on the "Job Opening" option in the side navigation
    Then the Job Opening screen should be displayed
    And the "Add Job Opening" button should be visible

    Examples:
      | action                          |
      | Click on the "Job Opening"     |

  @open_create_job_form
  Scenario Outline: Create Job Opening
    When the user clicks on the "Add Job Opening" button
    Then the Create New Job Opening form should be opened
    And the "Save" and "Cancel" buttons should be displayed

    Examples:
      | action                     |
      | Add Job Opening            |

@valid-job-opening
Scenario Outline: Create Job Opening with Valid Data
  When I select "<job_role>"
  And I select "<location>"
  And I enter "<min_experience>" as Minimum Experience
  And I enter "<max_experience>" as Maximum Experience
  And I enter "<qualification>" as Qualification
  And I enter "<short_job_description>" as Short Job Description
  And I enter "<responsibilities>" as Responsibilities
  And I click on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location | min_experience | max_experience | qualification      | short_job_description | responsibilities      |
    | Software Engineer  | New York | 2              | 5              | Bachelor's Degree   | a * 100               | a * 100               |

@create-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role "<job_role>"
  And the recruiter selects a Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter enters Qualification "<qualification>"
  And the recruiter leaves optional fields empty
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | job_role         | location   | min_experience | max_experience | qualification         |
    | Software Engineer | New York   | 2              | 5              | Bachelor's Degree      |

  @create-job-opening
  Scenario Outline: Create Job Opening
    When the user selects "<job_role>"
    And the user selects "<location>"
    And the user enters "<minimum_experience>"
    And the user enters "<maximum_experience>"
    And the user enters "<qualification>"
    And the user enters all optional fields "<secondary_skills>" and "<tags>"
    And the user clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with all details

    Examples:
      | job_role          | location  | minimum_experience | maximum_experience | qualification      | secondary_skills     | tags                  |
      | Software Engineer  | New York  | 2                  | 5                  | Bachelor's Degree   | Java, Python          | Remote, Full-time     |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects "<job_role>"
    And the recruiter selects "<location>"
    And the recruiter enters "<minimum_experience>" as Minimum Experience
    And the recruiter enters "<maximum_experience>" as Maximum Experience
    And the recruiter selects "<employment_type>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role         | location   | minimum_experience | maximum_experience | employment_type |
      | Software Engineer | New York   | 2                  | 5                  | Full-Time       |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    Given the user selects "<job_role>"
    And the user selects "<location>"
    And the user enters "<min_experience>" as Minimum Experience
    And the user enters "<max_experience>" as Maximum Experience
    And the user selects "<work_mode>"
    When the user clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role         | location   | min_experience | max_experience | work_mode |
      | Software Engineer | New York   | 2              | 5              | Remote    |

@valid-job-opening
Scenario Outline: Create Job Opening
  Given the recruiter selects the Job Role "<job_role>"
  And the recruiter selects the Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter selects a valid Status "<status>"
  When the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | job_role         | location    | min_experience | max_experience | status |
    | Software Engineer | New York    | 2              | 5              | Open   |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    Given the recruiter selects the Job Role
    And the recruiter selects the Location
    And the recruiter enters Minimum Experience
    And the recruiter enters Maximum Experience
    And the recruiter enters a valid Department
    When the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | Job Role         | Location   | Minimum Experience | Maximum Experience | Department  |
      | Software Engineer | New York   | 2                  | 5                  | Engineering  |

  @valid_job_opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<min_experience>"
    And the recruiter enters Maximum Experience "<max_experience>"
    And the recruiter enters a valid Industry Type "<industry_type>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | min_experience | max_experience | industry_type          |
      | Software Engineer  | New York   | 2              | 5              | Information Technology  |

  @create-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role
    And the recruiter selects a Location
    And the recruiter enters Minimum Experience
    And the recruiter enters Maximum Experience
    And the recruiter enters valid Tags
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | Job Role      | Location      | Minimum Experience | Maximum Experience | Tags         |
      | Software Engineer | New York    | 2 years           | 5 years           | Java, Spring |

  @create_job_opening
  Scenario Outline: Create Job Opening
    When I select a Job Role "<job_role>"
    And I select a Location "<location>"
    And I enter Minimum Experience "<min_experience>"
    And I enter Maximum Experience "<max_experience>"
    And I select valid Vendors "<vendor>"
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role         | location   | min_experience | max_experience | vendor     |
      | Software Engineer | New York   | 2              | 5              | Vendor A   |

  @error_message_job_role
  Scenario Outline: Create Job Opening without Job Role
    Given the recruiter fills the Job Title with "<job_title>"
    And the recruiter fills the Job Description with "<job_description>"
    And the recruiter fills the Company Name with "<company_name>"
    And the recruiter fills the Location with "<location>"
    And the recruiter fills the Salary with "<salary>"
    When the recruiter clicks the Save button
    Then an error message should be displayed indicating that Job Role is required
    And the job opening should not be saved

    Examples:
      | job_title         | job_description        | company_name     | location         | salary      |
      | valid job title   | valid job description   | valid company name| valid location    | valid salary |

  @location-required-error
  Scenario Outline: Create Job Opening Without Selecting a Location
    Given all required fields are filled with valid data
    And the Location field is left empty
    When the user clicks on the Save button
    Then an error message should be displayed indicating that Location is required
    And the job opening should not be saved

    Examples:
      | <valid_data> |
      | valid data   |

  @error-minimum-experience
  Scenario Outline: Create Job Opening without Minimum Experience
    Given the recruiter is on the Job Opening Creation Page
    When I leave the Minimum Experience field empty
    And I enter "<job_title>"
    And I enter "<job_description>"
    And I enter "<company_name>"
    And I enter "<location>"
    And I enter "<salary>"
    And I click on "Save"
    Then an error message should be displayed indicating that Minimum Experience is required
    And the job opening should not be saved

    Examples:
      | job_title        | job_description         | company_name        | location        | salary         |
      | valid job title  | valid job description    | valid company name   | valid location   | valid salary    |

  @invalid-experience
  Scenario Outline: Create Job Opening with Invalid Experience
    Given I enter "<minimum_experience>" as Minimum Experience
    And I enter "<maximum_experience>" as Maximum Experience
    And I fill in the Job Title "<job_title>"
    And I fill in the Company Name "<company_name>"
    And I fill in the Location "<location>"
    And I fill in the Description "<description>"
    And I fill in the Salary "<salary>"
    And I fill in the Benefits "<benefits>"
    And I fill in the Contact Email "<contact_email>"
    And I fill in the Contact Phone "<contact_phone>"
    When I click on "Save"
    Then an error message should be displayed indicating that Maximum Experience must be greater than Minimum Experience
    And the job opening should not be saved

    Examples:
      | minimum_experience | maximum_experience | job_title  | company_name | location      | description   | salary | benefits  | contact_email       | contact_phone |
      | 2                  | 1                  | Job Title  | Company Name | Location      | Description   | Salary | Benefits  | email@example.com   | 1234567890    |

  @negative-number-error
  Scenario Outline: Create Job Opening with Negative Total Openings
    Given the user enters "<total_openings>" as Total Openings
    And the user fills in "<field1>", "<field2>", "<field3>" with valid data
    When the user clicks on "Save"
    Then an error message should be displayed indicating that Total Openings must be a positive number
    And the job opening should not be saved

    Examples:
      | total_openings | field1        | field2        | field3        |
      | -5             | valid_value1  | valid_value2  | valid_value3  |

  @missing-employment-type
  Scenario Outline: Create Job Opening without Employment Type
    Given the Employment Type field is empty
    And the user fills in all other required fields with valid data
    When the user clicks on "Save"
    Then an error message should be displayed indicating that Employment Type is required
    And the job opening should not be saved

    Examples:
      | Employment Type | Other Required Fields |
      |                 | valid data           |

  @empty-work_mode
  Scenario Outline: Create Job Opening without selecting Work Mode
    Given the recruiter is on the Create Job Opening Page
    When I leave the Work Mode field empty
    And I fill in all other required fields with valid data
    And I click on "Save"
    Then an error message should be displayed indicating that Work Mode is required
    And the job opening should not be saved

    Examples:
      | <work_mode> |
      |             |

@status_required_error
Scenario Outline: Create Job Opening without Selecting a Status
  Given I fill in the Job Title with "<title>"
  And I fill in the Job Description with "<description>"
  And I fill in the Job Location with "<location>"
  And I fill in the Job Salary with "<salary>"
  And I fill in the Job Requirements with "<requirements>"
  And I leave the Status field empty
  When I click on "Save"
  Then I should see an error message indicating that Status is required
  And the job opening should not be saved

  Examples:
    | title               | description                                  | location  | salary | requirements                                   |
    | Software Engineer   | Develop and maintain software applications.  | New York  | 80000  | Bachelor's degree in Computer Science or related field. |

  @empty_department
  Scenario Outline: Create Job Opening without Department
    Given the recruiter fills in the Name field with "<name>"
    And the recruiter fills in the Email field with "<email>"
    And the recruiter fills in the Phone field with "<phone>"
    And the recruiter fills in the Job Title field with "<job_title>"
    And the recruiter fills in the Location field with "<location>"
    And the recruiter leaves the Department field empty
    When the recruiter clicks on "Save"
    Then an error message should be displayed indicating that Department is required
    And the job opening should not be saved

    Examples:
      | name      | email                   | phone       | job_title         | location   |
      | John Doe  | john.doe@example.com    | 1234567890  | Software Engineer   | New York   |

  @feature_create_job_opening
  @missing_industry_type
  Scenario Outline: Create Job Opening without Industry Type
    When the user enters "<valid_value_required_1>"
    And the user enters "<valid_value_required_2>"
    And the user enters "<valid_value_required_3>"
    And the user enters "<valid_value_required_4>"
    And the user enters "<valid_value_required_5>"
    And the user enters "<valid_value_required_6>"
    And the user enters "<valid_value_required_7>"
    And the user enters "<valid_value_required_8>"
    And the user leaves the Industry Type field empty
    And the user clicks the Save button
    Then an error message should be displayed indicating that Industry Type is required
    And the job opening should not be saved

    Examples:
      | valid_value_required_1              | valid_value_required_2              | valid_value_required_3              | valid_value_required_4              | valid_value_required_5              | valid_value_required_6              | valid_value_required_7              | valid_value_required_8              |
      | valid value for other required fields | valid value for other required fields | valid value for other required fields | valid value for other required fields | valid value for other required fields | valid value for other required fields | valid value for other required fields | valid value for other required fields |

  @invalid-tags
  Scenario Outline: Create Job Opening with Invalid Tags Format
    Given the user enters a valid job title "<job_opening_title>"
    And the user enters invalid tags "<tags>"
    When the user clicks on the Save button
    Then an error message should be displayed indicating that Tags must be in a valid format
    And the job opening should not be saved

    Examples:
      | job_opening_title | tags           |
      | valid job title   | !@#$%^&*()     |

  @empty-vendors
  Scenario Outline: Create Job Opening without Selecting Vendors
    Given the user fills in all other required fields with valid data
      | job_title         | job_description          | location        | salary        |
      | "<job_title>"     | "<job_description>"      | "<location>"    | "<salary>"    |
    When the user leaves the Vendors field empty
    And the user clicks on "Save"
    Then an error message should be displayed indicating that Vendors selection is required
    And the job opening should not be saved

    Examples:
      | job_title       | job_description       | location       | salary      |
      | valid job title | valid job description  | valid location | valid salary |
