package ProyectoTQS;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// This class represents one Player of the game. Every player has 10 boats and a different name.
public class Player {
	// Private attributes
	private String m_name;
	private int m_numBoats;
	
	// Constructor
	public Player(String name) {
		this.m_name = name;
		this.m_numBoats = 9;
	}
	
	// Getters
	public String getName() {
		return this.m_name;
	}
	
	public int getNumBoats() {
		return this.m_numBoats;
	}
	
	// Setters
	public void setNumBoats(int numBoats) {
		this.m_numBoats = numBoats;
	}
	
	// This method is for enter the row and column to make a move.
	public int[] play() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int row = in.nextInt();
		System.out.println("Enter the column: ");
		int col = in.nextInt();
		return new int[] {row, col};
	}
	
	// This method is used to ask the player where to put the boats at the beginning
	//public List<Integer> putBoats() {}
		
	
}
