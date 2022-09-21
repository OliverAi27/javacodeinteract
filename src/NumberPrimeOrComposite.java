import java.util.Scanner;

public class NumberPrimeOrComposite {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// positive number
		int Factors = 0;
		for (int i = 1; i <= n; i++) {
			// if number is divided by i
			// i is the factor
			if (n % i == 0) {
				Factors++;
			}
		}
		if (n>1)
		{
		if (Factors > 2) {
			System.out.println(n + " is a composite.");
		} else {
			System.out.println(n + " is prime.");
		}
	}
		else {
			System.out.println(n + " is neither prime nor composite.");
}
}
}
//public class NumberPrimeOrComposite {

//	public static void main(String[] args) {
//		System.out.println("Enter Number");
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		if (isPrime(n)){ 
//			System.out.println(n + " is a prime number.");			
//		}
//		else {
//			System.out.println(n + " is a composite.");
//		}
//	}
//	static boolean isPrime(int n)
//	{ 
//		if(n<=1)
//		{
//			return false;
//		}
//		for(int i=2; i<=n/2;i++)
//		{
//			if((n%i)==0)
//				return false;
//		}
//		return true;
//		
//	}
//}

