package com.xyzbank.utility;

import com.xyzbank.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class UtilityRM extends BasePage {

    //public WebDriver driver;

    private JavascriptExecutor jse;

    // this method will click on element

    public void clickOnElement(By by) { driver.findElement(by).click();  }

    // This method will click on element

    public void clickOnElement(WebElement element) {
        element.click();
    }

    // this method will send text on element
    public void sendTextToElement(By by, String str) {
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(str);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);}


    //this method will get text from element

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }


    // this method is to get element

    public WebElement getElement(By by){
        return driver.findElement(by);
    }
    public WebElement getElement(WebElement element){
        return element;
    }

    // this method is for mouse hover (move to element)

    public void moveToElement(By by) {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(by));
        act.perform();
    }

    // this method is select by visible text
    public void selectByvisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    // this method is for select by value
    public void selectByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    // this method is for select by index
    public void selectByIndex(By by, int x) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(x);
    }

    // this mehtod is implicit wait in seconds
    public void implicitWaitSeconds(int y) {
        driver.manage().timeouts().implicitlyWait(y, TimeUnit.SECONDS);
    }

    // this method is thread sleep 2 seconds wait
    public void sleepMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    // this method is quit method
    public void quitMethod() {
        driver.quit();
    }

    public void closeMethod() {
        driver.close();
    }

    public void chromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void openUrl(String a) {
        driver.get(a);
    }

    public void javaScriptExecuter(int x, int y) {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500);");
    }

    public void selectDropDown(By by, String text) {
        WebElement productDropDown = driver.findElement(by);
    }

    // radio button selection methods


    /*
     *This method will perform a click on a radio Button
     */
    public void radioButtonClick(By by) {
        driver.findElement(by).click();
    }

    /*
     *This method will perform a click on a radio Button
     */
    public void radioButtonClick(WebElement element) {
        element.click();
    }

    /*
     *This method will verify if a radio Button is selected
     */
    public void radioButtonIsSelected(By by) {
        driver.findElement(by).isSelected();
    }

    /*
     *This method will verify if a radio Button is selected
     */
    public void radioButtonIsSelected(WebElement element) {
        element.isSelected();
    }

    /*
     *This method will verify if a radio Button is displayed
     */
    public void radioButtonIsDisplayed(By by) {
        driver.findElement(by).isDisplayed();
    }

    /*
     *This method will verify if a radio Button is displayed
     */
    public void radioButtonIsDisplayed(WebElement element) {
        element.isDisplayed();
    }

    /*
     *This method will verify if  a radio Button is enabled
     */
    public void radioButtonIsEnabled(By by) {
        driver.findElement(by).isEnabled();
    }

    /*
     *This method will verify if a radio Button is enabled
     */
    public void radioButtonIsEnabled(WebElement element) {
        element.isEnabled();
    }

    // check box selection methods

    public void checkBoxClick(By by) {
        driver.findElement(by).click();
    }

    public void checkBoxIsSelected(By by) {
        driver.findElement(by).isSelected();
    }

    public void checkBoxIsDisplayed(By by) {
        driver.findElement(by).isDisplayed();
    }

    public void checkBoxIsEnabled(By by) {
        driver.findElement(by).isEnabled();
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByValue(string);
    }


    /*
     * This method will verify that an element is displayed
     */
    public boolean elementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is displayed
     */
    public boolean elementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is selected
     */
    public boolean elementIsSelected(By by) {
        WebElement element = driver.findElement(by);
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is selected
     */
    public boolean elementIsSelected(WebElement element) {
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is enabled
     */
    public boolean elementIsEnabled(By by) {
        WebElement element = driver.findElement(by);
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is enabled
     */
    public boolean elementIsEnabled(WebElement element) {
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }




    //random method to generate email

    public void generateRandomEmail(By by) {

        Random random = new Random();
        char c = (char) (random.nextInt(26) + 'a');
        String strEmail = c + "ravee123@gmail.com";

        WebElement emailField = driver.findElement(by);
        emailField.sendKeys(strEmail);
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertMethod(By by, String str) {
        String actualText = driver.findElement(by).getText();
        String expectedText = str;
        Assert.assertEquals(actualText, expectedText);
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertMethod(WebElement element, String str) {
        String actualText = element.getText();
        String expectedText = str;
        Assert.assertEquals(actualText, expectedText);
    }

    // compare list of array
    public boolean compareList(String strSortingLink, String strSortText, String strBookList) {

        List<String> booksNames = new ArrayList<>();

        Select select = new Select(By.id(strSortingLink).findElement(driver));
        select.selectByVisibleText(strSortText);
        List<WebElement> booksList = driver.findElements(By.xpath(strBookList));

        for (WebElement ele : booksList) {
            booksNames.add(ele.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(booksNames);
        Collections.sort(tempList);

        return booksNames.equals(tempList);
    }


    /**
     * This method generate random number
     *
     * @return
     */
    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }


    /**
     * This method will used to wait web driver until element become clickable
     */
    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    /**
     * This method will used to wait web driver until presence of element located by locator
     */
    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * This method will used to wait web driver until visibility of element located by locator
     */
    public void waitUntilVisibilityOfElementLocated(By by, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * This method will take screen shot and store into screenshot folder
     */
    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/demo/nopcommerce/screenshots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method will take the screenshot and add to screenshot folder
     * This method will required parameter like screenshot name and return destination path
     * @param driver
     * @param screenshotName
     * @return
     */
    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/demo/nopcommerce/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /**
     * This method will take the screenshot and add to test-output/html folder
     * This method will required parameter like screenshot name and return the destination path
     * @param fileName
     * @return
     */
    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName+currentTimeStamp()+".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
    /**
     * This method will return current time stamp
     *
     * @return
     */
    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }




}




