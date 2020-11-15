package ProyectoTQS.model;

import java.util.List;

public interface interfaceBoat {
	public int getSize();
	
	public int getOrientation();
	
	public boolean getAlive();
	
	public int getState();
	
	public List<Box> getList();
	
	public void setPositionBox(Box b);
	
	public void setOrientation(int orientation);
	
	// This method changes the state of the boat
	public void changeState(int state);
	
	// This method checks if the boat is dead by checking the state of the boat
	public boolean checkDead() ;
	
	public void attacked();
}
