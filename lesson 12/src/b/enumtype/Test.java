package b.enumtype;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a Planet: " + Arrays.toString(Planet.values()));
		Planet planet = Planet.valueOf(sc.nextLine());
		System.out.println(planet);
		System.out.println("Orbit: " + planet.getOrbit());
		System.out.println("Mass: " + planet.getMass());
		System.out.println("Type: " + planet.getType());

	}

}
