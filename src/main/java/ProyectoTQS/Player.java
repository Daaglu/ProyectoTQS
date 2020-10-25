package ProyectoTQS;

import java.io.IOException;
import java.util.Scanner;

// This class represents one Player of the game. Every player has 10 boats and a different name.
public class Player {
	private String m_name;
	private int m_numBoats;
	
	// constructor
	public Player(String name) {
		this.m_name = name;
		this.m_numBoats = 10;
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
	
}
