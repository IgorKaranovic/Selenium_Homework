package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        Chrome();
        Firefox();
        Edge();
    }

    //Automation methods using 3 different browsers.

    public static void Chrome()  {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title1, title2);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), title2);

        driver.quit();
    }


    public static void Firefox() {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title1, title2);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), title2);

        driver.quit();
    }


    public static void Edge() {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String title1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title1, title2);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), title2);

        driver.quit();
    }

}
