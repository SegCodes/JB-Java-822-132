<<<<<<< HEAD
package a;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getAge() < p2.getAge()) {
			return -1;
		} else if(p1.getAge() > p2.getAge()) {
			return 1;
		}
		return 0;
	}
	
}
=======
package a;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getAge() < p2.getAge()) {
			return -1;
		} else if(p1.getAge() > p2.getAge()) {
			return 1;
		}
		return 0;
	}
	
}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132