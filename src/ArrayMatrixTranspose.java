
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMatrixTranspose {
	
	public static void main(String[] args) {
				
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter total number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter total number of columns");
		int columns = sc.nextInt();
		
		int matrix[][] = new int[rows][columns];
		int transposedmatrix [][] = new int [columns][rows];
		
		System.out.println("Enter the matrix values");
				
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entered Matrix");
		
		for (int r []: matrix) { 
		System.out.println(Arrays.toString(r));
		}	
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++) {
				transposedmatrix [j][i] = matrix[i][j];
			}
		}
		System.out.println("Transposed Matrix");
		
		for (int r []: transposedmatrix) { 
		System.out.println(Arrays.toString(r));

	}

}
}