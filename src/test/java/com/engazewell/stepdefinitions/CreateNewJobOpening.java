package com.engazewell.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.engazewell.pages.CreateNewJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateNewJobOpening extends DriverFactory {
CreateNewJobOpeningPage createNewJobOpeningPage = new CreateNewJobOpeningPage(driver);
@Given("the user is logged in")
public void the_user_is_logged_in() {
// Logic for user login
createNewJobOpeningPage.login();
}
@Given("the user clicks on the {string} menu item in the application")
public void the_user_clicks_on_the_menu_item_in_the_application(String menuItem) {
createNewJobOpeningPage.clickMenuItem(menuItem);
}
@When("the user waits for the Job Opening screen to load")
public void the_user_waits_for_the_job_opening_screen_to_load() {
createNewJobOpeningPage.waitForJobOpeningScreenToLoad();
}
@Then("the Job Opening page is displayed")
public void the_job_opening_page_is_displayed() {
createNewJobOpeningPage.isJobOpeningPageDisplayed();
}
@And("the {string} button is visible and clickable")
public void the_button_is_visible_and_clickable(String button) {
createNewJobOpeningPage.isButtonVisibleAndClickable(button);
}
// DUPLICATE: @When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String button) {
createNewJobOpeningPage.clickButton(button);
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
createNewJobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@And("all required fields are present")
public void all_required_fields_are_present() {
createNewJobOpeningPage.areAllRequiredFieldsPresent();
}
@Given("the user enters a valid Job Title {string}")
public void the_user_enters_a_valid_job_title(String jobTitle) {
createNewJobOpeningPage.enterJobTitle(jobTitle);
}
@And("the user enters a valid Job Description {string}")
public void the_user_enters_a_valid_job_description(String jobDescription) {
createNewJobOpeningPage.enterJobDescription(jobDescription);
}
@And("the user selects a valid Department {string}")
public void the_user_selects_a_valid_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@And("the user enters a valid Location {string}")
public void the_user_enters_a_valid_location(String location) {
createNewJobOpeningPage.enterLocation(location);
}
@When("the user clicks the {string} button")
public void the_user_clicks_the_save_button(String button) {
createNewJobOpeningPage.clickButton(button);
}
@Then("a success message is displayed confirming the job opening creation")
public void a_success_message_is_displayed_confirming_the_job_opening_creation() {
createNewJobOpeningPage.isSuccessMessageDisplayed();
}
@And("the new job opening appears in the Job Openings listing")
public void the_new_job_opening_appears_in_the_job_openings_listing() {
createNewJobOpeningPage.isJobOpeningDisplayedInListing();
}
@Given("the user leaves the Job Title field empty")
public void the_user_leaves_the_job_title_field_empty() {
createNewJobOpeningPage.leaveJobTitleFieldEmpty();
}
@Then("an error message is displayed indicating that the Job Title is required")
public void an_error_message_is_displayed_indicating_that_the_job_title_is_required() {
createNewJobOpeningPage.isJobTitleRequiredErrorDisplayed();
}
@Then("the job opening is not created")
public void the_job_opening_is_not_created() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@Given("the user is on the Job Opening Creation Page")
public void the_user_is_on_the_job_opening_creation_page() {
createNewJobOpeningPage.navigateToJobOpeningCreationPage();
}
@When("I enter valid details in the form")
public void i_enter_valid_details_in_the_form() {
createNewJobOpeningPage.fillInValidDetails();
}
@And("I click the {string} button")
public void i_click_the_cancel_button(String button) {
createNewJobOpeningPage.clickButton(button);
}
@Then("the user should be redirected back to the Job Openings listing")
public void the_user_should_be_redirected_back_to_the_job_openings_listing() {
createNewJobOpeningPage.isRedirectedToJobOpeningsListing();
}
@Given("the user clicks on the newly created job opening")
public void the_user_clicks_on_the_newly_created_job_opening() {
createNewJobOpeningPage.clickOnNewlyCreatedJobOpening();
}
@Then("the job opening details are displayed correctly")
public void the_job_opening_details_are_displayed_correctly() {
createNewJobOpeningPage.areJobOpeningDetailsDisplayedCorrectly();
}
@And("all fields (Job Title, Job Description, Department, Location) are visible and accurate")
public void all_fields_are_visible_and_accurate() {
createNewJobOpeningPage.areAllFieldsVisibleAndAccurate();
}
@When("I click on the filter options")
public void i_click_on_the_filter_options() {
createNewJobOpeningPage.clickOnFilterOptions();
}
@And("I select {string} from the filter dropdown")
public void i_select_from_the_filter_dropdown(String department) {
createNewJobOpeningPage.selectDepartmentFromFilter(department);
}
@Then("the Job Openings listing updates to show only job openings that match the selected Department")
public void the_job_openings_listing_updates_to_show_only_job_openings_that_match_the_selected_department() {
createNewJobOpeningPage.isJobOpeningsListingUpdated();
}
@And("the filter criteria are displayed on the page")
public void the_filter_criteria_are_displayed_on_the_page() {
createNewJobOpeningPage.isFilterCriteriaDisplayed();
}
@When("the user clicks on the sorting option {string}")
public void the_user_clicks_on_the_sorting_option(String sortingOption) {
createNewJobOpeningPage.clickOnSortingOption(sortingOption);
}
@And("the user selects the sorting order {string}")
public void the_user_selects_the_sorting_order(String sortingOrder) {
createNewJobOpeningPage.selectSortingOrder(sortingOrder);
}
@Then("the Job Openings listing should update to show job openings sorted by the selected criteria")
public void the_job_openings_listing_should_update_to_show_job_openings_sorted_by_the_selected_criteria() {
createNewJobOpeningPage.isJobOpeningsListingSorted();
}
@And("the sorting order should be visually indicated on the page")
public void the_sorting_order_should_be_visually_indicated_on_the_page() {
createNewJobOpeningPage.isSortingOrderIndicated();
}
@Given("the user observes the pagination controls at the bottom of the listing")
public void the_user_observes_the_pagination_controls_at_the_bottom_of_the_listing() {
createNewJobOpeningPage.arePaginationControlsVisible();
}
@When("the user clicks on the next page button")
public void the_user_clicks_on_the_next_page_button() {
createNewJobOpeningPage.clickNextPageButton();
}
@Then("the Job Openings listing updates to show the next set of job openings")
public void the_job_openings_listing_updates_to_show_the_next_set_of_job_openings() {
createNewJobOpeningPage.isNextSetOfJobOpeningsDisplayed();
}
@And("the pagination controls reflect the current page number")
public void the_pagination_controls_reflect_the_current_page_number() {
createNewJobOpeningPage.isCurrentPageNumberDisplayed();
}
@When("the user creates a new job opening with valid details")
public void the_user_creates_a_new_job_opening_with_valid_details() {
createNewJobOpeningPage.createNewJobOpeningWithValidDetails();
}
@Then("a confirmation message is displayed indicating the job opening was created successfully")
public void a_confirmation_message_is_displayed_indicating_the_job_opening_was_created_successfully() {
createNewJobOpeningPage.isConfirmationMessageDisplayed();
}
@When("the user enters {string} as the Job Title")
public void the_user_enters_as_the_job_title(String jobTitle) {
createNewJobOpeningPage.enterJobTitle(jobTitle);
}
@Then("an error message is displayed indicating the Job Title already exists")
public void an_error_message_is_displayed_indicating_the_job_title_already_exists() {
createNewJobOpeningPage.isJobTitleExistsErrorDisplayed();
}
@When("the user enters {string} in the Salary field")
public void the_user_enters_in_the_salary_field(String salary) {
createNewJobOpeningPage.enterSalary(salary);
}
@Then("the system displays an error message indicating invalid data type")
public void the_system_displays_an_error_message_indicating_invalid_data_type() {
createNewJobOpeningPage.isInvalidDataTypeErrorDisplayed();
}
@When("the user makes changes to the form without saving")
public void the_user_makes_changes_to_the_form_without_saving() {
createNewJobOpeningPage.makeChangesWithoutSaving();
}
@Then("the system displays a warning message about unsaved changes")
public void the_system_displays_a_warning_message_about_unsaved_changes() {
createNewJobOpeningPage.isUnsavedChangesWarningDisplayed();
}
@When("the user leaves all required fields empty")
public void the_user_leaves_all_required_fields_empty() {
createNewJobOpeningPage.leaveAllRequiredFieldsEmpty();
}
@Then("error messages should be displayed for all required fields indicating they must be filled")
public void error_messages_should_be_displayed_for_all_required_fields_indicating_they_must_be_filled() {
createNewJobOpeningPage.areRequiredFieldErrorsDisplayed();
}

@Given("the user fills in the location with {string}")
public void the_user_fills_in_the_location_with(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@Then("the newly created job opening should be displayed in the listing")
public void the_newly_created_job_opening_should_be_displayed_in_the_listing() {
"The newly created job opening is not displayed in the listing.", createNewJobOpeningPage.isJobOpeningDisplayed();
}
@When("the user clicks the edit button")
public void the_user_clicks_the_edit_button() {
createNewJobOpeningPage.clickEditButton();
}
@Then("the job opening page is displayed with an add job opening button visible")
public void the_job_opening_page_is_displayed_with_an_add_job_opening_button_visible() {
"Add job opening button is not visible.", createNewJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("I enter a valid job description {string}")
public void i_enter_a_valid_job_description(String jobDescription) {
createNewJobOpeningPage.enterJobDescription(jobDescription);
}
@Then("the user has entered a job description {string}")
public void the_user_has_entered_a_job_description(String jobDescription) {
Assert.assertEquals("Job description does not match.", jobDescription, createNewJobOpeningPage.getJobDescription());
}
@Then("the updated job opening details are displayed in the listing")
public void the_updated_job_opening_details_are_displayed_in_the_listing() {
"Updated job opening details are not displayed in the listing.", createNewJobOpeningPage.isUpdatedJobOpeningDisplayed();
}
@When("I select a valid department {string}")
public void i_select_a_valid_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("the user attempts to navigate to another module")
public void the_user_attempts_to_navigate_to_another_module() {
createNewJobOpeningPage.navigateToAnotherModule();
}
@Then("the user should see an error message indicating that the selected department is invalid")
public void the_user_should_see_an_error_message_indicating_that_the_selected_department_is_invalid() {
"Error message for invalid department is not displayed.", createNewJobOpeningPage.isDepartmentInvalidErrorDisplayed();
}
@When("the user fills in the employment type field with {string}")
public void the_user_fills_in_the_employment_type_field_with(String employmentType) {
createNewJobOpeningPage.fillInEmploymentType(employmentType);
}
// DUPLICATE: @When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createNewJobOpeningPage.clickAddJobOpeningButton();
}
@When("I select {string} from the dropdown")
public void i_select_from_the_dropdown(String option) {
createNewJobOpeningPage.selectFromDropdown(option);
}
@Then("the job opening is updated successfully")
public void the_job_opening_is_updated_successfully() {
"Job opening was not updated successfully.", createNewJobOpeningPage.isJobOpeningUpdatedSuccessfully();
}
@Then("the user is redirected back to the job openings listing page")
public void the_user_is_redirected_back_to_the_job_openings_listing_page() {
"User is not redirected to the job openings listing page.", createNewJobOpeningPage.isOnJobOpeningsListingPage();
}
@When("the user has entered a valid location {string}")
public void the_user_has_entered_a_valid_location(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@Then("all fields should match the data entered during creation")
public void all_fields_should_match_the_data_entered_during_creation() {
"Fields do not match the data entered during creation.", createNewJobOpeningPage.doFieldsMatchEnteredData();
}
@Then("the new job opening should be created successfully")
public void the_new_job_opening_should_be_created_successfully() {
"New job opening was not created successfully.", createNewJobOpeningPage.isNewJobOpeningCreatedSuccessfully();
}
@When("the user selects an invalid department {string}")
public void the_user_selects_an_invalid_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("I fill in the job title field with {string}")
public void i_fill_in_the_job_title_field_with(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@When("I clickElement the apply filters button")
public void i_click_the_apply_filters_button() {
createNewJobOpeningPage.clickApplyFiltersButton();
}
@When("the user clicks the save button")
public void the_user_clicks_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@Then("a success message is displayed confirming the job opening update")
public void a_success_message_is_displayed_confirming_the_job_opening_update() {
"Success message for job opening update is not displayed.", createNewJobOpeningPage.isSuccessMessageDisplayed();
}
@Then("the newly created job opening is displayed in the list")
public void the_newly_created_job_opening_is_displayed_in_the_list() {
"Newly created job opening is not displayed in the list.", createNewJobOpeningPage.isNewJobOpeningInList();
}
@When("the user fills in the job description field with {string}")
public void the_user_fills_in_the_job_description_field_with(String jobDescription) {
createNewJobOpeningPage.fillInJobDescription(jobDescription);
}
// DUPLICATE: @When("I select {string}")
public void i_select(String option) {
createNewJobOpeningPage.selectOption(option);
}
@When("the user fills in the job description with {string}")
public void the_user_fills_in_the_job_description_with(String jobDescription) {
createNewJobOpeningPage.fillInJobDescription(jobDescription);
}
@When("I quickly clickElement add job opening again")
public void i_quickly_click_add_job_opening_again() {
createNewJobOpeningPage.clickAddJobOpeningButton();
}
@When("I fill in the job description field with {string}")
public void i_fill_in_the_job_description_field_with(String jobDescription) {
createNewJobOpeningPage.fillInJobDescription(jobDescription);
}
@When("I enter {string} in the company field")
public void i_enter_in_the_company_field(String companyName) {
createNewJobOpeningPage.fillInCompanyName(companyName);
}
@When("I enter a valid location")
public void i_enter_a_valid_location() {
createNewJobOpeningPage.fillInLocation("Valid Location");
}
@Then("an error message is displayed indicating that the job title already exists")
public void an_error_message_is_displayed_indicating_that_the_job_title_already_exists() {
"Error message for existing job title is not displayed.", createNewJobOpeningPage.isJobTitleExistsErrorDisplayed();
}
@When("the user leaves optional fields empty")
public void the_user_leaves_optional_fields_empty() {
createNewJobOpeningPage.leaveOptionalFieldsEmpty();
}
@Then("the new job opening appears in the job openings listing with the correct details")
public void the_new_job_opening_appears_in_the_job_openings_listing_with_the_correct_details() {
"New job opening details are incorrect in the listing.", createNewJobOpeningPage.isNewJobOpeningDetailsCorrect();
}
@Then("the user is redirected to the job openings listing page")
public void the_user_is_redirected_to_the_job_openings_listing_page() {
"User is not redirected to the job openings listing page.", createNewJobOpeningPage.isOnJobOpeningsListingPage();
}
@Then("the user observes the list of job openings")
public void the_user_observes_the_list_of_job_openings() {
"Job openings list is not displayed.", createNewJobOpeningPage.isJobOpeningsListDisplayed();
}
@When("the user clicks the cancel button on the create new job opening form")
public void the_user_clicks_the_cancel_button_on_the_create_new_job_opening_form() {
createNewJobOpeningPage.clickCancelButton();
}
@When("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String option) {
createNewJobOpeningPage.selectFromDropdown(option);
}
@Then("the system displays an error message indicating the location is invalid")
public void the_system_displays_an_error_message_indicating_the_location_is_invalid() {
"Error message for invalid location is not displayed.", createNewJobOpeningPage.isLocationInvalidErrorDisplayed();
}
@When("the user enters the location {string}")
public void the_user_enters_the_location(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@When("I enter {string} as the company name")
public void i_enter_as_the_company_name(String companyName) {
createNewJobOpeningPage.fillInCompanyName(companyName);
}
@When("I enter {string} as the salary")
public void i_enter_as_the_salary(String salary) {
createNewJobOpeningPage.fillInSalary(salary);
}
@Then("job openings are filtered based on the selected criteria")
public void job_openings_are_filtered_based_on_the_selected_criteria() {
"Job openings are not filtered based on the selected criteria.", createNewJobOpeningPage.areJobOpeningsFiltered();
}
@Then("the system displays an error message indicating the job title is invalid")
public void the_system_displays_an_error_message_indicating_the_job_title_is_invalid() {
"Error message for invalid job title is not displayed.", createNewJobOpeningPage.isJobTitleInvalidErrorDisplayed();
}
@When("I fill in other required fields with maximum allowed characters")
public void i_fill_in_other_required_fields_with_maximum_allowed_characters() {
createNewJobOpeningPage.fillInMaxAllowedCharacters();
}
@Then("the new job opening is created successfully")
public void the_new_job_opening_is_created_successfully() {
"New job opening was not created successfully.", createNewJobOpeningPage.isNewJobOpeningCreatedSuccessfully();
}
@Then("both job openings should be created successfully")
public void both_job_openings_should_be_created_successfully() {
"Both job openings were not created successfully.", createNewJobOpeningPage.areBothJobOpeningsCreatedSuccessfully();
}
@Then("no new job opening is created")
public void no_new_job_opening_is_created() {
"A new job opening was created when it should not have been.", createNewJobOpeningPage.isNewJobOpeningCreated();
}
@When("I select a valid department")
public void i_select_a_valid_department() {
createNewJobOpeningPage.selectValidDepartment();
}
@When("I clickElement save for the second job opening")
public void i_click_save_for_the_second_job_opening() {
createNewJobOpeningPage.clickSaveButtonForSecondJobOpening();
}
@When("I enter {string} in the description field")
public void i_enter_in_the_description_field(String description) {
createNewJobOpeningPage.fillInDescription(description);
}
@When("I select {string} from the department dropdown")
public void i_select_from_the_department_dropdown(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("I enter a job description with the minimum allowed characters")
public void i_enter_a_job_description_with_the_minimum_allowed_characters() {
createNewJobOpeningPage.fillInJobDescriptionWithMinCharacters();
}
@When("I create a new job opening with title {string}, employment type {string}, experience {string}, salary {string}, description {string}, location {string}, start date {string}, end date {string}")
public void i_create_a_new_job_opening_with_title_employment_type_experience_salary_description_location_start_date_end_date(String title, String employmentType, String experience, String salary, String description, String location, String startDate, String endDate) {
createNewJobOpeningPage.createNewJobOpening(title, employmentType, experience, salary, description, location, startDate, endDate);
}
@When("the user fills in the salary with {string}")
public void the_user_fills_in_the_salary_with(String salary) {
createNewJobOpeningPage.fillInSalary(salary);
}
@Then("the system displays an error message indicating the job title already exists")
public void the_system_displays_an_error_message_indicating_the_job_title_already_exists() {
"Error message for existing job title is not displayed.", createNewJobOpeningPage.isJobTitleExistsErrorDisplayed();
}
@When("I clickElement the apply filter button")
public void i_click_the_apply_filter_button() {
createNewJobOpeningPage.clickApplyFilterButton();
}
@Then("the user remains on the create new job opening form until they confirm to leave")
public void the_user_remains_on_the_create_new_job_opening_form_until_they_confirm_to_leave() {
"User is not remaining on the create new job opening form.", createNewJobOpeningPage.isOnCreateNewJobOpeningForm();
}
@When("the admin clicks on the add job opening button")
public void the_admin_clicks_on_the_add_job_opening_button() {
createNewJobOpeningPage.clickAddJobOpeningButton();
}
@When("I clickElement the cancel button")
public void i_click_the_cancel_button() {
createNewJobOpeningPage.clickCancelButton();
}
@When("the user modifies the job description to {string}")
public void the_user_modifies_the_job_description_to(String jobDescription) {
createNewJobOpeningPage.modifyJobDescription(jobDescription);
}
@Then("an error message is displayed indicating that the job title contains invalid characters")
public void an_error_message_is_displayed_indicating_that_the_job_title_contains_invalid_characters() {
"Error message for invalid job title characters is not displayed.", createNewJobOpeningPage.isJobTitleInvalidCharactersErrorDisplayed();
}
// DUPLICATE: @When("the user enters {string}")
public void the_user_enters(String input) {
createNewJobOpeningPage.enterInput(input);
}
@When("I leave optional fields empty")
public void i_leave_optional_fields_empty() {
createNewJobOpeningPage.leaveOptionalFieldsEmpty();
}
@When("I enter {string} in the job title field")
public void i_enter_in_the_job_title_field(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@Then("the newly created job opening is displayed in the listing")
public void the_newly_created_job_opening_is_displayed_in_the_listing() {
"Newly created job opening is not displayed in the listing.", createNewJobOpeningPage.isNewJobOpeningDisplayed();
}
@When("the user fills in the company name with {string}")
public void the_user_fills_in_the_company_name_with(String companyName) {
createNewJobOpeningPage.fillInCompanyName(companyName);
}
@Then("the system displays an error message indicating the job description is too long")
public void the_system_displays_an_error_message_indicating_the_job_description_is_too_long() {
"Error message for long job description is not displayed.", createNewJobOpeningPage.isJobDescriptionTooLongErrorDisplayed();
}
@When("the user fills in the description with {string}")
public void the_user_fills_in_the_description_with(String description) {
createNewJobOpeningPage.fillInDescription(description);
}
@Then("the add job opening button is visible clickable")
public void the_add_job_opening_button_is_visible_clickable() {
"Add job opening button is not visible or clickable.", createNewJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("I clickElement save")
public void i_click_save() {
createNewJobOpeningPage.clickSaveButton();
}
@When("the user modifies the job description field")
public void the_user_modifies_the_job_description_field() {
createNewJobOpeningPage.modifyJobDescriptionField();
}
@Then("the user should be redirected to the job openings listing page")
public void the_user_should_be_redirected_to_the_job_openings_listing_page() {
"User is not redirected to the job openings listing page.", createNewJobOpeningPage.isOnJobOpeningsListingPage();
}
@When("I enter {string} as the location")
public void i_enter_as_the_location(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@Then("an error message is displayed indicating that the job description exceeds the maximum length")
public void an_error_message_is_displayed_indicating_that_the_job_description_exceeds_the_maximum_length() {
"Error message for exceeding job description length is not displayed.", createNewJobOpeningPage.isJobDescriptionExceedsMaxLengthErrorDisplayed();
}
@Then("the new job opening appears in the job openings listing with only the filled fields")
public void the_new_job_opening_appears_in_the_job_openings_listing_with_only_the_filled_fields() {
"New job opening does not appear with only the filled fields.", createNewJobOpeningPage.isNewJobOpeningDisplayedWithFilledFields();
}
// DUPLICATE: @When("the user selects {string}")
public void the_user_selects(String option) {
createNewJobOpeningPage.selectOption(option);
}
@When("I enter {string} as the job description")
public void i_enter_as_the_job_description(String jobDescription) {
createNewJobOpeningPage.fillInJobDescription(jobDescription);
}
@When("the user clicks on the job openings module")
public void the_user_clicks_on_the_job_openings_module() {
createNewJobOpeningPage.clickJobOpeningsModule();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter(String input) {
createNewJobOpeningPage.enterInput(input);
}
@When("the user fills in the location field with {string}")
public void the_user_fills_in_the_location_field_with(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@Then("both job openings should be displayed in the listing")
public void both_job_openings_should_be_displayed_in_the_listing() {
"Both job openings are not displayed in the listing.", createNewJobOpeningPage.areBothJobOpeningsDisplayed();
}
@When("I clickElement the save button")
public void i_click_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@When("the user fills in the job title with {string}")
public void the_user_fills_in_the_job_title_with(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@When("I enter {string} in the location field")
public void i_enter_in_the_location_field(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@When("I select a {string} from the filter dropdown")
public void i_select_a_from_the_filter_dropdown(String filter) {
createNewJobOpeningPage.selectFilter(filter);
}
@Then("a new job opening is created successfully")
public void a_new_job_opening_is_created_successfully() {
"A new job opening was not created successfully.", createNewJobOpeningPage.isNewJobOpeningCreatedSuccessfully();
}
@Then("the user is redirected to the job openings listing")
public void the_user_is_redirected_to_the_job_openings_listing() {
"User is not redirected to the job openings listing.", createNewJobOpeningPage.isOnJobOpeningsListingPage();
}
@Then("the job opening should not be created")
public void the_job_opening_should_not_be_created() {
"A new job opening was created when it should not have been.", createNewJobOpeningPage.isNewJobOpeningCreated();
}
@When("I enter an invalid location {string}")
public void i_enter_an_invalid_location(String location) {
createNewJobOpeningPage.fillInLocation(location);
}
@Then("an error message is displayed indicating that the location format is invalid")
public void an_error_message_is_displayed_indicating_that_the_location_format_is_invalid() {
"Error message for invalid location format is not displayed.", createNewJobOpeningPage.isLocationFormatInvalidErrorDisplayed();
}
@Then("the job opening details are correct match the entered data")
public void the_job_opening_details_are_correct_match_the_entered_data() {
"Job opening details do not match the entered data.", createNewJobOpeningPage.areJobOpeningDetailsCorrect();
}
@Then("the updated job opening details are reflected in the job openings listing")
public void the_updated_job_opening_details_are_reflected_in_the_job_openings_listing() {
"Updated job opening details are not reflected in the job openings listing.", createNewJobOpeningPage.isUpdatedJobOpeningDetailsReflected();
}
@Then("only relevant job openings are displayed in the listing")
public void only_relevant_job_openings_are_displayed_in_the_listing() {
"Only relevant job openings are not displayed in the listing.", createNewJobOpeningPage.areOnlyRelevantJobOpeningsDisplayed();
}
@Then("the system displays error messages for each required field that is empty")
public void the_system_displays_error_messages_for_each_required_field_that_is_empty() {
"Error messages for empty required fields are not displayed.", createNewJobOpeningPage.areErrorMessagesDisplayedForEmptyFields();
}
@Then("the system displays an error message indicating the selected department is invalid")
public void the_system_displays_an_error_message_indicating_the_selected_department_is_invalid() {
"Error message for invalid selected department is not displayed.", createNewJobOpeningPage.isSelectedDepartmentInvalidErrorDisplayed();
}
@When("I fill in the job description field with the maximum allowed characters")
public void i_fill_in_the_job_description_field_with_the_maximum_allowed_characters() {
createNewJobOpeningPage.fillInJobDescriptionWithMaxCharacters();
}
@When("the user clicks on the job openings module from the main menu")
public void the_user_clicks_on_the_job_openings_module_from_the_main_menu() {
createNewJobOpeningPage.clickJobOpeningsModuleFromMainMenu();
}
@When("the user has selected a valid department {string}")
public void the_user_has_selected_a_valid_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@Then("the user should be redirected to the job openings listing page after each save")
public void the_user_should_be_redirected_to_the_job_openings_listing_page_after_each_save() {
"User is not redirected to the job openings listing page after save.", createNewJobOpeningPage.isOnJobOpeningsListingPage();
}
@When("I enter {string} in the salary field")
public void i_enter_in_the_salary_field(String salary) {
createNewJobOpeningPage.fillInSalary(salary);
}
@Then("job opening details should be displayed correctly")
public void job_opening_details_should_be_displayed_correctly() {
"Job opening details are not displayed correctly.", createNewJobOpeningPage.areJobOpeningDetailsDisplayedCorrectly();
}
@When("the user selects the department {string}")
public void the_user_selects_the_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("the user remains on the create new job opening form")
public void the_user_remains_on_the_create_new_job_opening_form() {
"User is not remaining on the create new job opening form.", createNewJobOpeningPage.isOnCreateNewJobOpeningForm();
}
@When("the user fills in other required fields with valid data")
public void the_user_fills_in_other_required_fields_with_valid_data() {
createNewJobOpeningPage.fillInOtherRequiredFieldsWithValidData();
}
}