package Exclesheetreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	private CharSequence textdata1;

	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver ().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String path="C:\\Users\\46sag\\eclipse-workspace\\MYAUTOMATION\\excle\\excalreed.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String textdata=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String testdada1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(textdata);
		System.out.println(textdata1);
		WebElement emailaddres=driver.findElement(By.id("email"));
		
		WebElement password=driver.findElement(By.id("pass"));
		emailaddres.sendKeys(textdata);
		password.sendKeys(textdata1);
		
		
        
	}

}
