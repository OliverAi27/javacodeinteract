import java.util.Scanner;

public class FibonaciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter total numbers");
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	int first = 0;
	int second = 1;
	int third = 0;
	System.out.println(first);
	System.out.println(second);
	
	for(int i = 0; i<count-2; i++) {
		third = first + second;
		first = second;
		second = third;
		
	System.out.println(third);}
	}

}
