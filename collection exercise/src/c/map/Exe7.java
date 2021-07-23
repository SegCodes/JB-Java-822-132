package c.map;

import java.util.*;
import javax.swing.*;

public class Exe7 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("dog", "an animal that barks");
		map.put("car", "a vehicle");
		map.put("java", "a programming language");
		
		String str = JOptionPane.showInputDialog("Select one of the words: " + map.keySet());
		str.toLowerCase();
		if(map.containsKey(str)) {
			System.out.println(str + ": " + map.get(str) + ".");
		}

	}

}
