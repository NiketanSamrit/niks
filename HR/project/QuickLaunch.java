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
import org.openqa.selenium.remote.RemoteWebElement;

public class QuickLaunch {

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
		    	String C1= allValues.get(32).toString();
		    	String C2= allValues.get(33).toString();
		    	String C3= allValues.get(34).toString();
		    	String C4= allValues.get(35).toString();
		    	String C5= allValues.get(36).toString();
		    	String C6= allValues.get(37).toString();
		    	String C7= allValues.get(38).toString();
		    	String C8= allValues.get(39).toString();
		    	String C9= allValues.get(40).toString();
		    	String C10= allValues.get(41).toString();
		    	String C11= allValues.get(42).toString();
		    	String C12= allValues.get(43).toString();
		    	String C13= allValues.get(44).toString();
		    	String C14= allValues.get(45).toString();
		    	String C15= allValues.get(46).toString();
		    	String C16= allValues.get(47).toString();
		    	String C17= allValues.get(48).toString();
		    	String C18= allValues.get(49).toString();
		    	String C19= allValues.get(50).toString();
		    	String C20= allValues.get(51).toString();
		    	
		        driver.findElement(By.name("username")).sendKeys("Admin");
		        Thread.sleep(500);
		        driver.findElement(By.name("password")).sendKeys("admin123");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		        Thread.sleep(500);
		        
		        
         //QuickLaunch  
	            driver.findElement(By.xpath(C1)).click();
	            Thread.sleep(500);
		        driver.findElement(By.xpath(C2)).sendKeys(C3);
		        Thread.sleep(500);
		        driver.findElement(By.xpath(C4)).click();
		        Thread.sleep(1000);
		       List<WebElement> list = driver.findElements(By.xpath(C5));
				 Iterator<WebElement> iterator = list.iterator();
				 while (iterator.hasNext()) {
					WebElement webElement = (WebElement) iterator.next();
					if(webElement.getText().equals(C6)) {
						webElement.click();
					}
				 }
	            driver.findElement(By.xpath(C7)).sendKeys(C8);
				Thread.sleep(1000);
				driver.findElement(By.xpath(C9)).sendKeys(C10);
	            Thread.sleep(1000);
	            driver.findElement(By.xpath(C11)).sendKeys(C12);
	            Thread.sleep(1000);
	            driver.findElement(By.xpath(C13)).click();
	            driver.navigate().back();
	          
		        
	    //TimeSheets    
	            driver.findElement(By.xpath(C14)).click();
	            Thread.sleep(1000);
	            driver.findElement(By.xpath(C15)).sendKeys(C16);
	            Thread.sleep(1000);
	            driver.findElement(By.xpath(C17));
	            driver.navigate().back();
	            Thread.sleep(1000);
		        
		        
		//ApplyLeave
	            driver.findElement(By.xpath(C18)).click();
		        Thread.sleep(1000);
	            driver.navigate().back();
	            Thread.sleep(1000);
		        
		       
		//MyTimesheet
	            driver.findElement(By.xpath(C19)).click();
	            Thread.sleep(1000);
	            driver.navigate().back();
						
		    }
			   driver.quit();
			    workbook.close();
	     	} 
		    catch (Exception e) {
			   System.out.println(e.getMessage());
	     	}
	  }
	}