package com.xyzbank.resources.testdata;

import org.testng.annotations.DataProvider;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestData {

    // annotations data provider
    @DataProvider(name = "AddCustomer")
    public Object[][] getAddCustomerData() {
        return new Object[][]{
                {"mak","LE5 6PL"},
        };
    }
    @DataProvider(name = "OpenAccount")
    public Object[][] getOpenAccountData() {
        return new Object[][]{
                {"mak"}
        };
    }
    @DataProvider(name = "LoginAndLogout")
    public Object[][] getLoginAndLogoutData() {
        return new Object[][]{
                {"mak"},
        };
    }
    @DataProvider(name = "DepositMoney")
    public Object[][] getDepositMoenyData() {
        return new Object[][]{
                {"mak","100"},
        };
    }
    @DataProvider(name = "WithdrawMoney")
    public Object[][] getWithdrawMoneyData() {
        return new Object[][]{
                {"mak"},
        };
    }
    @DataProvider(name = "DeleteCustomer")
    public Object[][] getDeleteCustomerData() {
        return new Object[][]{
                {""},
        };
    }

}
