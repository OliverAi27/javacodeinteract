
import java.util.Scanner;

/*
 * Program to find prime and composite number within a range
 */

// Single line comment
public class ArrayPrimeOrComposite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start range with smaller number::");
		int start = sc.nextInt();
		
		System.out.println("End range with larger number::");
		int end = sc.nextInt();
		
		while (start <= end) {
			System.out.println(start);
			
			int number = start;
			int i = 1;
			int factorsCount = 0;
			while (i <= number) {
				if (number % i == 0) {
					factorsCount++;
				}
				i++;
			} 
			if (number>1) {
			if (factorsCount > 2) {
				System.out.println(number + " is compostie");
			} else {
				System.out.println(number + " is prime");
			}
			}
			else {
				System.out.println(number + " is neither prime nor composite.");
	}
			start++;
			
		}
		
	}
}
