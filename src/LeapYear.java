import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("This program calculates leap year.");
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        if ((n % 4 == 0) && (n % 100 != 0))
        {
            System.out.println(n + " is a leap year.");
        }
        else if ((n % 4 == 0) && (n % 100 == 0) && (n% 400 == 0))
        {
            System.out.println(n + " is a leap year.");
        }
        else
        {
            System.out.println(n + " is not a leap year.");
        }
    }
}