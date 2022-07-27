package TESTNG;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class test3 extends D1{
	@Test

	public void m1() {
		
		driver.findElement(By.id("email")).sendKeys("dhanraj");
		driver.findElement(By.id("pass")).sendKeys("112233");
		driver.findElement(By.id("loginbutton")).click();
		
	}
	@AfterMethod
	public void AF() {
		
		driver.close();
	}
}
