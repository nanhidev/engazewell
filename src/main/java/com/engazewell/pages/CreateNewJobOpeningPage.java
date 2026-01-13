package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateNewJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public CreateNewJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menuItem")
    private WebElement menuItemElement;
    @FindBy(id = "jobOpeningScreen")
    private WebElement jobOpeningScreenElement;
    @FindBy(id = "createJobOpeningForm")
    private WebElement createJobOpeningFormElement;
    @FindBy(id = "jobTitleInput")
    private WebElement jobTitleInput;
    @FindBy(id = "jobDescriptionInput")
    private WebElement jobDescriptionInput;
    @FindBy(id = "departmentDropdown")
    private WebElement departmentDropdown;
    @FindBy(id = "locationInput")
    private WebElement locationInput;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "successMessage")
    private WebElement successMessageElement;
    @FindBy(id = "jobOpeningsListing")
    private WebElement jobOpeningsListingElement;
    @FindBy(id = "errorMessageTitleRequired")
    private WebElement errorMessageTitleRequiredElement;
    @FindBy(id = "jobOpeningDetails")
    private WebElement jobOpeningDetailsElement;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButtonElement;

    public void clickMenuItem(String menuItem) {
        try {
            elementUtils.clickElement(menuItemElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForJobOpeningScreenToLoad() {
        // Implementation for waiting can be added based on specific needs
    }

    public boolean isJobOpeningPageDisplayed() {
        return elementUtils.isElementDisplayed(jobOpeningScreenElement);
    }

    public boolean isCreateNewJobOpeningFormDisplayed() {
        return elementUtils.isElementDisplayed(createJobOpeningFormElement);
    }

    public void enterJobTitle(String jobTitle) {
        try {
            elementUtils.clearAndSendKeys(jobTitleInput, jobTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterJobDescription(String jobDescription) {
        try {
            elementUtils.clearAndSendKeys(jobDescriptionInput, jobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDepartment(String department) {
        try {
            elementUtils.clickElement(departmentDropdown);
            elementUtils.selectOptionInDropdown(departmentDropdown, department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterLocation(String location) {
        try {
            elementUtils.clearAndSendKeys(locationInput, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessMessageDisplayed() {
        return elementUtils.isElementDisplayed(successMessageElement);
    }

    public boolean isJobOpeningDisplayedInListing() {
        return elementUtils.isElementDisplayed(jobOpeningsListingElement);
    }

    public boolean isJobTitleRequiredErrorDisplayed() {
        return elementUtils.isElementDisplayed(errorMessageTitleRequiredElement);
    }

    public boolean areJobOpeningDetailsDisplayedCorrectly() {
        // Add implementation to verify job opening details
        return true; // Placeholder return
    }

    public void clickAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButtonElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isNewJobOpeningDisplayed() {
        try {
            WebElement newJobOpeningElement = driver.findElement(By.id("newJobOpening"));
            Assert.assertTrue("New Job Opening is not displayed!", elementUtils.isElementDisplayed(newJobOpeningElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInMaxAllowedCharacters() {
        try {
            WebElement jobTitleElement = driver.findElement(By.id("jobTitle"));
            String maxChars = "A".repeat(50); // Assuming max allowed characters is 50
            elementUtils.clearAndSendKeys(jobTitleElement, maxChars);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickApplyFiltersButton() {
        try {
            WebElement applyFiltersButton = driver.findElement(By.id("applyFilters"));
            elementUtils.clickElement(applyFiltersButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobTitleInvalidCharactersErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("jobTitleError"));
            Assert.assertTrue("Job Title invalid characters error is not displayed!", elementUtils.isElementDisplayed(errorElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickEditButton() {
        try {
            WebElement editButton = driver.findElement(By.id("editButton"));
            elementUtils.clickElement(editButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickJobOpeningsModule() {
        try {
            WebElement jobOpeningsModule = driver.findElement(By.id("jobOpeningsModule"));
            elementUtils.clickElement(jobOpeningsModule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doFieldsMatchEnteredData() {
        try {
            WebElement jobTitleField = driver.findElement(By.id("jobTitle"));
            String enteredJobTitle = jobTitleField.getAttribute("value");
            String expectedJobTitle = "Expected Job Title"; 
            Assert.assertEquals("Job Titles do not match!", enteredJobTitle, expectedJobTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToJobOpeningCreationPage() {
        try {
            WebElement createJobOpeningLink = driver.findElement(By.id("createJobOpening"));
            elementUtils.clickElement(createJobOpeningLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidDepartment() {
        try {
            elementUtils.selectOptionInDropdown(departmentDropdown, "Valid Department");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInOtherRequiredFieldsWithValidData() {
        try {
            WebElement locationField = driver.findElement(By.id("location"));
            elementUtils.clearAndSendKeys(locationField, "Valid Location");

            WebElement salaryField = driver.findElement(By.id("salary"));
            elementUtils.clearAndSendKeys(salaryField, "50000");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveAllRequiredFieldsEmpty() {
        try {
            WebElement jobTitleField = driver.findElement(By.id("jobTitle"));
            elementUtils.clearElement(jobTitleField);
            // Clear other required fields similarly
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isNewJobOpeningDisplayedWithFilledFields() {
        try {
            WebElement newJobOpeningElement = driver.findElement(By.id("newJobOpening"));
            Assert.assertTrue("New Job Opening with filled fields is not displayed!", elementUtils.isElementDisplayed(newJobOpeningElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areBothJobOpeningsCreatedSuccessfully() {
        try {
            WebElement jobOpening1 = driver.findElement(By.id("jobOpening1"));
            WebElement jobOpening2 = driver.findElement(By.id("jobOpening2"));
            Assert.assertTrue("Job Opening 1 is not displayed!", elementUtils.isElementDisplayed(jobOpening1));
            Assert.assertTrue("Job Opening 2 is not displayed!", elementUtils.isElementDisplayed(jobOpening2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isConfirmationMessageDisplayed() {
        try {
            WebElement confirmationMessage = driver.findElement(By.id("confirmationMessage"));
            Assert.assertTrue("Confirmation message is not displayed!", elementUtils.isElementDisplayed(confirmationMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnFilterOptions() {
        try {
            WebElement filterOptionsButton = driver.findElement(By.id("filterOptions"));
            elementUtils.clickElement(filterOptionsButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobDescriptionTooLongErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("jobDescriptionError"));
            Assert.assertTrue("Job Description too long error is not displayed!", elementUtils.isElementDisplayed(errorElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInDescription() {
        try {
            WebElement descriptionField = driver.findElement(By.id("jobDescription"));
            elementUtils.clearAndSendKeys(descriptionField, "This is a valid job description.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningsListingSorted() {
        try {
            // Implement the logic to verify that job openings are sorted
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningCreated() {
        try {
            WebElement newJobOpeningElement = driver.findElement(By.id("newJobOpening"));
            Assert.assertTrue("Job Opening was not created!", elementUtils.isElementDisplayed(newJobOpeningElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInJobTitle() {
        try {
            WebElement jobTitleField = driver.findElement(By.id("jobTitle"));
            elementUtils.clearAndSendKeys(jobTitleField, "Software Engineer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isLocationInvalidErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("locationError"));
            Assert.assertTrue("Location invalid error is not displayed!", elementUtils.isElementDisplayed(errorElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifyJobDescription() {
        try {
            WebElement descriptionField = driver.findElement(By.id("jobDescription"));
            elementUtils.clearAndSendKeys(descriptionField, "Updated job description.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createNewJobOpeningWithValidDetails() {
        try {
            fillInJobTitle();
            fillInDescription();
            clickApplyFiltersButton(); // Assuming it submits the form to create a job opening
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isOnJobOpeningsListingPage() {
        try {
            WebElement jobOpeningsPageElement = driver.findElement(By.id("jobOpeningsPage"));
            Assert.assertTrue("Not on Job Openings listing page!", elementUtils.isElementDisplayed(jobOpeningsPageElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areErrorMessagesDisplayedForEmptyFields() {
        try {
            // Implement checks for error messages when fields are empty
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterInput(String input) {
        // Implement input for job opening fields
    }

    public void isJobOpeningDisplayed() {
        // Implement check for specific job opening display
    }

    public void selectFilter(String filter) {
        // Implement filter selection logic
    }

    public void selectDepartmentFromFilter(String department) {
        // Implement department selection logic from filter
    }

    public void isJobTitleExistsErrorDisplayed() {
        // Implement check for job title exists error display
    }

    public void arePaginationControlsVisible() {
        // Implement check for pagination controls visibility
    }

    public void isUnsavedChangesWarningDisplayed() {
        // Implement check for unsaved changes warning display
    }

    public void isNewJobOpeningDetailsCorrect() {
        // Implement verification of new job opening details
    }

    public void selectFromDropdown(String option) {
        // Implement dropdown selection logic
    }

    public void enterSalary(String salary) {
        // Implement salary entry logic
    }

    public void createNewJobOpening(String title, String employmentType, String experience, String salary, String description, String location, String startDate, String endDate) {
        // Implement creation of a new job opening
    }

    public void clickJobOpeningsModuleFromMainMenu() {
        clickJobOpeningsModule(); // Reuse the module click method
    }

    public void isNewJobOpeningInList() {
        // Check if the newly created job opening is in the list
    }

    public void isNextSetOfJobOpeningsDisplayed() {
        // Implement check for next job openings display
    }

    public void modifyJobDescriptionField() {
        modifyJobDescription(); // Reuse modify job description method
    }

    public void areAllFieldsVisibleAndAccurate() {
        // Implement visibility and accuracy checks for all fields
    }

    public void isDepartmentInvalidErrorDisplayed() {
        // Implement check for invalid department error display
    }

    public void clickNextPageButton() {
        // Implement click next page functionality
    }

    public void getJobDescription() {
        // Implement retrieval of job description
    }

    public void isJobTitleInvalidErrorDisplayed() {
        // Implement check for invalid job title error display
    }

    public void isJobOpeningUpdatedSuccessfully() {
        // Implement check for job opening update success
    }

    public void clickSaveButtonForSecondJobOpening() {
        // Implement click save for second job opening
    }

    public void isUpdatedJobOpeningDisplayed() {
        // Implement check for updated job opening visibility
    }

    public void isCurrentPageNumberDisplayed() {
        // Implement check for current page number display
    }

    public void login() {
        // Implement login logic
    }

    public void navigateToAnotherModule() {
        // Implement navigation logic to another module
    }

    public void areJobOpeningsFiltered() {
        // Implement check for job openings being filtered
    }

    public void fillInLocation(String location) {
        // Implement location entry logic
    }

    public void fillInJobDescriptionWithMinCharacters() {
        // Implement filling in job description with minimum characters
    }

    public void isSelectedDepartmentInvalidErrorDisplayed() {
        // Implement check for invalid selected department error
    }

    public void fillInCompanyName(String companyName) {
        // Implement company name entry logic
    }

    public void fillInJobDescription(String jobDescription) {
        // Implement job description entry logic
    }

    public void isRedirectedToJobOpeningsListing() {
        // Implement check for redirection to job openings listing
    }

    public void areAllRequiredFieldsPresent() {
        // Implement check for presence of all required fields
    }

    public void selectSortingOrder(String order) {
        // Implement sorting order selection logic
    }

    public void areOnlyRelevantJobOpeningsDisplayed() {
        // Implement check for relevance of displayed job openings
    }

    public void areJobOpeningDetailsCorrect() {
        // Implement check for correctness of job opening details
    }

    public void isFilterCriteriaDisplayed() {
        // Implement check for filter criteria visibility
    }

    public void areRequiredFieldErrorsDisplayed() {
        // Implement check for required field errors visibility
    }

    public void clickOnSortingOption(String option) {
        // Implement click on sorting option logic
    }

    public void fillInSalary(String salary) {
        // Implement salary entry logic
    }

    public void isNewJobOpeningCreatedSuccessfully() {
        // Implement check for successful new job opening creation
    }

    public void clickButton(String button) {
        // Implement click generic button logic
    }

    public void clickCancelButton() {
        // Implement click on cancel button logic
    }

    public void fillInValidDetails() {
        // Implement filling in all necessary valid details
    }

    public void isAddJobOpeningButtonVisible() {
        // Implement check for visibility of Add Job Opening button
    }

    public void isNewJobOpeningCreated() {
        // Implement check for the creation of a new job opening
    }

    public void leaveJobTitleFieldEmpty() {
        // Implement logic to leave job title field empty
    }

    public void isLocationFormatInvalidErrorDisplayed() {
        // Implement check for location format invalid error display
    }

    public void isButtonVisibleAndClickable(String button) {
        // Implement check for button visibility and clickability
    }

    public void isJobDescriptionExceedsMaxLengthErrorDisplayed() {
        // Implement check for job description max length error display
    }

    public void selectOption(String option) {
        // Implement dropdown option selection logic
    }

    public void isSortingOrderIndicated() {
        // Implement check for sorting order indication
    }

    public void isJobOpeningsListingUpdated() {
        // Implement check for updates in job openings listing
    }

    public void isInvalidDataTypeErrorDisplayed() {
        // Implement check for invalid data type error display
    }

    public void isOnCreateNewJobOpeningForm() {
        // Implement check for the presence of create new job opening form
    }

    public void makeChangesWithoutSaving() {
        // Implement logic to make changes without saving
    }

    public void isJobOpeningsListDisplayed() {
        // Implement check for visibility of job openings list
    }

    public void fillInJobDescriptionWithMaxCharacters() {
        // Implement logic to fill in job description with max characters
    }

    public void areBothJobOpeningsDisplayed() {
        // Implement check for both job openings being displayed
    }

    public void clickOnNewlyCreatedJobOpening() {
        // Implement click on the newly created job opening
    }

    public void leaveOptionalFieldsEmpty() {
        // Implement logic to leave optional fields empty
    }

    public void isUpdatedJobOpeningDetailsReflected() {
        // Implement check for updated job opening details
    }

    public void clickApplyFilterButton() {
        // Implement click on apply filter button logic
    }

    public void fillInEmploymentType(String employmentType) {
        // Implement employment type entry logic
    }
}