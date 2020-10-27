package ProyectoTQS;

public class Box {
	private boolean m_state;
	private Boat m_boat;
	public Box() {
		this.m_state = false;
		this.m_boat = null;
	}
	
	public Boat getBoat() {
		return this.m_boat;
	}
	
	public boolean getState() {
		return this.m_state;
	}

	public void setBoat(Boat boat) {
		this.m_boat = boat;
		this.m_state = true;
	}

}
