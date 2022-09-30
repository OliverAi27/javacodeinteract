import java.util.Scanner;

class StringVowelsAndConsonantsCount {
	public static void main(String[] args) {

		System.out.println("Enter a word.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int vowelcount = 0;
		int consonantcount = 0;
		
		for(int i=0; i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				vowelcount ++;
			}else {
				consonantcount++; 
			}
		}
		
		System.out.println("Vowel Count is " + vowelcount);
		System.out.println("Consonant Count is " + consonantcount);
	}
		static boolean isVowel(char ch) {
			ch = Character.toLowerCase(ch); 
			return (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u');
		
		
	

	}
}
