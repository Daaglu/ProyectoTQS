package ProyectoTQS;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// This class represents one Player of the game. Every player has 10 boats and a different name.
public class Player {
	// Private attributes
	private String m_name;
	private int m_numBoats; // 10
	private List<Boat> m_listBoats;
	
	// Constructor
	public Player(String name) {
		this.m_name = name;
		this.m_numBoats = 10;
		this.m_listBoats = new LinkedList<Boat>();
	}
	
	// Getters
	public String getName() {
		return this.m_name;
	}
	
	public int getNumBoats() {
		return this.m_numBoats;
	}
	
	public List<Boat> getBoatList(){
		return this.m_listBoats;
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
	
	public void createBoats(){
		for (int i = 0; i < 4; i++) {
			Boat b = new Boat(1,-1);
			this.m_listBoats.add(b);
		}
		
		for (int i = 0; i < 3; i++) {
			Boat b = new Boat(2,-1);
			this.m_listBoats.add(b);
		}
		
		for (int i = 0; i < 2; i++) {
			Boat b = new Boat(3,-1);
			this.m_listBoats.add(b);
		}
		
		Boat b = new Boat(4,-1);
		this.m_listBoats.add(b);
	}
		
	
}
