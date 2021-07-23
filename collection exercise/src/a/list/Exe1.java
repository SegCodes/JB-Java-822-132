package a.list;

import java.util.*;

public class Exe1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add((int)(Math.random()*11));
		list.add((int)(Math.random()*11));
		list.add((int)(Math.random()*11));
		System.out.println(list);
		
		int sum = 0;
		Iterator<Integer> it =  list.iterator();
		int n;
		
		while(it.hasNext()) {
			n = it.next();
			sum += n;
		}
		
		System.out.println("Last number: " + list.get(list.size() - 1));
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum/list.size());

	}

}
