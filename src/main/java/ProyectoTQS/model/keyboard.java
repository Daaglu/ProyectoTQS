package ProyectoTQS.model;

import java.util.Scanner;

public class keyboard implements interfaceKeyboard{
	Scanner in = new Scanner(System.in);
	public int keyboardIn() {
		return in.nextInt();
	}
	
	public void addValue(Integer val) {};
}
