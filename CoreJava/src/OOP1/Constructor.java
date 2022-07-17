package OOP1;

public class Constructor {

	String name;
	int id;

	public Constructor(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public void display() {
		System.out.println(name + " " + id);

	}

	public static void main(String[] args) {
		Constructor cs = new Constructor("Santosh", 20);
		Constructor cs2 = new Constructor("Mohan", 25);
		cs.display();
		cs2.display();

	}
}
