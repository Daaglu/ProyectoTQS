package ProyectoTQS;

import java.io.IOException;
import java.util.Scanner;

public class Player {
	private String m_name;
	private int m_numBoats;
	
	public Player(String name) {
		this.m_name = name;
		this.m_numBoats = 10;
	}
	
	public String getName() {
		return this.m_name;
	}
	
	public int getNumBoats() {
		return this.m_numBoats;
	}
	
	// Habria que testearlo de alguna forma
	public int[] play() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int row = in.nextInt();
		System.out.println("Enter the column: ");
		int col = in.nextInt();
		return new int[] {row, col};
	}
	
}
