package program;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "Selenium Automation";
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
