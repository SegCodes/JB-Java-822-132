<<<<<<< Upstream, based on origin/master
package a;

import java.time.LocalDate;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		
		{// Numeral natural order is from lower to higher.
			Set<Integer> set = new TreeSet<>();
			set.add(7);
			set.add(5);
			set.add(9);
			set.add(1);
			set.add(2);
			set.add(-8);
			System.out.println(set);
		}
		
		{// Date natural order is from early to late.
			Set<LocalDate> set = new TreeSet<>();
			set.add(LocalDate.of(1998, 2, 1));
			set.add(LocalDate.of(1999, 5, 2));
			set.add(LocalDate.of(2021, 9, 3));
			set.add(LocalDate.of(2012, 7, 4));
			set.add(LocalDate.of(2015, 3, 5));
			System.out.println(set);
		}
		
		{// String natural order is alphabetical.
			Set<String> set = new TreeSet<>();
			set.add("xml");
			set.add("java");
			set.add("html");
			set.add("apple");
			System.out.println(set);
		}
		
		{// Person natural order is Person.id
			Set<Person> set = new TreeSet<>();
			set.add(new Person(12354, "James", 25));
			set.add(new Person(43781, "Frank", 31));
			set.add(new Person(23571, "Sam", 22));
			set.add(new Person(68712, "Sandra", 27));
			System.out.println(set);
		}
		
		{// Person other order is Person.name
			PersonNameComparator nameComparator = new PersonNameComparator();
			Set<Person> set = new TreeSet<>(nameComparator);
			set.add(new Person(12354, "James", 25));
			set.add(new Person(43781, "Frank", 31));
			set.add(new Person(23571, "Sam", 22));
			set.add(new Person(68712, "Sandra", 27));
			System.out.println(set);
		}
		
		{// Person other order is Person.age
			PersonAgeComparator ageComparator = new PersonAgeComparator();
			Set<Person> set = new TreeSet<>(ageComparator);
			set.add(new Person(12354, "James", 25));
			set.add(new Person(43781, "Frank", 31));
			set.add(new Person(23571, "Sam", 22));
			set.add(new Person(68712, "Sandra", 27));
			System.out.println();
		}
	}

=======
package a;

import java.time.LocalDate;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		
		{// Numeral natural order is from lower to higher.
			Set<Integer> set = new TreeSet<>();
			set.add(7);
			set.add(5);
			set.add(9);
			set.add(1);
			set.add(2);
			set.add(-8);
			System.out.println(set);
		}
		
		{// Date natural order is from early to late.
			Set<LocalDate> set = new TreeSet<>();
			set.add(LocalDate.of(1998, 2, 1));
			set.add(LocalDate.of(1999, 5, 2));
			set.add(LocalDate.of(2021, 9, 3));
			set.add(LocalDate.of(2012, 7, 4));
			set.add(LocalDate.of(2015, 3, 5));
			System.out.println(set);
		}
		
		{// String natural order is alphabetical.
			Set<String> set = new TreeSet<>();
			set.add("xml");
			set.add("java");
			set.add("html");
			set.add("apple");
			System.out.println(set);
		}
		
		{// Person natural order is Person.id
			Set<Person> set = new TreeSet<>();
			set.add(new Person(12354, "James", 25));
			set.add(new Person(43781, "Frank", 31));
			set.add(new Person(23571, "Sam", 22));
			set.add(new Person(68712, "Sandra", 27));
			System.out.println(set);
		}
		
		{// Person other order is Person.name
			PersonNameComparator nameComparator = new PersonNameComparator();
			Set<Person> set = new TreeSet<>(nameComparator);
			set.add(new Person(12354, "James", 25));
			set.add(new Person(43781, "Frank", 31));
			set.add(new Person(23571, "Sam", 22));
			set.add(new Person(68712, "Sandra", 27));
			System.out.println(set);
		}
		
		{// Person other order is Person.age
			PersonAgeComparator ageComparator = new PersonAgeComparator();
			Set<Person> set = new TreeSet<>(ageComparator);
			set.add(new Person(12354, "James", 25));
			set.add(new Person(43781, "Frank", 31));
			set.add(new Person(23571, "Sam", 22));
			set.add(new Person(68712, "Sandra", 27));
			System.out.println();
		}
	}

>>>>>>> 2904016 Updated code.
}