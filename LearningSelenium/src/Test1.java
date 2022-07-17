import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aman");
		names.add("Arti");
		names.add("Sandeep");
		names.add("Ajay");
		names.add("Raju");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
