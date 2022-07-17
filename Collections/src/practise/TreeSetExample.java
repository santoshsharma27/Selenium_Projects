package practise;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		System.out.println("Traversing element through Iterator in descending order");
		Iterator<String> i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(24);
		ts.add(66);
		ts.add(12);
		ts.add(15);
		System.out.println("Lowest Value: " + ts.pollFirst());
		System.out.println("Highest Value: " + ts.pollLast());
	}

}
