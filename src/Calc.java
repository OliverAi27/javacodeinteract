import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

        char operator;
        double num1, num2;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the operation( +, -, *, /)");
        operator = input.next().charAt(0);

        System.out.println("Enter the two numbers one by one");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        input.close();

        switch( operator ) {
        case '+':
        System.out.printf("%.1f + %.1f = %.1f" , num1,num2,(num1+num2));
                break;

        case '-':
        System.out.printf("%.1f - %.1f = %.1f" , num1,num2,(num1-num2));
                break;

        case '*':
        System.out.printf("%.1f * %.1f = %.1f" , num1,num2,(num1*num2));
                break;

        case '/':
            if(num2 !=0)
            	System.out.printf("%.1f %.1f = %.1f" , num1,num2,(num1/num2));
            else
                System.out.printf("%c is an invalid operator",operator);

                    break;


        } //ask how this works with this formula ( %.if )


    }

}