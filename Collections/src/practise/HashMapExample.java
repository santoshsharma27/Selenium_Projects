package practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Java HashMap class implements the Map interface which allows us to store key and value pair
		//Java HashMap is non synchronized -- not thread safe
		//Java HashMap maintains no order
		//Java HashMap may have one null key and multiple null values
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Selenium");
		hm.put(1, "QTP");
		hm.put(2, "TestComplete");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Santosh", 26, "QA");
		Employee e2 = new Employee("Sandeep", 24, "Dev");
		Employee e3 = new Employee("Tara", 31, "Admin");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e2);

		// traverse the hashmap:
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key + " " + "info");
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}

	}

}
