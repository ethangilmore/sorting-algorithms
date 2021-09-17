package sortingAlgorithms;

import java.util.Comparator;

public class SelectionSort {
	public static void main(String[] args) {
		Integer[] arr = SortingUtil.randomIntegerArray(100, 100);
		Comparator<Integer> cmp = (Integer a, Integer b) -> a-b;
	
		selectionSort(arr, cmp);
		
		System.out.println(SortingUtil.isSorted(arr, cmp));
	}
	
	public static <T> void selectionSort(T[] arr, Comparator<T> cmp) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			T minVal = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(cmp.compare(arr[j], minVal) < 0) {
					minIndex = j;
					minVal = arr[j];
				}
			}
			SortingUtil.swap(arr, i, minIndex);
		}
	}
}
