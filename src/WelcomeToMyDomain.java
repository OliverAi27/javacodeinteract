
import java.util.Scanner;

public class WelcomeToMyDomain {

	public static void main(String[] args) {
		System.out.println("Hello. Please state your full name below and address below your full name.");
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		System.out.println("Hello, " + n1 + " from " + n2 + ". Welcome to my humble domain.");

		// TODO Auto-generated method stub

	}

}
