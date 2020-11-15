package ProyectoTQS.controlador;

import static org.junit.Assert.*;

import org.junit.Test;

import ProyectoTQS.controlador.Game;
import ProyectoTQS.model.Board;
import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Player;
import ProyectoTQS.model.interfacePlayer;
import mockObjects.mockKeyboard;
import mockObjects.mockPlayer;

public class GameTest {
	interfaceKeyboard kb = new mockKeyboard();
	interfaceKeyboard kb0 = new mockKeyboard();
	interfaceKeyboard kb1 = new mockKeyboard();
	public GameTest() {
		kb.addValue(0);
		kb.addValue(0);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(1);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(2);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(3);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(4);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(6);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(8);
		kb.addValue(0);
		
		kb.addValue(1);
		kb.addValue(0);
		kb.addValue(0);
		
		kb.addValue(1);
		kb.addValue(3);
		kb.addValue(0);
		
		kb.addValue(1);
		kb.addValue(6);
		kb.addValue(0);
		
		
		kb.addValue(0);
		kb.addValue(0);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(1);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(2);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(3);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(4);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(6);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(8);
		kb.addValue(0);
		
		kb.addValue(1);
		kb.addValue(0);
		kb.addValue(0);
		
		kb.addValue(1);
		kb.addValue(3);
		kb.addValue(0);
		
		kb.addValue(1);
		kb.addValue(6);
		kb.addValue(0);
		
		
		//Entrada segunda creacion de tablero
		kb0.addValue(0);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(1);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(2);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(4);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(6);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(8);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(6);
		kb0.addValue(0);
		
		
		kb0.addValue(0);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(1);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(2);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(4);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(6);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(8);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(6);
		kb0.addValue(0);
		
		//Entrada de valores de ataque
		//agua
		kb1.addValue(2);
		kb1.addValue(2);
		
		//barco hundido
		kb1.addValue(0);
		kb1.addValue(0);
		
		//Atacar posicion previamente atacada
		kb1.addValue(0);
		kb1.addValue(0);
		
		//atacar fuera del tablero
		kb1.addValue(14);
		kb1.addValue(2);
		
		//atacar barco de +1 de tamaño y dejarlo tocado
		kb1.addValue(1);
		kb1.addValue(0);
		
		//fallo
		kb1.addValue(6);
		kb1.addValue(5);
	}

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
		interfacePlayer p1 = new mockPlayer(1);
		interfacePlayer p2 = new mockPlayer(1);
		game.setPlayer1(p1);
		game.setPlayer2(p2);
		assertEquals(game.checkWin(), 0);
		interfacePlayer p3 = new mockPlayer(0);
		interfacePlayer p4 = new mockPlayer(1);
		game.setPlayer1(p3);
		game.setPlayer2(p4);
		assertEquals(game.checkWin(), 2);
		interfacePlayer p5 = new mockPlayer(1);
		interfacePlayer p6 = new mockPlayer(0);
		game.setPlayer1(p5);
		game.setPlayer2(p6);
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
	
	@Test
	public void initializateBoatsTest() {
		Game game = new Game();
		game.initilizateBoats(kb);
		Board board1 = game.getBoard1();
		Board board2 = game.getBoard2();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j<10; j++) {
				if(i<2) {
					assertTrue(board1.getBox(i, j).getState());
					assertTrue(board2.getBox(i, j).getState());
				}	
				else {
					assertFalse(board1.getBox(i, j).getState());
					assertFalse(board2.getBox(i, j).getState());
				}	
			}
		}
		
	}
	
	@Test
	public void doAttackTest() {
		Game game = new Game();
		game.initilizateBoats(kb0);
		assertEquals(game.doAttack(kb1), 0);
		assertEquals(game.doAttack(kb1), -1);
		assertEquals(game.doAttack(kb1), 0);
	}
}
