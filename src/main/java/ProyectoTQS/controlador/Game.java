package ProyectoTQS.controlador;

import static org.junit.Assert.assertTrue;

import ProyectoTQS.model.Board;
import ProyectoTQS.model.Player;
import ProyectoTQS.model.Boat;
import ProyectoTQS.vista.showGame;

// This class implements a Game. It has two players, the turn to know which player has to play and a board.
public class Game {	
	// Private attributes
	private Player m_p1;
	private Player m_p2;
	private int m_turn;
	private Board m_board1;
	private Board m_board2;
	
	// Constructor
	public Game() {
		this.m_p1 = new Player();
		// Create all the boats for p1
		this.m_p1.createBoats();
		this.m_p2 = new Player();
		// Create all the boats for p2
		this.m_p2.createBoats();
		this.m_turn = 0; //Player 1: 0 //Player 2: 1
		this.m_board1 = new Board();
		this.m_board2 = new Board();
	}
	
	// Getters
	public int getTurn() {
		return this.m_turn;
	}
	
	public Player getPlayer1() {
		return this.m_p1;
	}
	
	public Player getPlayer2() {
		return this.m_p2;
	}
	
	public Board getBoard1(){
		return this.m_board1;
	}	
	
	public Board getBoard2(){
		return this.m_board2;
	}	
	
	// This method is used to start a game.
	public void start() {
	// not implemented yet	
	}
	
	// This method checks if any of the players has won.
	public int checkWin() {
		if (this.m_p1.getNumBoats() == 0) {
			System.out.println("Player 2 has won");
			return 2;
		}
		else {
			if (this.m_p2.getNumBoats() == 0){
				System.out.println("Player 1 has won");
				return 1;
			}	
			else {
				return 0;
			}
		}
	}
	
	public void changeTurn() {
		this.m_turn = (this.m_turn + 1) % 2;
	}
	
	
	// funcion que se encargue de inicializar los barcos en el tablero 
	// con un for y asi poder tratar las excepciones
	public void initilizateBoats() {
		showGame sgame = new showGame();
		for (Boat boat : m_p1.getBoatList()) {
			boolean positioned = false;
			while (!positioned) {
				int[] res = m_p1.enterPositionBoats(boat.getSize()); //row, col, orientation
				boat.setOrientation(res[2]);
				positioned = m_board1.setBoat(boat, res[0], res[1]);
				if (!positioned) {
					System.out.println("Error: Wrong position or orientation.");
				}
				else {
					sgame.show(this.m_board1);
				}
				
			}
		}
	}
	
	public void doAttack() {
		int[] attack1 = m_p1.attack();
		m_board2.getBox(attack1[0], attack1[1]).setAttacked();
		
	}
}
