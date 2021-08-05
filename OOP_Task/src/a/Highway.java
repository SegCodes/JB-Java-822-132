package a;

import java.util.Arrays;

public class Highway {
	
	private String name;
	private Car[] cars = new Car[100];
	
	public Highway() {
		
	}
	
	public Highway(String name) {
		this.name = name;
	}
	
<<<<<<< Upstream, based on origin/master
<<<<<<< Upstream, based on origin/master
	public void addCar(Car c) throws Exception {
		for(int i = 0; i < cars.length; i++) {			
			if(cars[i] == null) {			
				cars[i] = c;
				return;
			}
		}
		throw new Exception("Error: Highway is full.");
	}

	public void removeCar(int carNumber) throws Exception {
		for(int i = 0; i < cars.length; i++) {			
			if(cars[i] != null && cars[i].getNumber() == carNumber) {			
				cars[i] = null;
				return;
			}
		}
		throw new Exception("Error: Car not found.");
=======
	public void addCar(int index, Car c) throws Exception {
		if(cars[index] == null) {			
			cars[index] = c;
		} else {
			throw new Exception("Error: spot already full.");
=======
	public void addCar(Car c) throws Exception {
		for(int i = 0; i < cars.length; i++) {			
			if(cars[i] == null) {			
				cars[i] = c;
				return;
			}
>>>>>>> 2904016 Updated code.
		}
<<<<<<< Upstream, based on origin/master
>>>>>>> fd2056e All Lessons thus far.
=======
		throw new Exception("Error: Highway is full.");
	}

	public void removeCar(int carNumber) throws Exception {
		for(int i = 0; i < cars.length; i++) {			
			if(cars[i] != null && cars[i].getNumber() == carNumber) {			
				cars[i] = null;
				return;
			}
		}
		throw new Exception("Error: Car not found.");
>>>>>>> 2904016 Updated code.
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Highway [name=" + name + ", cars=" + Arrays.toString(cars) + "]";
	}
	
	public void FillHighway (Highway h) {
		
	}
	
}
