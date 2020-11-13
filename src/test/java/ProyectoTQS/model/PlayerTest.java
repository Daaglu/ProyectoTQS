package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import ProyectoTQS.model.Player;

public class PlayerTest {

	@Test // This tests the Constructor.
	public void PlayerTest() {
		Player p1 = new Player("Player 1");
		assertEquals(p1.getName(), "Player 1");
		assertEquals(p1.getNumBoats(), 10);
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
	public void createBoatsTest() {
		Player p1 = new Player("Player 1");
		p1.createBoats();
		assertEquals(p1.getBoatList().size(), 10);
		assertEquals(p1.getBoatList().get(0).getSize(), 1);
		assertEquals(p1.getBoatList().get(1).getSize(), 1);
		assertEquals(p1.getBoatList().get(2).getSize(), 1);
		assertEquals(p1.getBoatList().get(3).getSize(), 1);
		assertEquals(p1.getBoatList().get(4).getSize(), 2);
		assertEquals(p1.getBoatList().get(5).getSize(), 2);
		assertEquals(p1.getBoatList().get(6).getSize(), 2);
		assertEquals(p1.getBoatList().get(7).getSize(), 3);
		assertEquals(p1.getBoatList().get(8).getSize(), 3);
		assertEquals(p1.getBoatList().get(9).getSize(), 4);
		assertEquals(p1.getBoatList().get(5).getOrientation(), -1);
	}
	
	
	//@Test // This tests the move of a player, but is commented because the player has to enter data.
	public void enterPositionBoatsTest() throws IOException {
		Player p1 = new Player("Player 1");			
		assertArrayEquals(p1.enterPositionBoats(1), new int[] {2,2,0});
	}
	
}
