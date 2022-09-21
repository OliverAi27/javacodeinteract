import java.util.Scanner;

public class StringWordsCount {

	public static int countWordsUsingSplit(String input) {
		System.out.println("Enter a statement.");
		Scanner words = new Scanner(System.in);
//		if (words == null || words.isEmpty()) { 
//			System.out.println("Input is invalid or empty");//return 0; } 
//		String[]words = line.split("\\s+"); 
//		return words.length; }
//		String[]words2=words.split("");
//		System.out.println(words2);
		for(int i=0; i<=words.length-1; i++) {System.out.println(words[i]);
		}
	}
}
	


//		for(int i=0; i<words.length(); i++) {
//		if(words.charAt(i)==' ') c++;
//		sysout("num of words:" +c);
//}