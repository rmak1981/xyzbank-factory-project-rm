package com.xyzbank.pages;

import com.xyzbank.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
Ravi's Creation
 */
public class BankManagerLoginPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountTab = By.cssSelector("body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.center > button.btn.btn-lg.tab:nth-child(2)");
    By customersTab = By.xpath("//button[3]");

    //add customer
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addCustomerTab;
    //open account
    @FindBy(css = "body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.center > button.btn.btn-lg.tab:nth-child(2)")
    WebElement _openAccountTab;
    //customers tab
    @FindBy(xpath = "//button[3]")
    WebElement _customersTab;

    public void clickOnAddCustomerTab() {
        Reporter.log("click in add customer tab" + _addCustomerTab.toString() + "<br>");
        clickOnElement(_addCustomerTab);
        log.info("click in add customer tab" + _addCustomerTab.toString());
    }

    public void clickOnOpenAccountTab() {
        Reporter.log("click on open account tab"+_openAccountTab.toString()+"<br>");
        clickOnElement(_openAccountTab);
        log.info("click on open account tab"+_openAccountTab.toString());
    }

    public void clickOnCustomerTab() {
        Reporter.log("click on customers tab"+_customersTab.toString()+"<br>");
        clickOnElement(_customersTab);
        log.info("click on customers tab"+_customersTab.toString());
    }
}
