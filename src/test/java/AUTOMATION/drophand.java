package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drophand {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();

//driver.findElement(By.x)

WebElement drop=driver.findElement(By.xpath("//select[@name='country']"));
Select d1=new Select(drop);
d1.selectByIndex(2);
Thread.sleep(2000);
d1.selectByValue("INDIA");
d1.selectByVisibleText("ALGERIA");




	}
	public static void drpdwn(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		}

}
