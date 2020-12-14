package automatització;

import static org.junit.Assert.*;

import org.junit.Test;

import ProyectoTQS.controlador.Game;
import ProyectoTQS.controlador.interfaceKeyboard;
import mockObjects.mockKeyboard;

public class Automatització {
	
	interfaceKeyboard kb0 = new mockKeyboard();
	interfaceKeyboard kb7 = new mockKeyboard();
	
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
		
		//Tauler jugador 1
		kb7.addValue(0);
		kb7.addValue(0);
		kb7.addValue(0);
		
		kb7.addValue(1);
		kb7.addValue(2);
		kb7.addValue(0);
		
		kb7.addValue(3);
		kb7.addValue(0);
		kb7.addValue(0);
		
		kb7.addValue(9);
		kb7.addValue(9);
		kb7.addValue(0);
		
		kb7.addValue(8);
		kb7.addValue(2);
		kb7.addValue(1);
		
		kb7.addValue(1);
		kb7.addValue(8);
		kb7.addValue(1);
		
		kb7.addValue(8);
		kb7.addValue(6);
		kb7.addValue(0);
		
		kb7.addValue(6);
		kb7.addValue(0);
		kb7.addValue(0);
		
		kb7.addValue(3);
		kb7.addValue(6);
		kb7.addValue(1);
		
		kb7.addValue(3);
		kb7.addValue(4);
		kb7.addValue(1);
		
		// Tauler jugador 2
		kb7.addValue(1);
		kb7.addValue(4);
		kb7.addValue(0);
		
		kb7.addValue(2);
		kb7.addValue(1);
		kb7.addValue(0);
		
		kb7.addValue(2);
		kb7.addValue(7);
		kb7.addValue(0);
		
		kb7.addValue(5);
		kb7.addValue(8);
		kb7.addValue(0);
		
		kb7.addValue(5);
		kb7.addValue(0);
		kb7.addValue(1);
		
		kb7.addValue(8);
		kb7.addValue(5);
		kb7.addValue(1);
		
		kb7.addValue(8);
		kb7.addValue(7);
		kb7.addValue(0);
		
		kb7.addValue(4);
		kb7.addValue(5);
		kb7.addValue(1);
		
		kb7.addValue(0);
		kb7.addValue(0);
		kb7.addValue(0);
		
