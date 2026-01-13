package com.engazewell.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.engazewell.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the recruiter is on the Profile section")
public void the_recruiter_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects the {string} candidate profile file")
public void the_user_browses_and_selects_the_candidate_profile_file(String file) {
uploadNewCandidateProfilePage.browseAndSelectFile(file);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("a success confirmation message is displayed to the user")
public void a_success_confirmation_message_is_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@Then("the system should display an error message indicating the file type is not supported")
public void the_system_should_display_an_error_message_indicating_the_file_type_is_not_supported() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message is displayed indicating the file exceeds the maximum size limit")
public void an_error_message_is_displayed_indicating_the_file_exceeds_the_maximum_size_limit() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message is displayed indicating that no file was selected")
public void an_error_message_is_displayed_indicating_that_no_file_was_selected() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message is displayed indicating a network failure occurred")
public void an_error_message_is_displayed_indicating_a_network_failure_occurred() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message is displayed indicating the upload process timed out")
public void an_error_message_is_displayed_indicating_the_upload_process_timed_out() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message should be displayed indicating the file is corrupted and cannot be uploaded")
public void an_error_message_should_be_displayed_indicating_the_file_is_corrupted_and_cannot_be_uploaded() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user browses and selects a file that exceeds the size limit")
public void the_user_browses_and_selects_a_file_that_exceeds_the_size_limit() {
uploadNewCandidateProfilePage.browseAndSelectFile("large_file_6MB.pdf");
}
@When("the user does not select any file")
public void the_user_does_not_select_any_file() {
uploadNewCandidateProfilePage.deselectFile();
}
@When("a network failure occurs during the upload process")
public void a_network_failure_occurs_during_the_upload_process() {
uploadNewCandidateProfilePage.simulateNetworkFailure();
}
@When("the system simulates a timeout during the upload process")
public void the_system_simulates_a_timeout_during_the_upload_process() {
uploadNewCandidateProfilePage.simulateTimeout();
}
@When("the user browses and selects a corrupted candidate profile file")
public void the_user_browses_and_selects_a_corrupted_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectFile("corrupted_file.docx");
}
@When("the user browses and selects a valid candidate profile file with special characters in the filename")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_special_characters_in_the_filename() {
uploadNewCandidateProfilePage.browseAndSelectFile("John_Doe@2023.pdf");
}
@When("the user browses and selects a valid candidate profile file with a very short filename")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_a_very_short_filename() {
uploadNewCandidateProfilePage.browseAndSelectFile("A.pdf");
}
@When("the user browses and selects a valid candidate profile file with spaces in the filename")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename() {
uploadNewCandidateProfilePage.browseAndSelectFile("John Doe Profile.pdf");
}

@Given("the user navigates to the profile section from the side navigation")
public void the_user_navigates_to_the_profile_section_from_the_side_navigation() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFile();
}
@When("the user browses selects a valid candidate profile file with spaces in the filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithSpaces();
}
@When("the user browses selects a valid candidate profile file with text in spanish")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_text_in_spanish() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithSpanishText();
}
@When("the user browses selects a valid candidate profile file with utf-8 encoding")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_utf_8_encoding() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithUTF8Encoding();
}
@When("the user browses selects a valid candidate profile file of 2mb")
public void the_user_browses_selects_a_valid_candidate_profile_file_of_2mb() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileOf2MB();
}
@When("the user browses selects a valid candidate profile file with a long filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_long_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithLongFilename();
}
@When("the user clicks the upload button")
public void the_user_clicks_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the recruiter clicks on the upload icon")
public void the_recruiter_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the recruiter clicks on the upload button")
public void the_recruiter_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload to complete confirms success")
public void the_user_waits_for_the_upload_to_complete_confirms_success() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@When("the upload process does not initiate")
public void the_upload_process_does_not_initiate() {
uploadNewCandidateProfilePage.isUploadProcessInitiated();
}
@When("the upload process does not complete successfully")
public void the_upload_process_does_not_complete_successfully() {
uploadNewCandidateProfilePage.isUploadProcessCompletedSuccessfully();
}
@When("the user browses selects an unsupported file type {string}")
public void the_user_browses_selects_an_unsupported_file_type(String fileType) {
uploadNewCandidateProfilePage.selectUnsupportedFileType(fileType);
}
@Then("a success confirmation message should be displayed to the user")
public void a_success_confirmation_message_should_be_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Then("the user should see the confirmation message")
public void the_user_should_see_the_confirmation_message() {
uploadNewCandidateProfilePage.isConfirmationMessageDisplayed();
}
@Then("the upload process should complete")
public void the_upload_process_should_complete() {
uploadNewCandidateProfilePage.isUploadProcessCompleted();
}
@Then("the upload process should complete successfully")
public void the_upload_process_should_complete_successfully() {
uploadNewCandidateProfilePage.isUploadProcessCompletedSuccessfully();
}
@Then("the upload process should not initiate")
public void the_upload_process_should_not_initiate() {
uploadNewCandidateProfilePage.isUploadProcessInitiated();
}
@When("the recruiter browses selects a valid candidate profile file with a .doc extension")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_with_a_doc_extension() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithDocExtension();
}
@Then("I observe the system's response")
public void i_observe_the_systems_response() {
uploadNewCandidateProfilePage.observeSystemResponse();
}
@Then("I wait for the upload process to complete")
public void i_wait_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
}