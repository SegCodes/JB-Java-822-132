package a;

import java.util.*;

public class Exe25 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 25; i++) {
			list.add((int)(Math.random()*11));
		}
		System.out.println(list);
		
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		System.out.println(set);
	}

}
