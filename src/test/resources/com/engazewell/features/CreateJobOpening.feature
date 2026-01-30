
@feature_create_job_opening
Feature: CreateJobOpening

  Background: 
    Given the user is on the Dashboard

  @navigate_job_opening
  Scenario Outline: Create Job Opening
    When the user clicks on the "Job Opening" option in the side navigation
    Then the Job Opening screen should be displayed
    And the "Add Job Opening" button should be visible

    Examples:
      |   |
      |   |

  @add_job_opening
  Scenario Outline: Create Job Opening
    When the recruiter clicks on the Add Job Opening button
    Then the Create New Job Opening form should be opened
    And the Save and Cancel buttons should be displayed

    Examples:
      | action                |
      | Add Job Opening       |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select a Job Role "<job_role>"
    And I select a Location "<location>"
    And I enter Minimum Experience "<min_experience>"
    And I enter Maximum Experience "<max_experience>"
    And I enter Qualification "<qualification>"
    And I enter Short Job Description "<short_description>"
    And I enter Responsibilities "<responsibilities>"
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | min_experience | max_experience | qualification       | short_description                     | responsibilities                                        |
      | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree     | This is a short job description.    | 1. Develop software solutions. 2. Collaborate with team members. |

  @create-job-opening
  Scenario Outline: Create Job Opening with Optional Fields Left Blank
    Given the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<min_experience>"
    And the recruiter leaves Maximum Experience blank
    And the recruiter enters Qualification "<qualification>"
    And the recruiter leaves Responsibilities blank
    When the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | min_experience | qualification        |
      | Software Engineer  | New York   | 3              | Bachelor's Degree     |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select a Job Role as "<job_role>"
    And I select a Location as "<location>"
    And I enter Minimum Experience as "<min_experience>"
    And I enter Maximum Experience as "<max_experience>"
    And I enter Qualification as "<qualification>"
    And I enter Tags as "<tags>"
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct tags

    Examples:
      | job_role         | location    | min_experience | max_experience | qualification      | tags                     |
      | Software Engineer | New York    | 2              | 5              | Bachelor's Degree    | Java, Python, SQL       |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select a Job Role as "<job_role>"
    And I select a Location as "<location>"
    And I enter Minimum Experience as "<min_experience>"
    And I enter Maximum Experience as "<max_experience>"
    And I enter Qualification as "<qualification>"
    And I select a Vendor as "<vendor>"
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct vendor

    Examples:
      | job_role         | location   | min_experience | max_experience | qualification      | vendor    |
      | Software Engineer | New York   | 2              | 5              | Bachelor's Degree   | Vendor A  |

  @valid-job-opening
  Scenario Outline: Create Job Opening with Valid Data
    Given the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<min_experience>"
    And the recruiter enters Maximum Experience "<max_experience>"
    And the recruiter enters Qualification "<qualification>"
    And the recruiter selects Work Mode "<work_mode>"
    When the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct work mode

    Examples:
      | job_role         | location   | min_experience | max_experience | qualification      | work_mode |
      | Software Engineer | New York   | 2              | 5              | Bachelor's Degree   | Remote    |

  @valid-job-opening
  Scenario Outline: Create Job Opening with Valid Department
    Given the recruiter selects <Job Role>
    And the recruiter selects <Location>
    And the recruiter enters <Min Experience> as Minimum Experience
    And the recruiter enters <Max Experience> as Maximum Experience
    And the recruiter enters <Qualification>
    And the recruiter enters <Department> as a valid Department
    When the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct department

    Examples:
      | Job Role         | Location   | Min Experience | Max Experience | Qualification       | Department   |
      | Software Engineer | New York   | 2              | 5              | Bachelor's Degree    | Engineering   |

  @create-job-opening
  Scenario Outline: Create Job Opening with Valid Industry Type
    When I select the Job Role "<job_role>"
    And I select the Location "<location>"
    And I enter Minimum Experience "<min_experience>"
    And I enter Maximum Experience "<max_experience>"
    And I enter Qualification "<qualification>"
    And I enter a valid Industry Type "<industry_type>"
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct industry type

    Examples:
      | job_role         | location   | min_experience | max_experience | qualification      | industry_type        |
      | Software Engineer | New York   | 2              | 5              | Bachelor's Degree   | Information Technology |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select a Job Role
    And I select a Location
    And I enter Minimum Experience
    And I enter Maximum Experience
    And I enter Qualification
    And I enter valid Primary Skills
    And I enter valid Secondary Skills
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct skills

    Examples:
      | Job Role  | Location  | Min Experience | Max Experience | Qualification | Primary Skills | Secondary Skills |
      | Developer | New York  | 2 years        | 5 years        | Bachelors      | Java, Python   | SQL, Git        |

  @navigate-job-opening
  Scenario Outline: Create Job Opening
    When I click on the "Job Opening" option in the side navigation
    Then the Job Opening screen should be displayed
    And the "Add Job Opening" button should be visible

    Examples:
      |  |
      |  |

  @open_create_job_opening_form
  Scenario Outline: Create Job Opening
    When the user clicks on the Add Job Opening button
    Then the Create New Job Opening form should be opened
    And the Save and Cancel buttons should be displayed

    Examples:
      |   |
      |   |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select "<job_role>"
    And I select "<location>"
    And I enter "<min_experience>"
    And I enter "<max_experience>"
    And I enter "<qualification>"
    And I enter "<short_job_description>"
    And I enter "<responsibilities>"
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location    | min_experience | max_experience | qualification      | short_job_description | responsibilities   |
      | Software Engineer  | New York    | 2              | 5              | Bachelor's Degree   | a * 100              | a * 100            |

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
      | job_role         | location   | min_experience | max_experience | qualification      |
      | Software Engineer | New York   | 2              | 5              | Bachelor's Degree   |

  @valid_creation
  Scenario Outline: Create Job Opening
    When the recruiter selects "<job_role>"
    And the recruiter selects "<location>"
    And the recruiter enters "<min_experience>"
    And the recruiter enters "<max_experience>"
    And the recruiter enters "<qualification>"
    And the recruiter enters all optional fields "<secondary_skills>" and "<tags>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully

    Examples:
      | job_role         | location  | min_experience | max_experience | qualification     | secondary_skills     | tags                  |
      | Software Engineer | New York  | 2              | 5              | Bachelor's Degree   | Java, Python          | Remote, Full-time     |

  @create_job_opening
  Scenario Outline: Create Job Opening
    Given the user selects "<job_role>"
    And the user selects "<location>"
    And the user enters "<minimum_experience>" as Minimum Experience
    And the user enters "<maximum_experience>" as Maximum Experience
    And the user selects "<employment_type>"
    When the user clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role         | location   | minimum_experience | maximum_experience | employment_type |
      | Software Engineer | New York   | 2                  | 5                  | Full-Time       |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects "<job_role>"
    And the recruiter selects "<location>"
    And the recruiter enters "<min_experience>" for Minimum Experience
    And the recruiter enters "<max_experience>" for Maximum Experience
    And the recruiter selects "<work_mode>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | min_experience | max_experience | work_mode |
      | Software Engineer  | New York   | 2              | 5              | Remote    |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects the Job Role "<job_role>"
  And the recruiter selects the Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter selects a valid Status "<status>"
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | job_role         | location   | min_experience | max_experience | status |
    | Software Engineer | New York   | 2              | 5              | Open   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role "<job_role>"
  And the recruiter selects a Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter enters a valid Department "<department>"
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location  | min_experience | max_experience | department   |
    | Software Engineer  | New York  | 2              | 5              | Engineering   |

  @create-job-opening
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
      | job_role         | location   | min_experience | max_experience | industry_type         |
      | Software Engineer | New York   | 2              | 5              | Information Technology  |

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
      | Job Role    | Location     | Minimum Experience | Maximum Experience | Tags         |
      | Developer   | New York     | 2 years           | 5 years           | Java, Spring |

