package practise;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	// HashSet treeset, LinkedHashset implements Set interface
	// does not accept duplicate values // There is no guarantee elements stored in sequential order..Random order

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("China");
		hs.add("Russia");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
