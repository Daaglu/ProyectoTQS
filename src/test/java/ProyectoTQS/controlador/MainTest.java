package ProyectoTQS.controlador;

import static org.junit.Assert.*;

import org.junit.Test;

import mockObjects.mockKeyboard;


public class MainTest {
	interfaceKeyboard kb = new mockKeyboard();
	interfaceKeyboard kb1 = new mockKeyboard();
	
	public MainTest() {
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
	}

	@Test
	public void test() {
		interfaceGame game = new Game();
		int win = 0;
		game.initilizateBoats(kb);
		do {
			System.out.println("Turn player " + game.getTurn()+1);
			win = game.doAttack(kb);
			game.changeTurn();
			System.out.println("Turn changed. Time to player " + game.getTurn()+1);
		} while(win==0);
		assertEquals(win,1);
		
		interfaceGame game2 = new Game();
		int win2 = 0;
		game2.initilizateBoats(kb1);
		do {
			win2 = game2.doAttack(kb1);
			game2.changeTurn();
		} while(win2==0);
		assertEquals(win2,2);
	}

}
