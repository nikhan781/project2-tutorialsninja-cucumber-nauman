package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductSelectionPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopSteps {

    @When("^I hover mouser over Desktop link$")
    public void iHoverMouserOverDesktopLink() {
        new HomePage().hoverOverDesktopLink();
    }

    @And("^I click on Show All Desktops$")
    public void iClickOnShowAllDesktops() {
        new HomePage().clickOnShowAllDesktopsLink();
    }

    @And("^I select Z to A in sort by drop down bar$")
    public void iSelectZToAInSortByDropDownBar() {
        new DesktopsPage().sortByZtoA();
    }

    @Then("^Is should be able to see product arranged in descending alphabetical$")
    public void isShouldBeAbleToSeeProductArrangedInDescendingAlphabetical() {
        Assert.assertEquals(new DesktopsPage().beforeSortTheProducts(), new DesktopsPage().afterSortingTheProducts());
    }

    @And("^I select Sort By position A to Z \"([^\"]*)\"$")
    public void iSelectSortByPositionAToZ(String sortBy) {
        new DesktopsPage().sortByAtoZ();
    }

    @And("^I select product HP$")
    public void iSelectProductHP() {
        new DesktopsPage().clickOnHpLPDesktop();
    }

    @And("^I verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String product) {
        Assert.assertEquals(product, new ProductSelectionPage().getSelectedProductName());
    }

    @And("^I select Delivery month and year$")
    public void iSelectDeliveryMonthAndYear() {
        new ProductSelectionPage().selectDateAndYearOnCalendar("November", "2022");
    }

    @And("^I select Delivery Day$")
    public void iSelectDeliveryDay() {
        new ProductSelectionPage().selectDateOnCalendar("30");
    }

    @And("^I enter Qty$")
    public void iEnterQty() {
        new ProductSelectionPage().enterQuantityRequired("1");

    }

    @And("^I verify the Message$")
    public void iVerifyTheMessage() {
        Assert.assertTrue(new ProductSelectionPage().getSuccessMessageAfterClickingAddToCartButton().contains("Success: You have added HP LP3065 to your shopping cart!"));
    }

    @And("^I click on link shopping cart display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductSelectionPage().clickShoppingCartButtonInMessage();
    }

    @And("^I verify the cart text \"([^\"]*)\"$")
    public void iVerifyTheCartText(String cartText) {
        Assert.assertEquals(cartText, new ShoppingCartPage().getShoppingCartTextOnSHoppingCartPage());

    }

    @And("^I verify the Product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String text) {
        Assert.assertEquals(text, new ShoppingCartPage().getProductNameInCart());

    }

    @And("^I verify the Delivery Date \"([^\"]*)\"$")
    public void iVerifyTheDeliveryDate(String date) {
        Assert.assertEquals(date, new ShoppingCartPage().getDeliveryDateInCart());

    }

    @And("^I verify the Model$")
    public void iVerifyTheModel() {
        Assert.assertEquals("Product 21", new ShoppingCartPage().getModelNameInCart());
    }

    @And("^I verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String price) {
        Assert.assertEquals(price, new ShoppingCartPage().getTotalPriceOfProducts());
    }

    @Then("^should be able to added product to shopping cart successFully$")
    public void shouldBeAbleToAddedProductToShoppingCartSuccessFully() {

    }

}
