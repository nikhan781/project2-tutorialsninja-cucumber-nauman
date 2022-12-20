package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductSelectionPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductSelectionPage.class.getName());
    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(xpath = "(//div[@class='col-sm-4'])[2]/h1")
    WebElement productName;
    @CacheLookup
    @FindBy(css = "i[class='fa fa-calendar']")
    WebElement calendarButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker']/div[1]/table/thead/tr[1]/th[2]")
    WebElement monthAndYearInCalendar;

    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker']/div[1]/table/thead/tr[1]/th[3]")
    WebElement nextMonthAndYearButtonInCalendar;

    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker']//div//table//td")
    List<WebElement> datesInCalendar;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement selectQuantity;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLinkInSuccessMessage;


    //This method will get the product name
    public String getSelectedProductName() {
        log.info("Getting My Product Name : " + productName.toString());
        return getTextFromElement(productName);
    }


    //This method will select date and yea
    public void selectDateAndYearOnCalendar(String month, String year) {

        clickOnElement(calendarButton);
        while (true) {
            String monthYear = getTextFromElement(monthAndYearInCalendar);
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextMonthAndYearButtonInCalendar);
            }

        }

    }

    //This method will select the date
    public void selectDateOnCalendar(String date) {
        List<WebElement> allDates = datesInCalendar;
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;

            }
        }

    }


    //This method will send text to qty box
    public void enterQuantityRequired(String quantity) {
        clearTextFromField(selectQuantity);
        sendTextToElement(selectQuantity, quantity);
        log.info("Entering quantity : " + quantity);
    }

    //This method will click on Add to Cart button
    public void clickAddToCartButton() throws InterruptedException {
        clickOnElement(addToCartButton);
        log.info("Clicking on Add to cart button: " + addToCartButton.toString());
        Thread.sleep(1500);


    }

    //This method will get the “Success: You have added HP LP3065 to your shopping cart!” message after clicking on Add To Cart
    public String getSuccessMessageAfterClickingAddToCartButton() {
        log.info("Getting Success Text : " + successMessage.toString());
        return getTextFromElement(successMessage);
    }


    //This method will click on Shopping Cart link in success message
    public void clickShoppingCartButtonInMessage() {
        clickOnElement(shoppingCartLinkInSuccessMessage);
        log.info("Clicking on Add to shopping cart button in message: " + shoppingCartLinkInSuccessMessage.toString());
    }

}

