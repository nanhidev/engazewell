package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class SchedulePanelInterviewPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    // Web Elements
    @FindBy(id = "createInterviewButton")
    private WebElement createInterviewButton;
    @FindBy(id = "jobOpeningDropdown")
    private WebElement jobOpeningDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "candidateEmailField")
    private WebElement candidateEmailField;
    @FindBy(id = "panelInterviewOption")
    private WebElement panelInterviewOption;
    @FindBy(id = "interviewDateField")
    private WebElement interviewDateField;
    @FindBy(id = "startTimeField")
    private WebElement startTimeField;
    @FindBy(id = "nextButton")
    private WebElement nextButton;
    @FindBy(id = "confirmSendButton")
    private WebElement confirmSendButton;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;
    @FindBy(id = "updateConfirmationMessage")
    private WebElement updateConfirmationMessage;

    // Constructor
    public SchedulePanelInterviewPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods for interactions
    public void navigateToScheduleInterviewSection() {
        driver.get("localhost/schedule-interview");
    }

    public void clickCreateInterview() {
        elementUtils.clickElement(createInterviewButton);
    }

    public void selectJobOpening(String jobOpening) {
        elementUtils.clickElement(jobOpeningDropdown);
        elementUtils.selectOptionInDropdown(jobOpeningDropdown, jobOpening);
    }

    public void selectLocation(String location) {
        elementUtils.clickElement(locationDropdown);
        elementUtils.selectOptionInDropdown(locationDropdown, location);
    }

    public void enterCandidateEmail(String candidateEmail) {
        elementUtils.clearAndSendKeys(candidateEmailField, candidateEmail);
    }

    public void choosePanelInterviewOption() {
        elementUtils.clickElement(panelInterviewOption);
    }

    public void selectInterviewDateAndStartTime(String interviewDate, String startTime) {
        elementUtils.clearAndSendKeys(interviewDateField, interviewDate);
        elementUtils.clearAndSendKeys(startTimeField, startTime);
    }

    public void clickNext() {
        elementUtils.clickElement(nextButton);
    }

    public void clickConfirmAndSend() {
        elementUtils.clickElement(confirmSendButton);
    }

    public boolean isConfirmationMessageDisplayed() {
        return elementUtils.isElementDisplayed(confirmationMessage);
    }

    public boolean isUpdateConfirmationMessageDisplayed() {
        return elementUtils.isElementDisplayed(updateConfirmationMessage);
    }

    public void verifyCandidateEmailNotification() {
        // Logic to verify candidate email notification
    }

    public void verifyNotificationsSent() {
        // Logic to verify notifications sent
    }

    public void verifyOptionalFieldsSaved() {
        // Logic to verify optional fields saved
    }

    public void areAttendeesNotified() {
        // Logic to verify attendees notified
    }

    public void isErrorMessageDisplayedForInterviewDate() {
        WebElement errorMessage = driver.findElement(By.id("interviewDateError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for interview date.");
    }

    public void selectInterviewDate(String date) {
        WebElement dateField = driver.findElement(By.id("interviewDate"));
        elementUtils.clearAndSendKeys(dateField, date);
    }

    public void isEmailContentCorrect() {
        // Logic to verify email content
    }

    public void verifyUpdatedInterviewDetails() {
        // Logic to verify updated interview details
    }

    public void selectCandidate(String candidateName) {
        WebElement candidateDropdown = driver.findElement(By.id("candidateDropdown"));
        elementUtils.selectOptionInDropdown(candidateDropdown, candidateName);
    }

    public void selectMinimumNumberOfAttendees(int minAttendees) {
        WebElement minAttendeesField = driver.findElement(By.id("minAttendees"));
        elementUtils.clearAndSendKeys(minAttendeesField, String.valueOf(minAttendees));
    }

    public void clickEditInterview() {
        WebElement editButton = driver.findElement(By.id("editInterview"));
        elementUtils.clickElement(editButton);
    }

    public void selectMaximumNumberOfAttendees(int maxAttendees) {
        WebElement maxAttendeesField = driver.findElement(By.id("maxAttendees"));
        elementUtils.clearAndSendKeys(maxAttendeesField, String.valueOf(maxAttendees));
    }

    public void leaveInterviewDateFieldEmpty() {
        WebElement dateField = driver.findElement(By.id("interviewDate"));
        elementUtils.clearElement(dateField);
    }

    public void verifyCandidateEmailNotificationForCancellation() {
        // Logic to verify candidate email notification for cancellation
    }

    public void attachRequiredFiles(String filePath) {
        WebElement fileInput = driver.findElement(By.id("fileUpload"));
        fileInput.sendKeys(filePath);
    }

    public void makeChangesToInterviewDetails() {
        // Logic to make changes to interview details
    }

    public void isErrorMessageDisplayedForInvalidEmailFormat() {
        WebElement errorMessage = driver.findElement(By.id("invalidEmailError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for invalid email format.");
    }

    public void enterMaximumCharacterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("candidateEmail"));
        elementUtils.clearAndSendKeys(emailField, email);
    }

    public void enterInvalidEmailFormat(String email) {
        WebElement emailField = driver.findElement(By.id("candidateEmail"));
        elementUtils.clearAndSendKeys(emailField, email);
    }

    public void fillOptionalFields() {
        // Logic to fill optional fields
    }

    public void isCancellationConfirmationMessageDisplayed() {
        WebElement confirmationMessage = driver.findElement(By.id("cancellationConfirmation"));
        Assert.assertTrue(elementUtils.isElementDisplayed(confirmationMessage), "Cancellation confirmation message is not displayed.");
    }

    public void leaveCandidateFieldEmpty() {
        WebElement candidateField = driver.findElement(By.id("candidateEmail"));
        elementUtils.clearElement(candidateField);
    }

    public void leaveAttendeesFieldEmpty() {
        WebElement attendeesField = driver.findElement(By.id("attendees"));
        elementUtils.clearElement(attendeesField);
    }

    public void selectPastInterviewDate(String date) {
        WebElement pastDateField = driver.findElement(By.id("interviewDate"));
        elementUtils.clearAndSendKeys(pastDateField, date);
    }

    public void selectScheduledInterviewToCancel() {
        WebElement cancelInterviewOption = driver.findElement(By.id("cancelInterviewOption"));
        elementUtils.clickElement(cancelInterviewOption);
    }

    public void areNotificationsSent() {
        // Logic to check if notifications are sent
    }

    public void isErrorMessageDisplayedForJobOpening() {
        WebElement errorMessage = driver.findElement(By.id("jobOpeningError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for job opening.");
    }

    public void verifyScheduledInterviewInDashboard() {
        // Logic to verify scheduled interview in the dashboard
    }

    public void isErrorMessageDisplayedForCandidate() {
        WebElement errorMessage = driver.findElement(By.id("candidateError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for candidate.");
    }

    public void isInterviewDisplayedInDashboard() {
        // Logic to check if the interview is displayed in the dashboard
    }

    public void schedulePanelInterviewWithMultipleAttendees() {
        // Logic to schedule panel interview with multiple attendees
    }

    public void selectOverlappingInterviewDateAndStartTime(String date, String startTime) {
        WebElement dateField = driver.findElement(By.id("interviewDate"));
        elementUtils.clearAndSendKeys(dateField, date);
        WebElement timeField = driver.findElement(By.id("startTime"));
        elementUtils.clearAndSendKeys(timeField, startTime);
    }

    public void selectFromDropdown(String option) {
        WebElement dropdown = driver.findElement(By.id("dropdownMenu"));
        elementUtils.selectOptionInDropdown(dropdown, option);
    }

    public void selectFromAvailableOptions(String option) {
        WebElement availableOptionsDropdown = driver.findElement(By.id("availableOptions"));
        elementUtils.selectOptionInDropdown(availableOptionsDropdown, option);
    }

    public void selectAttendeesAndInterviewRound() {
        // Logic to select attendees and interview round
    }

    public void isCalendarInviteIncluded() {
        // Logic to verify if calendar invite is included
    }

    public void isCandidateNotified() {
        // Logic to verify if the candidate is notified
    }

    public void isInterviewInAttendeesCalendar() {
        // Logic to check if the interview is in attendees' calendar
    }

    public void clickCancelInterview() {
        WebElement cancelButton = driver.findElement(By.id("cancelInterview"));
        elementUtils.clickElement(cancelButton);
    }

    public void verifyUpdatedInterviewInDashboard() {
        // Logic to verify updated interview in the dashboard
    }

    public void verifyInterviewRemovedFromList() {
        // Logic to verify interview is removed from the list
    }

    public void clickSaveChanges() {
        WebElement saveButton = driver.findElement(By.id("saveChanges"));
        elementUtils.clickElement(saveButton);
    }

    public void verifyNotificationsSentForCancellation() {
        // Logic to verify notifications sent for cancellation
    }

    public void leaveJobOpeningFieldEmpty() {
        WebElement jobOpeningField = driver.findElement(By.id("jobOpening"));
        elementUtils.clearElement(jobOpeningField);
    }

    public void confirmCancellation() {
        WebElement confirmButton = driver.findElement(By.id("confirmCancellation"));
        elementUtils.clickElement(confirmButton);
    }

    public void selectScheduledInterviewToEdit() {
        WebElement scheduledInterview = driver.findElement(By.id("scheduledInterviewEditOption"));
        elementUtils.clickElement(scheduledInterview);
    }

    public void isErrorMessageDisplayedForAttendees() {
        WebElement errorMessage = driver.findElement(By.id("attendeesError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for attendees.");
    }

    public void leaveStartTimeFieldEmpty() {
        WebElement startTimeField = driver.findElement(By.id("startTime"));
        elementUtils.clearElement(startTimeField);
    }

    ublic void enterInterviewProvider(String providerName) {
        WebElement providerField = driver.findElement(By.id("interviewProvider"));
        elementUtils.clearAndSendKeys(providerField, providerName);
    }

    public void enterMinimumCharacterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("candidateEmail"));
        elementUtils.clearAndSendKeys(emailField, email);
    }

    public void areAllAttendeesNotified() {
        // Logic to check if all attendees are notified
    }

    public void selectJobOpeningFromDropdown(String jobOpening) {
        WebElement jobOpeningDropdown = driver.findElement(By.id("jobOpeningDropdown"));
        elementUtils.selectOptionInDropdown(jobOpeningDropdown, jobOpening);
    }

    public void isInterviewScheduled() {
        // Logic to verify if the interview is scheduled
    }

    public void isErrorMessageDisplayedForStartTime() {
        WebElement errorMessage = driver.findElement(By.id("startTimeError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for start time.");
    }

    public void clickConfirmSend() {
        WebElement confirmButton = driver.findElement(By.id("confirmSend"));
        elementUtils.clickElement(confirmButton);
    }

    public void isErrorMessageDisplayedForPastInterviewDate() {
        WebElement errorMessage = driver.findElement(By.id("pastInterviewDateError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for past interview date.");
    }

    public void verifyCandidateEmailNotificationForUpdate() {
        // Logic to verify candidate email notification for update
    }

    public void verifyNotificationsSentForChanges() {
        // Logic to verify notifications sent for changes
    }

    public void isErrorMessageDisplayedForOverlappingInterview() {
        WebElement errorMessage = driver.findElement(By.id("overlappingInterviewError"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Error message is not displayed for overlapping interview.");
    }

    public void isInterviewScheduledSuccessfully() {
        // Logic to verify if the interview is scheduled successfully
    }
}