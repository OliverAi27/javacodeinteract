import java.util.Scanner;

public class OperatersIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Number");
		if (n % 5 == 0 && n % 7 == 0) {
			System.out.println("Numer is divisible by 5 and 7");
		} else {
			System.out.println("Numer is not divisible 5 and 7");
		}

	}

}
