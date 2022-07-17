package program;

public class SecondSmallestNumber {

		public static int getSecondSmallest(int arr[], int total) {
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
			return arr[1];//2nd element because index starts with 0
//			return arr[0];
//			return arr[2];
//			return arr[3];

		}

		public static void main(String[] args) {
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println("Second Smallest Number:" + getSecondSmallest(arr, 5));

	}

}
