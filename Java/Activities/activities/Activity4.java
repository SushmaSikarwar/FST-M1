package activities;

import java.util.Arrays;

public class Activity4 {
	
	
	static void insertionSort(int[] array) {
		
		int size = array.length;
		
			for (int i = 1; i < size; i++) {
			
				int key = array[i];
				int j = i-1;
				
				while (j >= 0 && key < array[j]) {
					
					array [j+1] = array [j];
					
					--j;
				}
			
				array[j + 1] = key;		
			
		}
	}	
	
	public static void main(String[] args) {
		
		int[] array = { 18, 11, 12, 19, 15};
		
		System.out.println("Array before Sorting:");
		
		System.out.println(Arrays.toString(array));
		
		insertionSort(array);
		
		System.out.println("Array after Sorting:");
		
		System.out.println(Arrays.toString(array));
				
	}

}