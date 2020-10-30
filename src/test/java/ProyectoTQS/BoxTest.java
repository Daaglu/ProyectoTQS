package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxTest {

	@Test // Tests the constructor
	public void Boxtest() {
		Box box = new Box();
		assertFalse(box.getState());
	}
	
	/*@Test // Tests if the method changes the state correctly
	public void ChangeStateTest() {
		Box box = new Box();
		box.changeState(true);
		assertTrue(box.getState());
	}*/
	
	@Test
	public void setBoatTest() {
		Box box = new Box();
		Boat boat = new Boat(2,1);
		box.setBoat(boat);
		assertEquals(box.getBoat(),boat);
	}
}
