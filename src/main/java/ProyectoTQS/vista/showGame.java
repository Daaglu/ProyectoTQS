package ProyectoTQS.vista;

import ProyectoTQS.model.Board;
import ProyectoTQS.model.interfaceBoard;

public class showGame {
	//main
	public void showCreation(interfaceBoard b) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(b.getBox(i, j).getState())
				{
					System.out.print(" X ");
				} else {
					System.out.print(" _ ");
				}
			}
			System.out.print("\n");
		}
	}
	public void showPlay(interfaceBoard b) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(b.getBox(i, j).getAttacked())
				{
					if(b.getBox(i, j).getState()) {
						if(b.getBox(i, j).getBoat().checkDead()) {
							System.out.print(" X ");
						}
						else
							System.out.print(" * ");
					}
					else
						System.out.print(" O ");
				} else {
					System.out.print(" _ ");
				}
			}
			System.out.print("\n");
		}
	}
}
