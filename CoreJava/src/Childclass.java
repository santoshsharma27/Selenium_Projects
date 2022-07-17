
public class Childclass extends ParentclassDemo {
	public void engine() {
		System.out.println("new engine");
	}

	public void colour() {
		System.out.println(colur);
	}

	public static void main(String[] args) {

		Childclass cd = new Childclass();
		cd.colour();
		cd.Brakes();
	}

}
