package ProyectoTQS.controlador;

import static org.junit.Assert.*;

import org.junit.Test;

import ProyectoTQS.controlador.Game;
import ProyectoTQS.model.Board;

public class GameTest {

	@Test // Tests the constructor
	public void gameTest() {
		Game game = new Game();
		Board board = new Board();
		assertEquals(game.getPlayer1().getNumBoats(), 10);
		assertEquals(game.getPlayer2().getNumBoats(), 10);
		assertEquals(game.getTurn(), 0);
		assertEquals(game.getBoard1().getNumBoxes(), 100);
		assertEquals(game.getBoard2().getNumBoxes(), 100);
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
	
	@Test
	public void changeTurnTest() {
		Game game = new Game();
		game.changeTurn();
		assertEquals(game.getTurn(), 1);
		game.changeTurn();
		assertEquals(game.getTurn(), 0);
	}
	
	//@Test
	public void initializateBoatsTest() {
		Game game = new Game();
		game.initilizateBoats();
		
	}
}
