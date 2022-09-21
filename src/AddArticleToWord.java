import java.util.Scanner;

public class AddArticleToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter any words");
Scanner sc = new Scanner(System.in);
String word = sc.nextLine();
char[] articleWord= word.toCharArray();
if(word.charAt(0) == 'a' || word.charAt[(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
	word = "an" +word;
	
	} else

	{
	  word = "a" + word;
	} System.out.println(word);
	scan.close();	
}
	}