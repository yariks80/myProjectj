package com.company.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

   public static WebDriver getDriver() {
        WebDriver webDriver;
        String driver= System.getProperty("driver");
        if ("firefox".equals(driver)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            webDriver = new FirefoxDriver();
        }else if ("ie".equals(driver)){
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            webDriver = new InternetExplorerDriver();
        }else if ("edge".equals(driver)){
            System.setProperty("webdriver.edge.driver", "drivers/MicrosoftWebDriver.exe");
            webDriver = new EdgeDriver();
        }else{
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            webDriver = new ChromeDriver();
        }


     webDriver.get("http://www.i.ua/");
       webDriver.manage().window().maximize();
       return webDriver;
}}
