package Activities;

import java.util.Arrays;

public class Activiy4 {

	
	
	

//	    // Method to perform insertion sort on an array
//	    public static void insertionSort(int[] arr) {
//	        int n = arr.length;
//
//	        for (int i = 1; i < n; i++) {
//	            int key = arr[i];       // Element to be inserted
//	            int j = i - 1;
//
//	            // Move elements of arr[0..i-1] that are greater than key
//	            // one position ahead to make space for key
//	            while (j >= 0 && arr[j] > key) {
//	                arr[j + 1] = arr[j];
//	                j--;
//	            }
//
//	            arr[j + 1] = key; // Insert the key at the correct position
//	        }
//	    }
//
//	    // Utility method to print the array
//	    public static void printArray(int[] arr) {
//	        for (int num : arr) {
//	            System.out.print(num + " ");
//	        }
//	        System.out.println();
//	    }
//
//	    // Main method to test the insertion sort
//	    public static void main(String[] args) {
//	        int[] data = { 9, 5, 1, 4, 3 };
//
//	        System.out.println("Original array:");
//	        printArray(data);
//
//	        insertionSort(data);
//
//	        System.out.println("Sorted array:");
//	        printArray(data);
//	    }
//	}
//
//
	
	
	    static void ascendingSort(int array[]) {
	        int size = array.length, i;
	        
	        for (i = 1; i < size; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < array[j]) {
	                array[j + 1] = array[j];
	                --j;
	            }
	            array[j + 1] = key;
	        }
	    }
	    
	    public static void main(String args[]) {
	        int[] data = { 9, 5, 1, 4, 3 };
	        ascendingSort(data);
	        System.out.println("Sorted Array in Ascending Order: ");
	        System.out.println(Arrays.toString(data));
	    }
	}

