package vehicles;

public abstract class Vehicle {
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public abstract void Start();
	
	public abstract void Stop();
	
	public abstract void turnRight();
	
	public abstract void turnLeft();
	
}
