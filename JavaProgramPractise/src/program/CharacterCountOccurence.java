package program;

public class CharacterCountOccurence {

	public static void main(String[] args) {
		String str = "Selenium Automation";
		System.out.println(str.length()-str.replaceAll("e", "").length());
	}

}
