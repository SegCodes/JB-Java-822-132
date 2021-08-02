package a;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoForEach {

	public static void main(String[] args) {
		
		// Create the set.
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (set.size() < 10) {
			set.add((int)(Math.random()*11));
		}
		System.out.println(set);
		
		// Iterate with for-each loop.
		int sum = 0;
		for(Integer x: set) {
			System.out.println(x);
			sum += x;
		}
		
		System.out.println("=====");
		System.out.println(sum);
	}

}