package program;

public class ThirdLargestNumber {
	public static int getThirdLargest(int arr[], int total) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[total - 3];

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Third Largest Number:" + getThirdLargest(arr, 5));

	}

}
