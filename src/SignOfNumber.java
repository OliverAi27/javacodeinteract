import java.util.Scanner;

public class SignOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Enter any Number");
 	Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
 		if (n>0){
 			System.out.println("Number is Positive"); 
 		}
 		else if (n<0) {
 			System.out.println("Number is Negative");
 		}
 		else {
 			System.out.println("Number is O");
 		}
	}

}
