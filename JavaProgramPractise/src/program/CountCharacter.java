package program;

public class CountCharacter {

	public static void main(String[] args) {
		String str = "The Best Book is XYZ";
		System.out.println(str.length());
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
