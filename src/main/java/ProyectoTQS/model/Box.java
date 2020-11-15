package ProyectoTQS.model;

public class Box {
	private boolean m_state; // false = water // true = boat
	private interfaceBoat m_boat;
	private boolean m_attacked;
	
	public Box() {
		this.m_state = false;
		this.m_boat = null;
		this.m_attacked = false;
	}
	
	public interfaceBoat getBoat() {
		return this.m_boat;
	}
	
	public boolean getState() {
		return this.m_state;
	}
	
	public boolean getAttacked() {
		return this.m_attacked;
	}
	
	public void setState(boolean state) {
		m_state = state;
	}
	
	public boolean setAttacked() {
		if(!m_attacked) {
			this.m_attacked = true;
			if(m_state) {
				m_boat.attacked();
				return true;
			}
			else{
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	// This method links the box with the boat in both ways
	public void setBoat(interfaceBoat boat) {
		this.m_boat = boat;
		this.m_state = true;
		boat.setPositionBox(this);
	}

}
