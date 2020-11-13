package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxTest {

	@Test // Tests the constructor
	public void BoxTest() {
		Box box = new Box();
		assertFalse(box.getState());
	}
	
	@Test
	public void setBoatTest() {
		Box box = new Box();
		Boat boat = new Boat(2,1);
		box.setBoat(boat);
		assertEquals(box.getBoat(),boat);
	}
	
	@Test
	public void AttackedTest() {
		Box b = new Box();
		assertFalse(b.getAttacked());
		b.setAttacked();
		assertTrue(b.getAttacked());
	}
}
