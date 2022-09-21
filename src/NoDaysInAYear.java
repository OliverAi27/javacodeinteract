import java.util.Scanner;

public class NoDaysInAYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Year");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {

			System.out.println("It is Monday");
		} else if (n == 2) {
			System.out.println(" It is Tuesday");
		} else if (n == 3) {
			System.out.println("It is Wednesday");
		} else if (n == 4) {
			System.out.println(" It is Thursday");
		} else if (n == 5) {
			System.out.println(" It is Friday");
		} else if (n == 6) {
			System.out.println(" It is Saturday");
		} else if (n==7){
			System.out.println(" It is Sunday");
		} else {
			System.out.println("Invalid Input");
		}

	}
}
