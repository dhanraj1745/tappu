package TESTNG;

		import org.testng.annotations.Test;

		public class test5 {
	
		@Test
		public void A() {
		
					System.out.println("test a");
					
				}
		@Test
		public void B() {
		
					System.out.println("test b");
	}
	    @Test(enabled=false)
		public void C() {
	
	    		System.out.println("test c");
}
}
