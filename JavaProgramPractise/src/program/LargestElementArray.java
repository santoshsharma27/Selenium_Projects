package program;

public class LargestElementArray {

	public static void main(String[] args) {
		int arr[] = { 20, 50, 80, 45 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest Element is:" + max);
	}
}