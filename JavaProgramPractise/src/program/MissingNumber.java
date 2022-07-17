package program;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int expectedsum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		for (int i = 1; i < 10; i++) {
			expectedsum = expectedsum + i;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The missing Number is: " + (expectedsum - sum));

	}

}
