package Draganddrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
WebDriverManager.chromiumdriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("\"https://demo.guru99.com/test/drag_drop.html\"");
driver.manage().window().maximize();


	}

}
