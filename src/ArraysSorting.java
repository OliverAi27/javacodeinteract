import java.util.Scanner;
import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 7, 3, 4, 5, 6, 1, 2, -1, 0, 20 };

		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) { // j<i:ascending order
					int temp = numbers[i];     // j>i:descending order
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		
			System.out.println("After single iteration");

			for (int k = 0; k < numbers.length; k++) {
				System.out.println(numbers[k]);
			}

		}

		System.out.println("\n\n\n\n Sorted Array");

		for (int k = 0; k < numbers.length; k++) {
			System.out.print(numbers[k] + "\t");
		}
	}

}
