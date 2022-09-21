import java.util.Scanner;

public class MultiplicationTableOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number for Multiplication Table.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter number of multiplications to be shown.");
		int a = sc.nextInt();
//for(int i=1; i<=a; i++)
//System.out.println(i + " * "+n+" = "+i*n); 
//System.out.printf("%d * %d=%d /n", n, i, n *i);

		int i = 1;
		// TODO Auto-generated method stub
		while (i <= a) {
			int b = n * i;
			{
				System.out.println("Multiples of are " + b);
			}
			i++;

		}
	}
}

//System.out.print("Multiplication table\n");
//for(int i=1; i<=a; i++){ 
//    for(int j=1; j<=a; j++){
//     System.out.print(i*j+"\t");
//            }
//            System.out.println();
//        }
//    }
//}

//public static void main(String[] args) {
//    int tableSize = 9;
//    printMultiplicationTable(tableSize);
//}
// 
//public static void printMultiplicationTable(int tableSize) {
//    // first print the top header row
//    System.out.format("      ");
//    for(int i = 1; i<=tableSize;i++ ) {
//        System.out.format("%4d",i);
//    }
//    System.out.println();
//    System.out.println("------------------------------------------");
//     
//    for(int i = 1 ;i<=tableSize+1;i++) {
//        // print left most column first
//        System.out.format("%4d |",i);
//        for(int j=1;j<=tableSize+1;j++) {
//            System.out.format("%4d",i*j);
//        }
//        System.out.println();
//    }
//}
// 
//}