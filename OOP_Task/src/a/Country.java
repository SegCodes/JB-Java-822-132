package a;

import java.util.Arrays;

public class Country {
	
	private Highway[] highways = new Highway[5];

	public Highway[] getHighways() {
		return highways;
	}
	
	public void addHighway(Highway h) throws Exception {
		for(int i = 0; i < highways.length; i++) {			
			if(highways[i] == null) {			
				highways[i] = h;
				return;
			}
		}
		throw new Exception("Error: Country is full.");
	}

	public void removeHighway(String name) throws Exception {
		for(int i = 0; i < highways.length; i++) {			
			if(highways[i] != null && highways[i].getName().equals(name)) {			
				highways[i] = null;
				return;
			}
		}
		throw new Exception("Error: Highway not found.");
	}

	@Override
	public String toString() {
		return "Country [highways=" + Arrays.toString(highways) + "]";
	}
	
}
