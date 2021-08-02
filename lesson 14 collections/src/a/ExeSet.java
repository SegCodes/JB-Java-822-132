<<<<<<< HEAD
package a;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExeSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (set.size() < 10) {
			boolean x = set.add((int)(Math.random()*11));
			System.out.println(x);
		}
		System.out.println(set);

	}

}
=======
package a;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExeSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (set.size() < 10) {
			boolean x = set.add((int)(Math.random()*11));
			System.out.println(x);
		}
		System.out.println(set);

	}

}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132
