package ProyectoTQS;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class PlayerTest {

	@Test // This tests the Constructor.
	public void PlayerTest() {
		Player p1 = new Player("Player 1");
		assertEquals(p1.getName(), "Player 1");
		assertEquals(p1.getNumBoats(), 9);
	}
	
	@Test // Tests the setter by checking the new number of boats.
	public void setBoatsTest() {
		Player p1 = new Player("Player 1");
		p1.setNumBoats(8);
		assertEquals(p1.getNumBoats(), 8);
	}
	
	//@Test // This tests the move of a player, but is commented because the player has to enter data.
	public void playTest() throws IOException {
		Player p1 = new Player("Player 1");
		assertArrayEquals(p1.play(), new int[] {2,2});
	}
	
	@Test
	public void putBoatsTest() {
		Player p1 = new Player("Player 1");
	}

}
