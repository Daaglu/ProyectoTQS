package ProyectoTQS.model;

import java.util.LinkedList;
import java.util.List;

// This class represents a single boat, the size and orientation is passed in the constructor.
public class Boat {
	private int m_size; // 1-4 // 2-3 // 3-2 // 4-1
	private int m_orientation; // 0 right // 1 down // 2 left // 3 up
	private boolean m_alive; // true alive // false dead
	private List<Box> m_listBoxes;
	private int m_state; // 0 normal // 1 touched // 2 dead 
	
	// Constructor
	public Boat(int size, int orientation) {
		this.m_size = size;
		this.m_orientation = orientation; // Ask in Game
		this.m_alive = true;
		this.m_state = 0;
		this.m_listBoxes = new LinkedList<Box>();
	}
	
	// Getters
	public int getSize() {
		return this.m_size;
	}
	
	public int getOrientation() {
		return this.m_orientation;
	}
	
	public boolean getAlive() {
		return this.m_alive;
	}
	
	public int getState() {
		return this.m_state;
	}
	
	public List<Box> getList() {
		return this.m_listBoxes;
	}
	
	public void setPositionBox(Box b) {
		this.m_listBoxes.add(b);
	}
	
	public void setOrientation(int orientation) {
		this.m_orientation = orientation;
	}
	
	// This method changes the state of the boat
	public void changeState(int state) {
		this.m_state = state;
	}
	
	// This method checks if the boat is dead by checking the state of the boat
	public boolean checkDead() {
		if(this.m_state == 2) {
			this.m_alive = false;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void attacked() {
		int totalAttacked = 0;
		for(Box box: this.m_listBoxes){
			if(box.getAttacked()) {
				totalAttacked++;
				this.m_state = 1;
			}
		}
		if(totalAttacked == this.m_size) {
			this.m_state = 2;

			System.out.println("Barco hundido");
		}
	}
}
