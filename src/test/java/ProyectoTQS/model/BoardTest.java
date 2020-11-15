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
		// Esquina superior esquerra.
		boolean res_5 = board.setBoat(boat, 0, 0);
		assertTrue(res_5);
		// Esquina supieror dreta.
		boolean res_6 = board.setBoat(boat, 0, 9);
		assertTrue(res_6);
		// Esquina inferior esquerra.
		boolean res_7 = board.setBoat(boat, 9, 0);
		assertTrue(res_7);
		// Esquina inferior dreta.
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
	public void checkAndSet() {
		Board board = new Board();
		Boat boat1 = new Boat(2,0);
		Boat boat2 = new Boat(2,1);
		Boat boat3 = new Boat(3,2);
		Boat boat4 = new Boat(3,3);
		Boat boat5 = new Boat(3,2);
		Boat boat6 = new Boat(4,4);
		// Possar un vaixell a l'esquina superior esquerra.
		boolean res_0 = board.checkAndSet(0,0,boat1);
		assertTrue(res_0);
		// Possar un vaixell a l'esquina inferior esquerra.
		boolean res_1 = board.checkAndSet(9,0,boat1);
		assertTrue(res_1);
		// Posar un vaixell en una casella ocupada
		boolean res_2 = board.checkAndSet(0,0,boat2);
		assertFalse(res_2);
		// Try to put a boat on the last position of the first row.
		boolean res_3 = board.checkAndSet(0,9, boat2);
		assertTrue(res_3);
		// Try to put a boat on a position already occupied.
		boolean res_4 = board.checkAndSet(9,0, boat3);
		assertFalse(res_4);
		// Try to put a boat in the middle of the board.
		boolean res_5 = board.checkAndSet(5,5, boat3);
		assertTrue(res_5);
		// Trying to put a boat of different size in a position already occupied in the middle
		boolean res_6 = board.checkAndSet(5,5, boat4);
		assertFalse(res_6);
		// Trying to put a boat on an empty position but the last one is occupied
		boolean res_7 = board.checkAndSet(2,0, boat4);
		assertFalse(res_7);
		// Trying to put a boat on the last position to left direction
		boolean res_8 = board.checkAndSet(9, 9, boat5);
		assertTrue(res_8);
		// Trying to put a boat out of the board, right direction
		boolean res_9 = board.checkAndSet(7, 9, boat1);
		assertFalse(res_9);
		// Trying to put a boat on an empty position but the last one is occupied, right direction
		boolean res_10 = board.checkAndSet(9, 6, boat1);
		assertFalse(res_10);
		// Trying to put a boat with a wrong orientation
		boolean res_11 = board.checkAndSet(9, 9, boat6);
		assertFalse(res_11);
		// Trying to put a boat out of the board, down direction
		boolean res_12 = board.checkAndSet(9, 9, boat2);
		assertFalse(res_12);
		// Trying to put a boat on a empty position but the last one is occupied, left direction
		boolean res_13 = board.checkAndSet(0, 2, boat3);
		assertFalse(res_13);
		// Trying to put a boat out of the board with up direction
		boolean res_14 = board.checkAndSet(0, 5, boat4);
		assertFalse(res_14);
		// Trying to put a boat on an empty position with up direction
		boolean res_15 = board.checkAndSet(2, 2, boat4);
		assertTrue(res_15);
	}
}
