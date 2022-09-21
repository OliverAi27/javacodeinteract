import java.util.Scanner;

public class SimpleInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		float P = sc.nextFloat();
		System.out.println("Enter Time in years");
		float T = sc.nextFloat();
		System.out.println("Enter Rate");
		float R = sc.nextFloat();
		float I = P * T * R / 100;

		System.out.println("Simple Interest is " + I);

	}

}
