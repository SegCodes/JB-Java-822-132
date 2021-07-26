package a;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) {
		// Create a set of String
		//Set<String> set = new HashSet<>(); // Unordered
		//Set<String> set = new LinkedHashSet<>(); // Ordered
		Set<String> set = new TreeSet<>(); // Sorted (A->C)
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("B");
		set.add("C");
		set.add("A");
		System.out.println(set);
	}

}
