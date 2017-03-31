

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import greenfoot.platforms.standalone.GreenfootUtilDelegateStandAlone;
import greenfoot.util.GreenfootUtil;

public class Car_hTest {
	private Car_h car_h;

	@Before
	public void before() {
		GreenfootUtilDelegateStandAlone delegate = new GreenfootUtilDelegateStandAlone(false, // boolean storageStandalone,
	            "", // String storageHost, 
	            "", // String storagePort,
	            "", // String storagePasscode,
	            "", // String storageScenarioId,
	            "", // String storageUserId,
	            ""); // String storageUserName);
		GreenfootUtil.initialise(delegate);
		car_h = new Car_h();
	}

	@After
	public void after() {
		car_h = null;
	}

	@Test
	public void testCFTAct() {
		fail("Not yet implemented");
	}

	@Test
	public void testCFTSetDestination() {
		// Three Control Flow paths
		// 1 is false / false
		// 2 is true / false
		// 3 is false / true
		
		// CF 1
		car_h.setRotation(0);
		car_h.setDestination(0);
		assertTrue("Destination should still be 0, but is: " + car_h.dest, car_h.dest == 0);
		assertTrue("Rotation should still be 0, but is: " + car_h.getRotation(), car_h.getRotation() == 0);
		assertTrue("Max destination should still be 0, but is: " + car_h.maxDest, car_h.maxDest == 0);
		
		after();
		before();

		// CF 2
		car_h.setRotation(0);
		car_h.setDestination(1);
		assertTrue("Destination should still be 1, but is: " + car_h.dest, car_h.dest == 1);
		assertTrue("Rotation should still be 0, but is: " + car_h.getRotation(), car_h.getRotation() == 0);
		assertTrue("Max destination should have changed to -90, but is: " + car_h.maxDest, car_h.maxDest == -90);
		
		after();
		before();

		// CF 3
		car_h.setRotation(0);
		car_h.setDestination(3);
		assertTrue("Destination should still be 3, but is: " + car_h.dest, car_h.dest == 3);
		assertTrue("Rotation should still be 0, but is: " + car_h.getRotation(), car_h.getRotation() == 0);
		assertTrue("Max destination should have changed to 90, but is: " + car_h.maxDest, car_h.maxDest == 90);
	}

	@Test
	public void testDFTAct() {
		fail("Not yet implemented");
	}

	@Test
	public void testDFTSetDestination() {
		fail("Not yet implemented");
	}

}
