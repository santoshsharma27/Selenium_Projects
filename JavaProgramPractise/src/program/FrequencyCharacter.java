package program;

public class FrequencyCharacter {

	public static void main(String[] args) {
		String str = "Santosh Kumar";
		int freq[] = new int[str.length()];
		char string[] = str.toCharArray();
		for (int i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == (string[j])) {
					freq[i]++;
					string[j] = '0'; // Set words[j] to 0 to avoid printing visited word
				}
			}

		}
		for (int i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0') {
				System.out.println(string[i] + "---->" + freq[i]);
			}
		}
	}
}
