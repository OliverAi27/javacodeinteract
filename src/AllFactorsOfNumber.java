import java.util.Scanner;

public class AllFactorsOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// positive number
		for(int i = 1; i <= n; i++) {
			// if number is divided by i
			// i is the factor
			if (n % i == 0) {
				System.out.println("Factors of " + n + " are: " + i);
			}
		}
	}
}