import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter total number of rows in the array1");
		int rows1 = sc.nextInt();
		System.out.println("Enter total number of columns array1");
		int columns1 = sc.nextInt();
		int data1[][] = new int[rows1][columns1];
		System.out.println("Enter the matrix1 values");
		
		for (int i = 0; i<rows1; i++) {
			for (int j = 0; j<columns1; j++) {
				data1[i][j] = sc.nextInt();
			}
		
//		for (int i = 0; i<rows; i++) {
//			for (int j = 0; j<columns; j++) {
//				System.out.print(data[i][j]+"");
//			}
//			System.out.println();
			
			
//		int [] set3 = set1 * set2;
//		set3[i] = size2;
//		for (int i = 0; i<size3; i++) {
//			System.out.println("Enter the values");
//			int values1 = sc.nextInt();
//			set3[i] = values3;
//	}
//		System.out.println(set3);
//		}
		
		System.out.println(Arrays.deepToString(data1));
		
		System.out.println("Enter total number of rows in the array2");
		int rows2 = sc.nextInt();
		System.out.println("Enter total number of columns array2");
		int columns2 = sc.nextInt();
		int data2[][] = new int[rows2][columns2];
		System.out.println("Enter the matrix2 values");
		
		for (int a = 0; a<rows2; a++) {
			for (int b = 0; b<columns2; b++) {
				data2[a][b] = sc.nextInt();
			}
			
		System.out.println(Arrays.deepToString(data2));
		
		data3[d][e] = new int [data1 * data2];
		for (int d = 0; d<rows2; d++) {
			for (int e = 0; e<columns2; e++) {
				
			}
		System.out.println(Arrays.deepToString(data3));

}
}