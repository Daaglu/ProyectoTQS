package automatització;

import static org.junit.Assert.*;

import org.junit.Test;

import ProyectoTQS.controlador.Game;
import ProyectoTQS.controlador.interfaceKeyboard;
import mockObjects.mockKeyboard;

public class Automatització {
	
	interfaceKeyboard kb0 = new mockKeyboard();
	
	public Automatització() {
		//Tauler jugador 1
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
		
		// Tauler jugador 2
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
	}
	
	@Test
	//Automatització on el jugador 01 encerta tot a la primera
	public void automatització1() {
		//Inicialitzem el taulell al joc
		Game game = new Game();
		game.initilizateBoats(kb0);
		interfaceKeyboard kb1 = new mockKeyboard();
		
		//Jugador 01 encerta tots els vaixells
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
		
		game.doAttack(kb1);
	}
	
	@Test
	//Automatització on el jugador 2 encerta tot a la primera
	public void automatització2() {
		//Inicialitzem el taulell al joc
		Game game = new Game();
		game.initilizateBoats(kb0);
		interfaceKeyboard kb2 = new mockKeyboard();
		
		//Jugador 1 falla el primer torn
		kb2.addValue(3);
		kb2.addValue(2);
		
		game.doAttack(kb2);
		game.changeTurn();
		
		//Jugador 2 encerta tots els vaixells
		kb2.addValue(0);
		kb2.addValue(0);
		
		kb2.addValue(0);
		kb2.addValue(1);
		
		kb2.addValue(0);
		kb2.addValue(2);
		
		kb2.addValue(0);
		kb2.addValue(3);
		
		kb2.addValue(0);
		kb2.addValue(4);
		kb2.addValue(0);
		kb2.addValue(5);
		
		kb2.addValue(0);
		kb2.addValue(6);
		kb2.addValue(0);
		kb2.addValue(7);
		
		kb2.addValue(0);
		kb2.addValue(8);
		kb2.addValue(0);
		kb2.addValue(9);
		
		kb2.addValue(1);
		kb2.addValue(0);
		kb2.addValue(1);
		kb2.addValue(1);
		kb2.addValue(1);
		kb2.addValue(2);
		
		kb2.addValue(1);
		kb2.addValue(3);
		kb2.addValue(1);
		kb2.addValue(4);
		kb2.addValue(1);
		kb2.addValue(5);
		
		kb2.addValue(1);
		kb2.addValue(6);
		kb2.addValue(1);
		kb2.addValue(7);
		kb2.addValue(1);
		kb2.addValue(8);
		kb2.addValue(1);
		kb2.addValue(9);
		
		game.doAttack(kb2);
	}
	
	//@Test
	//Automatització on 
	public void automatització3() {
		//Inicialitzem el taulell al joc
		Game game = new Game();
		game.initilizateBoats(kb0);
		interfaceKeyboard kb3 = new mockKeyboard();
		
		for (int i=2;i<10;i++) {
			for (int j=0;j<10;i++) {
				kb3.addValue(i);
				kb3.addValue(j);
				game.doAttack(kb3);
				game.changeTurn();
			}
		}
	}
	
	
}
