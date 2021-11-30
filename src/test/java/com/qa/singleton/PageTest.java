package com.qa.singleton;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

    WebDriver driver ;
    @BeforeMethod
    public void setUp()
   {
         DriverInit driverPage = DriverInit.getInstance();
         driver = driverPage.openBrowser();
         driver.findElement(By.name(""));

   }

   @Test
    public void task1()
   {
       driver.get("http://www.google.com");
       System.out.println(driver.getTitle());

   }

   @AfterMethod
    public void tearDown()
   {
          driver.quit();
   }

}
