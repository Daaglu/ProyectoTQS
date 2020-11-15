package ProyectoTQS.model;

public interface interfaceBoard {
	public int getNumBoxes();
	public Box getBox(int x, int y);
	public Box[][] getMatrix();
	public boolean checkAndSet(int x, int y, Boat boat);
	public boolean setBoat(Boat boat, int x, int y);
}
