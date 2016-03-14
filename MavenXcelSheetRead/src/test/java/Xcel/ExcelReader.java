package Xcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExcelReader 
{
	FirefoxDriver dr;
	@Test 
	public void xllRead() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Md\\Desktop\\BIT TECH\\MavenXcelSheetRead\\src\\test\\java\\ExcelSheet.xlsx");

        //Access the required test data sheet
		
       // HSSFWorkbook wb = new HSSFWorkbook(fis);

        //HSSFSheet sheet = wb.getSheet("sheet1");
		
		 XSSFWorkbook wb = new XSSFWorkbook(fis);

	        XSSFSheet sheet = wb.getSheet("sheet1");


 

   for (int count = 1; count <= sheet.getLastRowNum(); count++)

         {

             XSSFRow row = sheet.getRow(count);

             String id = row.getCell(0).toString();

             String userid = row.getCell(1).toString();

             String password = row.getCell(2).toString();

             if (id.equalsIgnoreCase("1.0"))

             {

                 System.out.println("hellos");
                 dr=new FirefoxDriver();
                 dr.get("http://www.facebook.com");

                 dr.findElement(By.id("email")).sendKeys(userid);

                 dr.findElement(By.id("pass")).sendKeys(password);

                 dr.findElement(By.id("u_0_n")).click();

                 break;

               

             }

             

         }
   
  
   
   
   
} 
		
	
	
	
	
	
		
	}
	
	

