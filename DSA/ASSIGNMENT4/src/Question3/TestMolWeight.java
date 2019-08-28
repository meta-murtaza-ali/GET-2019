package Question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMolWeight {
	@Test
	public void test() {
		CalculateMolWeight obj = new CalculateMolWeight();

		try {
			String compound = "ch3";
			assertEquals(15, obj.evaluate(compound));

			compound = "CH(OC(CH3)3)";
			assertEquals(86, obj.evaluate(compound));

			compound = "C(OH)2";
			assertEquals(46, obj.evaluate(compound));

			compound = "C12H10";
			assertEquals(154, obj.evaluate(compound));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = NullPointerException.class)
	public void nulltest() {
		CalculateMolWeight obj = new CalculateMolWeight();

		try {
			assertEquals(15, obj.evaluate(null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void digitMakerTest() {
		CalculateMolWeight obj = new CalculateMolWeight();

		assertEquals(10, obj.digitMaker("C10CH"));

		assertEquals(1, obj.digitMaker("CH"));
	}

	@Test
	public void elementCheck() {
		Compounds e = new Compounds('C', 3);

		assertEquals('C', e.getElement());

		assertEquals(3, e.getBase());
	}
}
