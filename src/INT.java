import java.util.Scanner;

public class INT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter First Number"); 
		System.out.println("Enter Second Number");
		Scanner sc = new Scanner(System.in);
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
 int e = n1 + n2;
 int f = n1 - n2;
 int g = n1*n2;
 int h =	n1/n2;

System.out.println("Addition of 2 numbers is " + e); 
System.out.println("Substraction of 2 numbers is " + f);
System.out.println("Multiplication of 2 numbers is " + g); 
System.out.println("Division of 2 numbers is " + h);
		 }

}
