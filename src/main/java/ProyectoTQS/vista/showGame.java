package ProyectoTQS.vista;

import ProyectoTQS.model.Board;
import ProyectoTQS.model.interfaceBoard;

public class showGame {
	//main
	public void show(interfaceBoard b) {
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
	
	public void showMock(interfaceBoard b) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
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
