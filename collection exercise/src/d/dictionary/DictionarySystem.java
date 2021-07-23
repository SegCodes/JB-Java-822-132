package d.dictionary;

import java.util.*;

public class DictionarySystem {
	
	private static Dictionary dictionary = new Dictionary();
	public static Scanner sc;
	private static boolean systemOn;
	
	
	
	public static boolean isSystemOn() {
		return systemOn;
	}

	public static Dictionary getDictionary() {
		return dictionary;
	}

	public static void start() {
		systemOn = true;
		dictionary.buildDictionary();
		sc = new Scanner(System.in);
		System.out.println("Welcome to the Dictionary System™!");
	}
	
	public static void printMenu() {
		System.out.println("What would you like to do?");
		System.out.println("==============================");
		System.out.println("1. Get a definiton for a word." );
		System.out.println("2. Add a word to the dicitonary." );
		System.out.println("3. Edit definition for an existing word." );
		System.out.println("4. Delete an existing word." );
		System.out.println("5. Get all existing defitions.");
		System.out.println("6. Close Dictionary.");
		System.out.println("==============================");
	}
	
	public static void close() {
		System.out.println("Thank you for using the Dictionary System™. See you soon!");
		sc.close();
		systemOn = false;
	}
	
}
