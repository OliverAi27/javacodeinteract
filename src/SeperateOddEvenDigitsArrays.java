
public class SeperateOddEvenDigitsArrays {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] even = new int[10];
		int eind = 0;
		int[] odd = new int[10];
		int oind = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even[eind] = i;
				eind++;
			} else {
				odd[oind] = i;
				oind++;
			}

		}
		for (int i = 0; i < even.length; i++) {
			System.out.println(even[i]);
		}
		for (int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
	}
}