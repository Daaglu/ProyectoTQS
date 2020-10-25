package ProyectoTQS;

public class Player {
	private String m_name;
	private int m_numBoats;
	
	public Player(String name) {
		this.m_name = name;
		this.m_numBoats = 10;
	}
	
	public String getName() {
		return this.m_name;
	}
	
	public int getNumBoats() {
		return this.m_numBoats;
	}
	
	public void play() {
		
	}
	
}
