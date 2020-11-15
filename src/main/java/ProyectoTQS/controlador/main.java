package ProyectoTQS.controlador;

public class main{
	public static void main(String[] args){
		Game game = new Game();
		interfaceKeyboard kb = new keyboard();
		game.initilizateBoats(kb);
		boolean hit = false;
		while(game.checkWin()==0) {
			game.doAttack(kb);
			game.changeTurn();
		}
	}
}
