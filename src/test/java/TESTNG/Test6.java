package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test6 {
	@Test(priority=1,invocationCount=2)
	
	public void m1() {
		
			System.out.println("m1 test");
	}
	@Test(priority=0)
	public void m2() {
		
			System.out.println("m1 test");
			Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods= {"m2"})
	public void m3 () {
	
			System.out.println("m1 test");
}

}
