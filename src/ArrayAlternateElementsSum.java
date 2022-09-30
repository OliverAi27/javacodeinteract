
public class ArrayAlternateElementsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		int sum2 = 0;
		int []array = {1,2,3,4,5,6};
		for (int i = 0; i < array.length; i++ ) {
			if (i % 2 ==0) {
				sum1 = sum1 + array[i];
			}
			else {
				sum2 = sum2 + array[i];
			}
		}
		System.out.println("Sum of 1st number alternates is " +sum1);
		System.out.println("Sum of 2nd number alternates is " +sum2);

	}

}
