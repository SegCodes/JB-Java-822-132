package a;

import java.util.Scanner;

public class TripPlanner {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Vacation Planner!");
		//Intro();
		System.out.println();
		getDetails();
	}
	
	
	// Get Input of name and destination
	public static void Intro() {
		Scanner input = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		System.out.print("Welcome " + name + "! Where are you traveling to? ");
		String dest = input.nextLine();
		
		System.out.println("Great! " + dest + " sounds like a great trip.");
		System.out.println("====================");
	}
	
	// Get details of the vacation plans
	public static void getDetails() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("For how many days do you go? ");
		int days = input.nextInt();
		
		System.out.print("What is your budget for the trip? ");
		int budget = input.nextInt();
		
		System.out.print("What is the currency of your destination? ");
		String cur = input.next();
		
		System.out.print("How many USD are there in 1 " + cur +"? ");
		double con = input.nextDouble();
		
	}

}
