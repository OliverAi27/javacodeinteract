import java.util.Arrays;
import java.util.Scanner;
public class ArrayMatrixAddition {
	
	public static void main(String[] args) {
				
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter total number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter total number of columns");
		int columns = sc.nextInt();
		
		int matrix1[][] = new int[rows][columns];
		int matrix2[][] = new int[rows][columns];
		int sum[][] = new int[rows][columns];
		
		System.out.println("Enter the matrix1 values");
				
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the matrix2 values");
				
		for (int a = 0; a<rows; a++) {
			for (int b = 0; b<columns; b++) {
				matrix2[a][b] = sc.nextInt();
			}
		}	
		
		System.out.println("matrix1");
		
		for (int r []: matrix1) { 
		System.out.println(Arrays.toString(r));
		}
		
		System.out.println("matrix2");	
		
		for (int r []: matrix2) {
		System.out.println(Arrays.toString(r));
		}
		
		System.out.println("Sum of the 2 matrices = "  );
			
		for (int d = 0; d<rows; d++) {
			for (int e = 0; e<columns; e++) {
				sum[d][e] = matrix1[d][e] / matrix2[d][e];	
				System.out.print(sum[d][e] + " ");
			}
			System.out.println();
		}	

	}

}