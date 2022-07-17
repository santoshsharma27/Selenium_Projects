package program;

public class PlaindromeString {

	public static void main(String[] args) {
		String str = "radar";
		String org_str = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println(org_str + ":" + "String is Plaindrome");
		} else {
			System.out.println(org_str + ":" + "String is not Plaindrome");
		}

	}

}
