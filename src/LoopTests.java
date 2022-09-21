import java.util.Scanner;

public class LoopTests {

	public static void main(String[] args) {
		System.out.println("This displays the multiples of 5 & 7. Enter the start of the range of numbers to run. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the end (higher number)of the range of numbers. ");
		int b = sc.nextInt();
		int n = a;// TODO Auto-generated method stub
		while (n <= b && n>=a) {
			if (n % 5 == 0 && n % 7==0) {
				System.out.println("Multiples of 5 & 7 are " + n);
			}
			n += 1;
		}
	}
}