import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementIndexReverseMtd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter total number of rows in the Matrix");
		int rows = sc.nextInt();
		System.out.println("Enter total number of columns in Matrix");
		int columns = sc.nextInt();
		int matrix[][] = new int[rows][columns];
		System.out.println("Enter the matrix values");
		
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix");
		for (int r []: matrix) { 
		System.out.println(Arrays.toString(r));
		}
		System.out.println("Enter Number of whose index you seek.");
		int a  = sc.nextInt();
		for (int i = rows-1; i >= 0; i--) {
			for (int j = columns-1; j>= 0; j--) {
				if(matrix[i][j] == a) {
					System.out.println(" Number's index is " + i + "," + j);
				} 
				
//				else { 
//					System.out.println("Number does not exist within Matrix");
//				}
			
			}

		}
			
	}
}
		//System.out.println(" Index is " + i + "," + j);

			

	

