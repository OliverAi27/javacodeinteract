import java.util.Scanner;

class AlphabetVowelOrConsonant {
	public static void main(String[] args) {
		System.out.println("Enter a character.");
		Scanner sc = new Scanner(System.in);
		// declare a variable
		char c = sc.next().charAt(0);
		// checks if c is an alphabet]

		if ((Character.isAlphabetic(c))) {
			if (c == 'a' || c == 'e' || c == 'i' | c == 'o' || c == 'u') {
				System.out.println(c + " is a vowel.");
			} else {
				System.out.println(c + " is a consonant.");
			}
		} else {
			System.out.println(c + " is not an alphabet.");
		}

	}
}
