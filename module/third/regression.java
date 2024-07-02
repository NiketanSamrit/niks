package com.module.third;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class regression {
	
	@Test(groups = {"regression"})
	public void fillform() {
		try {
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demoqa.com/automation-practice-form");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).click();
		    driver.findElement(By.id("firstName")).sendKeys("niketan");
			Thread.sleep(1000);
		    driver.findElement(By.id("lastName")).sendKeys("samrit");
			Thread.sleep(1000);
		    driver.findElement(By.id("userEmail")).sendKeys("samritniketan@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.className("custom-control-label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("userNumber")).sendKeys("9876543210");
			Thread.sleep(1000);
			driver.findElement(By.id("dateOfBirthInput")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("january");
			Thread.sleep(1000);
		    driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1998");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]")).click();
		    Thread.sleep(1000);
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1000)","");
			Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("subjectsInput")).sendKeys("M");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[text()='Maths']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		    Thread.sleep(1000);
			driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\Downloads");
			Thread.sleep(1000);
			driver.findElement(By.id("currentAddress")).sendKeys("Nagpur");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]")).click();
		    Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='NCR']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[text()='Delhi']")).click();
	        Thread.sleep(2000);
			driver.findElement(By.id("submit")).click();
			Thread.sleep(3000);      
	        driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	  } 
	}
