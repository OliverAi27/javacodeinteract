import java.util.Scanner;

public class DaysInAMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Month Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if ((n==4)||(n==6)||(n==9)||(n==11)) {
			System.out.println("Month has 30 days.");
		} else if (n==2) {
			System.out.println("Month has 28 days. If it is a leap year, Feburary has 29 days.");
		} else {
			System.out.println("MOnth has 31 days.");
		} 
		

}
}