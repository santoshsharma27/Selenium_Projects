package practise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	// can accept duplicate values
	// ArraList,LinkedList,vector- Implementing List interface
	// array have fixed size where as arraylist can grow dynamically
	// you can access and insert any value in any index
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Santosh");
		a.add("Sandeep");
		a.add("Sandeep");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Sandeep"));
		System.out.println(a.indexOf("Sandeep"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		Employee e1 = new Employee("Santosh", 26, "QA");
		Employee e2 = new Employee("Sandeep", 24, "Dev");
		Employee e3 = new Employee("Tara", 31, "Admin");

		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);

		Iterator<Employee> it = ar.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

	}

}
