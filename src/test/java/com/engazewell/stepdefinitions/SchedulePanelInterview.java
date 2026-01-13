package com.engazewell.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.engazewell.pages.SchedulePanelInterviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SchedulePanelInterview extends DriverFactory {
SchedulePanelInterviewPage schedulePanelInterviewPage = new SchedulePanelInterviewPage(driver);
@Given("the recruiter is on the Schedule Interview section")
public void the_recruiter_is_on_the_schedule_interview_section() {
schedulePanelInterviewPage.navigateToScheduleInterviewSection();
}
@When("I click on Create Interview")
public void i_click_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
@When("I select {string}")
public void i_select_job_opening(String job_opening) {
schedulePanelInterviewPage.selectJobOpening(job_opening);
}
// DUPLICATE: @When("I select {string}")
public void i_select_location(String location) {
schedulePanelInterviewPage.selectLocation(location);
}
@When("I enter {string}")
public void i_enter_candidate_email(String candidate_email) {
schedulePanelInterviewPage.enterCandidateEmail(candidate_email);
}
@When("I choose the Panel Interview option")
public void i_choose_the_panel_interview_option() {
schedulePanelInterviewPage.choosePanelInterviewOption();
}
@When("I select {string} and {string}")
public void i_select_interview_date_and_start_time(String interview_date, String start_time) {
schedulePanelInterviewPage.selectInterviewDateAndStartTime(interview_date, start_time);
}
// DUPLICATE: @When("I select {string} and {string}")
public void i_select_attendees_and_interview_round(String attendees, String interview_round) {
schedulePanelInterviewPage.selectAttendeesAndInterviewRound(attendees, interview_round);
}
// DUPLICATE: @When("I select {string}")
public void i_select_interview_provider(String interview_provider) {
schedulePanelInterviewPage.selectInterviewProvider(interview_provider);
}
@When("I click on Next")
public void i_click_on_next() {
schedulePanelInterviewPage.clickNext();
}
@When("I attach {string}")
public void i_attach_required_files(String required_files) {
schedulePanelInterviewPage.attachRequiredFiles(required_files);
}
@When("I click on Confirm and Send")
public void i_click_on_confirm_and_send() {
schedulePanelInterviewPage.clickConfirmAndSend();
}
@Then("the system displays a confirmation message for the scheduled interview")
public void the_system_displays_confirmation_message() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@Then("all optional fields are saved and displayed correctly in the interview details")
public void all_optional_fields_are_saved_and_displayed_correctly() {
schedulePanelInterviewPage.verifyOptionalFieldsSaved();
}
@Then("notifications are sent to all participants with the additional information included")
public void notifications_are_sent_to_all_participants() {
schedulePanelInterviewPage.verifyNotificationsSent();
}
@Then("the interview appears in the calendar of all attendees with all details")
public void the_interview_appears_in_calendar() {
schedulePanelInterviewPage.verifyInterviewInCalendar();
}
@Then("the candidate receives an email notification with all details")
public void the_candidate_receives_email_notification() {
schedulePanelInterviewPage.verifyCandidateEmailNotification();
}
@Then("the recruiter can view the scheduled interview in their dashboard with all information")
public void the_recruiter_can_view_scheduled_interview() {
schedulePanelInterviewPage.verifyScheduledInterviewInDashboard();
}
@When("the user selects a scheduled panel interview to edit")
public void the_user_selects_scheduled_panel_interview_to_edit() {
schedulePanelInterviewPage.selectScheduledInterviewToEdit();
}
@When("the user clicks on Edit Interview")
public void the_user_clicks_on_edit_interview() {
schedulePanelInterviewPage.clickEditInterview();
}
@When("the user makes changes to the Interview Date, Start Time, or Attendees")
public void the_user_makes_changes_to_interview_details() {
schedulePanelInterviewPage.makeChangesToInterviewDetails();
}
@When("the user clicks on Save Changes")
public void the_user_clicks_on_save_changes() {
schedulePanelInterviewPage.clickSaveChanges();
}
@Then("the system displays a confirmation message indicating that the interview has been updated")
public void the_system_displays_confirmation_message_for_update() {
schedulePanelInterviewPage.isUpdateConfirmationMessageDisplayed();
}
@Then("the updated interview details are reflected in the system")
public void the_updated_interview_details_are_reflected() {
schedulePanelInterviewPage.verifyUpdatedInterviewDetails();
}
@Then("notifications are sent to all attendees regarding the changes")
public void notifications_are_sent_to_all_attendees() {
schedulePanelInterviewPage.verifyNotificationsSentForChanges();
}
@Then("the candidate receives an email notification with updated interview details")
public void the_candidate_receives_email_notification_for_update() {
schedulePanelInterviewPage.verifyCandidateEmailNotificationForUpdate();
}
@Then("the recruiter can view the updated interview in their dashboard")
public void the_recruiter_can_view_updated_interview() {
schedulePanelInterviewPage.verifyUpdatedInterviewInDashboard();
}
@When("the user selects a scheduled panel interview to cancel")
public void the_user_selects_scheduled_panel_interview_to_cancel() {
schedulePanelInterviewPage.selectScheduledInterviewToCancel();
}
@When("the user clicks on Cancel Interview")
public void the_user_clicks_on_cancel_interview() {
schedulePanelInterviewPage.clickCancelInterview();
}
@When("the user confirms the cancellation")
public void the_user_confirms_cancellation() {
schedulePanelInterviewPage.confirmCancellation();
}
@Then("the system displays a confirmation message indicating that the interview has been canceled")
public void the_system_displays_cancellation_confirmation_message() {
schedulePanelInterviewPage.isCancellationConfirmationMessageDisplayed();
}
@Then("the interview is removed from the scheduled interviews list")
public void the_interview_is_removed_from_scheduled_interviews_list() {
schedulePanelInterviewPage.verifyInterviewRemovedFromList();
}
@Then("notifications are sent to all attendees regarding the cancellation")
public void notifications_are_sent_to_all_attendees_regarding_cancellation() {
schedulePanelInterviewPage.verifyNotificationsSentForCancellation();
}
@Then("the candidate receives an email notification about the cancellation")
public void the_candidate_receives_email_notification_about_cancellation() {
schedulePanelInterviewPage.verifyCandidateEmailNotificationForCancellation();
}
@When("the user leaves the Job Opening field empty")
public void the_user_leaves_job_opening_field_empty() {
schedulePanelInterviewPage.leaveJobOpeningFieldEmpty();
}
@Then("the system displays an error message indicating that the Job Opening must be selected")
public void the_system_displays_error_message_job_opening() {
schedulePanelInterviewPage.isErrorMessageDisplayedForJobOpening();
}
@Then("the user remains on the scheduling page")
public void the_user_remains_on_scheduling_page() {
schedulePanelInterviewPage.isOnSchedulingPage();
}
@Then("no interview is scheduled")
public void no_interview_is_scheduled() {
schedulePanelInterviewPage.isInterviewScheduled();
}
@When("the user leaves the Candidate field empty")
public void the_user_leaves_candidate_field_empty() {
schedulePanelInterviewPage.leaveCandidateFieldEmpty();
}
@Then("the system displays an error message indicating that a Candidate must be selected")
public void the_system_displays_error_message_candidate() {
schedulePanelInterviewPage.isErrorMessageDisplayedForCandidate();
}
@When("the user leaves the Interview Date field empty")
public void the_user_leaves_interview_date_field_empty() {
schedulePanelInterviewPage.leaveInterviewDateFieldEmpty();
}
@Then("the system displays an error message indicating that an Interview Date must be selected")
public void the_system_displays_error_message_interview_date() {
schedulePanelInterviewPage.isErrorMessageDisplayedForInterviewDate();
}
@When("the user leaves the Start Time field empty")
public void the_user_leaves_start_time_field_empty() {
schedulePanelInterviewPage.leaveStartTimeFieldEmpty();
}
@Then("the system displays an error message indicating that a Start Time must be selected")
public void the_system_displays_error_message_start_time() {
schedulePanelInterviewPage.isErrorMessageDisplayedForStartTime();
}
@When("the user leaves the Attendees field empty")
public void the_user_leaves_attendees_field_empty() {
schedulePanelInterviewPage.leaveAttendeesFieldEmpty();
}
@Then("the system displays an error message indicating that at least one Attendee must be selected")
public void the_system_displays_error_message_attendees() {
schedulePanelInterviewPage.isErrorMessageDisplayedForAttendees();
}
@When("the user selects a past Interview Date {string}")
public void the_user_selects_past_interview_date(String interview_date) {
schedulePanelInterviewPage.selectPastInterviewDate(interview_date);
}
@Then("the system displays an error message indicating that the Interview Date cannot be in the past")
public void the_system_displays_error_message_past_interview_date() {
schedulePanelInterviewPage.isErrorMessageDisplayedForPastInterviewDate();
}
@When("the user selects an Interview Date {string} and Start Time {string} that overlaps with an existing interview")
public void the_user_selects_overlapping_interview(String interview_date, String start_time) {
schedulePanelInterviewPage.selectOverlappingInterviewDateAndStartTime(interview_date, start_time);
}
@Then("the system displays an error message indicating that the interview time overlaps with an existing interview")
public void the_system_displays_error_message_overlapping_interview() {
schedulePanelInterviewPage.isErrorMessageDisplayedForOverlappingInterview();
}
@When("the user enters an invalid email format for the Candidate as {string}")
public void the_user_enters_invalid_email_format(String email) {
schedulePanelInterviewPage.enterInvalidEmailFormat(email);
}
@Then("the system displays an error message indicating that the email format is invalid")
public void the_system_displays_error_message_invalid_email_format() {
schedulePanelInterviewPage.isErrorMessageDisplayedForInvalidEmailFormat();
}
@When("the user enters a candidate email address that is at the maximum character limit")
public void the_user_enters_maximum_character_email() {
schedulePanelInterviewPage.enterMaximumCharacterEmail();
}
@Then("the system accepts the email address without errors")
public void the_system_accepts_email_address_without_errors() {
schedulePanelInterviewPage.isEmailAccepted();
}
@When("the user enters the candidate email address {string}")
public void the_user_enters_minimum_character_email(String email) {
schedulePanelInterviewPage.enterMinimumCharacterEmail(email);
}
@Then("the system should accept the email address without errors")
public void the_system_should_accept_email_address_without_errors() {
schedulePanelInterviewPage.isEmailAccepted();
}

@When("the recruiter selects {string} from the dropdown")
public void the_recruiter_selects_from_the_dropdown(String option) {
schedulePanelInterviewPage.selectFromDropdown(option);
}
@Then("the recruiter can view the scheduled interview in their dashboard")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard() {
schedulePanelInterviewPage.isInterviewDisplayedInDashboard();
}
@When("the recruiter chooses the panel interview option")
public void the_recruiter_chooses_the_panel_interview_option() {
schedulePanelInterviewPage.choosePanelInterviewOption();
}
@When("the recruiter selects the interview date {string} start time {string}")
public void the_recruiter_selects_the_interview_date_start_time(String date, String time) {
schedulePanelInterviewPage.selectInterviewDateAndStartTime(date, time);
}
@When("the recruiter clicks on create interview")
public void the_recruiter_clicks_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
@When("the recruiter selects the location {string}")
public void the_recruiter_selects_the_location(String location) {
schedulePanelInterviewPage.selectLocation(location);
}
@Then("notifications should be sent to all participants")
public void notifications_should_be_sent_to_all_participants() {
schedulePanelInterviewPage.areNotificationsSent();
}
@When("the recruiter enters the candidate's email address {string} and selects the candidate")
public void the_recruiter_enters_the_candidate_email_address_and_selects_the_candidate(String email) {
schedulePanelInterviewPage.enterCandidateEmailAndSelect(email);
}
@When("the recruiter enters the candidate's email address {string}")
public void the_recruiter_enters_the_candidate_email_address(String email) {
schedulePanelInterviewPage.enterCandidateEmail(email);
}
@Then("each attendee should receive an email notification with the interview details")
public void each_attendee_should_receive_an_email_notification_with_the_interview_details() {
schedulePanelInterviewPage.areAttendeesNotified();
}
@Then("all attendees receive notifications")
public void all_attendees_receive_notifications() {
schedulePanelInterviewPage.areAllAttendeesNotified();
}
@Then("the interview can be scheduled successfully")
public void the_interview_can_be_scheduled_successfully() {
schedulePanelInterviewPage.isInterviewScheduledSuccessfully();
}
@Then("the interview should be scheduled successfully")
public void the_interview_should_be_scheduled_successfully() {
schedulePanelInterviewPage.isInterviewScheduledSuccessfully();
}
@When("the recruiter selects a job opening from the dropdown")
public void the_recruiter_selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.selectJobOpeningFromDropdown();
}
@Then("the email should include a calendar invite for the interview")
public void the_email_should_include_a_calendar_invite_for_the_interview() {
schedulePanelInterviewPage.isCalendarInviteIncluded();
}
@When("the user selects {string} from the available options")
public void the_user_selects_from_the_available_options(String option) {
schedulePanelInterviewPage.selectFromAvailableOptions(option);
}
@When("the recruiter selects the minimum number of attendees {string}")
public void the_recruiter_selects_the_minimum_number_of_attendees(String minAttendees) {
schedulePanelInterviewPage.selectMinimumNumberOfAttendees(minAttendees);
}
@When("the recruiter selects the maximum number of attendees {string}")
public void the_recruiter_selects_the_maximum_number_of_attendees(String maxAttendees) {
schedulePanelInterviewPage.selectMaximumNumberOfAttendees(maxAttendees);
}
@Then("the candidate receives an email notification with interview details")
public void the_candidate_receives_an_email_notification_with_interview_details() {
schedulePanelInterviewPage.isCandidateNotified();
}
@When("the user selects attendees {string} interview round {string}")
public void the_user_selects_attendees_interview_round(String attendees, String round) {
schedulePanelInterviewPage.selectAttendeesAndInterviewRound(attendees, round);
}
@When("the user schedules a panel interview with multiple attendees")
public void the_user_schedules_a_panel_interview_with_multiple_attendees() {
schedulePanelInterviewPage.schedulePanelInterviewWithMultipleAttendees();
}
@When("the recruiter attaches the required files {string}")
public void the_recruiter_attaches_the_required_files(String files) {
schedulePanelInterviewPage.attachRequiredFiles(files);
}
@Then("the email should contain the correct interview date, start time, location")
public void the_email_should_contain_the_correct_interview_date_start_time_location() {
schedulePanelInterviewPage.isEmailContentCorrect();
}
@When("the recruiter fills in optional fields with {string} {string}")
public void the_recruiter_fills_in_optional_fields_with(String field1, String field2) {
schedulePanelInterviewPage.fillOptionalFields(field1, field2);
}
@When("the user selects the interview date")
public void the_user_selects_the_interview_date() {
schedulePanelInterviewPage.selectInterviewDate();
}
@Then("the interview appears in the calendar of all attendees")
public void the_interview_appears_in_the_calendar_of_all_attendees() {
schedulePanelInterviewPage.isInterviewInAttendeesCalendar();
}
@When("the user selects the candidate {string}")
public void the_user_selects_the_candidate(String candidate) {
schedulePanelInterviewPage.selectCandidate(candidate);
}
@When("the recruiter clicks on confirm send")
public void the_recruiter_clicks_on_confirm_send() {
schedulePanelInterviewPage.clickConfirmSend();
}
@When("the recruiter attaches required files")
public void the_recruiter_attaches_required_files() {
schedulePanelInterviewPage.attachRequiredFiles();
}
@When("the recruiter selects the job opening {string}")
public void the_recruiter_selects_the_job_opening(String jobOpening) {
schedulePanelInterviewPage.selectJobOpening(jobOpening);
}
@When("the recruiter selects {string} from the available options")
public void the_recruiter_selects_from_the_available_options(String option) {
schedulePanelInterviewPage.selectFromAvailableOptions(option);
}
}