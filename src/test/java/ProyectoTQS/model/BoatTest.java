package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;

public class BoatTest {

	@Test // Tests the constructor 
	public void BoatTest() {
		Boat boat = new Boat(3, 0);
		List<Box> blist = new LinkedList<Box>(); 
		assertEquals(boat.getSize(), 3);
		assertEquals(boat.getOrientation(), 0);
		assertTrue(boat.getAlive());
		assertEquals(boat.getState(), 0);
		assertEquals(boat.getList(), blist);
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
	
	@Test 
	public void setPositiobBoxTest() {
		Box b = new Box();
		Boat boat = new Boat(2,1);
		boat.setPositionBox(b);
		assertEquals(boat.getList().get(0), b);
	}

}
