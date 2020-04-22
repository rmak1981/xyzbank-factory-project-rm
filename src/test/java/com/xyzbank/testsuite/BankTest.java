package com.xyzbank.testsuite;

import com.xyzbank.pages.*;
import com.xyzbank.resources.testdata.TestData;
import com.xyzbank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.xyzbank.utility.UtilityRM.getRandomString;

// Ravi's creation

public class BankTest extends TestBase {
    // static variables
    String firstName = null;
    //String lastName = null;
    //objects for all the pages
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    AccountPage accountPage;
    CustomersPage customersPage;


    @BeforeTest (groups = {"Regression","Smoke","Sanity"})
    public void setUp(){

        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage  = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        accountPage = new AccountPage();
        customersPage = new CustomersPage();

        // random method to get names
        firstName = getRandomString(5);
       // lastName = getRandomString(5);
    }

    @Test(priority = 0,groups = {"Regression"},dataProvider = "AddCustomer",dataProviderClass = TestData.class)
    public void bankManagerShouldAddCustomerSuccessfully(String lastName,String postcode) throws InterruptedException {

        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName(firstName);
        addCustomerPage.enterLastName(lastName);
        addCustomerPage.enterPostcode(postcode);
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
//        Alert alert = driver.switchTo().alert();
//        Assert.assertTrue(alert.getText().contains("Customer added successfully"),"Customer added successfully");
//        alert.accept();
    }

    @Test(priority = 1,groups = {"Regression"},dataProvider = "OpenAccount",dataProviderClass = TestData.class)
    public void bankManagerShouldOpenAccountSuccessfully(String lastName){
        homePage.clickOnHomeBtn();
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.searchCustomerName();
        openAccountPage.selectCustomerName(firstName +" "+ lastName );
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
//        Alert alert = driver.switchTo().alert();
//        Assert.assertTrue(alert.getText().contains("Account created successfully "),"Account created successfully");
//        alert.accept();
    }

    @Test(priority = 2,groups = {"Regression"},dataProvider = "LoginAndLogout",dataProviderClass = TestData.class)
    public void customerShouldLoginAndLogoutSuccessfully(String lastName){

        homePage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginTab();
        customersPage.searcustomerfield();
        customerLoginPage.selectYourName(firstName+" "+lastName);
        customerLoginPage.clickOnLoginButton();
        Assert.assertTrue(accountPage.isLogoutButtonDisplayed());
        accountPage.clickOnLogoutButton();
        Assert.assertTrue(customerLoginPage.isYourNameLabelDisplayed());
    }

    @Test(priority = 3,groups = {"Regression"},dataProvider = "DepositMoney",dataProviderClass = TestData.class)
    public void customerShouldDepositMoneySuccessfully(String lastName){

        homePage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourName(firstName+" "+lastName);
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterAmount(100);
        accountPage.clickOnDepositWithdrawButton();
        Assert.assertEquals(accountPage.getErrorSuccessMessage(),"Deposit Successful");
    }

    @Test(priority = 4,groups = {"Regression"},dataProvider = "WithdrawMoney",dataProviderClass = TestData.class)
    public void customerShouldWithdrawMoneySuccessfully(String lastName){

        homePage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourName(firstName+" "+lastName);
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawlTab();
        accountPage.enterAmount(50);
        accountPage.clickOnDepositWithdrawButton();
        Assert.assertEquals(accountPage.getErrorSuccessMessage(),"Transaction successful");
    }

    @Test(priority = 5,groups = {"Regression"},dataProvider = "DeleteCustomer",dataProviderClass = TestData.class)
    public void bankManagerShouldDeleteCustomerSuccessfully() throws InterruptedException {

        homePage.clickOnHomeBtn();
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnCustomerTab();
        customersPage.searchCustomerByName(firstName);
        Thread.sleep(5000);
        customersPage.deleteCustomer();
        Thread.sleep(5000);
    }

}
