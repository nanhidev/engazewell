package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "dashboardLink")
    private WebElement dashboardLink;
    @FindBy(id = "jobOpeningOption")
    private WebElement jobOpeningOption;
    @FindBy(id = "jobOpeningScreen")
    private WebElement jobOpeningScreen;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "createNewJobOpeningForm")
    private WebElement createNewJobOpeningForm;
    @FindBy(id = "jobTitleField")
    private WebElement jobTitleField;
    @FindBy(id = "jobDescriptionField")
    private WebElement jobDescriptionField;
    @FindBy(id = "companyNameField")
    private WebElement companyNameField;
    @FindBy(id = "salaryField")
    private WebElement salaryField;
    @FindBy(id = "locationField")
    private WebElement locationField;
    @FindBy(id = "minimumExperienceField")
    private WebElement minimumExperienceField;
    @FindBy(id = "maximumExperienceField")
    private WebElement maximumExperienceField;
    @FindBy(id = "qualificationField")
    private WebElement qualificationField;
    @FindBy(id = "responsibilitiesField")
    private WebElement responsibilitiesField;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    public CreateJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToDashboard() {
        elementUtils.clickElement(dashboardLink);
    }

    public void clicksOnJobOpeningOption() {
        elementUtils.clickElement(jobOpeningOption);
    }

    public boolean isJobOpeningScreenDisplayed() {
        return elementUtils.isElementDisplayed(jobOpeningScreen);
    }

    public void fillJobTitle(String jobTitle) {
        elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
    }

    public void fillJobDescription(String jobDescription) {
        elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
    }

    public void fillCompanyName(String companyName) {
        elementUtils.clearAndSendKeys(companyNameField, companyName);
    }

    public void fillSalary(String salary) {
        elementUtils.clearAndSendKeys(salaryField, salary);
    }

    public void fillLocation(String location) {
        elementUtils.clearAndSendKeys(locationField, location);
    }

    public void enterMinimumExperience(String minExperience) {
        elementUtils.clearAndSendKeys(minimumExperienceField, minExperience);
    }

    public void enterMaximumExperience(String maxExperience) {
        elementUtils.clearAndSendKeys(maximumExperienceField, maxExperience);
    }

    public void enterQualification(String qualification) {
        elementUtils.clearAndSendKeys(qualificationField, qualification);
    }

    public void enterResponsibilities(String responsibilities) {
        elementUtils.clearAndSendKeys(responsibilitiesField, responsibilities);
    }

    public void clickSave() {
        elementUtils.clickElement(saveButton);
    }

    public boolean isErrorMessageDisplayed(String expectedMessage) {
        String actualMessage = elementUtils.getElementText(errorMessage);
        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match!");
        return true;
    }

    public boolean isJobOpeningSavedSuccessfully() {
        // Implement logic to check if job opening was saved successfully
        return true; // Placeholder
    }

    public boolean isJobOpeningAvailableInList() {
        // Implement logic to check if job opening is available in the list
        return true; // Placeholder
    }

    public void navigateToCreateJobOpeningPage() {
        // Implement the logic to navigate to Create Job Opening page
    }

    public void fillInAllRequiredFieldsWithValidData() {
        fillJobTitle("Software Engineer");
        fillJobDescription("Job Description goes here.");
        fillCompanyName("Example Company");
        fillSalary("70000");
        fillLocation("Desired Location");
        enterMinimumExperience("2");
        enterMaximumExperience("5");
        enterQualification("Bachelor's Degree");
        enterResponsibilities("Develop and maintain software applications.");
    }

    public void isLocationRequiredErrorDisplayed() {
        WebElement errorElement = driver.findElement(By.id("locationRequiredError"));
        Assert.assertTrue("Location required error is not displayed!", errorElement.isDisplayed());
    }

    public void fillInBenefits() {
        WebElement benefitsField = driver.findElement(By.id("benefits"));
        elementUtils.clearAndSendKeys(benefitsField, "Health, Dental, Vision");
    }

    public void isMinExperienceRequiredErrorDisplayed() {
        WebElement errorElement = driver.findElement(By.id("minExperienceError"));
        Assert.assertTrue("Minimum experience required error is not displayed!", errorElement.isDisplayed());
    }

    public void clickAddJobOpeningButton() {
        elementUtils.clickElement(addJobOpeningButton);
    }

    public void leaveDepartmentFieldEmpty() {
        WebElement departmentField = driver.findElement(By.id("department"));
        elementUtils.clearElement(departmentField);
    }

    public void leaveLocationFieldEmpty() {
        WebElement locationField = driver.findElement(By.id("location"));
        elementUtils.clearElement(locationField);
    }

    public void fillInContactEmail(String email) {
        WebElement emailField = driver.findElement(By.id("contactEmail"));
        elementUtils.clearAndSendKeys(emailField, email);
    }

    public void fillInPhoneField(String phone) {
        WebElement phoneField = driver.findElement(By.id("phone"));
        elementUtils.clearAndSendKeys(phoneField, phone);
    }

    public void fillInJobRequirements(String requirements) {
        WebElement jobRequirementsField = driver.findElement(By.id("jobRequirements"));
        elementUtils.clearAndSendKeys(jobRequirementsField, requirements);
    }

    public void isJobOpeningAvailable() {
        // Logic to verify if a job opening is available can be implemented here
    }

    public void isCreateNewJobOpeningFormOpened() {
        Assert.assertTrue("Create Job Opening form is not displayed!", createNewJobOpeningForm.isDisplayed());
    }

    public void isAddJobOpeningButtonVisible() {
        Assert.assertTrue("Add Job Opening button is not visible!", addJobOpeningButton.isDisplayed());
    }

    public void areSaveCancelButtonsDisplayed() {
        WebElement saveButton = driver.findElement(By.id("saveButton"));
        WebElement cancelButton = driver.findElement(By.id("cancelButton"));
        Assert.assertTrue("Save button is not displayed!", saveButton.isDisplayed());
        Assert.assertTrue("Cancel button is not displayed!", cancelButton.isDisplayed());
    }

    public void isMaxExperienceGreaterThanMinErrorDisplayed() {
        WebElement errorElement = driver.findElement(By.id("maxExperienceError"));
        Assert.assertTrue("Max experience greater than min error is not displayed!", errorElement.isDisplayed());
    }

    public void isTotalOpeningsPositiveErrorDisplayed() {
        WebElement errorElement = driver.findElement(By.id("totalOpeningsError"));
        Assert.assertTrue("Total openings must be positive error is not displayed!", errorElement.isDisplayed());
    }

    public void leaveEmploymentTypeFieldEmpty() {
        WebElement employmentTypeField = driver.findElement(By.id("employmentType"));
        elementUtils.clearElement(employmentTypeField);
    }

    public void leaveOptionalFieldsEmpty() {
        // Logic to clear optional fields can be implemented here
    }

    public void enterValidDepartment(String department) {
        WebElement departmentField = driver.findElement(By.id("department"));
        elementUtils.clearAndSendKeys(departmentField, department);
    }

    public void enterValidTags(String tags) {
        WebElement tagsField = driver.findElement(By.id("tags"));
        elementUtils.clearAndSendKeys(tagsField, tags);
    }

    public void enterInvalidTags(String invalidTags) {
        WebElement tagsField = driver.findElement(By.id("tags"));
        elementUtils.clearAndSendKeys(tagsField, invalidTags);
    }
}