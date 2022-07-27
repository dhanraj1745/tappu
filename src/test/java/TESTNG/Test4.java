package TESTNG;

import org.testng.annotations.Test;

public class Test4 {
	
	@Test(priority=1,invocationCount=2)
	public void A() {
		
		System.out.println("A test");
	}
	@Test(priority=0)
	public void B() {
		System.out.println("B tst");
	}
	@Test(priority=2)
	public void C() {
		
		System.out.println("C test");
	}

}
