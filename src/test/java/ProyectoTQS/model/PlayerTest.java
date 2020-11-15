package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import ProyectoTQS.controlador.interfaceKeyboard;
import ProyectoTQS.model.Player;
import mockObjects.mockKeyboard;

public class PlayerTest {
	interfaceKeyboard kbPos = new mockKeyboard();
	interfaceKeyboard kbAtt = new mockKeyboard();
	
	public PlayerTest() {
		kbPos.addValue(2);
		kbPos.addValue(2);
		kbPos.addValue(0);
		kbAtt.addValue(0);
		kbAtt.addValue(0);
		kbAtt.addValue(9);
		kbAtt.addValue(9);
	}

	@Test // This tests the Constructor.
	public void PlayerTest() {
		Player p1 = new Player();
		assertEquals(p1.getNumBoats(), 0);
	}
	
	@Test // Tests the setter by checking the new number of boats.
	public void setBoatsTest() {
		Player p1 = new Player();
		p1.setNumBoats(8);
		assertEquals(p1.getNumBoats(), 8);
	}
	
	@Test
	public void createBoatsTest() {
		Player p1 = new Player();
		assertEquals(p1.getNumBoats(), 0);
		p1.createBoats();
		assertEquals(p1.getNumBoats(), 10);
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
	
	
	@Test // This tests the move of a player, but is commented because the player has to enter data.
	public void enterPositionBoatsTest() throws IOException {
		Player p1 = new Player();
		assertArrayEquals(p1.enterPositionBoats(1,kbPos), new int[] {2,2,0});
	}
	
	@Test
	public void attackTest() {
		Player p1 = new Player();
		assertArrayEquals(p1.attack(kbAtt),new int[] {0,0});
		assertArrayEquals(p1.attack(kbAtt),new int[] {9,9});
	}
	
	@Test
	public void livesTest() {
		Player p1 = new Player();
		p1.setNumBoats(1);
		p1.boatDied();
		assertEquals(0,p1.getNumBoats());
	}
	
}
