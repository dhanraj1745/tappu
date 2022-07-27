package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1 {
		WebDriver driver;
		@Parameters({"BrowserName"})
		@BeforeMethod 
		public void BM(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			
		}
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			
			
			
		}
		
		@AfterMethod
		public void AM() {
			
			driver.close();
		}
}
