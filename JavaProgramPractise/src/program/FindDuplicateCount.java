package program;

public class FindDuplicateCount {

	public static void main(String[] args) {
		String arr[] = { "Santosh", "Sony", "Tara", "Mohan", "Sony", "Santosh" };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
