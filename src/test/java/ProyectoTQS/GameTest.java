package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test // Tests the constructor
	public void gametest() {
		Game game = new Game();
		assertEquals(game.getPlayer1().getName(), "Player 1");
		assertEquals(game.getPlayer2().getName(), "Player 2");
		assertEquals(game.getPlayer1().getNumBoats(), 10);
		assertEquals(game.getPlayer2().getNumBoats(), 10);
		assertEquals(game.getTurn(), 0);
		assertEquals(game.getBoard().getNumBoxes(), 64);
		assertArrayEquals(game.getBoard().getMatrix(), new Box[8][8]);
	}
	
	@Test // This checks if a player wins by modifying the number of boats of each player.
	public void checkWinTest() {
		Game game = new Game();
		assertEquals(game.checkWin(), 0);
		game.getPlayer1().setNumBoats(0);
		assertEquals(game.checkWin(), 2);
		game.getPlayer1().setNumBoats(10);
		game.getPlayer2().setNumBoats(0);
		assertEquals(game.checkWin(), 1);
	}

}
