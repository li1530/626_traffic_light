

import static org.junit.Assert.*;

import org.junit.Test;

public class LightAlgorithmTest {

	@Test
	public void testCFTLightAlgorithm() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCFTActivate() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCFTDeactivate() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCFTIsActivated() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCFTResetLightInt() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCFTGetLight() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCFTNextLight() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCFTResetLight() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDFTLightAlgorithm() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDFTActivate() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDFTDeactivate() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDFTIsActivated() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDFTResetLightInt() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDFTGetLight() {
		//fail("Not yet implemented");
	}

	/**
	 * TC-A1: 1-2-4
	 */
	@Test
	public void testDFTNextLight1() {
		//fail("Not yet implemented");
		LightAlgorithm la = new LightAlgorithm(1, 1);
		la.activate();
		la.nextLight();
		assertEquals(0, la.getLight());
	}
	
	/**
	 * TC-A1: 1-2-3
	 */
	@Test
	public void testDFTNextLight2() {
		//fail("Not yet implemented");
		LightAlgorithm la = new LightAlgorithm(2, 2);
		la.activate();
		la.resetLight(1);
		la.nextLight();
		assertEquals(2, la.getLight());
	}

	@Test
	public void testDFTResetLight() {
		//fail("Not yet implemented");
	}

}
