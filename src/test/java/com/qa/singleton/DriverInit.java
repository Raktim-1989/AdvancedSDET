package com.qa.singleton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
public static WebDriver driver;
private static  DriverInit instanceDriver = null;

private DriverInit()
{
    System.out.println("Driver is initialized");
}

public  WebDriver openBrowser()
{
   // WebDriverManager.chromedriver().setup();
    System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    return  driver;
}

    public static DriverInit getInstance()
    {
         if(instanceDriver == null)
         {
             instanceDriver = new DriverInit();
             return  instanceDriver;
         }
    return instanceDriver;
    }

}
