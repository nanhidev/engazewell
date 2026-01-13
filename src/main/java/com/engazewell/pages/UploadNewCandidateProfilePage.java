package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadNewCandidateProfilePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "profileSectionLink")
    private WebElement profileSectionLink;

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "fileInput")
    private WebElement fileInput;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    public UploadNewCandidateProfilePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToProfileSection() {
        try {
            elementUtils.clickElement(profileSectionLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void browseAndSelectFile(String filePath) {
        try {
            elementUtils.clearAndSendKeys(fileInput, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForUploadToComplete() {
        try {
            WebElement loadingIndicator = driver.findElement(By.id("loading-indicator"));
            new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOf(loadingIndicator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void validateSuccessMessage(String expectedMessage) {
        try {
            String actualMessage = elementUtils.getElementText(successMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Success message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void validateErrorMessage(String expectedMessage) {
        try {
            String actualMessage = elementUtils.getElementText(errorMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deselectFile() {
        // Implementation to deselect file if required
    }

    public void simulateNetworkFailure() {
        // Simulating network failure during upload process
    }

    public void simulateTimeout() {
        // Simulating timeout during upload process
    }

    public void selectUnsupportedFileType(String fileType) {
        // Implementation to select an unsupported file type
    }

    public void observeSystemResponse() {
        // Implementation to observe system response after actions
    }

    public boolean isUploadProcessInitiated() {
        // Implementation to check if upload process has been initiated
        return false; // Placeholder return statement
    }

    public boolean isUploadProcessCompleted() {
        // Implementation to check if upload process has completed
        return false; // Placeholder return statement
    }

    public boolean isUploadProcessCompletedSuccessfully() {
        // Implementation to check if upload process completed successfully
        return false; // Placeholder return statement
    }

    public void selectValidCandidateProfileFile() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isConfirmationMessageDisplayed() {
        try {
            WebElement confirmationMessage = driver.findElement(By.id("confirmation-message"));
            return elementUtils.isElementDisplayed(confirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectValidCandidateProfileFileWithLongFilename() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "long-filename-candidate-profile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileWithDocExtension() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "valid-candidate-profile.doc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileWithUTF8Encoding() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "utf8-candidate-profile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileWithSpaces() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "valid candidate profile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileWithSpanishText() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "perfil-candidato-valido.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFileOf2MB() {
        try {
            elementUtils.clearAndSendKeys(fileInput, "valid-candidate-profile-2MB.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}