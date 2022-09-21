import java.util.Scanner;

class CharTest {
	public static void main(String[] args) {
		System.out.println("Enter a character.");
		Scanner sc = new Scanner(System.in);
		//declare a variable
		char c = sc.next().charAt(0);

		// checks if c is an alphabet
		if (Character.isAlphabetic(c)) {
			System.out.println(c + " is an alphabet.");
		} 
		else if (Character.isDigit(c)) {
			System.out.println(c + " is a number.");
		} 
		else {
			System.out.println(c + " is a special character.");
		}
	}
}