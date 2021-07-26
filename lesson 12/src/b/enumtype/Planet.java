package b.enumtype;

public enum Planet {

	MERCURY(10, 325, Type.SOLID), VENUS(15, 326, Type.SOLID), EARTH(20, 885, Type.SOLID), MARS(25, 885, Type.SOLID), JUPITER(30, 885, Type.SOLID), SATURN(35, 885, Type.GAS), URANUS(40, 885, Type.GAS), 
	NEPTUNE(45, 885, Type.GAS), PLUTO(50, 885, Type.GAS);
	
	private int mass;
	private int orbit;
	private Type type;
	
	private Planet(int orbit, int mass, Type type) {
		this.orbit = orbit;
		this.mass = mass;
		this.type = type;
	}
	
	public enum Type{
		GAS, SOLID;
	}

	public int getMass() {
		return mass;
	}

	public int getOrbit() {
		return orbit;
	}
	
	public Type getType() {
		return type;
	}
	
}
