package ProyectoTQS.controlador;

import static org.junit.Assert.*;

import org.junit.Test;

import mockObjects.mockKeyboard;


public class MainTest {
	interfaceKeyboard kb = new mockKeyboard();
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
	}

	@Test
	public void test() {
		interfaceGame game = new Game();
		int win = 0;
		game.initilizateBoats(kb);
		boolean hit = false;
		while(game.checkWin()==0) {
			win = game.doAttack(kb);
			game.changeTurn();
		}
		assertEquals(win,1);
	}

}
