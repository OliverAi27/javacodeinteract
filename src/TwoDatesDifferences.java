import java.text.SimpleDateFormat;
import java.text.ParseException;
import java. util. Date;
import java.util.Scanner;

public class TwoDatesDifferences {

	public static void main(String[] args){
		//System.out.println(sDate1+date1);// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Date's year.");
		int y1 = sc.nextInt();
		System.out.println("Enter 1st date's month.");
		int m1 = sc.nextInt();
		System.out.println("Enter 1st date's days.");
		int d1 = sc.nextInt();
		System.out.println("Enter 2nd date's year.");
		int y2 = sc.nextInt();	
		System.out.println("Enter 2nd date's month.");
		int m2 = sc.nextInt();
		System.out.println("Enter 2nd date's days.");
		int d2 = sc.nextInt();
		int d3=0;
		int d4=0;
		if      (m1==1) d3=31;
		else if (m1==2) d3=28+31;
		else if (m1==3) d3=31+31+28;
		else if (m1==4) d3=30+31+31+28;
		else if (m1==5) d3=31+30+31+31+28;
		else if (m1==6) d3=30+31+30+31+31+28;
		else if (m1==7) d3=31+30+31+30+31+31+28;
		else if (m1==8) d3=31+31+30+31+30+31+31+28;
	    else if (m1==9) d3=30+31+31+30+31+30+31+31+28;
	    else if (m1==10)d3=31+30+31+31+30+31+30+31+31+28;
	    else if (m1==11)d3=30+31+30+31+31+30+31+30+31+31+28;
	    else            d3=31+30+31+30+31+31+30+31+30+31+31+28;
		int TotalDaysInyear1 = (y1 * 365) + d3 + d1;
		
		if      (m2==1) d4=31;
		else if (m2==2) d4=28+31;
		else if (m2==3) d4=31+31+28;
		else if (m2==4) d4=30+31+31+28;
		else if (m2==5) d4=31+30+31+31+28;
	    else if (m2==6) d4=30+31+30+31+31+28;
	    else if (m2==7) d4=31+30+31+30+31+31+28;
	    else if (m2==8) d4=31+31+30+31+30+31+31+28;
	    else if (m2==9) d4=30+31+31+30+31+30+31+31+28;
	    else if (m2==10)d4=31+30+31+31+30+31+30+31+31+28;
	    else if (m2==11)d4=30+31+30+31+31+30+31+30+31+31+28;
	    else            d4=31+30+31+30+31+31+30+31+30+31+31+28;
	    
			
		int TotalDaysInyear2 = y2 * 365 + d4 + d2;
		
        int Difference=TotalDaysInyear1- TotalDaysInyear2;
        
		int years = Difference / 365;
		int months = (Difference % 365) / 30;
		int days = (Difference % 365) % 7; 
		System.out.println("The difference between the two dates are " + years + " years " + months + " months " + days + " days.");

}
}