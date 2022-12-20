package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    //Declaring WebElement Variables
    @CacheLookup
    @FindBy(css = "i[class='fa fa-caret-down']")
    WebElement currencySelectionLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
    WebElement showAllDesktop;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]")
    WebElement laptopAndNotebooks;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
    WebElement showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//div[@class='btn-group open']/ul/li")
    List<WebElement> listOfCurrencies;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li//a")
    List<WebElement> listOfMyAccountOptions;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9']//h2")
    WebElement pageNames;


    //Method to select currency
    public void selectRequiredCurrency() {
        clickOnElement(currencySelectionLink);
        List<WebElement> currencyList = listOfCurrencies;
        for (WebElement currency : currencyList) {
            if (currency.getText().equalsIgnoreCase("£ Pound Sterling")) {
                log.info("Selecting the currency : " + currency);
                currency.click();
                break;
            }
        }


    }

    //Method to hover mouse on Desktops link
    public void hoverOverDesktopLink() {
        mouseHoverToElement(desktopLink);
        log.info("Hovering mouse over Desktops : " + desktopLink.toString());
    }

    //Method to hover mouse on Laptop and Notebooks link
    public void hoverOverLaptopsAndNotebooksLink() {
        clickOnElement(laptopAndNotebooks);
        log.info("Clicking over laptops and Notebooks : " + laptopAndNotebooks.toString());

    }

    //Method to click on Show All Desktops link
    public void clickOnShowAllDesktopsLink() {
        clickOnElement(showAllDesktop);
        log.info("Clicking over Show All Desktops : " + showAllDesktop.toString());
    }


    //Method to click on Show All Laptop & Notebooks link
    public void clickOnShowAllLaptopAndNotebooksLink() {
        clickOnElement(showAllLaptopsAndNotebooks);
        log.info("Clicking over Show All Laptops and Notebooks: " + showAllLaptopsAndNotebooks.toString());
    }

    //this method will click on My Account link
    public void homepageMyAccountLink() {
        clickOnElement(myAccountLink);
        log.info("Clicking on My Account link : " + myAccountLink.toString());
    }

    // This mehtod will select options from My Account
    public void selectMyAccountOptions(String options) {
        List<WebElement> accountOptionList = listOfMyAccountOptions;
        for (WebElement accountOptions : accountOptionList) {
            if (accountOptions.getText().equalsIgnoreCase(options)) {
                log.info("Selecting account options : " + accountOptions.toString());
                accountOptions.click();
                break;
            }
        }
    }

    public String getPagesNames() throws InterruptedException {
        Thread.sleep(1500);
        log.info("Getting page name : " + pageNames.toString());
        return getTextFromElement(pageNames);
    }

}
