package DemoTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PAGEOBJECT.Loginpom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTLOGIN {

	@Test
	public void test1(){
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Loginpom login=	PageFactory.initElements(driver,Loginpom.class);
		login.getText_email().sendKeys("dhanraj");
		login.getText_pass().sendKeys("12345");
		login.getText_login().click();
		
		
	}
}
