package b.varargs;

import java.util.*;
import a.exercise.*;

public class Util {
	
	public static void main(String[] args) {
		System.out.println(sum(5, 6));
		System.out.println(sum(5, 6, 3, 1, 2, 5, 4));
		System.out.println(sum("Eldar", 5, 6, 3, 1, 2, 5, 4));
		System.out.println(sum("Eldar"));
		
		List<Integer> list = Arrays.asList(2, 4, 2, 3, 6, 7);
		System.out.println(list);
		
		Arrays.asList(new Employee(), new Manager());
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int... nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
	
	public static int sum(String name, int... nums) {
		System.out.println("Hello " + name);
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}

}
