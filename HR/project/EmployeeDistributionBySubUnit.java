package com.HR.project;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeDistributionBySubUnit {

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
		    	String F1=allValues.get(81).toString();
		    	String F2=allValues.get(82).toString();
		    	String F3=allValues.get(83).toString();
		    	String F4=allValues.get(84).toString();
		    	String F5=allValues.get(85).toString();
		    	String F6=allValues.get(86).toString();
		    	String F7=allValues.get(87).toString();
		    	
		        driver.findElement(By.name("username")).sendKeys("Admin");
		        Thread.sleep(500);
		        driver.findElement(By.name("password")).sendKeys("admin123");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		        Thread.sleep(500);
		        
		        driver.findElement(By.xpath(F1)).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath(F1)).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(F2)).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath(F2)).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(F3)).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath(F3)).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(F4)).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath(F4)).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(F5)).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath(F5)).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(F6)).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath(F6)).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(F7)).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath(F7)).click();
		    }
			   driver.quit();
			    workbook.close();
	     	} 
		    catch (Exception e) {
			   System.out.println(e.getMessage());
	     	}
	  }
	}
