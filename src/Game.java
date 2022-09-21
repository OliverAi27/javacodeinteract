import java.util.Scanner;
import java.util.Timer;

public class Game {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. What is the capital of Maldives?");
        System.out.println("1. Male");
        System.out.println("2. Kathmandu");
        System.out.println("3. New Delhi");
        System.out.println("4. Dhaka");
        System.out.println("Enter your choice:: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            score += 1;
            //            score = score + 1;
            //            score++;
        }
        //        else {
        //            System.out.println("Wrong Answer!!! \nFinal Score=" + score);
        //            System.exit(0);
        //        }

        /*
         * Add more questions and compute score
         */
  
        System.out.println("Q2. What is the capital of Nepal?");
        System.out.println("1. Singapore");
        System.out.println("2. Kathmandu");
        System.out.println("3. New Delhi");
        System.out.println("4. Dhaka");
        System.out.println("Enter your choice:: ");
        choice = sc.nextInt();

        if (choice == 2) {
            score += 1;}
            
        System.out.println("Q3. What is the capital of India?");
        System.out.println("1. Singapore");
        System.out.println("2. Kathmandu");
        System.out.println("3. New Delhi");
        System.out.println("4. Dhaka");
        System.out.println("Enter your choice:: ");
        choice = sc.nextInt();

        if (choice == 3) {
            score += 1;}
                
                
        System.out.println("Q4. What is the capital of Turkey?");
        System.out.println("1. Izmir");
        System.out.println("2. Kathmandu");
        System.out.println("3. New Delhi");
        System.out.println("4. Ankara");
        System.out.println("Enter your choice:: ");
        choice = sc.nextInt();

        if (choice == 1) {
            score += 1;}
        System.out.println("Q5. What is the capital of Bangladesh?");
        System.out.println("1. Singapore");
        System.out.println("2. Kathmandu");
        System.out.println("3. New Delhi");
        System.out.println("4. Dhaka");
        System.out.println("Enter your choice:: ");
        choice = sc.nextInt();

        if (choice == 4) {
                score += 1;}
                
        System.out.println("Q6. What is the capital of China?");
        System.out.println("1. Male");
        System.out.println("2. Beijing");
        System.out.println("3. Shanghai");
        System.out.println("4. Dhaka");
        System.out.println("Enter your choice:: ");
        choice = sc.nextInt();

        if (choice == 2) {
                score += 1;}
                    
                    
        System.out.println("Q7. What is the capital of Singapore?");
        System.out.println("1. Singapore");
        System.out.println("2. Kathmandu");
        System.out.println("3. New Delhi");
        System.out.println("4. Kuala Lumpur");
        System.out.println("Enter your choice:: ");
        choice = sc.nextInt();

        if (choice == 1) {
            score += 1;}
            
        System.out.println("Q8. What is 2^0?");
        System.out.println("1. 0");
        System.out.println("2. 1");
        System.out.println("3. 2");
        System.out.println("4. 20");
        System.out.println("Enter your choice:: ");
        choice = sc.nextInt();
        if (choice == 2) {
                score += 1;}
   
        System.out.println("Total Score is " + score +" out of 8");}

}