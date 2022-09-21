import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int remainder = 0;
		int armstrong = 0;
		int digit = sc.nextInt();
		String power = String.valueOf(digit);

		int num = digit;
		while (digit > 0) {
			remainder = digit % 10;
			remainder = (int) Math.pow(remainder, power.length());
			armstrong = armstrong + remainder;
			digit = digit / 10;
		}
		if (armstrong == num) {
			System.out.println("Number is Armstrong number.");

		} else {
			System.out.println("Number is not Armstrong number.");
		}
	}

}
