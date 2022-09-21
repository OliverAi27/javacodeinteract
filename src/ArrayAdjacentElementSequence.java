import java.util.Scanner;

public class ArrayAdjacentElementSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = { 1, 2, 3, 3, 4, 5, 5, 3, 6, 6, 8, 7, 7, 4, 3 };

		for (int i = 0; i < number.length; i++) {

			if ((i + 1) < number.length && number[i] == number[i + 1])
				System.out.println(number[i] + " " + i + " " + (i + 1));

		}
	}

}