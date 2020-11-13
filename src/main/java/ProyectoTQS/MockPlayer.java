package ProyectoTQS;

import java.io.IOException;
import java.util.Scanner;

public class MockPlayer implements Client{
	
	@Override
	public int[] play(int row, int col) throws IOException {
		return new int[] {row, col};
	}
	
}
