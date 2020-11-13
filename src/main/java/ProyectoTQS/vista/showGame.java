package ProyectoTQS.vista;

import ProyectoTQS.model.Board;

public class showGame {
	//main
	public void show(Board b) {
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
}
