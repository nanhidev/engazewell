package com.engazewell.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.engazewell.pages.CreateJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateJobOpening extends DriverFactory {
CreateJobOpeningPage createJobOpeningPage = new CreateJobOpeningPage(driver);
@Given("the recruiter is on the Dashboard")
public void the_recruiter_is_on_the_dashboard() {
createJobOpeningPage.navigateToDashboard();
}
@When("the recruiter clicks on the {string} option in the side navigation")
public void the_recruiter_clicks_on_the_option_in_the_side_navigation(String action) {
createJobOpeningPage.clicksOnJobOpeningOption(action);
}
@Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void the_button_should_be_visible(String button) {
createJobOpeningPage.isButtonVisible(button);
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String button) {
createJobOpeningPage.clicksOnAddJobOpeningButton(button);
}
@Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the {string} and {string} buttons should be displayed")
public void the_and_buttons_should_be_displayed(String button1, String button2) {
createJobOpeningPage.areButtonsDisplayed(button1, button2);
}
// DUPLICATE: @When("I select {string}")
public void i_select(String job_role) {
createJobOpeningPage.selectJobRole(job_role);
}
@And("I select {string}")
public void i_select_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@And("I enter {string} as Minimum Experience")
public void i_enter_as_minimum_experience(String min_experience) {
createJobOpeningPage.enterMinimumExperience(min_experience);
}
@And("I enter {string} as Maximum Experience")
public void i_enter_as_maximum_experience(String max_experience) {
createJobOpeningPage.enterMaximumExperience(max_experience);
}
@And("I enter {string} as Qualification")
public void i_enter_as_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@And("I enter {string} as Short Job Description")
public void i_enter_as_short_job_description(String short_job_description) {
createJobOpeningPage.enterShortJobDescription(short_job_description);
}
@And("I enter {string} as Responsibilities")
public void i_enter_as_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@And("I click on {string}")
public void i_click_on(String action) {
createJobOpeningPage.clicksOn(action);
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@And("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@Given("the recruiter fills the Job Title with {string}")
public void the_recruiter_fills_the_job_title_with(String job_title) {
createJobOpeningPage.fillJobTitle(job_title);
}
@And("the recruiter fills the Job Description with {string}")
public void the_recruiter_fills_the_job_description_with(String job_description) {
createJobOpeningPage.fillJobDescription(job_description);
}
@And("the recruiter fills the Company Name with {string}")
public void the_recruiter_fills_the_company_name_with(String company_name) {
createJobOpeningPage.fillCompanyName(company_name);
}
@And("the recruiter fills the Salary with {string}")
public void the_recruiter_fills_the_salary_with(String salary) {
createJobOpeningPage.fillSalary(salary);
}
@Then("an error message should be displayed indicating that Job Role is required")
public void an_error_message_should_be_displayed_indicating_that_job_role_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Job Role is required");
}
@Then("the job opening should not be saved")
public void the_job_opening_should_not_be_saved() {
createJobOpeningPage.isJobOpeningSaved();
}
@Given("the Employment Type field is empty")
public void the_employment_type_field_is_empty() {
createJobOpeningPage.leaveEmploymentTypeFieldEmpty();
}
@Given("the recruiter leaves the Department field empty")
public void the_recruiter_leaves_the_department_field_empty() {
createJobOpeningPage.leaveDepartmentFieldEmpty();
}
@Then("an error message should be displayed indicating that Employment Type is required")
public void an_error_message_should_be_displayed_indicating_that_employment_type_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Employment Type is required");
}
@Then("an error message should be displayed indicating that Department is required")
public void an_error_message_should_be_displayed_indicating_that_department_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Department is required");
}
@Given("the recruiter is on the Create Job Opening Page")
public void the_recruiter_is_on_the_create_job_opening_page() {
createJobOpeningPage.navigateToCreateJobOpeningPage();
}
@Then("an error message should be displayed indicating that Work Mode is required")
public void an_error_message_should_be_displayed_indicating_that_work_mode_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Work Mode is required");
}
@Then("an error message should be displayed indicating that Status is required")
public void an_error_message_should_be_displayed_indicating_that_status_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Status is required");
}
@Then("an error message should be displayed indicating that Vendors selection is required")
public void an_error_message_should_be_displayed_indicating_that_vendors_selection_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Vendors selection is required");
}
@Then("an error message should be displayed indicating that Tags must be in a valid format")
public void an_error_message_should_be_displayed_indicating_that_tags_must_be_in_a_valid_format() {
createJobOpeningPage.isErrorMessageDisplayed("Tags must be in a valid format");
}

