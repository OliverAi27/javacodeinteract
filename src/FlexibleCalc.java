import java.util.Scanner;

public class FlexibleCalc {

	public static void main(String[] args) {
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: 1st Number Number");
		float a = sc.nextFloat();
		System.out.println("Enter b: 2nd Number Number");
		float b = sc.nextFloat();
		System.out.println("Enter the equation to perform one of the following function: +, -, *, /");
		operator = sc.next().charAt(0);
		double addition = a + b;
		double subtraction = a - b;
		double multiplication = a * b;
		double division = a / b;
		switch (operator) {
		case '+':
			System.out.println(a + "+" + b + "=" + addition);
			break;
		case '-':
			System.out.println(a + "-" + b + "=" + subtraction);
			break;
		case '*':
			System.out.println(a + "*" + b + "=" + multiplication);
			break;
		case '/':
			System.out.println(a + "/" + b + "=" + division);
			break;
		default:
			System.out.println("Invalid Operation Requested");

			// TODO Auto-generated method stub

		}
	}
}
