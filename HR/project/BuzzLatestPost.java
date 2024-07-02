package com.HR.project;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuzzLatestPost {

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
		    	String D1= allValues.get(74).toString();
		    	String D2= allValues.get(75).toString();
		    	String D3= allValues.get(76).toString();
		    	String D4= allValues.get(77).toString();
		    	
		        driver.findElement(By.name("username")).sendKeys("Admin");
		        Thread.sleep(500);
		        driver.findElement(By.name("password")).sendKeys("admin123");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		        Thread.sleep(500);
		        
		        driver.findElement(By.xpath(D1)).click();
		        Thread.sleep(3000);          
		        JavascriptExecutor js = (JavascriptExecutor)driver;
			    for(int x=0; x<=120; x++){
			    	js.executeScript("window.scrollBy(0,100)","");
			    	}
			    Thread.sleep(1000);
			    for(int x=0; x<=120; x++){
			    	js.executeScript("window.scrollBy(0,-100)","");
			    	}
		        driver.findElement(By.className(D2)).sendKeys(D3); 
		        Thread.sleep(500);
		       driver.findElement(By.xpath(D4)).click();
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