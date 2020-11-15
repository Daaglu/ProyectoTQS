package ProyectoTQS.controlador;

import ProyectoTQS.model.Board;
import ProyectoTQS.model.Player;
import ProyectoTQS.model.interfaceBoard;
import ProyectoTQS.model.interfaceBoat;
import ProyectoTQS.model.interfacePlayer;
import ProyectoTQS.model.Boat;
import ProyectoTQS.model.Box;
import ProyectoTQS.vista.showGame;


// This class implements a Game. It has two players, the turn to know which player has to play and a board.
public class Game{	
	// Private attributes
	private interfacePlayer m_p1;
	private interfacePlayer m_p2;
	private int m_turn;
	private interfaceBoard m_board1;
	private interfaceBoard m_board2;
	
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
	
	public interfacePlayer getPlayer1() {
		return this.m_p1;
	}
	
	public interfacePlayer getPlayer2() {
		return this.m_p2;
	}
	
	public Board getBoard1(){
		return (Board) this.m_board1;
	}	
	
	public Board getBoard2(){
		return (Board) this.m_board2;
	}	
	
	public void setPlayer1(interfacePlayer p) {
		this.m_p1 = p;
	}
	
	public void setPlayer2(interfacePlayer p) {
		this.m_p2 = p;
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
	public void initilizateBoats(interfaceKeyboard kb) {
		showGame sgame = new showGame();
		for (interfaceBoat boat : m_p1.getBoatList()) {
			boolean positioned = false;
			while (!positioned) {
				int[] res = m_p1.enterPositionBoats(boat.getSize(), kb); //row, col, orientation
				boat.setOrientation(res[2]);
				positioned = m_board1.setBoat(boat, res[0], res[1]);
				if (!positioned) {
					System.out.println("Error: Wrong position or orientation.");
				}
				else {
					sgame.showCreation(this.m_board1);
				}
				
			}
		}
		
		for (interfaceBoat boat : m_p2.getBoatList()) {
			boolean positioned = false;
			while (!positioned) {
				int[] res = m_p2.enterPositionBoats(boat.getSize(), kb); //row, col, orientation
				boat.setOrientation(res[2]);
				positioned = m_board2.setBoat(boat, res[0], res[1]);
				if (!positioned) {
					System.out.println("Error: Wrong position or orientation.");
				}
				else {
					sgame.showCreation(this.m_board2);
				}
				
			}
		}
	}
	
	public int doAttack(interfaceKeyboard kb) {
		boolean hit = false;
		int win = 0;
		showGame sgame = new showGame();
		if(m_turn == 0) {
			do {
				int[] attack1 = m_p1.attack(kb);
				Box box = m_board2.getBox(attack1[0], attack1[1]);
				if(box.getAttacked()) {
					return -1;
				}
				hit = box.setAttacked();
				if(hit) {
					if(box.getBoat().checkDead()) {
						m_p2.boatDied();
					}
				}
				sgame.showPlay(m_board2);
				win = this.checkWin();
			}while(hit==true && win ==0);
		}
		else {
			do {
				int[] attack2 = m_p2.attack(kb);
				Box box = m_board1.getBox(attack2[0], attack2[1]);
				if(box.getAttacked()) {
					return -1;
				}
				hit = box.setAttacked();
				if(hit) {
					if(m_board1.getBox(attack2[0], attack2[1]).getBoat().checkDead()) {
						m_p1.boatDied();
					}
				}
				sgame.showPlay(m_board1);
				win = this.checkWin();
			}while(hit==true && win ==0);
		}
		return win;
	}
}
