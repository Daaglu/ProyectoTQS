package ProyectoTQS.model;

public interface interfaceBoard {
	public int getNumBoxes();
	public Box getBox(int x, int y);
	public Box[][] getMatrix();
	public boolean checkAndSet(int x, int y, interfaceBoat boat);
	public boolean setBoat(interfaceBoat boat, int x, int y);
}
