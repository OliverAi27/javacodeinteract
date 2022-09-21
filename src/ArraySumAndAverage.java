import java.util.Scanner;

public class ArraySumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of numbers::");
		int count = sc.nextInt();
		int sum = 0;
		int[] numbers = new int[count];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter number::");
			int number = sc.nextInt();
			numbers[i] = number;
		}

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);

		float average = sum / count;
		System.out.println(average);
	}
}
