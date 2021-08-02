<<<<<<< HEAD
package b.set;

import java.util.*;

public class Exe4 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		set.add("David");
		set.add("Jason");
		set.add("Maxim");
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		String str = "";
		
		while(it.hasNext()) {
			str = it.next().toString();
		}
		System.out.println(str);
		
		/** for(int i = 0; it.hasNext();i++) { // For third element in a big set.
		 * 		str = it.next().toString();
		 * 		if(i == 2) {
		 * 			System.out.println(str);
		 * 			break;
		 * 		}
		 * }
		 */

	}

}
=======
package b.set;

import java.util.*;

public class Exe4 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		set.add("David");
		set.add("Jason");
		set.add("Maxim");
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		String str = "";
		
		while(it.hasNext()) {
			str = it.next().toString();
		}
		System.out.println(str);
		
		/** for(int i = 0; it.hasNext();i++) { // For third element in a big set.
		 * 		str = it.next().toString();
		 * 		if(i == 2) {
		 * 			System.out.println(str);
		 * 			break;
		 * 		}
		 * }
		 */

	}

}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132
