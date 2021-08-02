package b;

import java.util.Comparator;

public class StateAreaComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		if(s1.getArea() < s2.getArea()) {
			return -1;
		}
		if(s1.getArea() > s2.getArea()) {
			return 1;
		}
		return 0;
	}

}