import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) { 
	        	System.out.println("Enter 1st Number");
	    		Scanner sc = new Scanner(System.in);
				int n1 = sc.nextInt();
				System.out.println("Enter 2nd Number");
				int n2 = sc.nextInt();
				System.out.println("Enter 3rd Number");
				int n3 = sc.nextInt();
				if (n3<n1 && n3>n2) {
					System.out.println(n1+" is the greatest number");}
				else if (n3<n2 && n2>n1){
					System.out.println(n2+"is the greatest number");}
				else {
					System.out.println(n3+"is the greatest number");}
				}
	
}

// TODO Auto-generated method stub


