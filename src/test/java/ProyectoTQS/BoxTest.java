package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxTest {

	@Test // Tests the constructor
	public void Boxtest() {
		Box box = new Box();
		assertFalse(box.getState());
	}
	
	@Test // Tests  if the methos changes the state correctly
	public void ChangeStateTest() {
		Box box = new Box();
		box.changeState(true);
		assertTrue(box.getState());
	}
}
