package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {

	@Test // Tests the constructor
	public void BoatTest() {
		Boat boat = new Boat(3, 0);
		Box[] aBox = new Box[3];
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

}
