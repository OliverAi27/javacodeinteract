import java.util.Scanner;

public class DaysInAYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Year");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isLeapYear = ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0));

		if (isLeapYear) {
			System.out.println("Year " + n + " has 366 days.");
		} else
			System.out.println("Year " + n + " has 365 days.");

	}

}
