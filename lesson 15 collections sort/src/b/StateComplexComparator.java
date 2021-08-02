<<<<<<< HEAD
package b;

import java.util.Comparator;

public class StateComplexComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		
		int results = 0;
		
		// Try to decide by population
		results = s1.getPopulation() == s2.getPopulation()?0:s1.getPopulation() - s2.getPopulation();
		
		// If population is the same, try to decide by area
		if(results == 0) {
			results = s1.getArea() == s2.getArea()?0:s1.getArea() - s2.getArea();
		}
		
		// If area is the same, try to decide by name (natural order)
		if(results == 0) {
			s1.compareTo(s2);
		}
		
		return results;
	}

}
=======
package b;

import java.util.Comparator;

public class StateComplexComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		
		int results = 0;
		
		// Try to decide by population
		results = s1.getPopulation() == s2.getPopulation()?0:s1.getPopulation() - s2.getPopulation();
		
		// If population is the same, try to decide by area
		if(results == 0) {
			results = s1.getArea() == s2.getArea()?0:s1.getArea() - s2.getArea();
		}
		
		// If area is the same, try to decide by name (natural order)
		if(results == 0) {
			s1.compareTo(s2);
		}
		
		return results;
	}

}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132
