package com.engazewell.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.engazewell.pages.LoginScreenforRecruitersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenforRecruiters extends DriverFactory {
LoginScreenforRecruitersPage loginPage = new LoginScreenforRecruitersPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginScreen();
}
@When("I enter {string} in the Email ID field")
public void i_enter_email_in_the_email_id_field(String emailId) {
loginPage.enterEmailId(emailId);
}
@When("I enter {string} in the Password field")
public void i_enter_password_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@When("I click on the 'Show Password' option")
public void i_click_on_the_show_password_option() {
loginPage.togglePasswordVisibility();
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
loginPage.isDashboardDisplayed();
}
@Then("the dashboard should load without errors")
public void the_dashboard_should_load_without_errors() {
loginPage.isDashboardLoadedWithoutErrors();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
loginPage.isLoginButtonEnabled();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
loginPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
loginPage.isPasswordVisible();
}
@Then("an error message {string} should be displayed")
public void an_error_message_should_be_displayed(String errorMessage) {
Assert.assertEquals(errorMessage, loginPage.getErrorMessage());
}
@Then("the user remains on the login screen")
public void the_user_remains_on_the_login_screen() {
loginPage.isLoginScreenDisplayed();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
loginPage.isLoginButtonEnabled();
}

@Given("I open the application in {string}")
public void i_open_the_application_in(String url) {
driver = DriverFactory.getDriver();
driver.get(url);
}
@When("I enter an email id with maximum allowed characters {string}")
public void i_enter_an_email_id_with_maximum_allowed_characters(String email) {
loginPage.enterEmailId(email);
}
@When("I enter a password with maximum allowed characters {string}")
public void i_enter_a_password_with_maximum_allowed_characters(String password) {
loginPage.enterPassword(password);
}
@When("I leave the email id field empty")
public void i_leave_the_email_id_field_empty() {
loginPage.clearEmailIdField();
}
@When("I leave the password field empty")
public void i_leave_the_password_field_empty() {
loginPage.clearPasswordField();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter(String password) {
loginPage.enterPassword(password);
}
@When("I clickElement the login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@When("I clickElement the login button again")
public void i_click_the_login_button_again() {
loginPage.clickLoginButton();
}
@When("I clickElement on the 'hide password' option")
public void i_click_on_the_hide_password_option() {
loginPage.clickHidePasswordOption();
}
@Then("the user should see an error message 'please enter your email id.'")
public void the_user_should_see_an_error_message_please_enter_your_email_id() {
Assert.assertEquals("please enter your email id.", loginPage.getEmailErrorMessage());
}
@Then("the user should see the error message 'password must be at least 6 characters long.'")
public void the_user_should_see_the_error_message_password_must_be_at_least_6_characters_long() {
Assert.assertEquals("password must be at least 6 characters long.", loginPage.getPasswordErrorMessage());
}
@Then("an error message 'please enter a valid email id.' is displayed")
public void an_error_message_please_enter_a_valid_email_id_is_displayed() {
Assert.assertEquals("please enter a valid email id.", loginPage.getEmailErrorMessage());
}
@Then("an error message 'please enter your password.' is displayed")
public void an_error_message_please_enter_your_password_is_displayed() {
Assert.assertEquals("please enter your password.", loginPage.getPasswordErrorMessage());
}
@Then("the error message 'incorrect email id or password.' should be displayed")
public void the_error_message_incorrect_email_id_or_password_should_be_displayed() {
Assert.assertEquals("incorrect email id or password.", loginPage.getLoginErrorMessage());
}
@Then("the user is redirected to the dashboard in {string}")
public void the_user_is_redirected_to_the_dashboard_in(String dashboardUrl) {
Assert.assertEquals(dashboardUrl, driver.getCurrentUrl());
}
}