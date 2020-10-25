package ProyectoTQS;

// This class represents a board. It has the number of boxes and a 8x8 type Box matrix.
public class Board {
	private int m_numBoxes;
	private Box[][] m_matrixBoxes;
	
	// Constructor
	public Board() {
		this.m_numBoxes = 64;
		m_matrixBoxes = new Box[8][8];
	}
	
	// Getters
	public int getNumBoxes() {
		return this.m_numBoxes;
	}
	
	public Box[][] getMatrix() {
		return this.m_matrixBoxes;
	}
	
}
