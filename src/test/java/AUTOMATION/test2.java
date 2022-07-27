package AUTOMATION;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver ().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("dhan1045");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("12345");
		WebElement login=driver.findElement(By.xpath("//button[@id='u_0_5_oj']"));
		login.click();
		
	}

}
