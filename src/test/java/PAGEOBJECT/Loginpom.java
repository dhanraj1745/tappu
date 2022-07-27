package PAGEOBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	@FindBy(how=How.XPATH,using="//input[@id='email']")private WebElement text_email;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")private WebElement text_pass;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement text_login;
	public WebElement getText_email() {
		return text_email;
	}
	public WebElement getText_pass() {
		return text_pass;
	}
	public WebElement getText_login() {
		return text_login;
	}
	
	
}
