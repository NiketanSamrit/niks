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
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAction {

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
		    	String B1= allValues.get(4).toString();
		    	String B2= allValues.get(5).toString();
     	    	String B5= allValues.get(8).toString();
		    	String B6= allValues.get(9).toString();
		    	
		        driver.findElement(By.name("username")).sendKeys("Admin");
		        Thread.sleep(500);
		        driver.findElement(By.name("password")).sendKeys("admin123");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
	      
		        driver.findElement(By.xpath(B1)).click();
		        Thread.sleep(1000);
		        driver.navigate().back();
		        driver.findElement(By.xpath(B2)).click();
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor)driver;
			    for(int x=0; x<=120; x++){
			    	js.executeScript("window.scrollBy(0,100)","");
			    	}
			    driver.navigate().back();
			    Thread.sleep(500);
		        driver.findElement(By.xpath(B5)).click();
		        Thread.sleep(100);
		        driver.navigate().back();
                driver.findElement(By.xpath(B6)).click();
		        Thread.sleep(2000);
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
