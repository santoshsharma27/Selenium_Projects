
public class ArraysDemo {

	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 1;
		x[1] = 3;
		x[2] = 5;
		x[3] = 7;
		x[4] = 9;
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		int[] b = { 11, 12, 13, 14, 14 };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
