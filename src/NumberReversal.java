
import java.io.*;
import java.util.Scanner;
  
class NumberReversal {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(),reversed =0;
    
    System.out.println("Original Number: " + n);

    // run loop until num becomes 0
    while(n != 0) {
    
      // get last digit from num
      int digit = n % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      n /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}