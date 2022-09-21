import java.util.Scanner;

public class CompoundInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		float P = sc.nextFloat();
		System.out.println("Enter Time in years");
		float T = sc.nextFloat();
		System.out.println("Enter Interest Rate");
		float R = sc.nextFloat();
		System.out.println("Enter Number of times Interest applied per time period");
		float N = sc.nextFloat();
		float A = Math.round((P*Math.pow((1+(R/N)),N*T))-P);

		System.out.println("Compound Interest is " + A);

	}

}
