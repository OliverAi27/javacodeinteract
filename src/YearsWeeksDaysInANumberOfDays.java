import java.util.Scanner;

public class YearsWeeksDaysInANumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days");
		int z = sc.nextInt();
		int years = z / 365;
		int weeks = (z % 365) / 7;
		int days = (z % 365) % 7; 
		System.out.println(z + " days can be grouped as " + years + " years " + weeks + " weeks " + days + " days.");}


}