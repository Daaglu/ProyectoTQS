package ProyectoTQS;

public class Box {
	private boolean m_state; // false = water // true = boat
	private Boat m_boat;
	private boolean m_attacked;
	
	public Box() {
		this.m_state = false;
		this.m_boat = null;
		this.m_attacked = false;
	}
	
	public Boat getBoat() {
		return this.m_boat;
	}
	
	public boolean getState() {
		return this.m_state;
	}
	
	public boolean getAttacked() {
		return this.m_attacked;
	}
	
	public void setAttacked() {
		this.m_attacked = true;
	}
	
	public void setBoat(Boat boat) {
		this.m_boat = boat;
		this.m_state = true;
	}

}
