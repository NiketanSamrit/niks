package com.module.third;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Third_assingment_smoke_test {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(groups = {"smoke"})
	public void OpenForm() {
			try {
				driver.get("https://demoqa.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")).click();
			} catch (Exception e) {
		}
	}
	
	@Test(groups = {"smoke"})
	public void fillform() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).click();
	}
	
		@AfterTest
	    public void aftertest() {
		driver.close();
	  }
	}

	