		kb7.addValue(5);
		kb7.addValue(2);
		kb7.addValue(1);
	}
	
	//@Test
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
		assertEquals(game.checkWin(), 1);
	}
	
	//@Test
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
		assertEquals(game.checkWin(), 2);
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
	
	//@Test
	//automatitzacio on J1 s'equivoca i torna a atacar una posició ja enfonsada
	public void automatitzacio4() {
		//Inicialitzem el taulell al joc
		Game game = new Game();
		game.initilizateBoats(kb0);
		interfaceKeyboard kb4 = new mockKeyboard();
		
		//Jugador 01 encerta tots els vaixells
		kb4.addValue(0);
		kb4.addValue(0);
		
		//s'equivoca i posa la mateixa posició de nou
		kb4.addValue(0);
		kb4.addValue(0);
		
		
		kb4.addValue(0);
		kb4.addValue(1);
		
		kb4.addValue(0);
		kb4.addValue(2);
		
		kb4.addValue(0);
		kb4.addValue(3);
		
		kb4.addValue(0);
		kb4.addValue(4);
		kb4.addValue(0);
		kb4.addValue(5);
		
		kb4.addValue(0);
		kb4.addValue(6);
		kb4.addValue(0);
		kb4.addValue(7);
	
		kb4.addValue(0);
		kb4.addValue(8);
		kb4.addValue(0);
		kb4.addValue(9);
		
		kb4.addValue(1);
		kb4.addValue(0);
		kb4.addValue(1);
		kb4.addValue(1);
		kb4.addValue(1);
		kb4.addValue(2);
		
		kb4.addValue(1);
		kb4.addValue(3);
		kb4.addValue(1);
		kb4.addValue(4);
		kb4.addValue(1);
		kb4.addValue(5);
	
		kb4.addValue(1);
		kb4.addValue(6);
		kb4.addValue(1);
		kb4.addValue(7);
		kb4.addValue(1);
		kb4.addValue(8);
		kb4.addValue(1);
		kb4.addValue(9);
		
		game.doAttack(kb4);
		assertEquals(game.checkWin(), 1);
	}
	
	//@Test
	//automatitzacio on J1 s'equivoca i torna a atacar una aigua
	public void automatitzacio5() {
		//Inicialitzem el taulell al joc
		Game game = new Game();
		game.initilizateBoats(kb0);
		interfaceKeyboard kb5 = new mockKeyboard();
		
		//Jugador 01 ataca aigua
		kb5.addValue(8);
		kb5.addValue(8);
		game.doAttack(kb5);
		game.changeTurn();
		
		//11 falla
		kb5.addValue(8);
		kb5.addValue(8);
		game.doAttack(kb5);
		game.changeTurn();
		
		//01 s'equivoca i torna a atacar l'aigua d'abans
		kb5.addValue(8);
		kb5.addValue(8);
		
		kb5.addValue(0);
		kb5.addValue(0);
		
		kb5.addValue(0);
		kb5.addValue(1);
		
		kb5.addValue(0);
		kb5.addValue(2);
	
		kb5.addValue(0);
		kb5.addValue(3);
		
		kb5.addValue(0);
		kb5.addValue(4);
		kb5.addValue(0);
		kb5.addValue(5);
		
		kb5.addValue(0);
		kb5.addValue(6);
		kb5.addValue(0);
		kb5.addValue(7);
		
		kb5.addValue(0);
		kb5.addValue(8);
		kb5.addValue(0);
		kb5.addValue(9);
		
		kb5.addValue(1);
		kb5.addValue(0);
		kb5.addValue(1);
		kb5.addValue(1);
		kb5.addValue(1);
		kb5.addValue(2);
		
		kb5.addValue(1);
		kb5.addValue(3);
		kb5.addValue(1);
		kb5.addValue(4);
		kb5.addValue(1);
		kb5.addValue(5);
		
		kb5.addValue(1);
		kb5.addValue(6);
		kb5.addValue(1);
		kb5.addValue(7);
		kb5.addValue(1);
		kb5.addValue(8);
		kb5.addValue(1);
		kb5.addValue(9);
		
		game.doAttack(kb5);
		assertEquals(game.checkWin(), 1);
	}
	
	//@Test
	//automatitzacio on la partida és normal i guanya 11
	public void automatitzacio6() {
		//Inicialitzem el taulell al joc
		Game game = new Game();
		game.initilizateBoats(kb7);
		interfaceKeyboard kb6 = new mockKeyboard();
		
		//Torn Jugador 01
		kb6.addValue(1);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(1);
		kb6.addValue(2);
		kb6.addValue(1);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(2);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(1);
		kb6.addValue(5);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(4);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(7);
		kb6.addValue(6);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(0);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(7);
		kb6.addValue(2);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(0);
		kb6.addValue(4);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(4);
		kb6.addValue(7);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(1);
		kb6.addValue(2);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(5);
		kb6.addValue(2);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(3);
		kb6.addValue(6);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(5);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(3);
		kb6.addValue(4);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(6);
		kb6.addValue(2);
		kb6.addValue(6);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//NEXT MOVE JUGADOR01 (DAAGLU) ATACA-> J10
		//Torn Jugador 01
		kb6.addValue(9);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(6);
		kb6.addValue(1);
		kb6.addValue(6);
		kb6.addValue(0);
		kb6.addValue(1);
		kb6.addValue(4);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(6);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(4);
		kb6.addValue(4);
		kb6.addValue(4);
		kb6.addValue(5);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(4);
		kb6.addValue(5);
		kb6.addValue(3);
		kb6.addValue(5);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(4);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(5);
		kb6.addValue(5);
		kb6.addValue(6);
		kb6.addValue(5);
		kb6.addValue(2);
		kb6.addValue(8);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(3);
		kb6.addValue(4);
		kb6.addValue(2);
		kb6.addValue(4);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(5);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(5);
		kb6.addValue(4);
		kb6.addValue(6);
		kb6.addValue(4);
		kb6.addValue(4);
		kb6.addValue(6);
		kb6.addValue(5);
		kb6.addValue(6);
		kb6.addValue(6);
		kb6.addValue(6);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(3);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(3);
		kb6.addValue(6);
		kb6.addValue(0);
		kb6.addValue(0);
		kb6.addValue(0);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(8);
		kb6.addValue(2);
		kb6.addValue(8);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(9);
		kb6.addValue(1);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(8);
		kb6.addValue(1);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(3);
		kb6.addValue(0);
		kb6.addValue(3);
		kb6.addValue(2);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(7);
		kb6.addValue(2);
		kb6.addValue(9);
		kb6.addValue(2);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(6);
		kb6.addValue(8);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(6);
		kb6.addValue(2);
		kb6.addValue(5);
		kb6.addValue(2);
		kb6.addValue(3);
		kb6.addValue(2);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(8);
		kb6.addValue(4);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(8);
		kb6.addValue(4);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(8);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(9);
		kb6.addValue(6);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(8);
		kb6.addValue(2);
		kb6.addValue(8);
		kb6.addValue(1);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(3);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(8);
		kb6.addValue(3);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(5);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(9);
		kb6.addValue(2);
		kb6.addValue(4);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(5);
		kb6.addValue(0);
		kb6.addValue(7);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(5);
		kb6.addValue(8);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(6);
		kb6.addValue(0);
		kb6.addValue(2);
		kb6.addValue(1);
		kb6.addValue(6);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(0);
		kb6.addValue(5);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(0);
		kb6.addValue(0);
		kb6.addValue(0);
		kb6.addValue(1);
		kb6.addValue(0);
		kb6.addValue(2);
		kb6.addValue(1);
		kb6.addValue(4);
		kb6.addValue(0);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(0);
		kb6.addValue(7);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(9);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(1);
		kb6.addValue(6);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(9);
		kb6.addValue(5);
		kb6.addValue(9);
		kb6.addValue(4);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(1);
		kb6.addValue(8);
		kb6.addValue(1);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(8);
		kb6.addValue(5);
		kb6.addValue(7);
		kb6.addValue(8);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(2);
		kb6.addValue(8);
		kb6.addValue(9);
		kb6.addValue(5);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(4);
		kb6.addValue(8);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(8);
		kb6.addValue(6);
		kb6.addValue(8);
		kb6.addValue(7);
		kb6.addValue(9);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(2);
		kb6.addValue(7);
		kb6.addValue(8);
		kb6.addValue(8);
		kb6.addValue(8);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(7);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(8);
		kb6.addValue(7);
		kb6.addValue(8);
		kb6.addValue(0);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(4);
		kb6.addValue(8);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 01
		kb6.addValue(4);
		kb6.addValue(9);
		game.doAttack(kb6);
		game.changeTurn();
		
		//Torn Jugador 11
		kb6.addValue(9);
		kb6.addValue(9);
	
		game.doAttack(kb6);
		assertEquals(game.checkWin(), 2);
	}

}
