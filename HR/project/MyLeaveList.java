  package com.HR.project;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeaveList {

	public static void main(String[] args) {
try {
			
	    	ChromeDriver driver =new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    FileInputStream file = new FileInputStream("C:\\excelr_workspace\\HRM1.xlsx");
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheet("Sheet1");
		    int rowcount = sheet.getLastRowNum();
		    int colcount = sheet.getRow(1).getLastCellNum();
		    ArrayList allValues=new ArrayList();
		    for(Row row : sheet) {
		    	Cell cell=row.getCell(1);
		    	allValues.add(cell);
		    }
		    for(int i=1; i<=rowcount; i++)
		    {
		    	String C21= allValues.get(52).toString();
		    	String C22= allValues.get(53).toString();
		    	String C23= allValues.get(54).toString();
		    	String C24= allValues.get(55).toString();
		    	String C25= allValues.get(56).toString();
		    	String C26= allValues.get(57).toString();
		    	String C27= allValues.get(58).toString();
		    	String C28= allValues.get(59).toString();
		    	String C29= allValues.get(60).toString();
		    	String C30= allValues.get(61).toString();
		    	String C31= allValues.get(62).toString();
		    	String C32= allValues.get(63).toString();
		    	String C33= allValues.get(64).toString();
		    	String C34= allValues.get(65).toString();
		    	String C35= allValues.get(66).toString();
		    	String C36= allValues.get(67).toString();
		    	String C37= allValues.get(68).toString();
		    	String C38= allValues.get(69).toString();
		    	String C39= allValues.get(70).toString();
		    	String C40= allValues.get(71).toString();
		    	String C41= allValues.get(72).toString();
		    	String C42= allValues.get(73).toString();
		    	
		        driver.findElement(By.name("username")).sendKeys("Admin");
		        Thread.sleep(500);
		        driver.findElement(By.name("password")).sendKeys("admin123");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		        Thread.sleep(500);
		        
		        
         //LeaveList 
	            driver.findElement(By.xpath(C21)).click();
	            Thread.sleep(500);
		        driver.findElement(By.xpath(C22)).click();
		        Thread.sleep(1000);
		       List<WebElement> list = driver.findElements(By.xpath(C23));
				 Iterator<WebElement> iterator = list.iterator();
				 while (iterator.hasNext()) {
					WebElement webElement = (WebElement) iterator.next();
					if(webElement.getText().equals(C24)) {
						webElement.click();
					}
				 }
	             Thread.sleep(1000);
				  driver.findElement(By.xpath(C25)).click();
			        Thread.sleep(1000);
			       List<WebElement> list1 = driver.findElements(By.xpath(C26));
					 Iterator<WebElement> iterator1 = list1.iterator();
					 while (iterator1.hasNext()) {
						WebElement webElement = (WebElement) iterator1.next();
						if(webElement.getText().equals(C27)) {
							webElement.click();
						}
					 }
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(C28)).sendKeys(C29);
	            Thread.sleep(1000);
				 driver.findElement(By.xpath(C30)).click();
			        Thread.sleep(1000);
			       List<WebElement> list2 = driver.findElements(By.xpath(C31));
					 Iterator<WebElement> iterator2 = list2.iterator();
					 while (iterator2.hasNext()) {
						WebElement webElement = (WebElement) iterator2.next();
						if(webElement.getText().equals(C32)) {
							webElement.click();
						}
					 }
	            Thread.sleep(1000);
	            driver.findElement(By.xpath(C33)).click();
	            Thread.sleep(1000);
	            driver.findElement(By.xpath(C34)).click();
	           
		        
	     //MyLeave     
	            driver.findElement(By.xpath(C35)).click();
	            Thread.sleep(1000);
	            
				  driver.findElement(By.xpath(C36)).click();
			        Thread.sleep(1000);
			       List<WebElement> list3 = driver.findElements(By.xpath(C37));
					 Iterator<WebElement> iterator3 = list3.iterator();
					 while (iterator3.hasNext()) {
						WebElement webElement = (WebElement) iterator3.next();
						if(webElement.getText().equals(C38)) {
							webElement.click();
						}
					 }
					 Thread.sleep(1000);
					  driver.findElement(By.xpath(C39)).click();
				        Thread.sleep(1000);
				       List<WebElement> list4 = driver.findElements(By.xpath(C40));
						 Iterator<WebElement> iterator4 = list4.iterator();
						 while (iterator4.hasNext()) {
							WebElement webElement = (WebElement) iterator4.next();
							if(webElement.getText().equals(C41)) {
								webElement.click();
							}
						 }
		             Thread.sleep(2000);
		             driver.findElement(By.xpath(C42)).click();
		    }
			   driver.quit();
			    workbook.close();
	     	} 
		    catch (Exception e) {
			   System.out.println(e.getMessage());
	     	}
	  }
	}