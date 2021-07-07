package vehicles;

public class Test {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.Start();
		v.Stop();
		
		v.setSpeed(52);
		System.out.println(v.getSpeed());
		
		v = new Boat();
		v.Start();
		v.Stop();
		
		v.setSpeed(25);
		System.out.println(v.getSpeed());

	}

}
