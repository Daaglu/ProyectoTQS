package ProyectoTQS.model;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import ProyectoTQS.controlador.interfaceKeyboard;
import ProyectoTQS.model.Player;
import mockObjects.mockKeyboard;
import mockObjects.mockPlayer;

public class PlayerTest {
	// Interficies per introduir dades
	interfaceKeyboard kbPos = new mockKeyboard();
	interfaceKeyboard kbAtt = new mockKeyboard();
	
	// Introduim les dades que volem per testejar.
	public PlayerTest() {
		kbPos.addValue(2);
		kbPos.addValue(2);
		kbPos.addValue(0);
		kbAtt.addValue(0);
		kbAtt.addValue(0);
		kbAtt.addValue(9);
		kbAtt.addValue(9);
	}

	@Test // Test del constructor.
	public void PlayerTest() {
		Player p1 = new Player();
		assertEquals(p1.getNumBoats(), 0);
	}
	
	@Test // Test de caixa blanca amb statement coverage.
	public void createBoatsTest() {
		Player p1 = new Player();
		assertEquals(p1.getNumBoats(), 0);
		p1.createBoats();
		assertEquals(p1.getNumBoats(), 10);
		assertEquals(p1.getBoatList().size(), 10);
		assertEquals(p1.getBoatList().get(0).getSize(), 1);
		assertEquals(p1.getBoatList().get(1).getSize(), 1);
		assertEquals(p1.getBoatList().get(2).getSize(), 1);
		assertEquals(p1.getBoatList().get(3).getSize(), 1);
		assertEquals(p1.getBoatList().get(4).getSize(), 2);
		assertEquals(p1.getBoatList().get(5).getSize(), 2);
		assertEquals(p1.getBoatList().get(6).getSize(), 2);
		assertEquals(p1.getBoatList().get(7).getSize(), 3);
		assertEquals(p1.getBoatList().get(8).getSize(), 3);
		assertEquals(p1.getBoatList().get(9).getSize(), 4);
		assertEquals(p1.getBoatList().get(5).getOrientation(), -1);
	}
	
	
	@Test // Test de introduir dades per posicionar els vaixells amb un mockobject.
	public void enterPositionBoatsTest() throws IOException {
		Player p1 = new Player();
		assertArrayEquals(p1.enterPositionBoats(1,kbPos), new int[] {2,2,0});
	}
	
	@Test // Test amb mockobject per introduir dades del atac.
	public void attackTest() {
		Player p1 = new Player();
		assertArrayEquals(p1.attack(kbAtt),new int[] {0,0});
		assertArrayEquals(p1.attack(kbAtt),new int[] {9,9});
	}
	
	@Test // Test de caixa blanca amb statement coverage i decision coverage i un mockobject.
	// Test de caixa negra amb particions equivalents.
	public void livesTest() {
		interfacePlayer p1 = new mockPlayer(0);
		interfacePlayer p2 = new mockPlayer(1);
		interfacePlayer p3 = new mockPlayer(5);
		interfacePlayer p4 = new mockPlayer(10);
		interfacePlayer p5 = new mockPlayer(11);
		p1.boatDied();
		p2.boatDied();
		p3.boatDied();
		p4.boatDied();
		p4.boatDied();
		p5.boatDied();
		assertEquals(0,p1.getNumBoats());
		assertEquals(0,p2.getNumBoats());
		assertEquals(4,p3.getNumBoats());
		assertEquals(8,p4.getNumBoats());
		assertEquals(11,p5.getNumBoats());
	}
	
}
