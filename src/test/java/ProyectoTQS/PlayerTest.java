package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void PlayerTest() {
		Player p1 = new Player("Player 1");
		assertEquals(p1.getName(), "Player 1");
		assertEquals(p1.getNumBoats(), 10);
		
	}

}
