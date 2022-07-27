package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import screenshot.Test2;

public class Customdrop {


	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement dhanu=driver.findElement(By.xpath("//select[@name='country']"));
		drophand.drpdwn(dhanu, "INDIA");
		Thread.sleep(1000);
		driver.quit();
		Test2.Screenshot(driver);
		
	}

}
