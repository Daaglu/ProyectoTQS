package ProyectoTQS.model;

import java.util.List;

import ProyectoTQS.controlador.interfaceKeyboard;

public interface interfacePlayer {

	public int getNumBoats() ;
	
	public List<interfaceBoat> getBoatList();
	
	
	public void boatDied();
	
	
	public void createBoats();
		
	//Funcion que se encargue de introducir datos para inicializar los barcos al tablero
	public int[] enterPositionBoats(int size, interfaceKeyboard kb);
	
	
	// This method is for enter the row and column to make a move.
	public int[] attack(interfaceKeyboard kb);
}
