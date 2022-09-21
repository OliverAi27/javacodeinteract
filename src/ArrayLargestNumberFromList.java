import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestNumberFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of numbers::");
		int numbers = sc.nextInt();
		int arr[] = new int[numbers];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number::");
			int num = sc.nextInt();
			arr[i] = num;
		}
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}

		}
		System.out.println("Largest number is " + largest);
	}
}

//String str1="Keep";
//String str2="Peek";
//str1=str1.toLowerCase();
//str2=str2.toLowerCase();
//char[] str1Array=str1.toCharArray();
//Arrays.sort(str1Array);
//System.out.println(str1Array);