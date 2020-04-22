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
public class CustomersPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    //search customer
    @FindBy(id = "userSelect")
    WebElement _searchCustomer;
    //delet
    @FindBy(xpath = "//td[contains(text(),'Delete Customer')]")
    WebElement _deleteBtn;

    //search customer
    public void searcustomerfield(){
        Reporter.log("search customer btn"+_searchCustomer.toString()+"<br>");
        clickOnElement(_searchCustomer);
        log.info("search customer btn"+_searchCustomer.toString());
    }
    //seacrch by name
    public void searchCustomerByName(String firstName){
        Reporter.log("enter customer name"+_searchCustomer+"to filed "+_searchCustomer.toString()+"<br>");
        sendTextToElement(_searchCustomer, firstName);
        log.info("enter customer name"+_searchCustomer+"to filed "+_searchCustomer.toString());
    }
    //delete customer
    public void deleteCustomer(){
        Reporter.log("delet customer"+_deleteBtn.toString()+"<br>");
        clickOnElement(_deleteBtn);
        log.info("delet customer"+_deleteBtn.toString());
    }
}
