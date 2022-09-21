import java.util.Scanner;

public class ArraysConatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//enter number count of words
//enter words consecutively until word count
//add each words using a + 
//display
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Array");
		int[] a = {10,20,30,40};
		int[] b = {50,60,70,80};
		int a1=a.length;
		int b1=b.length;
		
		for (int i = 0; i < a1; i = i++) { 
			System.out.println(a[i]);
		}
		for (int i = 0; i < b1; i = i++) {
			System.out.println(b[i]);	
		} 
		int c1=a1+b1;
		int[] result = new int[newArrayLength];
		int idx = 0; 
		
		for (int i = 0; i < c1; i++)
			System.out.println(c1[i]);
	}
}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		int newArrayLength = a.length + b.length;
		int[] result = new int[newArrayLength];
		
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			int member = a[i];
			result[index] = member;
			index++;
		}
		
		System.out.println("Index value after appending array A::" + index);
		
		for (int i = 0; i < b.length; i++) {
			int member = b[i];
			//			result[a.length + i] = member;
			result[index] = member;
			//			index++;
		}
		
		System.out.println("----------Printing Result-----------");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
}		
		
		
		

//public static void main(String args[])   
//{  
//String str1[] = { "A", "E", "I" };          //source array  
//String str2[] = { "O", "U" };               //destination array  
//List list = new ArrayList(Arrays.asList(str1)); //returns a list view of an array  
////returns a list view of str2 and adds all elements of str2 into list  
//list.addAll(Arrays.asList(str2));     
//Object[] str3 = list.toArray();         //converting list to array  
//System.out.println(Arrays.toString(str3));  //prints the resultant array  
//}  
//}  	
		


//mport java.util.stream.Stream;   
//import java.util.Arrays;   
//import java.io.*;   
//public class MergeArrayExample5  
//{   
//// function to merge two arrays  
//public static <T> Object[] mergeArray(T[] arr1, T[] arr2)   
//{   
//return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();   
//}   
//public static void main (String[] args)    
//{   
//Integer[] firstArray = new Integer[]{13,12,11,6,9,3}; //source array  
//Integer[] secondArray = new Integer[]{78,34,56,67,2,11,7}; //destination array  
//Object[] mergedArray = mergeArray(firstArray,secondArray); //merged array  
//System.out.println("Merged array: "+ Arrays.toString(mergedArray));   
//}   
//}  




