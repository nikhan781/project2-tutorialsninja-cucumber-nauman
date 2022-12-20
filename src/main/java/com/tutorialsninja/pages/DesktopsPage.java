package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProducts;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement hpLp2065;

    //This method will select A to Z
    public void sortByAtoZ() {
        selectByVisibleTextFromDropDown(sortBy, "Name (A - Z)");
        log.info("Selecting A to Z from Sort By : " + sortBy.toString());


    }

    //This method will select Z to A
    public void sortByZtoA() {
        selectByVisibleTextFromDropDown(sortBy, "Name (Z - A)");
        log.info("Selecting Z to A from Sort By : " + sortBy.toString());
    }

    //This method verify the sort by type
    public ArrayList beforeSortTheProducts() {
        List<WebElement> products = listOfProducts;
        ArrayList<String> originalProductList = new ArrayList();
        for (WebElement list : products) {
            originalProductList.add(list.getText());
        }
        return originalProductList;
    }

    //This method verify the sort by type
    public ArrayList afterSortingTheProducts() {
        Collections.reverse(beforeSortTheProducts());
        System.out.println(beforeSortTheProducts());
        List<WebElement> products = listOfProducts;
        ArrayList<String> afterSortList = new ArrayList();
        for (WebElement newList : products) {
            afterSortList.add(newList.getText());
        }
        return afterSortList;
    }

    //This method will click on HP LP3065
    public void clickOnHpLPDesktop() {
        clickOnElement(hpLp2065);
        log.info("Clicking on Product : " + hpLp2065.toString());

    }

}
