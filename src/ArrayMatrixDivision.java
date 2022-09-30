import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatrixDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter total number of rows in the 1st Matrix for Matrix/Matrix calculation");
		int rows1 = sc.nextInt();
		System.out.println("Enter total number of columns in 1st Matrix");
		int columns1 = sc.nextInt();
		int matrix1[][] = new int[rows1][columns1];
		System.out.println("Enter the matrix values");
		
		for (int i = 0; i<rows1; i++) {
			for (int j = 0; j<columns1; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter total number of rows in the 2nd Matrix for Matrix/Matrix calculation");
		int rows2 = sc.nextInt();
		System.out.println("Enter total number of columns in 2nd Matrix");
		int columns2 = sc.nextInt();
		int matrix2[][] = new int[rows2][columns2];
		System.out.println("Enter the matrix values");
		
		for (int i = 0; i<rows2; i++) {
			for (int j = 0; j<columns2; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println(" 1st Matrix ");
		
		for (int r []: matrix1) { 
		System.out.println(Arrays.toString(r));
		}
		System.out.println(" 2nd Matrix ");
		
		for (int p []: matrix2) { 
		System.out.println(Arrays.toString(p));
		
		}
		int matrix3[][] = new int[rows1][columns2];
		for (int i = 0; i<rows1; i++) {
			for (int j = 0; j<columns2; j++) {
				for (int k = 0; k<columns1; k++) {
					matrix3[i][j] = matrix1[i][k]/matrix2[k][j];
				}
			
	}
}
		System.out.println(" Result of 2 Matrixes Division");
		for (int o []: matrix3) { 
			System.out.println(Arrays.toString(o));
			
			}
	}
}
