package practise;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcept {

	public static void main(String[] args) {

		// It is similar to HashMap, but it is synchronised
		// stores the values on the basis of key-value

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		System.out.println("Before remove: " + hm);
		// Remove value for key 102
		hm.remove(102);
		System.out.println("After remove: " + hm);

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
