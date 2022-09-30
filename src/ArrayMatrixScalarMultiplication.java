import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatrixScalarMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter total number of rows in the Matrix");
		int rows1 = sc.nextInt();
		System.out.println("Enter total number of columns in Matrix");
		int columns1 = sc.nextInt();
		int matrix1[][] = new int[rows1][columns1];
		System.out.println("Enter the matrix values");
		for (int i = 0; i<rows1; i++) {
			for (int j = 0; j<columns1; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix");
		
		for (int r []: matrix1) { 
		System.out.println(Arrays.toString(r));
		}
		System.out.println("Enter the scalar multiplication value");
		int a = sc.nextInt();
		int scalarmultiplication[][] = new int[rows1][columns1];
		for (int i = 0; i<rows1; i++) {
			for (int j = 0; j<columns1; j++) {
					scalarmultiplication[i][j] = matrix1[i][j] * a;
				}
			
	}

		System.out.println("Result of Scalar Multiplication");
		for (int o []: scalarmultiplication) { 
			System.out.println(Arrays.toString(o));
			
			}
	}
}
