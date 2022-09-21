
public class PatternChristmasTree {

	public static void main(String[] args) { 
		
		int height = 5;

		for (int shapeduplication = 1; shapeduplication <= 2; shapeduplication++) {

			 for (int i = 1; i <= height; i++) {
		
				for (int space = 1; space <= height - i; space++) {
			         System.out.print(" ");
			    }
			    for (int star=1; star<=i*2-1; star++) {
			    	 System.out.print("*");
			    }
			    System.out.println();
		     }
		     }
		 for (int j = 0; j < 5; j++) {
		      System.out.println("    *");
	     }
   }
}

