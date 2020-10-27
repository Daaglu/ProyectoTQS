package ProyectoTQS;

// This class represents a board. It has the number of boxes and a 8x8 type Box matrix.
public class Board {
	private int m_numBoxes;
	private Box[][] m_matrixBoxes;
	
	// Constructor
	public Board() {
		this.m_numBoxes = 64;
		this.m_matrixBoxes = new Box[8][8];
<<<<<<< HEAD
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
=======
		for(int i=0; i<8;i++) {
			for(int j=0; j<8;j++) {
>>>>>>> 662a5fdc1e3b9140a74b2a43c177f4332637a602
				this.m_matrixBoxes[i][j] = new Box();
			}
		}
	}
	
	// Getters
	public int getNumBoxes() {
		return this.m_numBoxes;
	}
	public Box getBox(int x, int y) {
		return this.m_matrixBoxes[x][y];
	}
	
	public Box[][] getMatrix() {
		return this.m_matrixBoxes;
	}
	
	public boolean attack(int x, int y) {
		if(!this.getBox(x, y).getState()) {
			this.getBox(x,y).changeState(true);
			return true;
		}
		else
			return false;
	}
	
}
