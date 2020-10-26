package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {

	@Test // Tests the constructor
	public void BoatTest() {
		Boat boat = new Boat(3, 0);
		boolean[] aBox = new boolean[3];
		assertEquals(boat.getSize(), 3);
		assertEquals(boat.getOrientation(), 0);
		assertTrue(boat.getAlive());
		assertEquals(boat.getState(), 0);
		assertArrayEquals(boat.getArray(), aBox);
	}
	
	@Test // Tests the changeState() method 
	public void changeStateTest() {
		Boat boat = new Boat(4, 0);
		boat.changeState(2);
		assertEquals(boat.getState(), 2);
	}
	
	@Test // This test checks if the boat dies correctly
	public void checkDeadTest() {
		Boat boat = new Boat(3,1);
		boolean res_0 = boat.checkDead();
		assertFalse(res_0);
		assertTrue(boat.getAlive());
		boat.changeState(2);
		boolean res_1 = boat.checkDead();
		assertTrue(res_1);
		assertFalse(boat.getAlive());
	}

}
