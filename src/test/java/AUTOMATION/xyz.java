package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyz {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();
driver.findElement(By.name("firstName")).sendKeys("dhanraj");
driver.findElement(By.name("lastName")).sendKeys("manthale");
driver.findElement(By.name("phone")).sendKeys("124568");
driver.findElement(By.id("userName")).sendKeys("dhanra1745");
driver.findElement(By.name("address1")).sendKeys("swani");
driver.findElement(By.name("city")).sendKeys("ausa");
driver.findElement(By.name("postalCode")).sendKeys("123456");
 WebElement drop = driver.findElement(By.name("country"));
Select obj=new Select(drop);
obj.selectByValue("ALBANIA");
obj.selectByIndex(10);
driver.findElement(By.id("email")).sendKeys("dhanraj1745");
driver.findElement(By.name("password")).sendKeys("1234568");
driver.findElement(By.name("confirmPassword")).sendKeys("1234568");

driver.findElement(By.xpath("//input[@name='submit']")).click();
driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).click();
		
		
	}

}
