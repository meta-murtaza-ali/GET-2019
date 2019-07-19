import static org.junit.Assert.*;
import org.junit.Test;
public class TestRecursion {
	Recursion H = new Recursion();
	@Test
	public void testFindHcf() {
		 try {
			 Recursion.HCf(0, 0);
		 }
		 catch (Exception e) {
			 assertEquals("Divide By Zero", e.getMessage());
		 }
	}

	@Test
	public void testFindHcfPositiveInput() throws Exception {
		 assertEquals(2,Recursion.HCf(6,8));  
	}

	@Test
	public void testFindLcm() {
		try { 
			Recursion.LCM(0, 0);
		}
		catch (Exception e) {
			assertEquals("Divide By Zero", e.getMessage());
		}
	}

	@Test
	public void testFindLcmPositiveInput() throws Exception {
		assertEquals(24,Recursion.LCM(6,8));
	}

}

