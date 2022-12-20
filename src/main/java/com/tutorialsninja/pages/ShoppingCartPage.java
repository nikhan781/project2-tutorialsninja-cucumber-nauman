package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[3]")
    WebElement modelName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[6]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input")
    WebElement quantityField;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[4]/div/span/button[1]")
    WebElement updateQty;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement cartUpdateMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkOutButton;


    //This method will get shopping cart text
    public String getShoppingCartTextOnSHoppingCartPage() {
        return getTextFromElement(shoppingCartText);
    }

    //This method will get product Name
    public String getProductNameInCart() {
        log.info("Getting text : " + productName);
        return getTextFromElement(productName);
    }

    //This method will get delivery date
    public String getDeliveryDateInCart() {
        log.info("Getting text : " + deliveryDate);
        return getTextFromElement(deliveryDate);
    }

    //This method will get model Name
    public String getModelNameInCart() {
        log.info("Getting text : " + modelName);
        return getTextFromElement(modelName);
    }

    //This method will get total
    public String getTotalPriceOfProducts() {
        log.info("Getting text : " + totalPrice);
        return getTextFromElement(totalPrice);
    }

    //This method will clear and update the quantity as per user requirement
    public void updateQuantity(String qty) {
        clearTextFromField(quantityField);
        sendTextToElement(quantityField, qty);
        clickOnElement(updateQty);
        log.info("Updating quantity : " + qty);


    }

    public String getShoppingCartUpdatedMessage() {
        log.info("Getting text : " + cartUpdateMessage);
        return getTextFromElement(cartUpdateMessage);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
        log.info("Clicking on : " + checkOutButton);


    }


}
