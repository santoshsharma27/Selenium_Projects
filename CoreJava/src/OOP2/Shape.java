package OOP2;

public abstract class Shape {

	Shape() {
		System.out.println("Shape Class Constructor");
	}

	int color;

	abstract void drawing();

	public void fill() {
		System.out.println("Shape--fill");
	}

}
