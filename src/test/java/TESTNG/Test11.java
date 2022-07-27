package TESTNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test11 {
	
	@Test
	public void s1() {
		SoftAssert soft=new SoftAssert();
		System.out.println("username");
		System.out.println("password");
		System.out.println("loginbutton");
		
		String Expetedtitle="test";
		String Actualtitle="test1";
		
		soft.assertEquals(Actualtitle, Expetedtitle);
		System.out.println("Browserclose");
		soft.assertAll();
	}

}
