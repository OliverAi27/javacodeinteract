import java.util.Scanner;

public class StringWordsCount {

	public static void main(String [] args) {
		
		System.out.println("Enter string.");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		int wordscount = 0;
		if(a.charAt(0) !=' ') {
			wordscount++;
		}
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i)==' ' && a.charAt(i+1) !=' ') {
				wordscount++;
			}
		}
		System.out.println(wordscount);
	}
}
