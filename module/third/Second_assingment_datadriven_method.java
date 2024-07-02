package com.module.third;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second_assingment_datadriven_method {
	WebDriver driver;

    @BeforeTest
    public void beforetest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       }
    @Test
    public void Test() {
    	try {
    		FileInputStream fis=new FileInputStream("C:\\excelr_workspace\\Testng_assingment\\src\\test\\java\\com\\ddf_data\\input.properties");
    		Properties p =new Properties();
    		p.load(fis);
    		String url = p.getProperty("url");
    		String email= p.getProperty("email");
    		String passwd= p.getProperty("passwd");
    		
    		driver.get(url);
            Thread.sleep(2000);
            driver.findElement(By.id("email")).sendKeys(email);
            Thread.sleep(2000);
            driver.findElement(By.id("passwd")).sendKeys(passwd);
            Thread.sleep(2000);
          }catch (Exception e) {
    	    System.out.println(e.getMessage());
             }
    }
    @AfterTest
    public void aftertest() {
        driver.close();
    }
}


