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
	private List<Boat> m_listBoat;
	
	// Constructor
	public Player(String name) {
		this.m_name = name;
		this.m_numBoats = 9;
		this.m_listBoat = new LinkedList<Boat>(); // Initialize in Game
	}
	
	// Getters
	public String getName() {
		return this.m_name;
	}
	
	public int getNumBoats() {
		return this.m_numBoats;
	}
	
	public List<Boat> getList(){
		return m_listBoat;
	}
	
	// This method is used to print the list 
	public void printList() {
		for (int i = 0; i < this.m_listBoat.size(); i++) {
			System.out.println("Boat on position: " + i);
			System.out.println("Size: " + this.m_listBoat.get(i).getSize());
			System.out.println("Orientation: " + this.m_listBoat.get(i).getOrientation());
		}
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
	public List<Integer> putBoats() {
		List<Integer> boats=new LinkedList<Integer>(); // De tres en tres, row, col , orientation
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the position of the size 1 boat: ");
		System.out.println("Row: ");
		boats.add(in.nextInt());
		System.out.println("Column: ");
		boats.add(in.nextInt());
		boats.add(0);
		this.m_listBoat.add(new Boat(1, 0));
	
		// loop for the two boats of size 2
		for (int i = 0; i < 2 ; i++) {
			System.out.println("Enter the position of the size 2 boat number" + (i+1) + ":");
			System.out.println("Row: ");
			boats.add(in.nextInt());
			System.out.println("Column: ");
			boats.add(in.nextInt());
			System.out.println("Orientation: ");
			int ori = in.nextInt();
			boats.add(ori);
			this.m_listBoat.add(new Boat(2, ori));
		}
		
		// loop for the three boats of size 3
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Enter the position of the size 3 boat number" + (i+1) + ":");
			System.out.println("Row: ");
			boats.add(in.nextInt());
			System.out.println("Column: ");
			boats.add(in.nextInt());
			System.out.println("Orientation: ");
			int ori = in.nextInt();
			boats.add(ori);
			this.m_listBoat.add(new Boat(3, ori));
		}
		
		System.out.println("Enter the position of the size 4 boat: ");
		System.out.println("Row: ");
		boats.add(in.nextInt());
		System.out.println("Column: ");
		boats.add(in.nextInt());
		System.out.println("Orientation: ");
		int ori = in.nextInt();
		boats.add(ori);
		this.m_listBoat.add(new Boat(4, ori));
		
		return boats;
	}
	
}
