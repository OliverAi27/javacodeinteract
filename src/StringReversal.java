 
import java.io.*;
import java.util.Scanner;
  
class StringReversal {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
	String n = sc.nextLine(),nstr="";
      char ch;        
    System.out.println("Enter word/s "); //Example word
        
      for (int i=0; i<n.length(); i++
    		 )
      {
        ch= n.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
     }
     System.out.println("Reversed word: "+ nstr);
      
      if(nstr.equals(n)) {System.out.println ("string is palindrome.");}
      else {System.out.printf("%s is not a palindrome. \n");}
}


		// Java program to demonstrate conversion from
		// String to StringBuffer and reverse of string
		  
		        // conversion from String object to StringBuffer
//		        StringBuffer sbr = new StringBuffer(n);
//		        // To reverse the string
//		        sbr.reverse();
//		        System.out.println(sbr);
		    
		}
//}
//      char ch;
//      
//    System.out.println("Enter word/s "); //Example word
//      
//    for (int i=n.length(); i--
//  		 )
//    {
//      ch= n.charAt(i); //extracts each character
//      nstr= ch+nstr; //adds each character in front of the existing string
//    }
//    System.out.println("Reversed word: "+ nstr);
//  }
//}
// convert String to character array
// by using toCharArray
//char[] n = input.toCharArray();
//
//for (int i = n.length - 1; i >= 0; i--)
//    System.out.print(n[i]);
//}
//}