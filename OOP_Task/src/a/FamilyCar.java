package a;

public class FamilyCar extends Car {

	public FamilyCar() {
		// TODO Auto-generated constructor stub
	}

	public FamilyCar(int number, int speed) {
		super(number, speed);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "FamilyCar [number=" + this.getNumber() + ", speed=" + this.getSpeed() + "]";
	}
}
