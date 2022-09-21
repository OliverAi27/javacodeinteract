import java.util.Arrays;

public class ArrayMergeRemoveDuplicateNumbers {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 4, 5, 2 };
		int[] mergedarray = new int[array1.length + array2.length];
		int pos = 0;
		int filteredarray[] = new int[mergedarray.length];

		for (int i = 0; i < array1.length; i++) {
			mergedarray[pos++] = array1[i];

		}
		int count = array1.length;
		for (int j = 0; j < array2.length; j++) {
			mergedarray[count] = array2[j];
			count++;

		}
		System.out.println(Arrays.toString(mergedarray));

		int o = 0;
		for (int p = 0; p < mergedarray.length; p++) {
			// System.out.println(p);
			if (p + 1 < mergedarray.length) {
				if (mergedarray[p] != mergedarray[p + 1]) {
					filteredarray[o++] = mergedarray[p];
				}
			}
		}
		filteredarray[o++] = mergedarray[mergedarray.length - 1];
		for (int q = 0; q < o; q++) {
			System.out.println(filteredarray[q]);
		}

//		import java.util.Scanner;
//
//		public class RemoveDuplicateElementAndAdd {
//
//		    public static void main(String[] args) {
//		        System.out.println("Enter total size of Array");
//		        Scanner scan = new Scanner(System.in);
//		        int size = scan.nextInt();
//		        int[] num = new int[size];
//		        for (int i = 0; i < num.length; i++) {
//		            System.out.println("Enter numbers in Array");
//		            num[i] = scan.nextInt();
//
//		        }
//		        int[]arrayfilter = new int[num.length];
//		        int index = 0;
//
//		        for (int i = 0; i < num.length; i++) {
//		            boolean duplicate = true;
//		            for(int j = i + 1; j < num.length; j++) {
//		                if (num[i] != num[j]) {
//		                    duplicate = false;
//
//		                }
//		                else {
//		                    duplicate = true;
//		                    break;
//		                }
//
//		            }
//		            if(i == num.length -1) {
//		                duplicate = false;
//		            }
//
//
//		            if(duplicate == false) {
//		                arrayfilter[index ++] = num[i];
//
//		            }
//
//		        }
//		        for (int j = 0; j < num.length; j++) {
//		            System.out.println(arrayfilter[j]);
//		        }
//		    }
//		}

	}
}