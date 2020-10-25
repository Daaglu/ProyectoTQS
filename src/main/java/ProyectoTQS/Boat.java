package ProyectoTQS;

// This class represents a single boat, the size and orientation is passed in the constructor.
public class Boat {
	private int m_size;
	private int m_orientation; // 0 up-down // 1 left-right
	private boolean m_alive; // true alive // false dead
	private Box[] m_boxArray;
	private int m_state; // 0 normal // 1 touched // 2 dead 
	
	// Construcor
	public Boat(int size, int orientation) {
		this.m_size = size;
		this.m_orientation = orientation;
		this.m_alive = true;
		this.m_state = 0; 
		this.m_boxArray = new Box[this.m_size];
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
	
	public Box[] getArray() {
		return this.m_boxArray;
	}
	
	// This methos changes the state of the boat
	public void changeState(int state) {
		this.m_state = state;
	}
}
