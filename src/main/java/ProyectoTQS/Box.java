package ProyectoTQS;

public class Box {
	private boolean m_state;
	
	public Box() {
		this.m_state = false;
	}
	
	public boolean getState() {
		return this.m_state;
	}
	
	public void changeState(boolean state) {
		m_state = state;
	}
}
