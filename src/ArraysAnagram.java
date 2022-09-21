import java.util.Arrays;

public class ArraysAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Keep";
String str2="Peek";
str1=str1.toLowerCase();
str2=str2.toLowerCase();
char[] str1Array=str1.toCharArray();
Arrays.sort(str1Array);
System.out.println(str1Array);
char[] str2Array=str2.toCharArray();
Arrays.sort(str2Array);
System.out.println(str2Array);
str1=String.valueOf(str1Array);
str1=String.valueOf(str1Array);
if(str1.equals(str2Array)) {System.out.println("Strings are anagram.");
	}
else {System.out.println("Strings are not anagram");
}
	
	}
}
