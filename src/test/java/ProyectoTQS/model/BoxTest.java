package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;
import mockObjects.mockBoat;

public class BoxTest {

	@Test // Test de caixa de negra.
	public void setBoatTest() {
		Box box = new Box();
		Boat boat = new Boat(2,1);
		box.setBoat(boat);
		assertEquals(box.getBoat(),boat);
		List<Box> blist = boat.getList();
		assertEquals(blist.get(0), box);
	}
	
	@Test // Test de caixa de blanca amb statement coverage i condition coverage. 
	public void AttackedTest() {
		Box b = new Box();
		b.setState(true);
		interfaceBoat boat = new mockBoat();
		b.setBoat(boat);
		assertFalse(b.getAttacked()); //not attacked yet
		assertTrue(b.setAttacked()); //attack where there is a boat
		assertTrue(b.getAttacked()); //has been attacked
		assertFalse(b.setAttacked()); //can't attack again
		
		Box b2 = new Box();
		b2.setState(false);
		assertFalse(b2.getAttacked());
		assertFalse(b2.setAttacked());
		assertTrue(b2.getAttacked());
		assertFalse(b2.setAttacked());
	}
}
