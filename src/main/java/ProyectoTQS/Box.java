package ProyectoTQS;

public class Box {
	private boolean m_state;
<<<<<<< HEAD
	
=======
	private Boat m_boat;
>>>>>>> 662a5fdc1e3b9140a74b2a43c177f4332637a602
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
	
	public void changeState(boolean state) {
		m_state = state;
	}

	public void setBoat(Boat boat) {
		this.m_boat = boat;
	}

}
