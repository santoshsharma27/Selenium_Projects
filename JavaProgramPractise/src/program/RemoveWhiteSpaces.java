package program;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Santosh Kumar Sharma";
		System.out.println(str.replaceAll("\\s", ""));
		System.out.println(str.replaceAll(" ", ""));

	}

}
