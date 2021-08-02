package a;

public class Car {
	
	private int number;
	private int speed;
	
	public Car() {
		
	}

	public Car(int number, int speed) {
		this.number = number;
		if(speed >= 0 && speed <= 110) {
			this.speed = speed;
		} else {
			this.speed = (int)(Math.random()*111);
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
	
}
