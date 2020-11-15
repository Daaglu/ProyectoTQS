package ProyectoTQS.model;

// This class represents a board. It has the number of boxes and a 8x8 type Box matrix.
public class Board implements interfaceBoard{
	private int m_numBoxes;
	private Box[][] m_matrixBoxes;
	
	// Constructor
	public Board() {
		this.m_numBoxes = 100;
		this.m_matrixBoxes = new Box[10][10];
		for(int i=0; i<10;i++) {
			for(int j=0; j<10;j++) {
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
	
	/*public boolean attack(int x, int y) {
		if(!this.getBox(x, y).getState()) {
			this.getBox(x,y).changeState(true);
			return true;
		}
		else
			return false;
	}*/
	
	
	// This method checks if there's enough space and puts the boat
	public boolean checkAndSet(int x, int y, interfaceBoat boat) {
		int size = boat.getSize();
		int orientation = boat.getOrientation();
		Box[][] matrix = getMatrix();
		boolean set = true;
		
		switch(orientation) {
		case 0://right
			if((9-y)+1< size) {
				set = false;
			}else {
				for(int i = y; i < y+size; i++) {
					if (matrix[x][i].getState()) {
						return false;
					}
				}
				for(int i = y; i<y+size;i++) {
					matrix[x][i].setBoat(boat);
				}
			}
			break;
		case 1://down
			if((9-x) + 1 < size) {
				set = false;
			}else {
				for(int i = x; i<x+size;i++) {
					if(matrix[i][y].getState()) {
						return false;
					}
				}
				for(int i = x; i<x+size;i++) {
					matrix[i][y].setBoat(boat);
				}
			}
			break;
		case 2://left
			if(y + 1 < size) {
				set = false;
			}else {
				for(int i = y; i>y-size;i--) {
					if(matrix[x][i].getState()) {
						return false;
					}
				}
				for(int i = y; i > y-size; i--) {
					matrix[x][i].setBoat(boat);
				}
			}
			break;
		case 3://up
			if(x + 1 < size) {
				set = false;
			} else {
				for(int i = x; i > x-size;i--) {
					if(matrix[i][y].getState()) {
						return false;
					}
				}
				for(int i = x; i >x-size; i--) {
					matrix[i][y].setBoat(boat);
				}
			}
			break;
		default:return false;
		}
		
		if (set == true) {
			return true;
		} else {
			return false;
		}
	}
	
	// This method puts a boat
	public boolean setBoat(interfaceBoat boat, int x, int y) {
		if (x < 0 || x > 9 || y < 0 || y > 9) {
			return false;
		}
		else {
			if (this.getBox(x, y).getState()) { // Si ya hay un barco
				return false;
			}
			else {
				if(boat.getSize()==1) {
					this.getBox(x, y).setBoat(boat);
					return true;
				}
				else {
					return this.checkAndSet(x,y, boat);	
				}
			}
		}
		
	}
}
