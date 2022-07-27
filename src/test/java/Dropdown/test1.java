package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
WebElement drop=driver.findElement(By.xpath("//select[@name='country']"));

	Select sl=new Select(drop);
	sl.selectByIndex(4);
	
	Thread.sleep(3000);
	
	sl.selectByValue("ALBANIA");
	 Thread.sleep(3000);
	 
	 sl.selectByVisibleText("ANTARCTICA");



	}

}
