<<<<<<< Upstream, based on origin/master
package c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import c.food.Apple;
import c.food.Fruit;

public class GenericDemo {

	public static void main(String[] args) {
		
		// Generic collections are type safe
		//List<Fruit> list = new ArrayList<Apple>();
		
		Fruit[] arr = new Apple[5];
		arr[0] = new Apple();
		arr[1] = new Apple();
		arr[2] = new Apple();
		arr[3] = new Fruit(); // Insert fruit into apple.
		
		System.out.println(Arrays.toString(arr));

	}

=======
package c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import c.food.Apple;
import c.food.Fruit;

public class GenericDemo {

	public static void main(String[] args) {
		
		// Generic collections are type safe
		//List<Fruit> list = new ArrayList<Apple>();
		
		Fruit[] arr = new Apple[5];
		arr[0] = new Apple();
		arr[1] = new Apple();
		arr[2] = new Apple();
		arr[3] = new Fruit(); // Insert fruit into apple.
		
		System.out.println(Arrays.toString(arr));

	}

>>>>>>> 2904016 Updated code.
}