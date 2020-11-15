package ProyectoTQS.controlador;

public class main{
	public static void main(String[] args){
		Game game = new Game();
		interfaceKeyboard kb = new keyboard();
		game.initilizateBoats(kb);
		boolean hit = false;
		while(game.checkWin()==0) {
			System.out.println("Turn player " + game.getTurn()+1);
			game.doAttack(kb);
			game.changeTurn();
			System.out.println("Turn changed. Time to player " + game.getTurn()+1);
		}
	}
}
