package program;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// First method
//		a = a + b; // 30
//		b = a - b; // 10
//		a = a - b;
//		System.out.println("After Swap:" + a + " " + b);

		// Second Method using 3rd variable
		int t;
		t = a; //10
		a = b; //20
		b = t; //10
		System.out.println("After Swap:" + a + " " + b);

	}

}
