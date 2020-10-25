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

}
