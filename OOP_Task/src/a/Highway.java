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
	
	public void addCar(int index, Car c) throws Exception {
		if(cars[index] == null) {			
			cars[index] = c;
		} else {
			throw new Exception("Error: spot already full.");
		}
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
