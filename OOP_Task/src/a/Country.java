package a;

import java.util.Arrays;

public class Country {
	
	private Highway[] highways = new Highway[5];

	public Highway[] getHighways() {
		return highways;
	}
	public void addHighway(int index, Highway h) throws Exception {
		if(highways[index] == null) {			
			highways[index] = h;
		} else {
			throw new Exception("Error: spot already full.");
		}
	}

	@Override
	public String toString() {
		return "Country [highways=" + Arrays.toString(highways) + "]";
	}
	
}
