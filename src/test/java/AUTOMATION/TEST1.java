package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/login.php");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	driver.navigate().forward();
	
	driver.findElement(By.id("email")).sendKeys("dhanraj");
	driver.findElement(By.id("pass")).sendKeys("112233");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}
