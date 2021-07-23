package b;

public class State implements Comparable<State> {
	
	private String name;
	private int area;
	private int population;
	
	@Override
	public String toString() {
		return "State [name=" + name + ", area=" + area + ", population=" + population + "]";
	}

	public State(String name, int area, int population) {
		super();
		this.name = name;
		this.area = area;
		this.population = population;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}


	@Override
	public int compareTo(State s) {
		return this.name.compareToIgnoreCase(s.name);
	}

}
