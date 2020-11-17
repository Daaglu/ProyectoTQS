package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;

public class BoatTest {

	@Test // Test de caixa negra sobre el constructor.
	public void BoatTest() {
		Boat boat = new Boat(3, 0);
		List<Box> blist = new LinkedList<Box>(); 
		assertEquals(boat.getSize(), 3);
		assertEquals(boat.getOrientation(), 0);
		assertTrue(boat.getAlive());
		assertEquals(boat.getState(), 0);
		assertEquals(boat.getList(), blist);
	}
	
	@Test // Test de caixa negra amb particions equivalents. 
	public void changeStateTest() {
		Boat boat = new Boat(4, 0);
		// Valor limit
		boat.changeState(-1);
		assertEquals(boat.getState(), 0);
		// Valor frontera
		boat.changeState(0);
		assertEquals(boat.getState(), 0);
		// Valor limit
		boat.changeState(1);
		assertEquals(boat.getState(), 1);
		// Valor frontera
		boat.changeState(2);
		assertEquals(boat.getState(), 2);
		// Valor limit
		boat.changeState(4);
		assertEquals(boat.getState(), 2);
	}
	
	@Test // Test de caixa negra i test de caixa blanca amb statement coverage i decision coverage.
	public void checkDeadTest() {
		Boat boat = new Boat(3,1);
		boolean res_0 = boat.checkDead();
		assertFalse(res_0);
		boat.changeState(2);
		boolean res_1 = boat.checkDead();
		assertTrue(res_1);
	}
	
	@Test // Test de caixa negra.
	public void setPositionBoxTest() {
		Box b = new Box();
		Boat boat = new Boat(2,1);
		boat.setPositionBox(b);
		assertEquals(boat.getList().get(0), b);
	}
	
	@Test // Test de caja blanca amb statement coverage i decision coverage.
	public void attackedTest() {
		Boat b = new Boat(3,0);
		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = new Box();
		b1.setBoat(b);
		b2.setBoat(b);
		b3.setBoat(b);
		b1.setAttacked();
		assertEquals(b.getState(), 1);
		b2.setAttacked();
		assertEquals(b.getState(), 1);
		b3.setAttacked();
		assertEquals(b.getState(), 2);
	}

}
