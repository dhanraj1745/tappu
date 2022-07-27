package TESTNG;

import org.testng.annotations.Test;

public class Test7 {
	
	@Test(groups="sanity")
	public void m1() {
		
		System.out.println("testm1");
	}
	@Test(groups="resgration")
	public void m2() {
		
		System.out.println("testm2");
	}
	@Test(groups="sanity,regration")
	public void m3() {
		
		System.out.println("testm3");
	}
	
	
	

}
