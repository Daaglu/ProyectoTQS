package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test // This tests the constructor.
	public void BoardTest() {
		Board board = new Board();
		assertEquals(board.getNumBoxes(), 64);
		assertArrayEquals(board.getMatrix(), new Box[8][8]);
	}
	
	@Test // Test if the return value is a box
	public void getBoxTest() {
		Board board = new Board();
		Box box = new Box();
		assertEquals(board.getBox(0, 0), box);
	}
	
	@Test // Test the attack method
	public void attackTest() {
		Board board = new Board();
		int x = 0;
		int y = 0;
		board.attack(x,y);
		assertTrue(board.attack(x,y));
		assertFalse(board.attack(x, y)); //attack again and test if this could be possible
	}
	
	@Test
	public void setBoatsTest() {
		Board board = new Board();
		int pos = 0;
		int dir = 0;
	}

}
