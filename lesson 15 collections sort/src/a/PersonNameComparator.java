<<<<<<< Upstream, based on origin/master
package a;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getName().compareToIgnoreCase(p2.getName());
	}

=======
package a;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getName().compareToIgnoreCase(p2.getName());
	}

>>>>>>> 2904016 Updated code.
}