package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;
import mockObjects.mockBoat;

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
		List<Box> blist = boat.getList();
		assertEquals(blist.get(0), box);
	}
	
	@Test
	public void AttackedTest() {
		Box b = new Box();
		b.setState(true);
		interfaceBoat boat = new mockBoat();
		b.setBoat(boat);
		assertFalse(b.getAttacked()); //no haya sido atacado
		assertTrue(b.setAttacked()); //ataque y haya barco
		assertTrue(b.getAttacked()); //haya sido atacado
		assertFalse(b.setAttacked()); //no pueda atacar otra vez
		
		Box b2 = new Box();
		interfaceBoat boat2 = new mockBoat();
		b2.setState(false);
		b2.setBoat(boat2);
		assertFalse(b2.getAttacked());
		assertFalse(b2.setAttacked());
		assertTrue(b2.getAttacked());
		assertFalse(b2.setAttacked());
	}
	
}
