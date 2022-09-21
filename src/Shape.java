import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Length");
		System.out.println("Enter Breath");
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int B = sc.nextInt();

		int P = 2 * (L + B);
		if (L == B) {
			System.out.println("Shape is Square.");
		} else {
			System.out.println("Shape is Rectangle.");
		}
		System.out.println("Perimeter is " + P + ".");
	}
}
