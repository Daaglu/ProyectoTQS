package ProyectoTQS.model;

import static org.junit.Assert.*;

import org.junit.Test;

import ProyectoTQS.model.Board;
import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;

public class BoardTest {

	@Test // This tests the constructor. // Passed
	public void BoardTest() {
		Board board = new Board();
		assertEquals(board.getNumBoxes(), 100);
		assertEquals(board.getBox(0, 0).getState(), new Box().getState());
	}
	
	@Test // Test if the return value is a box // Passed
	public void getBoxTest() {
		Board board = new Board();
		Box box = new Box();
		assertFalse(board.getBox(0, 0).getState());
	}
	
	/*@Test // Test the attack method
	public void attackTest() {
		Board board = new Board();
		int x = 0;
		int y = 0;
		board.attack(x,y);
		assertTrue(board.attack(x,y));
		assertFalse(board.attack(x, y)); //attack again and test if this could be possible
	}*/
	
	@Test // This checks if we can pass pass a correct position and we can put a boat. // Passed
	public void setBoatTest() {
		Board board = new Board();
		Boat boat = new Boat(1,0);
		Boat boat2 = new Boat(3,0);
		boolean res_0 = board.setBoat(boat, 0, 0);
		assertTrue(res_0);
		assertTrue(board.getBox(0, 0).getState());
		boolean res_1 = board.setBoat(boat, 9, 9);
		assertTrue(res_1);
		boolean res_2 = board.setBoat(boat, 11, 12);
		assertFalse(res_2);
		boolean res_3 = board.setBoat(boat, -1, -1);
		assertFalse(res_3);
		boolean res_4 = board.setBoat(boat, -1, 1);
		assertFalse(res_4);
		boolean res_5 = board.setBoat(boat, 8, 12);
		assertFalse(res_5);
		boolean res_6 = board.setBoat(boat, 5, -1);
		assertFalse(res_6);
		boolean res_7 = board.setBoat(boat, 0, 0);
		assertFalse(res_7);
		boolean res_8 = board.setBoat(boat2, 1, 1);
		assertTrue(res_8);	
	}
	
	@Test // This tests if we can put a boat in a certain position and puts it. //Passed
	public void checkAndSet() {
		Board board = new Board();
		Boat boat1 = new Boat(2,0);
		Boat boat2 = new Boat(2,1);
		Boat boat3 = new Boat(3,2);
		Boat boat4 = new Boat(3,3);
		Boat boat5 = new Boat(3,2);
		Boat boat6 = new Boat(4,4);
		// Put a Boat on the first Box.
		boolean res_0 = board.checkAndSet(0,0,boat1);
		assertTrue(res_0);
		// Put a boat on the last row first position.
		boolean res_1 = board.checkAndSet(9,0,boat1);
		assertTrue(res_1);
		// Try to put a boat on a position already occupied.
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
