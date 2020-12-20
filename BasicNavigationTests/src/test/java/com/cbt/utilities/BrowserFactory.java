package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser){

        String OperatingSystem = System.getProperty("os.name");
        WebDriver driver=null;

        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                if(OperatingSystem.equals("Mac OS X")){
                    return null;
                }else{
                    System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");
                    driver = new EdgeDriver();
                }
                break;
            case "safari":
                if(OperatingSystem.equals("Windows")){
                    return null;
                }else{
                    driver = new SafariDriver();
                }
        }
        return driver;

    }

}


