package com.xyzbank.testbase;

import com.xyzbank.basepage.BasePage;
import com.xyzbank.browserselector.BrowserSelector;
import com.xyzbank.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestBase  extends BasePage {



    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");

    @BeforeTest(groups = {"Regression"})
    public void openBrowser(){

        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
    }
    @AfterTest(groups = {"Regression"})
    public void tearDown(){
        driver.quit();
    }

}
