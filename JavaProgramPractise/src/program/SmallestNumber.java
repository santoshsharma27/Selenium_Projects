package program;

public class SmallestNumber {

	public static void main(String[] args) {
		int arr[] = { 20, 50, 80, 45 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Element is:" + min);

	}

}
