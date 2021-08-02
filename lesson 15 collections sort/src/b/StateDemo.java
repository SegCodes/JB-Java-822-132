package b;

import java.util.*;

public class StateDemo {

	public static void main(String[] args) {

		{			
			List<State> list = new ArrayList<>();
			list.add(new State("Israel", 100000, 1596841));
			list.add(new State("America", 54942, 1981647));
			list.add(new State("Japan", 15267, 1264981));
			list.add(new State("Netherland", 51968, 952944));
			list.add(new State("India", 98710, 1568443));
			
			print(list);
		}
		
		{			
			List<State> list = new ArrayList<>();
			list.add(new State("Israel", 100000, 1596841));
			list.add(new State("America", 54942, 1981647));
			list.add(new State("Japan", 15267, 1264981));
			list.add(new State("Netherland", 51968, 952944));
			list.add(new State("India", 98710, 1568443));
			
			list.sort(null);
			print(list);
		}
		
		{			
			List<State> list = new ArrayList<>();
			list.add(new State("Israel", 100000, 1596841));
			list.add(new State("America", 54942, 1981647));
			list.add(new State("Japan", 15267, 1264981));
			list.add(new State("Netherland", 51968, 952944));
			list.add(new State("India", 98710, 1568443));
			
			list.sort(new StateAreaComparator());
			print(list);
		}
		
		{			
			List<State> list = new ArrayList<>();
			list.add(new State("Israel", 100000, 1596841));
			list.add(new State("America", 54942, 1981647));
			list.add(new State("Japan", 15267, 1264981));
			list.add(new State("Netherland", 51968, 952944));
			list.add(new State("India", 98710, 1568443));
			
			list.sort(new StatePopulationComparator());
			print(list);
		}

	}
	
	private static void print(Collection<?> col) {
		System.out.println("====================");
		for(Object o: col) {
			System.out.println(o);
		}
		System.out.println();
		
	}
}