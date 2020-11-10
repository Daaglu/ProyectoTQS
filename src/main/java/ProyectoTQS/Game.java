package ProyectoTQS;

// This class implements a Game. It has two players, the turn to know which player has to play and a board.
public class Game {
	// Constant values
	static final int M_NUM4 = 1;
	static final int M_NUM3 = 3;
	static final int M_NUM2 = 3;
	static final int M_NUM1 = 2;
	
	// Private attributes
	private Player m_p1;
	private Player m_p2;
	private int m_turn;
	private Board m_board;
	
	// Constructor
	public Game() {
		this.m_p1 = new Player("Player 1");
		this.m_p2 = new Player("Player 2");
		this.m_turn = 0; //Player 1: 0 Player 2: 1
		this.m_board = new Board();
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
	
	public Board getBoard(){
		return this.m_board;
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
}
