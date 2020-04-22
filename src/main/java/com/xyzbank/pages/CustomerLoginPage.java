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
public class CustomerLoginPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());


    // your name
    @FindBy(id = "userSelect")
    WebElement _yourName;
    //log in
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _loginBtn;
    // your name label
    @FindBy(xpath = "//div[@class='form-group']//label")
    WebElement _yourNameLabel;


    public void searchNameField(){
        Reporter.log("click on your name"+_yourName.toString()+"<br>");
        clickOnElement(_yourName);
        log.info("click on your name"+_yourName.toString());
    }

    public void selectYourName(String name){
        Reporter.log("select name "+_yourName+"form drop down"+_yourName.toString()+"<br>");
        selectByVisibleTextFromDropDown(_yourName, name);
        log.info("select name "+_yourName+"form drop down"+_yourName.toString());
    }

    public void clickOnLoginButton(){
        Reporter.log("click on login btn"+_loginBtn.toString()+"<br>");
        clickOnElement(_loginBtn);
        log.info("click on login btn"+_loginBtn.toString());
    }

    public boolean isYourNameLabelDisplayed(){
        Reporter.log("is your name is displayed"+_yourNameLabel.toString()+"<br>");
        log.info("is your name is displayed"+_yourNameLabel.toString());
        if (getElement(_yourNameLabel).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }

}
