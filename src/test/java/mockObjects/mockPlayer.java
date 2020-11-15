package mockObjects;

import java.util.List;

import ProyectoTQS.controlador.interfaceKeyboard;
import ProyectoTQS.model.interfaceBoat;
import ProyectoTQS.model.interfacePlayer;

public class mockPlayer implements interfacePlayer{
	private int m_numBoats;
	public mockPlayer(int boat) {this.m_numBoats=boat;};
	public int getNumBoats() {return m_numBoats;};
	
	public List<interfaceBoat> getBoatList() {return null;};
	
	// Setters
	public void setNumBoats(int numBoats) {};
	
	public void boatDied() {
		if (this.m_numBoats > 0 && this.m_numBoats <= 10) {
			this.m_numBoats--;
		}
	}
	
	
	public void createBoats() {};
		
	//Funcion que se encargue de introducir datos para inicializar los barcos al tablero
	public int[] enterPositionBoats(int size, interfaceKeyboard kb) {return new int[] {};};
	
	
	// This method is for enter the row and column to make a move.
	public int[] attack(interfaceKeyboard kb) {return new int[] {};};
}
