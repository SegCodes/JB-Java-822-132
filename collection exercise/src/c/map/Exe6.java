package c.map;

import java.util.*;

public class Exe6 {

	public static void main(String[] args) {

		Map<Character, Integer> map1 = new HashMap<>();
		map1.put('A', 65);
		map1.put('B', 66);
		map1.put('C', 67);
		
		System.out.println(map1);
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		System.out.println("==============");

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Sunday");
		map2.put(2, "Monday");
		map2.put(3, "Tuesday");
		
		System.out.println(map2);
		System.out.println(map2.keySet());
		System.out.println(map2.values());
		System.out.println("==============");
	
		Map<Integer, String> map3 = new HashMap<>();
		map3.put(1, "one");
		map3.put(2, "two");
		map3.put(3, "three");
		map3.put(4, "four");
		map3.put(5, "five");
		
		System.out.println(map3);
		System.out.println(map3.keySet());
		System.out.println(map3.values());

	}

}