@Given("the recruiter enters {string} as minimum experience")
public void the_recruiter_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Given("the recruiter enters {string} as maximum experience")
public void the_recruiter_enters_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@Then("an error message should be displayed indicating that location is required")
public void an_error_message_should_be_displayed_indicating_that_location_is_required() {
createJobOpeningPage.isLocationRequiredErrorDisplayed();
}
@When("the recruiter fills the location with {string}")
public void the_recruiter_fills_the_location_with(String location) {
createJobOpeningPage.fillLocation(location);
}
@When("I fill in the description {string}")
public void i_fill_in_the_description(String description) {
createJobOpeningPage.fillInDescription(description);
}
@When("the recruiter enters a valid department")
public void the_recruiter_enters_a_valid_department() {
createJobOpeningPage.enterValidDepartment();
}
// DUPLICATE: @When("the recruiter selects the location {string}")
public void the_recruiter_selects_the_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("I fill in the job description with {string}")
public void i_fill_in_the_job_description_with(String jobDescription) {
createJobOpeningPage.fillInJobDescription(jobDescription);
}
@When("the recruiter clicks on the job opening option in the side navigation")
public void the_recruiter_clicks_on_the_job_opening_option_in_the_side_navigation() {
createJobOpeningPage.clickJobOpeningOption();
}
@When("I leave the minimum experience field empty")
public void i_leave_the_minimum_experience_field_empty() {
createJobOpeningPage.leaveMinimumExperienceFieldEmpty();
}
@When("the recruiter leaves optional fields empty")
public void the_recruiter_leaves_optional_fields_empty() {
createJobOpeningPage.leaveOptionalFieldsEmpty();
}
@When("the user enters {string}")
public void the_user_enters(String userInput) {
createJobOpeningPage.enterUserInput(userInput);
}
@When("I clickElement on save")
public void i_click_on_save() {
createJobOpeningPage.clickSave();
}
@Then("the job opening should be available in the job opening list with all details")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_all_details() {
createJobOpeningPage.isJobOpeningAvailable();
}
@When("the recruiter selects a job role {string}")
public void the_recruiter_selects_a_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("I fill in the job title {string}")
public void i_fill_in_the_job_title(String jobTitle) {
createJobOpeningPage.fillInJobTitle(jobTitle);
}
@When("the recruiter enters qualification {string}")
public void the_recruiter_enters_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
@When("I leave the work mode field empty")
public void i_leave_the_work_mode_field_empty() {
createJobOpeningPage.leaveWorkModeFieldEmpty();
}
@Then("an error message should be displayed indicating that maximum experience must be greater than minimum experience")
public void an_error_message_should_be_displayed_indicating_that_maximum_experience_must_be_greater_than_minimum_experience() {
createJobOpeningPage.isMaxExperienceGreaterThanMinErrorDisplayed();
}
@When("the recruiter fills in the job title field with {string}")
public void the_recruiter_fills_in_the_job_title_field_with(String jobTitle) {
createJobOpeningPage.fillInJobTitle(jobTitle);
}
@When("the user fills in {string}, {string}, {string} with valid data")
public void the_user_fills_in_with_valid_data(String field1, String field2, String field3) {
createJobOpeningPage.fillInValidData(field1, field2, field3);
}
@When("the recruiter clicks the save button")
public void the_recruiter_clicks_the_save_button() {
createJobOpeningPage.clickSave();
}
@When("the recruiter fills in the phone field with {string}")
public void the_recruiter_fills_in_the_phone_field_with(String phone) {
createJobOpeningPage.fillInPhoneField(phone);
}
@Then("an error message should be displayed indicating that minimum experience is required")
public void an_error_message_should_be_displayed_indicating_that_minimum_experience_is_required() {
createJobOpeningPage.isMinExperienceRequiredErrorDisplayed();
}
@When("the recruiter enters a valid industry type {string}")
public void the_recruiter_enters_a_valid_industry_type(String industryType) {
createJobOpeningPage.enterValidIndustryType(industryType);
}
@When("the user enters all optional fields {string} {string}")
public void the_user_enters_all_optional_fields(String optionalField1, String optionalField2) {
createJobOpeningPage.fillInOptionalFields(optionalField1, optionalField2);
}
@When("the recruiter fills in the email field with {string}")
public void the_recruiter_fills_in_the_email_field_with(String email) {
createJobOpeningPage.fillInEmailField(email);
}
@Then("I should see an error message indicating that status is required")
public void i_should_see_an_error_message_indicating_that_status_is_required() {
createJobOpeningPage.isStatusRequiredErrorDisplayed();
}
@When("I fill in the job salary with {string}")
public void i_fill_in_the_job_salary_with(String salary) {
createJobOpeningPage.fillInJobSalary(salary);
}
@When("the recruiter enters valid tags")
public void the_recruiter_enters_valid_tags() {
createJobOpeningPage.enterValidTags();
}
@When("the user leaves the industry type field empty")
public void the_user_leaves_the_industry_type_field_empty() {
createJobOpeningPage.leaveIndustryTypeFieldEmpty();
}
@When("I fill in the salary {string}")
public void i_fill_in_the_salary(String salary) {
createJobOpeningPage.fillInSalary(salary);
}
@When("the user enters invalid tags {string}")
public void the_user_enters_invalid_tags(String invalidTags) {
createJobOpeningPage.enterInvalidTags(invalidTags);
}
@When("I fill in the contact email {string}")
public void i_fill_in_the_contact_email(String contactEmail) {
createJobOpeningPage.fillInContactEmail(contactEmail);
}
@When("the user fills in all other required fields with valid data")
public void the_user_fills_in_all_other_required_fields_with_valid_data() {
createJobOpeningPage.fillInAllRequiredFieldsWithValidData();
}
@Then("the location field is left empty")
public void the_location_field_is_left_empty() {
createJobOpeningPage.leaveLocationFieldEmpty();
}
@When("the user selects {string}")
public void the_user_selects(String selection) {
createJobOpeningPage.selectOption(selection);
}
@Then("the save cancel buttons should be displayed")
public void the_save_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveCancelButtonsDisplayed();
}
@When("I fill in the company name {string}")
public void i_fill_in_the_company_name(String companyName) {
createJobOpeningPage.fillInCompanyName(companyName);
}
@When("I fill in the contact phone {string}")
public void i_fill_in_the_contact_phone(String contactPhone) {
createJobOpeningPage.fillInContactPhone(contactPhone);
}
@When("I fill in the benefits {string}")
public void i_fill_in_the_benefits(String benefits) {
createJobOpeningPage.fillInBenefits(benefits);
}
@When("I fill in the job requirements with {string}")
public void i_fill_in_the_job_requirements_with(String jobRequirements) {
createJobOpeningPage.fillInJobRequirements(jobRequirements);
}
@Then("the add job opening button should be visible")
public void the_add_job_opening_button_should_be_visible() {
createJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("I leave the status field empty")
public void i_leave_the_status_field_empty() {
createJobOpeningPage.leaveStatusFieldEmpty();
}
@Then("an error message should be displayed indicating that total openings must be a positive number")
public void an_error_message_should_be_displayed_indicating_that_total_openings_must_be_a_positive_number() {
createJobOpeningPage.isTotalOpeningsPositiveErrorDisplayed();
}
@When("I select valid vendors {string}")
public void i_select_valid_vendors(String vendors) {
createJobOpeningPage.selectValidVendors(vendors);
}
}