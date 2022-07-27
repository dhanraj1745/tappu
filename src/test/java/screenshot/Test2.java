package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test2 {

	public static void main(String[] args) throws IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			
			
			String path ="C:\\Users\\46sag\\eclipse-workspace\\MYAUTOMATION\\Screen_Shots";
			String rem=RandomString.make(5);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File (path+"\\"+rem+".png");
			FileUtils.copyFile(src, dest);
			}
	
	public static void Screenshot(WebDriver driver) throws IOException {
		String path ="C:\\Users\\46sag\\eclipse-workspace\\MYAUTOMATION\\Screen_Shots";
		String rem=RandomString.make(5);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File (path+"\\"+rem+".png");
		FileUtils.copyFile(src, dest);
		
	}
	

}
