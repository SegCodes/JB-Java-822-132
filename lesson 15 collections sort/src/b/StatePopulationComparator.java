<<<<<<< Upstream, based on origin/master
package b;

import java.util.Comparator;

public class StatePopulationComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		if(s1.getPopulation() < s2.getPopulation()) {
			return -1;
		}
		if(s1.getPopulation() > s2.getPopulation()) {
			return 1;
		}
		return 0;
	}

=======
package b;

import java.util.Comparator;

public class StatePopulationComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		if(s1.getPopulation() < s2.getPopulation()) {
			return -1;
		}
		if(s1.getPopulation() > s2.getPopulation()) {
			return 1;
		}
		return 0;
	}

>>>>>>> 2904016 Updated code.
}