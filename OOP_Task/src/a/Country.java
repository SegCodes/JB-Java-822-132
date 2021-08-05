package a;

import java.util.Arrays;

public class Country {
	
	private Highway[] highways = new Highway[5];

	public Highway[] getHighways() {
		return highways;
	}
<<<<<<< Upstream, based on origin/master
<<<<<<< Upstream, based on origin/master
	
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
=======
	public void addHighway(int index, Highway h) throws Exception {
		if(highways[index] == null) {			
			highways[index] = h;
		} else {
			throw new Exception("Error: spot already full.");
=======
	
	public void addHighway(Highway h) throws Exception {
		for(int i = 0; i < highways.length; i++) {			
			if(highways[i] == null) {			
				highways[i] = h;
				return;
			}
>>>>>>> 2904016 Updated code.
		}
<<<<<<< Upstream, based on origin/master
>>>>>>> fd2056e All Lessons thus far.
=======
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
>>>>>>> 2904016 Updated code.
	}

	@Override
	public String toString() {
		return "Country [highways=" + Arrays.toString(highways) + "]";
	}
	
}
