import java.util.Scanner;

public class ArraysInsertElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of Array");
	int a = sc.nextInt();
	System.out.println("Enter Array of 4 numbers.");
	int []array = new int[a+1];
	for (int i = 0; i<array.length-1; i++) {
		array[i]=sc.nextInt();
	}
	System.out.println("Array before insert");
	for (int i : array) {
	System.out.println(i);
	}
	System.out.println("Enter the index of insert number.");
	int index = sc.nextInt();
	System.out.println("Enter the value of insert number.");
	int numvalue = sc.nextInt();
	
	for (int i=array.length-1; i>index; i--) {
		array[i] = array[i-1];
	}
	array[index]=numvalue;
	
	for(int i : array) {
		System.out.println(i);
	}
	}
	}