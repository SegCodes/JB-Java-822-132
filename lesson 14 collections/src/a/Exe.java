package a;

import java.util.ArrayList;

public class Exe {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*11));
		}
		System.out.println(list);

	}

}