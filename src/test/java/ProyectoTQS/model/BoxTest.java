package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;

public class BoxTest {

	@Test
	public void setBoatTest() {
		Box box = new Box();
		Boat boat = new Boat(2,1);
		box.setBoat(boat);
		assertEquals(box.getBoat(),boat);
		List<Box> blist = boat.getList();
		assertEquals(blist.get(0), box);
	}
	
	//@Test
	public void AttackedTest() {
		Box b = new Box();
		assertFalse(b.getAttacked());
		b.setAttacked();
		assertTrue(b.getAttacked());
	}
}
