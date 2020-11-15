package mockObjects;

import java.util.List;

import ProyectoTQS.model.Box;
import ProyectoTQS.model.interfaceBoat;

public class mockBoat implements interfaceBoat{
	public mockBoat() {
		
	}
	
	public int getSize() {return 0;};
	
	public int getOrientation() {return 0;};
	
	public boolean getAlive() {return false;};
	
	public int getState() {return 2;};
	
	public List<Box> getList() {return null;};
	
	public void setPositionBox(Box b){};
	
	public void setOrientation(int orientation) {};
	
	// This method changes the state of the boat
	public void changeState(int state) {};
	
	// This method checks if the boat is dead by checking the state of the boat
	public boolean checkDead() {return false;} ;
	
	public void attacked() {};
}
