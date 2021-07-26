package a;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		
		System.out.println("\n" + name + ", what is your age:");
		int age = input.nextInt();
		
		System.out.println("\n" + name + ", how much money do you have?");
		double money = input.nextDouble();
		
		System.out.println("\nAny Comments?");
		String cx = input.nextLine();
		
		
	}

}
