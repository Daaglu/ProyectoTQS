package mockObjects;

import java.util.ArrayList;

import ProyectoTQS.model.interfaceKeyboard;

public class mockKeyboard implements interfaceKeyboard{
	ArrayList<Integer> array = new ArrayList<Integer>(); //añado datos
	public int keyboardIn() {
		return array.remove(0);
	}
	
	public void addValue(Integer val) {
		array.add(val);
	}
}
