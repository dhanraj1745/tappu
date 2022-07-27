package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test5 {

	public static void main(String[] args) throws IOException {WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("d12");
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("pass");
	
	String ram=RandomString.make(5);
	String path="C:\\Users\\46sag\\eclipse-workspace\\MYAUTOMATION\\Screen_Shots";
	TakesScreenshot ts=(TakesScreenshot)driver;
File srec=	ts.getScreenshotAs(OutputType.FILE);
File dest=new File("\\"+ram+"png");
FileUtils.copyFile(srec, dest);
	


	}

}
