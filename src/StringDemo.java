import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {

	public static void main(java.lang.String[] args) {
	String name = "Ramesh";
	System.out.println(name.toUpperCase());// TODO Auto-generated method stub
	System.out.println(name.equalsIgnoreCase("ramesh"));
	System.out.println(name.equals("ramesh"));
	
	for(int i= name.length()-1;i>=0;i--) {
		System.out.println(name.charAt(i));
	}
	
	String[]values=name.split("m");
	System.out.println(values);
	for(int i=0; i<=values.length-1; i++) {System.out.println(values[i]);
	}
	}
}
//
//name=name.trim();
//System.out.println(name);
//
//concat = +
//name=name.concat("");
//boolean result=name.contains("ame");
//sysoutprintln(result);
//
//name="";
//result= name.isEmpty();
//sysout"(result)"
//
//name=name.replace("a","x")
//sysout(name)
//
//stringbuffer buffer=newstringbuffer(name);
//
//buffer.append("address");
//print("buffer=""+buffer);
//		
