package ProyectoTQS;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		Player p1 = new Player("Player 1");
		int a1[] = p1.play();
		System.out.println(a1[0]+ " " + a1[1]);
	}

}
