package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		
		System.out.println("BM");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void Test1() {
		System.out.println("test");
	}@Test
	public void Test2() {
		System.out.println("test");
	}@Test
	public void test3() {
		System.out.println("test3");
	}
	@AfterMethod 
	public void AM() {
		System.out.println("bm");
		driver.close();
	}
	

}

