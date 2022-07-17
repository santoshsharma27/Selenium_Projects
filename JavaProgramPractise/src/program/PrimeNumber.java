package program;

public class PrimeNumber {
	public static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(5));
		System.out.println(isPrimeNumber(10));
	}

}
