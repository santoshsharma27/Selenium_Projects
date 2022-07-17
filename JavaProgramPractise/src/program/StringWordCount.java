package program;

public class StringWordCount {

	public static void main(String[] args) {
		String str = "SantoshKumarSharma";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
