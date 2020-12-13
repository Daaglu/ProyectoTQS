package automatització;

import static org.junit.Assert.*;

import org.junit.Test;

import ProyectoTQS.controlador.interfaceKeyboard;
import mockObjects.mockKeyboard;

public class Automatització {
	interfaceKeyboard kb0 = new mockKeyboard();
	interfaceKeyboard kb1 = new mockKeyboard();
	
	@Test
	//Automatització on el jugador 01 encerta tot a la primera
	public void automatització1() {
		//Tauler jugador 1
		kb0.addValue(0);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(1);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(2);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(4);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(6);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(8);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(6);
		kb0.addValue(0);
		
		// Tauler jugador 2
		kb0.addValue(0);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(1);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(2);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(4);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(6);
		kb0.addValue(0);
		
		kb0.addValue(0);
		kb0.addValue(8);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(0);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(3);
		kb0.addValue(0);
		
		kb0.addValue(1);
		kb0.addValue(6);
		kb0.addValue(0);
		
		
		kb1.addValue(0);
		kb1.addValue(0);
		
		kb1.addValue(0);
		kb1.addValue(1);
		
		kb1.addValue(0);
		kb1.addValue(2);
		
		kb1.addValue(0);
		kb1.addValue(3);
		
		kb1.addValue(0);
		kb1.addValue(4);
		
		kb1.addValue(0);
		kb1.addValue(6);
		
		kb1.addValue(0);
		kb1.addValue(8);
		
		kb1.addValue(1);
		kb1.addValue(0);
		
		kb1.addValue(1);
		kb1.addValue(3);
		
		kb1.addValue(1);
		kb1.addValue(6);
	}
}
