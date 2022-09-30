import java.util.Arrays;
import java.util.Scanner;
public class ArrayMatrixAddition {
	
	public static void main(String[] args) {
				
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter number of rows of the Matrices");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns of the Matrices");
		int columns = sc.nextInt();
		
		int matrix1[][] = new int[rows][columns];
		int matrix2[][] = new int[rows][columns];
		int sum[][] = new int[rows][columns];
		
		System.out.println("Enter the 1st matrix values");
				
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the 2nd matrix values");
				
		for (int a = 0; a<rows; a++) {
			for (int b = 0; b<columns; b++) {
				matrix2[a][b] = sc.nextInt();
			}
		}	
		
		System.out.println("1st Matrix");
		
		for (int r []: matrix1) { 
		System.out.println(Arrays.toString(r));
		}
		
		System.out.println("2nd Matrix");	
		
		for (int r []: matrix2) {
		System.out.println(Arrays.toString(r));
		}
			
		for (int d = 0; d<rows; d++) {
			for (int e = 0; e<columns; e++) {
				sum[d][e] = matrix1[d][e] + matrix2[d][e];	
			}
		}
			System.out.println("1st Matrix + 2nd Matrix");
			for (int r []: sum) { 
				System.out.println(Arrays.toString(r));
		

	}

}
}