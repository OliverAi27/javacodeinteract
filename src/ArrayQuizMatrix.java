import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
//
//public class ArrayQuizMatrix {
//
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1 to start.");
//        System.out.println("Enter any num to exit.");
//        int start = sc.nextInt();
//        if (start==1) {
//        	System.out.println("Lets Begin!");
//        }
//       // else {
//       // 	System.out.println("Thanks for trying!");
//       // }
//        int score = 0;
//        
//        System.out.println("Q1. What is the capital of Maldives?");
//        String []Maldives = {"1. Male", "2. Kathmandu","3. New Delhi","4. Dhaka"};
//        for (int i = 0; i<Maldives.length; i++) 
//			System.out.println(Maldives[i]);
//        System.out.println("Enter your choice:: ");
//        int choice = sc.nextInt();
//
//        if (choice == 1) {
//            score += 1;
//        }
//     
//        System.out.println("Q2. What is the capital of Nepal?");
//        String [] Nepal = {"1. Singapore", "2. Kathmandu","3. New Delhi","4. Dhaka"};
//        for (int i = 0; i<Nepal.length; i++) 
//			System.out.println(Nepal[i]);
//        System.out.println("Enter your choice:: ");
//        choice = sc.nextInt();
//
//        if (choice == 2) {
//            score += 1;}
//            
//        System.out.println("Q3. What is the capital of India?");
//        String [] India = {"1. Singapore","2. Kathmandu","3. New Delhi","4. Dhaka"};
//        for (int i = 0; i<India.length; i++) 
//			System.out.println(India[i]);
//        System.out.println("Enter your choice:: ");
//        choice = sc.nextInt();
//
//        if (choice == 3) {
//            score += 1;}
//                
//                
//        System.out.println("Q4. What is the capital of Turkey?");
//        String [] Turkey = {"1. Izmir","2. Kathmandu","3. New Delhi","4. Ankara"};
//        for (int i = 0; i<Turkey.length; i++) 
//			System.out.println(Turkey[i]);
//        System.out.println("Enter your choice:: ");
//        choice = sc.nextInt();
//
//        if (choice == 1) {
//            score += 1;}
//        System.out.println("Q5. What is the capital of Bangladesh?");
//        String [] Bangladesh = {"1. Singapore","2. Kathmandu","3. New Delhi","4. Dhaka"};
//        for (int i = 0; i<Bangladesh.length; i++) 
//			System.out.println(Bangladesh[i]);
//        System.out.println("Enter your choice:: ");
//        choice = sc.nextInt();
//
//        if (choice == 4) {
//                score += 1;}
//                
//        System.out.println("Q6. What is the capital of China?");
//        String [] China = {"1. Male","2. Beijing","3. Shanghai","4. Dhaka"};
//        for (int i = 0; i<China.length; i++) 
//			System.out.println(China[i]);
//        System.out.println("Enter your choice:: ");
//        choice = sc.nextInt();
//
//        if (choice == 2) {
//                score += 1;}
//                    
//                    
//        System.out.println("Q7. What is the capital of Singapore?");
//        String [] Singapore = {"1. Singapore", "2. Kathmandu","3. New Delhi","4. Kuala Lumpur"};
//        for (int i = 0; i<Singapore.length; i++) 
//			System.out.println(Singapore[i]);
//        System.out.println("Enter your choice:: ");
//        choice = sc.nextInt();
//
//        if (choice == 1) {
//            score += 1;}
//            
//        System.out.println("Q8. What is 2^0?");
//        String [] Power = {"1. 0","2. 1","3. 2","4. 20"};
//        for (int i = 0; i<Power.length; i++) 
//			System.out.println(Power[i]);
//        System.out.println("Enter your choice:: ");
//        choice = sc.nextInt();
//        if (choice == 2) {
//                score += 1;}
//   
//        System.out.println("Total Score is " + score +" out of 8");}
//	
//
//}
//
public class ArrayQuizMatrix {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to start.");
        System.out.println("Enter any num to exit.");
        int start = sc.nextInt();
        if (start==1) {
        	System.out.println("Lets Begin!");
        }
       // else {
       // 	System.out.println("Thanks for trying!");
       // }
        int score = 0;
        String Q1 = "Q1. What is the capital of Maldives?";
        String Q2 = "Q2. What is the capital of Nepal?";
        String Q3 = "Q3. What is the capital of India?";
        String Q4 = "Q4. What is the capital of Turkey?";
        String Q5 = "Q5. What is the capital of Bangladesh?";
        String Q6 = "Q6. What is the capital of China?";
        String Q7 = "Q7. What is the capital of Singapore?";
        String Q8 = "Q8. What is 2^0?";
        String A1 = "1. Male", "2. Kathmandu","3. New Delhi", "4. Dhaka";
        String [][]QA = {Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8}{{"1. Male", "2. Kathmandu","3. New Delhi","4. Dhaka"}};
        for (int i = 0; i<Questions.length; i++) {
        System.out.println(Questions[i]);
        String []Answers = {"1. Male", "2. Kathmandu","3. New Delhi","4. Dhaka"};
        for (int i = 0; i<Answers.length; i++) 
			System.out.println(Answers[i]);
        System.out.println("Enter your choice:: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            score += 1;
        }
}
}