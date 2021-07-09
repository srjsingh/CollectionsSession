package SetConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcepts {

	public static void main(String[] args) {

		// HashSet is not ordered.
		// HashSet doesn't allow duplicate value
		// HashSet allows mathematical operations\
		// HashSet stores object

		Set<String> hs = new HashSet<String>();

		hs.add("Alpha");
		hs.add("Beta");
		hs.add(null);
		hs.add("Alpha");

		System.out.println(hs);

		System.out.println(hs.contains("testing"));

		// for iterating we can use

		// for each loop
		for (String e : hs) {

			System.out.println(e);

		}

		// Using iterator

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());

		}

		hs.remove("Beta");
		System.out.println(hs);

		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7 }));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));

		// get union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		// get intersection
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		//get difference
		Set<Integer> difference = new HashSet<Integer>(second);
		difference.removeAll(first);
		System.out.println(difference);
	}

}
