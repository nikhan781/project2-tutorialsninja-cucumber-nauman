package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonLogout;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddress;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement loginButton;

    //This method will get text
    public String getReturningCustomerText() {
        log.info("Getting Return Customer Text : " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);
    }

    //This method will get text
    public String getAccountLogoutText() {
        log.info("Getting Account Logout Text : " + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }

    //This method will click on continue button
    public void clickOnContinueButtonLogout() {
        clickOnElement(continueButtonLogout);
        log.info("Clicking on continue button : " + continueButtonLogout.toString());
    }

    //This method will send text to email field
    public void sendTextToEmailAddressField(String emailId) {
        sendTextToElement(emailAddress, emailId);
        log.info("Sending text to email field : " + emailId);
    }

    //This method will send text to password field
    public void sendTextToPasswordField(String lPassword) {
        sendTextToElement(password, lPassword);
        log.info("Sending text to password field : " + lPassword);
    }

    //This method will click on Login button
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login button : " + loginButton.toString());
    }
}
