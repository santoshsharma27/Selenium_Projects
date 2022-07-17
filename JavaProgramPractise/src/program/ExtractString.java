package program;

public class ExtractString {

	public static void main(String[] args) {
		String str="www.google.com";
		String firstFour = str.substring(0,4);
		System.out.println(firstFour);
		String lastFour = str.substring(str.length()-4);
		System.out.println(lastFour);
		String website = str.substring(4,str.length()-4);
		System.out.println(website);
	}

}
