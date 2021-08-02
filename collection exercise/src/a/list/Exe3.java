package a.list;

import java.util.*;

public class Exe3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*6 + 5));
		}
		System.out.println(list);
		
		Set<Integer> set = new LinkedHashSet<>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);

	}

}