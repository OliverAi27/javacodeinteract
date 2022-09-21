import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		int n = 1;// TODO Auto-generated method stub
		while (n <= 100) {
			if (n % 11 == 0) {
				System.out.println("Multiples of 11 are " + n);
			}
			n += 1;
		}
	}
}

//public class LoopDemo {
//
//    public static void main(String[] args) {
//        int n = 1;
//
//        //        while (n <= 100) {
//        //            if (n % 11 == 0) {
//        //                System.out.println(n);
//        //            }
//        //            n = n + 1;
//        //        }
//
//        String a = "apple";
//
//        int index = 0;
//        int length = a.length();
//        System.out.println(length);
//
//        while (index < length) {
//            System.out.println(a.charAt(index));
//            index++;
//        }
//
//
//
//    }
//
//}


//package level_1;
//
//import java.util.Scanner;
//
///*
// * Program to find prime and composite number within a range
//Expand
//PrimeCompostieWithRange.java
//﻿
//package level_1;
//
//
//public class LoopDemo1 {
//	
//	public static void main(String[] args) {
//		
//		//				for (int i = 10; i >= 1; i--) {
//		//					System.out.println(i);
//		//				}
//		
//		//		int i = 10;
//		//		while (i >= 1) {
//		//			System.out.println(i);
//		//			i--;
//		//		}
//		
//		for (int i = 1; i <= 10; i++) {
//			if (i % 3 == 0 || i % 2 == 0) {
//				System.out.println("About to call continue");
//				continue;
//				//				System.out.println("About to call break");
//				//				break;
//			}
//			System.out.println("Outside if condition");
//			System.out.println(i);
//			
//		}
//		System.out.println("Outside loop");
//		
//	}
//}
