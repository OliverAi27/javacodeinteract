import java.util.Scanner;

public class ArrayPerfectNumberSelection {

	public static void main(String[] args) {
		System.out.println("Enter Starting Number");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.println("Enter Ending Number");
		int end = sc.nextInt();
		int sum = 0;
		while (start <= end) {
			sum = sum+start;
			start=start+1;
		}
		for (sum = start + end; start<=end; start++ ) //check with teacher
			
		{
			{
		System.out.println("Sum of Numbers is " + sum + ".");
	}
			start++;
	}
		}
}
