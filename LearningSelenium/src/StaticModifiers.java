public class StaticModifiers {
	String name = "Santosh";// non static global var
	static int age = 25;// static global var

	public void sendMail() {
		System.out.println("send Mail method");
	}

	public static void sum() { // static method
		System.out.println("Sum Method");
	}

	public static void main(String[] args) {
		// how to call static variable and methods
		// 1. Direct calling
		sum();
		System.out.println(age);
		// 2. calling by class name
		StaticModifiers.sum();
		System.out.println(StaticModifiers.age);
		// how to call non static variable and methods
		StaticModifiers obj = new StaticModifiers();
		obj.sendMail();
		System.out.println(obj.name);
	}

}
