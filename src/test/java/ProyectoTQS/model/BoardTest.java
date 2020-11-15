package ProyectoTQS.model;

import static org.junit.Assert.*;

import org.junit.Test;

import ProyectoTQS.model.Board;
import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;

public class BoardTest {

	@Test // Test del constructor.
	public void BoardTest() {
		Board board = new Board();
		assertEquals(board.getNumBoxes(), 100);
		assertEquals(board.getBox(0, 0).getState(), new Box().getState());
	}
	
	@Test // Test per veure si es crea bé una casella.
	public void getBoxTest() {
		Board board = new Board();
		assertFalse(board.getBox(0, 0).getState());
	}
	
	
	@Test // Test de caixa negra amb particions equivalent i de caixa blanca amb statement i decision coverage.
	public void setBoatTest() {
		Board board = new Board();
		Boat boat = new Boat(1,0);
		Boat boat2 = new Boat(3,0);
		// Fila fora del tauler.
		boolean res_0 = board.setBoat(boat, -1, 1);
		assertFalse(res_0);
		// Columna fora del tauler.
		boolean res_1 = board.setBoat(boat, 8, 12);
		assertFalse(res_1);
		// Fila i columna fora del tauler per sota.
		boolean res_2 = board.setBoat(boat, -1, -1);
		assertFalse(res_2);
		// Fila i columna fora del tauler per dalt.
		boolean res_3 = board.setBoat(boat, 11, 12);
		assertFalse(res_3);
		// Columna fora del tauler per sota.
		boolean res_4 = board.setBoat(boat, 5, -1);
		assertFalse(res_4);
		// Esquina superior esquerra, valor limit.
		boolean res_5 = board.setBoat(boat, 0, 0);
		assertTrue(res_5);
		// Esquina supieror dreta, valor limit.
		boolean res_6 = board.setBoat(boat, 0, 9);
		assertTrue(res_6);
		// Esquina inferior esquerra, valor limit.
		boolean res_7 = board.setBoat(boat, 9, 0);
		assertTrue(res_7);
		// Esquina inferior dreta, valor limit.
		boolean res_8 = board.setBoat(boat, 9, 9);
		assertTrue(res_8);
		// Possar un vaixell a l'interior del tauler
		boolean res_9 = board.setBoat(boat, 5, 5);
		assertTrue(res_9);
		// Possar un vaixell on ja hi ha un vaixell
		boolean res_10 = board.setBoat(boat, 0, 0);
		assertFalse(res_10);	
		// Possar un vaixell al marge pero es sortiria
		boolean res_11 = board.setBoat(boat2, 5, 9);
		assertFalse(res_11);
	
	}
	
	@Test // Test de caixa blanca amb statement coverage i decision coverage.
	public void checkAndSetTest() {
		Board board = new Board();
		Boat boat1 = new Boat(2,0);
		Boat boat2 = new Boat(2,1);
		Boat boat3 = new Boat(3,2);
		Boat boat4 = new Boat(3,3);
		Boat boat5 = new Boat(3,2);
		Boat boat6 = new Boat(4,4);
		// Possar un vaixell a l'esquina superior esquerra, valor limit.
		boolean res_0 = board.checkAndSet(0, 0, boat1);
		assertTrue(res_0);
		// Possar un vaixell a l'esquina inferior esquerra, limit.
		boolean res_1 = board.checkAndSet(9, 0, boat1);
		assertTrue(res_1);
		// Possar un vaixell en una casella ocupada.
		boolean res_2 = board.checkAndSet(0, 0, boat2);
		assertFalse(res_2);
		// Possar un vaixell a l'esquina superior dreta, valor limit 
		boolean res_3 = board.checkAndSet(0, 9, boat2);
		assertTrue(res_3);
		// Possar un vaixell a l'esquina superior dreta pero esta ocupada
		boolean res_4 = board.checkAndSet(0, 9, boat2);
		assertFalse(res_4);
		// Possar un vaixell a l'esquina inferior dreta
		boolean res_5 = board.checkAndSet(9, 9, boat5);
		assertTrue(res_5);
		// Possar un vaixell al centre del tauler
		boolean res_6 = board.checkAndSet(5, 5, boat3);
		assertTrue(res_6);
		// Possar un vaixell al centre del tauler pero ja esta ocupat.
		boolean res_7 = board.checkAndSet(5, 5, boat4);
		assertFalse(res_7);
		// Possar un vaixell cap a dalt a una posicio buida pero l'ultima està ocupada.
		boolean res_8 = board.checkAndSet(2, 0, boat4);
		assertFalse(res_8);
		// Possar un vaixell cap a la dreta dins del tauler pero l'ultima possicio està fora.
		boolean res_9 = board.checkAndSet(7, 9, boat1);
		assertFalse(res_9);
		// Possar un vaixell cap a la dreta en una casella buida pero l'ultima esta ocupada.
		boolean res_10 = board.checkAndSet(9, 6, boat1);
		assertFalse(res_10);
		// Possar un vaixell amb una orientacio incorrecta.
		boolean res_11 = board.checkAndSet(9, 9, boat6);
		assertFalse(res_11);
		// Possar un vaixell cap avall dins del tauler pero es surt.
		boolean res_12 = board.checkAndSet(9, 9, boat2);
		assertFalse(res_12);
		// Possar un vaixell cap a l'esquerra pero es surt.
		boolean res_13 = board.checkAndSet(0, 2, boat3);
		assertFalse(res_13);
		// Possar un vaixell fora del tauler cap a dalt.
		boolean res_14 = board.checkAndSet(0, 5, boat4);
		assertFalse(res_14);
		// Possar un vaixell a una casella buida.
		boolean res_15 = board.checkAndSet(2, 2, boat4);
		assertTrue(res_15);
		// Possar un vaixell cap a l'esquerra i que es surti.
		boolean res_16 = board.checkAndSet(5, 0, boat3);
		assertFalse(res_16);
	}
}