@valid-job-opening
Scenario Outline: Create Job Opening
  Given the recruiter selects a Job Role "<job_role>"
  And the recruiter selects a Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter selects valid Vendors "<vendors>"
  When the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | job_role         | location  | min_experience | max_experience | vendors   |
    | Software Engineer | New York  | 2              | 5              | Vendor A  |

  @error_message_no_job_role
  Scenario Outline: Create Job Opening Without Selecting a Job Role
    Given the user leaves the Job Role field empty
    And the user fills in the Job Title with "<job_title>"
    And the user fills in the Job Description with "<job_description>"
    And the user fills in the Company Name with "<company_name>"
    And the user fills in the Location with "<location>"
    And the user fills in the Salary with "<salary>"
    When the user clicks on "Save"
    Then an error message should be displayed indicating that Job Role is required
    And the job opening should not be saved

    Examples:
      | job_title          | job_description            | company_name       | location           | salary        |
      | valid job title    | valid job description       | valid company name  | valid location      | valid salary   |

  @error_without_location
  Scenario Outline: Create Job Opening without Location
    Given the user fills in all other required fields with valid data
    And the user leaves the Location field empty
    When the user clicks on "Save"
    Then an error message should be displayed indicating that Location is required
    And the job opening should not be saved

  Examples:
    | location |
    |          |

  @error_min_experience
  Scenario Outline: Create Job Opening without Minimum Experience
    Given the user leaves the Minimum Experience field empty
    And the user fills in the Job Title with "<job_title>"
    And the user fills in the Job Description with "<job_description>"
    And the user fills in the Company Name with "<company_name>"
    And the user fills in the Location with "<location>"
    And the user fills in the Salary with "<salary>"
    When the user clicks on the Save button
    Then an error message should be displayed indicating that Minimum Experience is required
    And the job opening should not be saved

    Examples:
      | job_title         | job_description     | company_name       | location        | salary   |
      | valid job title   | valid job description| valid company name  | valid location   | valid salary |

  @invalid_experience
  Scenario Outline: Create Job Opening with Invalid Experience
    Given I enter a valid Minimum Experience of "<minimumExperience>"
    And I enter a Maximum Experience of "<maximumExperience>"
    And I fill in the Job Title as "<jobTitle>"
    And I fill in the Company Name as "<companyName>"
    And I fill in the Location as "<location>"
    And I fill in the Description as "<description>"
    And I fill in the Salary as "<salary>"
    And I fill in the Benefits as "<benefits>"
    And I fill in the Contact Email as "<contactEmail>"
    And I fill in the Contact Phone as "<contactPhone>"
    When I click on "Save"
    Then an error message should be displayed indicating that Maximum Experience must be greater than Minimum Experience
    And the job opening should not be saved

    Examples:
      | minimumExperience | maximumExperience | jobTitle     | companyName  | location        | description      | salary | benefits       | contactEmail         | contactPhone  |
      | 2                 | 1                 | Job Title    | Company Name | Location        | Description      | Salary | Benefits       | contact@example.com   | 1234567890    |

  @negative-total-openings
  Scenario Outline: Create Job Opening with Negative Total Openings
    When I enter "<total_openings>" for Total Openings
    And I enter "<field1>" for Field 1
    And I enter "<field2>" for Field 2
    And I enter "<field3>" for Field 3
    And I click on "Save"
    Then an error message should be displayed indicating that Total Openings must be a positive number
    And the job opening should not be saved

    Examples:
      | total_openings | field1        | field2        | field3        |
      | -5             | valid_value1  | valid_value2  | valid_value3  |

  @error_message_required_field
  Scenario Outline: Create Job Opening without Selecting Employment Type
    When the user leaves the Employment Type field empty
    And the user fills in all other required fields with valid data
    And the user clicks on "Save"
    Then an error message should be displayed indicating that Employment Type is required
    And the job opening should not be saved

    Examples:
      | EmploymentType | OtherRequiredField1 | OtherRequiredField2 |
      |                | ValidData1         | ValidData2         |

