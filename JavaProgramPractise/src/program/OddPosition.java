package program;

public class OddPosition {

	// For even position loop starts with 1
	// For even position loop starts with 0

	public static void main(String[] args) {
		String str = "Santosh";
		for (int i = 0; i < str.length(); i = i + 2) {
			System.out.println(str.charAt(i));
		}
		System.out.println("----------------");

//With Array:
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < str.length(); i = i + 2) {
			System.out.println(arr[i]);
		}

	}

}
