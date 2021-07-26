package a;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Demo3Map {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		// Add entries to the map
		map.put("Java","Programming Language");
		map.put("Israel","Country");
		map.put("Table","Furniture");
		System.out.println(map);
		
		// Give key and get the value
		System.out.println(map.get("Java"));
		System.out.println("===========================");
		
		while(true) {
			String word = JOptionPane.showInputDialog("Enter a word or q to quit:");
			try {
				if(word.equals("q")) {
					break;
				} else if(map.get(word) != null) {				
					System.out.println(map.get(word));
				} else {
					// System.out.println("");
					int input = JOptionPane.showConfirmDialog(null, "Error: Word not found. Would you like to add it?");
					if(input == 0) {
						String description = JOptionPane.showInputDialog("Enter definition:");
						map.put(word, description);
						System.out.println("Word added.");
						System.out.println(map.get(word));
					}
				}
			} catch (Exception e) {
				System.out.println("Error: Invalid input.");
			}
		}
		System.out.println("Bye.");
		
	}
}
