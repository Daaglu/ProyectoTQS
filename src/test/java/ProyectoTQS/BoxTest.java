package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxTest {

	@Test
	public void Boxtest() {
		Box box = new Box();
		assertFalse(box.getState());
	}
	
	@Test
	public void ChangeStateTest() {
		Box box = new Box();
		box.changeState(true);
		assertTrue(box.getState());
	}

}
