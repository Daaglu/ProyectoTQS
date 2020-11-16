package ProyectoTQS.controlador;

import static org.junit.Assert.*;

import org.junit.Test;

import mockObjects.mockKeyboard;


public class MainTest {
	interfaceKeyboard kb = new mockKeyboard();
	interfaceKeyboard kb1 = new mockKeyboard();
	interfaceKeyboard kb2 = new mockKeyboard();
	
	public MainTest() {
		// GAME 1
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
		
		
		kb.addValue(0);
		kb.addValue(0);
		
		kb.addValue(0);
		kb.addValue(1);
		
		kb.addValue(0);
		kb.addValue(2);
		
		kb.addValue(0);
		kb.addValue(3);
		
		kb.addValue(0);
		kb.addValue(4);
		
		kb.addValue(0);
		kb.addValue(5);
		
		kb.addValue(0);
		kb.addValue(6);
		
		kb.addValue(0);
		kb.addValue(7);
		
		kb.addValue(0);
		kb.addValue(8);
		
		kb.addValue(0);
		kb.addValue(9);
		
		kb.addValue(1);
		kb.addValue(0);
		
		kb.addValue(1);
		kb.addValue(1);
		
		kb.addValue(1);
		kb.addValue(2);
		
		kb.addValue(1);
		kb.addValue(3);
		
		kb.addValue(1);
		kb.addValue(4);
		
		kb.addValue(1);
		kb.addValue(5);
		
		kb.addValue(1);
		kb.addValue(6);
		
		kb.addValue(1);
		kb.addValue(7);
		
		kb.addValue(1);
		kb.addValue(8);
		
		kb.addValue(1);
		kb.addValue(9);
		
		// GAME 2
		kb1.addValue(0);
		kb1.addValue(0);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(1);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(2);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(3);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(4);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(6);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(8);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(0);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(3);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(6);
		kb1.addValue(0);
		
		
		kb1.addValue(0);
		kb1.addValue(0);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(1);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(2);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(3);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(4);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(6);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(8);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(0);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(3);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(6);
		kb1.addValue(0);
		
		
		kb1.addValue(7);
		kb1.addValue(8);
		
		kb1.addValue(0);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(1);
		
		kb1.addValue(0);
		kb1.addValue(2);
		
		kb1.addValue(0);
		kb1.addValue(3);
		
		kb1.addValue(0);
		kb1.addValue(4);
		
		kb1.addValue(0);
		kb1.addValue(5);
		
		kb1.addValue(0);
		kb1.addValue(6);
		
		kb1.addValue(0);
		kb1.addValue(7);
		
		kb1.addValue(0);
		kb1.addValue(8);
		
		kb1.addValue(0);
		kb1.addValue(9);
		
		kb1.addValue(1);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(1);
		
		kb1.addValue(1);
		kb1.addValue(2);
		
		kb1.addValue(1);
		kb1.addValue(3);
		
		kb1.addValue(1);
		kb1.addValue(4);
		
		kb1.addValue(1);
		kb1.addValue(5);
		
		kb1.addValue(1);
		kb1.addValue(6);
		
		kb1.addValue(1);
		kb1.addValue(7);
		
		kb1.addValue(1);
		kb1.addValue(8);
		
		kb1.addValue(1);
		kb1.addValue(9);
		
		// GAME 3
		// Size 1
		kb2.addValue(0);
		kb2.addValue(0);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(2);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(4);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(6);
		kb2.addValue(0);
		
		// Size 2
		kb2.addValue(2);
		kb2.addValue(1);
		kb2.addValue(0);
		
		kb2.addValue(2);
		kb2.addValue(5);
		kb2.addValue(0);
		
		kb2.addValue(2);
		kb2.addValue(9);
		kb2.addValue(3);
		
		// Size 3
		kb2.addValue(5);
		kb2.addValue(5);
		kb2.addValue(1);
		
		kb2.addValue(6);
		kb2.addValue(9);
		kb2.addValue(1);
		
		// Size 4
		kb2.addValue(9);
		kb2.addValue(9);
		kb2.addValue(2);
		
		// Player 2
		// Size 1
		kb2.addValue(0);
		kb2.addValue(0);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(2);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(4);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(6);
		kb2.addValue(0);
		
		// Size 2
		kb2.addValue(2);
		kb2.addValue(1);
		kb2.addValue(0);
		
		kb2.addValue(2);
		kb2.addValue(5);
		kb2.addValue(0);
		
		kb2.addValue(2);
		kb2.addValue(9);
		kb2.addValue(3);
		
		// Size 3
		kb2.addValue(5);
		kb2.addValue(5);
		kb2.addValue(1);
		
		kb2.addValue(6);
		kb2.addValue(9);
		kb2.addValue(1);
		
		// Size 4
		kb2.addValue(9);
		kb2.addValue(9);
		kb2.addValue(2);
		
		// Turno jugador1
		kb2.addValue(0);
		kb2.addValue(0);
		
		// Falla
		kb2.addValue(0);
		kb2.addValue(1);
		
		// Turno jugador 2
		kb2.addValue(0);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(2);
		
		kb2.addValue(0);
		kb2.addValue(4);
		
		kb2.addValue(0);
		kb2.addValue(6);
		
		// ALL THE SIZE 1 HITTED
		
		kb2.addValue(2);
		kb2.addValue(1);
		
		kb2.addValue(2);
		kb2.addValue(2);
		
		kb2.addValue(2);
		kb2.addValue(5);
		
		kb2.addValue(2);
		kb2.addValue(6);
		
		kb2.addValue(2);
		kb2.addValue(9);
		
		kb2.addValue(1);
		kb2.addValue(9);
		
		// ALL SIZE 2 HITTED
		
		kb2.addValue(5);
		kb2.addValue(5);
		
		kb2.addValue(6);
		kb2.addValue(5);
		
		kb2.addValue(7);
		kb2.addValue(5);
		
		kb2.addValue(6);
		kb2.addValue(9);
		
		kb2.addValue(7);
		kb2.addValue(9);
		
		kb2.addValue(8);
		kb2.addValue(9);
		
		// ALL SIZE 3 HITTED
		
		kb2.addValue(9);
		kb2.addValue(9);
		
		kb2.addValue(9);
		kb2.addValue(8);
		
		kb2.addValue(9);
		kb2.addValue(7);
		
		kb2.addValue(9);
		kb2.addValue(6);
	}

	@Test
	public void test() {
		Game game = new Game();
		int win = 0;
		game.initilizateBoats(kb);
		do {
			System.out.println("Turn player " + game.getTurn()+1);
			win = game.doAttack(kb);
			game.changeTurn();
			System.out.println("Turn changed. Time to player " + game.getTurn()+1);
		} while(win==0);
		assertEquals(win,1);
		
		Game game2 = new Game();
		int win2 = 0;
		game2.initilizateBoats(kb1);
		do {
			win2 = game2.doAttack(kb1);
			game2.changeTurn();
		} while(win2==0);
		assertEquals(win2,2);
		
		Game game3 = new Game();
		int win3 = 0;
		game3.initilizateBoats(kb2);
		do {
			System.out.println("Turn player " + game3.getTurn()+1);
			win3 = game3.doAttack(kb2);
			if(win3 == 0) {
				game3.changeTurn();
				System.out.println("Turn changed. Time to player " + game3.getTurn()+1);
			}
		} while(win3==0);
		assertEquals(win3,2);
	}

}