@error_message_work_mode
Scenario Outline: Create Job Opening
  When I leave the Work Mode field empty
  And I fill in all other required fields with valid data
  And I click on "Save"
  Then an error message should be displayed indicating that Work Mode is required
  And the job opening should not be saved

  Examples:
    | Work Mode | Other Required Fields |
    |           | valid data           |

  @error-message-required-status
  Scenario Outline: Create Job Opening without Selecting Status
    Given the user fills in the Job Title as "<title>"
    And the user fills in the Job Description as "<description>"
    And the user fills in the Job Location as "<location>"
    And the user fills in the Job Salary as "<salary>"
    And the user fills in the Job Requirements as "<requirements>"
    And the user leaves the Status field empty
    When the user clicks on the Save button
    Then an error message should be displayed indicating that Status is required
    And the job opening should not be saved

    Examples:
      | title                | description                                   | location  | salary  | requirements                                   |
      | Software Engineer     | Develop and maintain software applications.   | New York  | 80000   | Bachelor's degree in Computer Science or related field. |

  @feature_create_job_opening
  @missing_department
  Scenario Outline: Create Job Opening without Department
    Given the user fills in the Name field with "<name>"
    And the user fills in the Email field with "<email>"
    And the user fills in the Phone field with "<phone>"
    And the user fills in the Job Title field with "<job_title>"
    And the user fills in the Location field with "<location>"
    And the user leaves the Department field empty
    When the user clicks on "Save"
    Then an error message should be displayed indicating that Department is required
    And the job opening should not be saved

    Examples:
      | name         | email                  | phone      | job_title          | location  |
      | John Doe    | john.doe@example.com   | 1234567890 | Software Engineer   | New York  |

  @feature_create_job_opening
  @error_message_missing_industry
  Scenario Outline: Create Job Opening without Industry Type
    Given the user leaves the Industry Type field empty
    And the user fills in other required fields with "<valid_value>"
    When the user clicks on "Save"
    Then an error message should be displayed indicating that Industry Type is required
    And the job opening should not be saved

    Examples:
      | valid_value                          |
      | valid value for other required fields |

  @invalid-tags
  Scenario Outline: Create Job Opening with Invalid Tags Format
    Given the user enters "<job_opening_title>" as the job opening title
    And the user enters "<valid_job_title>" in the job title field
    And the user enters "<tags>" for Tags
    When the user clicks on "Save"
    Then an error message should be displayed indicating that Tags must be in a valid format
    And the job opening should not be saved

    Examples:
      | job_opening_title | valid_job_title    | tags           |
      | Job Opening 1     | Valid Job Title 1  | !@#$%^&*()     |

  @error_message_required_vendor
  Scenario Outline: Create Job Opening without Selecting Vendors
    Given the user fills in the Job Title with "<job_title>"
    And the user fills in the Job Description with "<job_description>"
    And the user fills in the Location with "<location>"
    And the user fills in the Salary with "<salary>"
    When the user leaves the Vendors field empty
    And the user clicks on the Save button
    Then an error message should be displayed indicating that Vendors selection is required
    And the job opening should not be saved

    Examples:
      | job_title          | job_description        | location         | salary     |
      | valid job title    | valid job description   | valid location    | valid salary |
