package a.list;

import java.util.*;

public class Exe2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			list.add((int)(Math.random()*61 + 20));
		}
		System.out.println(list + "\n");
		
		System.out.println("List size: " + list.size());
		System.out.println("First number: " + list.get(0));
		System.out.println("Last number: " + list.get(list.size() - 1));
		System.out.println("10th number: " + list.get(9));
		if(list.contains(25)) {			
			System.out.println("25\'s index: " + list.indexOf(25));
		} else {
			System.out.println("The list doesn't contain the number 25.");
		}

	}

}
