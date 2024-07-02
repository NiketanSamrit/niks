package com.module.fourth;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class com_assingment_poi {
	public static void main(String[] args) {

	    try {
	    	ChromeDriver driver =new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("http://demo.guru99.com/V4/");
		    FileInputStream file = new FileInputStream("C:\\excelr_workspace\\assing.xlsx");
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheet("Sheet1");
		    int rowcount = sheet.getLastRowNum();
		    int colcount = sheet.getRow(1).getLastCellNum();
		    
		    for(int i=1; i<=rowcount; i++)
		    {
		    	String username= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(1));
		    	String password= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(2));
		    	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(username);
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
		    	Thread.sleep(2000);
		    	System.out.println("For the Email  id: "+username);
		    	System.out.println("For the password: "+password);
		    }
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	    	Alert a= driver.switchTo().alert();
	    	Thread.sleep(2000);
	    	a.accept();
		    driver.quit();
		    workbook.close();
     	} 
	    catch (Exception e) {
		   System.out.println(e.getMessage());
     	}
	  }
	}
