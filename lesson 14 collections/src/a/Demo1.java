<<<<<<< Upstream, based on origin/master
package a;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("A");
//		list.add(1); // Integer is not allowed in this list.
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list.size());
		System.out.println(list);
		
	}

=======
package a;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("A");
//		list.add(1); // Integer is not allowed in this list.
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list.size());
		System.out.println(list);
		
	}

>>>>>>> 2904016 Updated code.
}