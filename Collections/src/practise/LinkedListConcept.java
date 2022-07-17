package practise;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		System.out.println(ll);
		ll.addFirst("Santosh");
		ll.addLast("Sharma");
		System.out.println(ll);
		System.out.println(ll.get(0));
		ll.set(1, "Kumar");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
	}

}
