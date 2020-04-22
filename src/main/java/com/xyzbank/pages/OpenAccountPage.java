package com.xyzbank.pages;

import com.xyzbank.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

/*
Ravi's Creation
 */

public class OpenAccountPage extends UtilityRM {

    // initiate log4j properties
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());


    // customer name
    @FindBy(id = "userSelect")
    WebElement _customerName;
    //currecy name
    @FindBy(id = "currency")
    WebElement _currency;
    //clicking process
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processBtn;

    //search customer name
    public void searchCustomerName() {
        Reporter.log("search customer" + _customerName.toString() + "<br>");
        clickOnElement(_customerName);
        log.info("search customer" + _customerName.toString());
    }

    // select customer name
    public void selectCustomerName(String strCustName) {
        Reporter.log("select customer name" + _customerName + "from drop menu" + _customerName.toString() + "<br.");
        selectByVisibleTextFromDropDown(_customerName, strCustName);
        log.info("select customer name" + _customerName + "from drop menu" + _customerName.toString());
    }

    //search currency name
    public void searchCurrencyName() {
        Reporter.log("search currency" + _currency.toString() + "<br>");
        clickOnElement(_currency);
        log.info("search currency" + _currency.toString());
    }

    //select currency from drop down
    public void selectCurrency(String strcurrency) {
        Reporter.log("select currency" + _currency + "form list" + _currency.toString() + "<br>");
        selectByVisibleTextFromDropDown(this._currency, strcurrency);
        log.info("select currency" + _currency + "form list" + _currency.toString());
    }
    //click on press btn
    public void clickOnProcessButton() {
        Reporter.log("click on press btn" + _processBtn.toString() + "<br>");
        clickOnElement(_processBtn);
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Account created successfully "),"Account created successfully");
        alert.accept();
        log.info("click on press btn" + _processBtn.toString());
    }
}
