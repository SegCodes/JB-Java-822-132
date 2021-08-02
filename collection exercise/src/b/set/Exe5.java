<<<<<<< HEAD
package b.set;

import java.util.*;

public class Exe5 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		
		while(set.size() < 10) {
			set.add((int)(Math.random()*11));
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			int x = (int)it.next();
			if(x % 2 == 0) {
				it.remove();
			}
		}
		System.out.println(set);
	}

}
=======
package b.set;

import java.util.*;

public class Exe5 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		
		while(set.size() < 10) {
			set.add((int)(Math.random()*11));
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			int x = (int)it.next();
			if(x % 2 == 0) {
				it.remove();
			}
		}
		System.out.println(set);
	}

}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132
