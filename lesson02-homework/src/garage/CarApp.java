package garage;

public class CarApp {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(9841647, "Volkswagen", 2007, "Red");
		
		c1.number = 5196841;
		c1.model = "Mercedes Benz";
		c1.year = 2002;
		c1.color = "Black";
		
		System.out.println("Car Details: Number-" + c1.number + ", Model-" + c1.model + ", Year-" + c1.year + ", Color-" + c1.color + ".");
		System.out.println("Car Details: Number-" + c2.number + ", Model-" + c2.model + ", Year-" + c2.year + ", Color-" + c2.color + ".");
	}

}
