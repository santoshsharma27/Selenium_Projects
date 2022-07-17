package practise;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Creating an empty LinekdhashSet of string type
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		// Adding elements to the above Set
		// by invoking the add() method
		lhs.add("Java");
		lhs.add("T");
		lhs.add("Point");
		lhs.add("Good");
		lhs.add("Website");

		// displaying all the elements on the console
		System.out.println("The hash set is: " + lhs);

		// Removing an element from the above linked Set

		// since the element "Good" is present, therefore, the method remove()
		// returns true
		System.out.println(lhs.remove("Good"));

		// After removing the element
		System.out.println("After removing the element, the hash set is: " + lhs);

		// since the element "For" is not present, therefore, the method remove()
		// returns false
		System.out.println(lhs.remove("For"));
	}

}
