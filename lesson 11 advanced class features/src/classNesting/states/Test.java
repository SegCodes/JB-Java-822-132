package classNesting.states;

import classNesting.states.State.Citizen;

public class Test {

	public static void main(String[] args) {
		
		State israel = new State("Israel");
		Citizen moshe = israel.new Citizen(101, "Moshe");
		Citizen danna = israel.new Citizen(102, "Danna");
		Citizen david = israel.new Citizen(103, "David");
		
		State france = new State("France");
		Citizen pier = france.new Citizen(101, "Pier");
		Citizen jeanne = france.new Citizen(102, "Jeanne");
		
		System.out.println(israel.getName());
		System.out.println(france.getName());
		
		System.out.println(moshe.getName() + " from " + moshe.getStateName());
		System.out.println(jeanne.getName() + " from " + jeanne.getStateName());
		
		System.out.println(israel.getName() + " population: " + israel.getPopulation());
		System.out.println(france.getName() + " population: " + france.getPopulation());
	}

}
