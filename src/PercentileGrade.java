import java.util.Scanner;

public class PercentileGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Score");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			if(100>n && n>=90) {
				        System.out.println( " Grade A");}
			else if(91>n && n>=70) {
						System.out.println(" Grade B");}
			else if(71>n & n>=50) {
						System.out.println(" Grade C");}
			else {
						System.out.println(" Grade D");}
				        }

}
