package a;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExeSet2 {

	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (set.size() < 10) {
			boolean x = set.add((int)(Math.random()*11));
			System.out.println(x);
		}
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		/*if(set.iterator().hasNext()) {			
			System.out.println(set.iterator().next());
		}*/
		
		
		while(it.hasNext()) {
			int x = it.next();
			if(x % 2 != 0) { // Call next() once per iteration
				it.remove();
			}
		}
		System.out.println(set);
	}

}
