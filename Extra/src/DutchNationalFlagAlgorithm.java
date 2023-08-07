import java.util.*;
/*
 * This problem is a variation of the popular Dutch National flag algorithm. 

This algorithm contains 3 pointers i.e. low, mid, and high, and 3 main rules.  The rules are the following:

arr[0….low-1] contains 0. [Extreme left part]
arr[low….mid-1] contains 1.
arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
 */
public class DutchNationalFlagAlgorithm {
	 public static void sortArray(ArrayList<Integer> arr, int n) {
	        int low = 0, mid = 0, high = n - 1; // 3 pointers

	        while (mid <= high) {
	            if (arr.get(mid) == 0) {
	                // swapping arr[low] and arr[mid]
	                int temp = arr.get(low);
	                arr.set(low, arr.get(mid));
	                arr.set(mid, temp);

	                low++;
	                mid++;

	            } else if (arr.get(mid) == 1) {
	                mid++;

	            } else {
	                // swapping arr[mid] and arr[high]
	                int temp = arr.get(mid);
	                arr.set(mid, arr.get(high));
	                arr.set(high, temp);

	                high--;
	            }
	        }
	    }

	    public static void main(String args[]) {
	        int n = 6;
	        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
	        sortArray(arr, n);
	        System.out.println("After sorting:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr.get(i) + " ");
	        }
	        System.out.println();

	    }

}
