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

public class CandidateToInterview {

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
		    	String B7= allValues.get(10).toString();
		    	String B8= allValues.get(11).toString();
		    	String B9= allValues.get(12).toString();
		    	String B10= allValues.get(13).toString();
		    	String B11= allValues.get(14).toString();
		    	String B12= allValues.get(15).toString();
		    	String B13= allValues.get(16).toString();
		    	String B14= allValues.get(17).toString();
		    	String B15= allValues.get(18).toString();
		    	String B16= allValues.get(19).toString();
		    	String B17= allValues.get(20).toString();
		    	String B18= allValues.get(21).toString();
		    	String B19= allValues.get(22).toString();
		    	String B20= allValues.get(23).toString();
		    	String B21= allValues.get(24).toString();
		    	String B22= allValues.get(25).toString();
		    	String B23= allValues.get(26).toString();
		    	String B24= allValues.get(27).toString();
		    	String B25= allValues.get(28).toString();
		    	String B26= allValues.get(29).toString();
		    	String B27= allValues.get(30).toString();
		    	String B28= allValues.get(31).toString();
		    	
		        driver.findElement(By.name("username")).sendKeys("Admin");
		        Thread.sleep(500);
		        driver.findElement(By.name("password")).sendKeys("admin123");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();

		        driver.findElement(By.xpath(B7)).click();
		        
		        driver.findElement(By.xpath(B8)).click();
		        Thread.sleep(1000);
		       List<WebElement> list = driver.findElements(By.xpath(B9));
				 Iterator<WebElement> iterator = list.iterator();
				 while (iterator.hasNext()) {
					WebElement webElement = (WebElement) iterator.next();
					if(webElement.getText().equals(B10)) {
						webElement.click();
					}
				 }
				 Thread.sleep(1000);
				  driver.findElement(By.xpath(B11)).click();
			        Thread.sleep(1000);
			       List<WebElement> list1 = driver.findElements(By.xpath(B12));
					 Iterator<WebElement> iterator1 = list1.iterator();
					 while (iterator1.hasNext()) {
						WebElement webElement = (WebElement) iterator1.next();
						if(webElement.getText().equals(B13)) {
							webElement.click();
						}
					 }
					 Thread.sleep(1000);
					 driver.findElement(By.xpath(B14)).click();
				        Thread.sleep(1000);
				       List<WebElement> list2 = driver.findElements(By.xpath(B15));
						 Iterator<WebElement> iterator2 = list2.iterator();
						 while (iterator2.hasNext()) {
							WebElement webElement = (WebElement) iterator2.next();
							if(webElement.getText().equals(B16)) {
								webElement.click();
							}
						 }
						 driver.findElement(By.xpath(B17)).click();
						 List<WebElement> list4 = driver.findElements(By.xpath(B28));
						 Iterator<WebElement> iterator4 = list4.iterator();
						 while (iterator4.hasNext()) {
							WebElement webElement = (WebElement) iterator4.next();
							if(webElement.getText().equals("joe root")) {
								webElement.click();
							}
						 }
					 driver.findElement(By.xpath(B18)).sendKeys(B19);
					 Thread.sleep(1000);
					 driver.findElement(By.xpath(B20)).sendKeys(B21);
					 Thread.sleep(1000);
					 driver.findElement(By.xpath(B22)).sendKeys(B23);
					 Thread.sleep(1000);
					 
					 driver.findElement(By.xpath(B24)).click();
				        Thread.sleep(1000);
				       List<WebElement> list3 = driver.findElements(By.xpath(B25));
						 Iterator<WebElement> iterator3 = list3.iterator();
						 while (iterator3.hasNext()) {
							WebElement webElement = (WebElement) iterator3.next();
							if(webElement.getText().equals(B26)) {
								webElement.click();
							}
						 }
						 Thread.sleep(1000);
						 driver.findElement(By.xpath(B27)).click();
		        Thread.sleep(1000);
		    }
			   driver.quit();
			    workbook.close();
	     	} 
		    catch (Exception e) {
			   System.out.println(e.getMessage());
	     	}
	  }
	}

