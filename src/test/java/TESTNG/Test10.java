package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test10 {
@Test
public void a1() {
	
	System.out.println("username");
	System.out.println("password");
	System.out.println("loginbutton");
	String Expectedtitle="test";
	String Actualtitle="test";
	
	Assert.assertEquals(Actualtitle, Expectedtitle);
	System.out.println("Browserclose");
}

}
