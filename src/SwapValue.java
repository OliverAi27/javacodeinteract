

	import java.util.Scanner;

	public class SwapValue  {

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        int x = 10;
	        int y = 20;

	        System.out.println("Before Swapping ");
	        System.out.println("Value of x is : " + x);
	        System.out.println("Value of y is : " + y);

	        // add both the numbers and assign it to first

//	        x = x + y; 
//	        y = x - y;
//	        x = x - y;
	        int z = y;
	        y = x;
	        x = z;

	        System.out.println("After Swapping ");
	        System.out.println("Value of x is : " + x);
	        System.out.println("Value of y is : " + y);

	        input.close();
	    }
	}