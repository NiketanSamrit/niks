package com.module.third;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_assingment_testNG {
	WebDriver driver;

    @BeforeTest
    public void beforetest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");
    }
    @AfterTest
    public void aftertest() {
        driver.close();
    }
    @Test
    public void Test() {
    	try {
        driver.findElement(By.id("email")).sendKeys("niketan_samrit");
        Thread.sleep(2000);
        driver.findElement(By.id("passwd")).sendKeys("12345");
        Thread.sleep(2000);
          }catch (Exception e) {
    	    System.out.println(e.getMessage());
          }
     }
 }

