package program;

public class ArrayFilter {

	public static void main(String[] args) {
		String input[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		String output[] = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = input[i].substring(0, 3);
		}
		for (String day : output) {
			System.out.println(day);
		}

	}

}
