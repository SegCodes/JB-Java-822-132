// This is the Maze Runner class for DEV276x Java Course by Sagiv Ness.

package app;

import java.util.Scanner;

public class MazeRunner {

	public static void main(String[] args) {
		
		Maze myMap = new Maze();
		Scanner input = new Scanner(System.in);
		int c = 0;
		
		Intro(myMap);

		while(!myMap.didIWin()) {
			checkDirection(userMove(input), myMap, input, c);
			c++;
			System.out.println("Moves made:" + c);
			movesMessage(c);
		}
		
		System.out.println("Congratulations! You won with " + c + " moves!");
		input.close();
	}
	
	// Greets player and shows the starting position in the map.
	public static void Intro(Maze map) {
		
		System.out.println("Welcome to Maze Runner!");
		System.out.println("Here is your current position:");
		
		map.printMap();
	}
	
	// Takes user movement input and moves him if they can.
	public static String userMove(Scanner input) {
		
		System.out.println("Where would you like to move? (R, L, U, D):");
		
		String move = input.next();
		
		while(!move.equals("R") && !move.equals("L") && !move.equals("U") && !move.equals("D")) {
			System.out.println();
			System.out.println("Please enter a proper direction (R, L, U, D):");
			move = input.next();
		}
		
		System.out.println();
		return move;
	}
	
	// Checks if the user can move in the direction he inputed and moves them if possible.
	public static void checkDirection(String move, Maze maze, Scanner input, int c) {
		
		switch(move) {
		case "R":
			if (maze.canIMoveRight()) {
				maze.moveRight();
			} else if(maze.isThereAPit(move)) {
				navigatePit(maze, input, move);
			} else {
				System.out.println("Sorry! there is a wall to your right.");
			} 
			break;
			
		case "L":
			if (maze.canIMoveLeft()) {
				maze.moveLeft();
			} else if(maze.isThereAPit(move)) {
				navigatePit(maze, input, move);
			} else {
				System.out.println("Sorry! there is a wall to your left.");
			} 
			break;
		
		case "U":
			if (maze.canIMoveUp()) {
				maze.moveUp();
			} else if(maze.isThereAPit(move)) {
				navigatePit(maze, input, move);
			} else {
				System.out.println("Sorry! there is a wall to your up.");
			} 
			break;
		
		case "D":
			if (maze.canIMoveDown()) {
				maze.moveDown();
			} else if(maze.isThereAPit(move)) {
				navigatePit(maze, input, move);
			} else {
				System.out.println("Sorry! there is a wall to your down.");
			} 
			break;
		}
		
		maze.printMap();
	}
	
	// Moves the user over pits.
	public static void navigatePit(Maze maze, Scanner input, String move) {
		
		System.out.println("Watch out! There is a pit ahead! Jump over it? (yes/no):");
		
		String descision = input.next();
		if(descision.startsWith("y")) {
			
			switch(move) {
				case "R": maze.jumpOverPit(move); break;
				case "L": maze.jumpOverPit(move); break;
				case "U": maze.jumpOverPit(move); break;
				case "D": maze.jumpOverPit(move); break;
			}
		}
	}
	
	// Messages the user on their left moves.
	public static void movesMessage(int moves) {
		
		switch(moves) {
		case 50: System.out.println("Warning: You have made 50 moves. You have 50 remaining before the maze exit closes."); break;
		case 75: System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape."); break;
		case 90: System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!"); break;
		case 100: System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:["); System.exit(0); break;
		}
	}
}
