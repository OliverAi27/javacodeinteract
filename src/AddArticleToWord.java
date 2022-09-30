import java.util.Scanner;

public class AddArticleToWord {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//System.out.println("enter any words");
//Scanner sc = new Scanner(System.in);
//String word = sc.nextLine();
//char[] articleWord= word.toCharArray();
//if(word.charAt(0) == 'a' || word.charAt[(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
//	word = "an" +word;
//	
//	} else
//
//	{
//	  word = "a" + word;
//	} System.out.println(word);
//	scan.close();	
//}
//	}

		System.out.println("Enter word.");
		Scanner sc = new Scanner(System.in);
		String word =sc.nextLine();
		char c = sc.next().charAt(0);

		if ((Character.isAlphabetic(c))) {
			if (c == 'a' || c == 'e' || c == 'i' | c == 'o' || c == 'u') {
				System.out.println("an " +word );
			} else {
				System.out.println("a " +word );
			}
		} else {
			System.out.println("The " +word );
		}

	}
}
