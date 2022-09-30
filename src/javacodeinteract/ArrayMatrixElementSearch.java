package javacodeinteract;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayMatrixElementSearch {
	
	public static void main(String[] args) {
		int matrix [][] = {{1,2,3},{4,5,6},{7,8,9}};		
		System.out.println("Enter the number whose index is to be returned");
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				if ( matrix[i][j] == a ) {
					System.out.println("Number found at index6(" + i + "," + j + ").");
				}
			}
		}	

	}

}