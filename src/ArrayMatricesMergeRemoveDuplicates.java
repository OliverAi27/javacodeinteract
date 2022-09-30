 
public class ArrayMatricesMergeRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = {1,2,3,4,5,6,7};
		int [] array2 = {5,6,7,8,9,10};
		int [] merged = new int[array1.length+array2.length];
		int c = 0;
		
		for (int i = 0; i<array1.length; i++) {
			merged[i] = array1[i];
			c++;
		}
		for (int j = 0; j<array2.length; j++) {
			merged[c++] = array2[j];
		}
		for (int i = 0; i<merged.length; i++) {
			System.out.print(merged[i]);
		}
}
}
 