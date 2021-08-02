<<<<<<< HEAD
package a;

import java.util.ArrayList;
import java.util.Collection;
// import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
	
		List<Person> list = new ArrayList<>();
		list.add(new Person(102, "Dan", 30));
		list.add(new Person(103, "Ben", 20));
		list.add(new Person(104, "Eric", 24));
		
		System.out.println("Insert order:");
		print(list);
		
		System.out.println("Natural order(id):");
		list.sort(null);
		print(list);
		
		System.out.println("Natural order(age):");
		list.sort(new PersonAgeComparator());
		print(list);

		System.out.println("Natural order(name):");
		list.sort(new PersonNameComparator());
		print(list);
		
		
	}
	
	private static void print(Collection<?> col) {
		System.out.println("====================");
		for(Object o: col) {
			System.out.println(o);
		}
		System.out.println();
		
	}

}
=======
package a;

import java.util.ArrayList;
import java.util.Collection;
// import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
	
		List<Person> list = new ArrayList<>();
		list.add(new Person(102, "Dan", 30));
		list.add(new Person(103, "Ben", 20));
		list.add(new Person(104, "Eric", 24));
		
		System.out.println("Insert order:");
		print(list);
		
		System.out.println("Natural order(id):");
		list.sort(null);
		print(list);
		
		System.out.println("Natural order(age):");
		list.sort(new PersonAgeComparator());
		print(list);

		System.out.println("Natural order(name):");
		list.sort(new PersonNameComparator());
		print(list);
		
		
	}
	
	private static void print(Collection<?> col) {
		System.out.println("====================");
		for(Object o: col) {
			System.out.println(o);
		}
		System.out.println();
		
	}

}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132
