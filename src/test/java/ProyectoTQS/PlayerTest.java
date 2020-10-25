package ProyectoTQS;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void PlayerTest() {
		Player p1 = new Player("Player 1");
		assertEquals(p1.getName(), "Player 1");
		assertEquals(p1.getNumBoats(), 10);
	}
	
	//@Test
	public void playTest() throws IOException {
		Player p1 = new Player("Player 1");
		assertArrayEquals(p1.play(), new int[] {2,2});
	}

}
