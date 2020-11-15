package ProyectoTQS.controlador;

import ProyectoTQS.model.Board;
import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Player;
import ProyectoTQS.model.interfaceBoard;
import ProyectoTQS.vista.showGame;

public interface interfaceGame {
	public int getTurn();
	
	public Player getPlayer1();
	
	public Player getPlayer2();
	
	public interfaceBoard getBoard1();	
	
	public interfaceBoard getBoard2();	
	
	// This method checks if any of the players has won.
	public int checkWin();
	
	public void changeTurn() ;
	
	
	// funcion que se encargue de inicializar los barcos en el tablero 
	// con un for y asi poder tratar las excepciones
	public void initilizateBoats(interfaceKeyboard kb);
	
	public int doAttack(interfaceKeyboard kb);
}
