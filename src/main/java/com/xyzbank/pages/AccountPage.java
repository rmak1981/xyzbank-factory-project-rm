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
public class AccountPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());


    //clicking on log in
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _logOutBtn;
    //transaction click on
    @FindBy(xpath = "//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[1]")
    WebElement _transactionTab;
    //deposit
    @FindBy(xpath = "//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[2]")
    WebElement _depositTab;
    //withdrow
    @FindBy(xpath = "//button[3]")
    WebElement _withdrawlTab;
    //amount
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amount;
    //diposit withdrow btn
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositWithdrawBtn;
    //error msg
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _errorMessage;

    //clicking
    public void clickOnLogoutButton(){
        Reporter.log("Click on login Btn"+_logOutBtn.toString()+"<br>");
        clickOnElement(_logOutBtn);
        log.info("Click on login Btn"+_logOutBtn.toString());
    }
    //log out btn displayed
    public boolean isLogoutButtonDisplayed(){
        Reporter.log("is log out btn displayed "+_logOutBtn.toString()+"<br>");
        log.info("is log out btn displayed "+_logOutBtn.toString());
        if (getElement(_logOutBtn).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
    // clicking transaction
    public void clickOnTransactionTab(){
        Reporter.log("click on transection"+_transactionTab.toString()+"<br>");
        clickOnElement(_transactionTab);
        log.info("click on transection"+_transactionTab.toString());
    }
    //clicking on deposit
    public void clickOnDepositTab(){
        Reporter.log("click on deposit"+_depositTab.toString()+"<br>");
        clickOnElement(_depositTab);
        log.info("click on deposit"+_depositTab.toString());
    }
    // clicking withdrow
    public void clickOnWithdrawlTab(){
        Reporter.log("click on withdrow tab"+_withdrawlTab.toString()+"<br>");
        clickOnElement(_withdrawlTab);
        log.info("click on withdrow tab"+_withdrawlTab.toString());
    }
    // enter ammount to deposit
    public void enterAmount(int amount){
        Reporter.log("enter amount :"+_amount+"to the filed"+_amount.toString()+"<br>");
        sendTextToElement(this._amount, String.valueOf(amount));
        log.info("enter amount :"+_amount+"to the filed"+_amount.toString());
    }
    // clicking deposit withdown btn
    public void clickOnDepositWithdrawButton(){
        Reporter.log("click on deposit withdrow btn"+_depositWithdrawBtn.toString()+"<br>");
        clickOnElement(_depositWithdrawBtn);
        log.info("click on deposit withdrow btn"+_depositWithdrawBtn.toString());
    }

    public String getErrorSuccessMessage(){
        Reporter.log("get error msg"+_errorMessage.toString());
        log.info("get error msg"+_errorMessage.toString());
        return getTextFromElement(_errorMessage);
    }

}
