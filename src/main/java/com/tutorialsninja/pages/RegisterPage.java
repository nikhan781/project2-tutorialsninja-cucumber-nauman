package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNo;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div//label[1]/input")
    WebElement subscribeButtonYes;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div//label[2]/input")
    WebElement subscribeButtonNo;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyButton;
    @CacheLookup
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonAfterAccountCreation;

    //this method will get text
    public String getRegisterAccountText() {
        log.info("Getting text : " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    //this method will send text to first name field
    public void sendTextFirstNameField(String fName) {
        log.info("Entering first name : " + fName);
        sendTextToElement(firstName, fName);
        log.info("Entering first name : " + fName);


    }

    //this method will send text to last name field
    public void sendTextLastNameField(String lName) {
        sendTextToElement(lastName, lName);
        log.info("Entering last name : " + lName);


    }

    //this method will send text to email field
    public void sendTextEmailField(String rEmail) {
        sendTextToElement(email, rEmail + getAlphaNumericString(2) + "@gmail.com");
        log.info("Entering email address : " + rEmail);


    }

    //this method will send text to telephone field
    public void sendTexTelephoneField(String telep) {
        sendTextToElement(telephoneNo, telep);
        log.info("Entering telephone : " + telep);

    }

    //this method will send text to password field
    public void sendTextPasswordField(String pass) {
        sendTextToElement(password, pass);
        log.info("Entering password : " + pass);


    }

    //this method will send text to confirm password field
    public void sendTextConfirmPasswordField(String cirPass) {
        sendTextToElement(confirmPassword, cirPass);
        log.info("Entering confirm password : " + cirPass);

    }

    //this method will click on subscribe button box
    public void selectSubscribeButtons(String op) {
        if (op.equalsIgnoreCase("Yes")) {
            clickOnElement(subscribeButtonYes);
            log.info("Clicking on Yes : " + op);
        } else if (op.equalsIgnoreCase("No")) {
            log.info("Clicking on No: " + op);
            clickOnElement(subscribeButtonNo);
        }
    }

    //this method will click on privacy button
    public void clickOnPrivacyButton() {
        clickOnElement(privacyButton);
        log.info("Clicking on privacy : " + privacyButton);
    }

    //this method will click on continue button
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton);

    }

    //this method will get text
    public String getAccountCreatedMessage() {
        log.info("Getting text : " + accountCreatedMessage);
        return getTextFromElement(accountCreatedMessage);
    }

    //this method will click on continue button
    public void clickOnContinueButtonAfterAccountCreation() {
        clickOnElement(continueButtonAfterAccountCreation);
        log.info("Clicking on continue button : " + continueButtonAfterAccountCreation);
    }

}
