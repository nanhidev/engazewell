package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class LoginScreenforRecruitersPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailIdField")
    private WebElement emailIdField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "showPasswordOption")
    private WebElement showPasswordOption;

    @FindBy(id = "hidePasswordOption")
    private WebElement hidePasswordOption;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "emailErrorMessage")
    private WebElement emailErrorMessage;

    @FindBy(id = "passwordErrorMessage")
    private WebElement passwordErrorMessage;

    public LoginScreenforRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmailId(String emailId) {
        try {
            elementUtils.clearAndSendKeys(emailIdField, emailId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void togglePasswordVisibility() {
        try {
            if (elementUtils.isElementDisplayed(showPasswordOption)) {
                elementUtils.clickElement(showPasswordOption);
            } else if (elementUtils.isElementDisplayed(hidePasswordOption)) {
                elementUtils.clickElement(hidePasswordOption);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getEmailErrorMessage() {
        try {
            return elementUtils.getElementText(emailErrorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPasswordErrorMessage() {
        try {
            return elementUtils.getElementText(passwordErrorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clearEmailIdField() {
        try {
            elementUtils.clearElement(emailIdField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearPasswordField() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isLoginScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(emailIdField) && elementUtils.isElementDisplayed(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDashboardDisplayed() {
        try {
            WebElement dashboardElement = driver.findElement(By.id("dashboardIndicator")); // Replace with actual locator
            return elementUtils.isElementDisplayed(dashboardElement);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDashboardLoadedWithoutErrors() {
        try {
            return !elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordVisible() {
        try {
            return passwordField.getAttribute("type").equals("text");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickHidePasswordOption() {
        try {
            elementUtils.clickElement(hidePasswordOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost/login"); // Navigating to login screen
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getLoginErrorMessage() {
        try {
            WebElement errorMessageElement = driver.findElement(By.id("loginErrorMessage")); // Assuming ID for error message
            String actualErrorMessage = elementUtils.getElementText(errorMessageElement);
            String expectedErrorMessage = "Invalid credentials"; // Expected error message
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}