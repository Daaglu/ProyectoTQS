package ProyectoTQS;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	//@Test // Tests the constructor
	public void gametest() {
		Game game = new Game();
		Board board = new Board();
		assertEquals(game.getPlayer1().getName(), "Player 1");
		assertEquals(game.getPlayer2().getName(), "Player 2");
		assertEquals(game.getPlayer1().getNumBoats(), 9);
		assertEquals(game.getPlayer2().getNumBoats(), 9);
		assertEquals(game.getTurn(), 0);
		assertEquals(game.getBoard().getNumBoxes(), 100);
	}
	
	//@Test // This checks if a player wins by modifying the number of boats of each player.
	public void checkWinTest() {
		Game game = new Game();
		assertEquals(game.checkWin(), 0);
		game.getPlayer1().setNumBoats(0);
		assertEquals(game.checkWin(), 2);
		game.getPlayer1().setNumBoats(10);
		game.getPlayer2().setNumBoats(0);
		assertEquals(game.checkWin(), 1);
	}
	
	//@Test
	public void changeTrun() {
		Game game = new Game();
		game.changeTurn();
		assertEquals(game.getTurn(), 1);
		game.changeTurn();
		assertEquals(game.getTurn(), 0);
	}
	
	void setBoats(Boat b, int row, int col) {
		
	}
}
