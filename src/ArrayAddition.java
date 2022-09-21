import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array to perform an addition");
		int setsize = sc.nextInt();

		System.out.println("Enter 1st set of numbers::");
		int[] set1 = new int[setsize];
		;
		for (int i = 0; i < setsize; i++) {
			set1[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd set of numbers::");
		int[] set2 = new int[setsize];
		;
		for (int i = 0; i < setsize; i++) {
			set2[i] = sc.nextInt();
		}
		int[] set3 = new int[setsize];
		for (int i = 0; i < setsize; i++) {
			set3[i] = set1[i] + set2[i];
		}
		for (int val : set3)
			System.out.println(val);
	}

//		int sum = 0;
//		int[] numbers = new int[count];
//
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("Enter number::");
//			int number = sc.nextInt();
//			numbers[i] = number;
//		}
//
//		for (int i = 0; i < numbers.length; i++) {
//			sum = sum + numbers[i];
//		}
//		System.out.println(sum);

	// condition to check if number length is equal

	// inside condition;set index1=0 for num1; set index2=0

	// num3 = num1 + num2

	// print [num3]
}
