package a;

public class Car {
	
<<<<<<< Upstream, based on origin/master
	public static final int MAX_SPEED = 110;
	public static final int MIN_SPEED = 0;
	private int number;
	private int speed;
	
	public Car() {
		
	}

	public Car(int number, int speed) {
		this.number = number;
		setSpeed(speed);
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
		if(speed >= MIN_SPEED && speed <= MAX_SPEED) {
			this.speed = speed;
		} else {
			this.speed = (int)(Math.random()*111);
		}
=======
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
>>>>>>> fd2056e All Lessons thus far.
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
	
}
