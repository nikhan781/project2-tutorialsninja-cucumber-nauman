package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyAccountSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() throws InterruptedException {
    }

    @When("^I click on My Account link$")
    public void iClickOnMyAccountLink() {
        new HomePage().homepageMyAccountLink();
    }

    @And("^I select Register option$")
    public void iSelectRegisterOption() {
        new HomePage().selectMyAccountOptions("Register");
    }

    @Then("^I should navigate to Register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
    }

    @And("^I should see Register Account text$")
    public void iShouldSeeRegisterAccountText() {
        Assert.assertEquals("Register Account", new RegisterPage().getRegisterAccountText());

    }


    @And("^I select Login option$")
    public void iSelectLoginOption() {
        new MyAccountPage().selectMyAccountOptions("Login");
    }

    @Then("^I should navigate to Login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @And("^I should see Returning Customer text$")
    public void iShouldSeeReturningCustomerText() {
        Assert.assertEquals("Returning Customer", new LoginPage().getReturningCustomerText());
    }

    @And("^I enter first name$")
    public void iEnterFirstName() {
        new RegisterPage().sendTextFirstNameField("Hulk");
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        new RegisterPage().sendTextLastNameField("Man");
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new RegisterPage().sendTextEmailField("hulkman");
    }

    @And("^I enter phone number$")
    public void iEnterPhoneNumber() {
        new RegisterPage().sendTexTelephoneField("0123456789");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new RegisterPage().sendTextPasswordField("hulk123");
    }

    @And("^I enter confirm password$")
    public void iEnterConfirmPassword() {
        new RegisterPage().sendTextConfirmPasswordField("hulk123");
    }

    @And("^I click on Yes on Subscribe button$")
    public void iClickOnYesOnSubscribeButton() {
        new RegisterPage().selectSubscribeButtons("Yes");
    }

    @And("^I click on Privacy button$")
    public void iClickOnPrivacyButton() {
        new RegisterPage().clickOnPrivacyButton();
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("^I verify the account creation text$")
    public void iVerifyTheAccountCreationText() {
        Assert.assertEquals("Your Account Has Been Created!", new RegisterPage().getAccountCreatedMessage());
    }

    @And("^i click continue button after account creation$")
    public void iClickContinueButtonAfterAccountCreation() {
        new RegisterPage().clickOnContinueButtonAfterAccountCreation();
    }

    @And("^I select Logout option$")
    public void iSelectLogoutOption() {
        new HomePage().selectMyAccountOptions("Logout");
    }

    @And("^I verify account Logout text$")
    public void iVerifyAccountLogoutText() {
        Assert.assertEquals("Account Logout", new LoginPage().getAccountLogoutText());
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new LoginPage().clickOnContinueButtonLogout();
    }

    @Then("^I am able to register an account successfully$")
    public void iAmAbleToRegisterAnAccountSuccessfully() {
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        new LoginPage().sendTextToEmailAddressField(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().sendTextToPasswordField(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I verify My account Text$")
    public void iVerifyMyAccountText() {
        Assert.assertEquals("My Account", new MyAccountPage().getMyAccountText());
    }

    @Then("^I am able to login and logout successfully$")
    public void iAmAbleToLoginAndLogoutSuccessfully() {
    }

}
