package a;

public class Demo {

	public static void main(String[] args) {
		
		Country country = new Country();
		
		Highway h1 = new Highway("James");
		try {
			h1.addCar(new Car(1, 50));
			h1.addCar(new Car(2, 120));			
			h1.addCar(new Car(3, -1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Highway h2 = new Highway("Frank");
		try {
			h2.addCar(new FamilyCar(4, 70));
			h2.addCar(new FamilyCar(5, 130));			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Highway h3 = new Highway("Teddy");
		try {
			h3.addCar(new SportsCar(8, 180));			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {			
			country.addHighway(h1);
			country.addHighway(h2);
			country.addHighway(h3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for(int i = 0; i < country.getHighways().length; i++) {
			if(country.getHighways()[i] == null) {
				break;
			}
			
			System.out.println(country.getHighways()[i]);
		}
		
		System.out.println();
		
		System.out.println("Total cars in country: " + getCountryCars(country));
		System.out.println("===================");
		
		for(int i = 0; i < country.getHighways().length; i++) {	
			if(country.getHighways()[i] == null) {
				break;
			}
			System.out.println("Total cars in " + country.getHighways()[i].getName() + " Highway: " + getHighwayCars(country.getHighways()[i]));
		}
		System.out.println("===================");
		
		System.out.println("Average speed in country: " + getAverageSpeed(country));
		System.out.println("===================");

		System.out.println("Max speed in country: " + getMaxSpeed(country));
		System.out.println("===================");
		
		
		Highway highway = getMostDenseHighway(country);
		System.out.println("Most densest highway: " +  highway.getName() + " Highway with " + getHighwayCars(highway) + " cars.");
		System.out.println("===================");
		
		Highway highway2 = getFastestHighway(country);
		System.out.println("Most fastest highway: " + highway2.getName() + " Highway with speed of " + getAverageHighwaySpeed(highway2));
		
	}
	
	public static int getCountryCars(Country c) {
		int count = 0;
		
		for(Highway highway : c.getHighways()) {	
			if(highway != null) {
				count += getHighwayCars(highway);
			}		
		}
		
		return count;
	}
	
	public static int getHighwayCars(Highway h) {
		int count = 0;
		
		for(Car car: h.getCars()) {	
			if(car != null) {
				count++; 
			}			
		}
		
		return count;
	}
	
	public static double getAverageHighwaySpeed(Highway h) {
		double sum = 0;
		
		for(int i = 0; i < h.getCars().length; i++) {
			if(h.getCars()[i] == null) {
				break;
			}
			sum += h.getCars()[i].getSpeed();
		}
		
		double avg = sum / getHighwayCars(h);
		
		return avg;
	}
	
	public static double getAverageSpeed(Country c) {
		double sum = 0;
		
		for(int i = 0; i < c.getHighways().length; i++) {
			
			if(c.getHighways()[i] == null) {
				break;
			}
			
			sum += getAverageHighwaySpeed(c.getHighways()[i]);
		}
		
		double avg = sum / getCountryCars(c);
		
		return avg;
	}
	
	public static int getMaxSpeed(Country c) {
		int max = 0;
		
		for(int i = 0; i < c.getHighways().length; i++) {
		
			if(c.getHighways()[i] == null) {
				break;
			}
			
			for(int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if(c.getHighways()[i].getCars()[j] == null) {
					break;
				}
				
				if(max < c.getHighways()[i].getCars()[j].getSpeed()) {
					max = c.getHighways()[i].getCars()[j].getSpeed();
				}
			}
		}
		
		return max;
	}
	
	public static Highway getMostDenseHighway(Country c) {
		int max = 0;
		Highway h = null;
		
		for(int i = 0; i < c.getHighways().length; i++) {
			
			if(c.getHighways()[i] == null) {
				break;
			}
			
			for(int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if(max < getHighwayCars(c.getHighways()[i])) {
					max = getHighwayCars(c.getHighways()[i]);
					h = c.getHighways()[i];
				}
			}
		}
		
		return h;
	}
	
	public static Highway getFastestHighway(Country c) {
		double max = 0;
		Highway h = null;
		
		for(int i = 0; i < c.getHighways().length; i++) {
			
			if(c.getHighways()[i] == null) {
				break;
			}
			
			for(int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if(max < getAverageHighwaySpeed(c.getHighways()[i])) {
					max = getAverageHighwaySpeed(c.getHighways()[i]);
					h = c.getHighways()[i];
				}
			}
		}
		
		return h;
	}

}
