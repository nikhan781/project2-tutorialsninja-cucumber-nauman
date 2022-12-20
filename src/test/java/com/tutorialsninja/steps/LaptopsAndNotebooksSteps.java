package com.tutorialsninja.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LaptopsAndNotebooksSteps {
    @When("^I hover the over Laptops and Notebooks link$")
    public void iHoverTheOverLaptopsAndNotebooksLink() {
        new HomePage().hoverOverLaptopsAndNotebooksLink();
    }

    @And("^I click on Show All Laptops and Notebooks link$")
    public void iClickOnShowAllLaptopsAndNotebooksLink() {
        new HomePage().clickOnShowAllLaptopAndNotebooksLink();
    }

    @And("^I sort the price by High To Low$")
    public void iSortThePriceByHighToLow() {
        new LaptopsAndNotebooksPage().sortByPriceHigToLow();
    }

    @Then("^I should see products displayed from High to Low price successfully$")
    public void iShouldSeeProductsDisplayedFromHighToLowPriceSuccessfully() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().beforeSortTheProductsByPrice(), new LaptopsAndNotebooksPage().afterSortingTheProductsByPrice());
    }

    @When("^I hover mouse over menu \"([^\"]*)\"$")
    public void iHoverMouseOverMenu(String menu) throws InterruptedException {
        new TopMenuPage().hoverOverMainMenuBar(menu);

    }

    @And("^I select option \"([^\"]*)\"$")
    public void iSelectOption(String submenu) throws InterruptedException {
        new TopMenuPage().selectMenu(submenu);

    }

    @And("^I sort the products in High to Low price$")
    public void iSortTheProductsInHighToLowPrice() {
        new LaptopsAndNotebooksPage().sortByPriceHigToLow();
    }

    @And("^i select a product \"([^\"]*)\"$")
    public void iSelectAProduct(String product) throws InterruptedException {
        new LaptopsAndNotebooksPage().selectAProduct(product);

    }

    @And("^I verify product name \"([^\"]*)\"$")
    public void iVerifyProductName(String product) {
        Assert.assertEquals(product, new ProductSelectionPage().getSelectedProductName());

    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new ProductSelectionPage().clickAddToCartButton();

    }

    @And("^I verify the message Success: You have added MacBook to your shopping cart!$")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertTrue(new ProductSelectionPage().getSuccessMessageAfterClickingAddToCartButton().contains("Success: You have added MacBook to your shopping cart!"));
    }

    @And("^I click on Shopping Cart Button in Message$")
    public void iClickOnShoppingCartButtonInMessage() {
        new ProductSelectionPage().clickShoppingCartButtonInMessage();
    }

    @And("^I change the currency to Pound$")
    public void iChangeTheCurrencyToPound() {
        new HomePage().selectRequiredCurrency();
    }

    @And("^I verify \"([^\"]*)\" on Shopping cart page$")
    public void iVerifyOnShoppingCartPage(String text) {
        Assert.assertEquals(text, new ShoppingCartPage().getShoppingCartTextOnSHoppingCartPage());
    }

    @And("^I verify product name in cart is \"([^\"]*)\"$")
    public void iVerifyProductNameInCartIs(String text) {
        Assert.assertEquals(text, new ShoppingCartPage().getProductNameInCart());
    }

    @And("^I update the quantity to \"([^\"]*)\"$")
    public void iUpdateTheQuantityTo(String qty) {
        new ShoppingCartPage().updateQuantity(qty);
    }


    @And("^I verify the message as \"([^\"]*)\"$")
    public void iVerifyTheMessageAs(String message) {
        Assert.assertTrue(message, new ShoppingCartPage().getShoppingCartUpdatedMessage().contains("Success: You have modified your shopping cart!"));
    }

    @And("^I verify the total price \"([^\"]*)\"$")
    public void iVerifyTheTotalPrice(String price) {
        Assert.assertEquals(price, new ShoppingCartPage().getTotalPriceOfProducts());

    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() throws InterruptedException {

        new ShoppingCartPage().clickOnCheckOutButton();
        Thread.sleep(1000);
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String checkout) throws InterruptedException {
        Assert.assertEquals(checkout, new CheckoutPage().getCheckOutPageText());
        Thread.sleep(1000);
    }

    @And("^I verify the text as \"([^\"]*)\"$")
    public void iVerifyTheTextAs(String newCustomer) {
        Assert.assertEquals(newCustomer, new CheckoutPage().getNewCustomerText());

    }

    @And("^I click on Guest Checkout button$")
    public void iClickOnGuestCheckoutButton() {
        new CheckoutPage().clickOnGuestCheckout();

    }

    @And("^I click on customer checkout continue button$")
    public void iClickOnCustomerCheckoutContinueButton() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("^I enter First name \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new CheckoutPage().sendTextToFirstNameField(name);

    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String lName) {
        new CheckoutPage().sendTextToLastNameField(lName);
    }

    @And("^I enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new CheckoutPage().sendTextToEmailField(email);

    }

    @And("^I enter Telephone Number \"([^\"]*)\"$")
    public void iEnterTelephoneNumber(String tele) {
        new CheckoutPage().sendTextToTelephoneField(tele);
    }

    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String add) {
        new CheckoutPage().sendTextToAddressField(add);

    }

    @And("^I enter City \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new CheckoutPage().sendTextToCityField(city);
    }

    @And("^I enter Postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String pCode) {
        new CheckoutPage().sendTextToPostCOdeField(pCode);

    }

    @And("^I select Country \"([^\"]*)\"$")
    public void iSelectCountry(String country) {
        new CheckoutPage().selectCountry(country);

    }

    @And("^I select Region \"([^\"]*)\"$")
    public void iSelectRegion(String reg) throws InterruptedException {
        new CheckoutPage().selectRegion(reg);
        Thread.sleep(1000);
    }

    @And("^I click on Guest Continue button$")
    public void iClickOnGuestContinueButton() {
        new CheckoutPage().clickOnGuestContinueButton();
    }

    @And("^I add a comment \"([^\"]*)\"$")
    public void iAddAComment(String comm) {
        new CheckoutPage().sendTextToAddCommentBox(comm);
    }

    @And("^I click on term and conditions box$")
    public void iClickOnTermAndConditionsBox() {
        new CheckoutPage().clickOnTermAndConditionsCheckBox();
    }

    @And("^I click on continue button in comment section$")
    public void iClickOnContinueButtonInCommentSection() {
        new CheckoutPage().clickOnContinueButtonInCommentSection();
    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String message) {
        Assert.assertEquals(message, new CheckoutPage().getPaymentErrorMessage());
    }

    @Then("^I should be able to place order successfully$")
    public void iShouldBeAbleToPlaceOrderSuccessfully() {
    }


}
