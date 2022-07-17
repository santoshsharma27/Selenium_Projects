package program;

public class RemoveJunkData {

	public static void main(String[] args) {
		String str = "@!!!&*{}Santosh Kumar";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));

	}

}
