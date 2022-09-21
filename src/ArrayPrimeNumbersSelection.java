import java.util.Scanner;
public class ArrayPrimeNumbersSelection{
public static void main (String[] args){
    int[] array = new int [5];
    Scanner in = new Scanner (System.in);

    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<5; i++)
    {
        array[i] = in.nextInt();
    }
     for(int i=0; i<array.length; i++) {boolean isPrime = true;
     if (array[i]==1)
    	 isPrime = false;
     else {
    	 for (int j = 2;j<=array[i]/2; j++){
    		 if (array[i]% j==0) {
    			 isPrime = false;
    			 break;} 
    		 }
    	 }
     }
}
}