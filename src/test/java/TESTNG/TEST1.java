package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEST1 {
	
	@BeforeSuite
	public void bs() {
		System.out.println("BS");
	}
	@BeforeTest
	public void BT() {
		System.out.println("BT");
		
	}
	@BeforeClass
	public void BC() {
		System.out.println("BC");
	}
	@BeforeMethod
	public void BM() {
	System.out.println("BM");
	}
	@Test
	public void test1() {
		
		System.out.println("test1");
		
	}@Test
	public void Test2() {
		
		System.out.println("test");
	}@Test
	public void Test3() {
		System.out.println("test2");
	}
	@AfterMethod
	public void AF() {
		System.out.println("AF");
	
	
}
	@AfterClass
	public void AC() {
		System.out.println();
	}
	
	@AfterTest
	public void AT() {
		
		System.out.println("At");
	}
	@AfterSuite
	public void AS() {
		System.out.println("AS");
	}
	
	
	
	
	
	
	
	
	
	
	
}
