package ProyectoTQS.model;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ProyectoTQS.controlador.interfaceKeyboard;

// This class represents one Player of the game. Every player has 10 boats and a different name.
public class Player{
	// Private attributes
	private int m_numBoats; // 10
	private List<interfaceBoat> m_listBoats;
	
	// Constructor
	public Player() {
		this.m_numBoats = 0;
		this.m_listBoats = new LinkedList<interfaceBoat>();
	}
	
	public int getNumBoats() {
		return this.m_numBoats;
	}
	
	public List<interfaceBoat> getBoatList(){
		return this.m_listBoats;
	}
	
	// Setters
	public void setNumBoats(int numBoats) {
		this.m_numBoats = numBoats;
	}
	
	
	
	
	public void createBoats(){
		for (int i = 0; i < 4; i++) {
			Boat b = new Boat(1,-1);
			this.m_listBoats.add(b);
			this.m_numBoats++;
		}
		
		for (int i = 0; i < 3; i++) {
			Boat b = new Boat(2,-1);
			this.m_listBoats.add(b);
			this.m_numBoats++;
		}
		
		for (int i = 0; i < 2; i++) {
			Boat b = new Boat(3,-1);
			this.m_listBoats.add(b);
			this.m_numBoats++;
		}
		
		Boat b = new Boat(4,-1);
		this.m_listBoats.add(b);
		this.m_numBoats++;
	}
		
	//Funcion que se encargue de introducir datos para inicializar los barcos al tablero
	public int[] enterPositionBoats(int size, interfaceKeyboard kb){
		System.out.println("Enter the first position of the boat of size " + size + ": " );
		System.out.println("Enter the row (0 to 9): ");
		int row = kb.keyboardIn();
		System.out.println("Enter the column (0 to 9): ");
		int col = kb.keyboardIn();
		System.out.println("Enter the orientation(0 right // 1 down // 2 left // 3 up): ");
		int orientation = kb.keyboardIn();
		return new int[] {row, col, orientation};
	}
	
	
	// This method is for enter the row and column to make a move.
	public int[] attack(interfaceKeyboard kb) {
		System.out.println("Enter the row you want attack: ");
		int row = kb.keyboardIn();
		System.out.println("Enter the column you want attack: ");
		int col = kb.keyboardIn();
		return new int[] {row,col};
	}
}
