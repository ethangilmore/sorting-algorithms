package sortingAlgorithms;

import java.util.Comparator;

public class InsertionSort {
	public static void main(String[] args) {
		Integer[] arr = SortingUtil.randomIntegerArray(100, 100);
		Comparator<Integer> cmp = (Integer a, Integer b) -> a-b;
	
		insertionSort(arr, cmp);
		
		System.out.println(SortingUtil.isSorted(arr, cmp));
	}
	
	public static <T> void insertionSort(T[] arr, Comparator<T> cmp) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(cmp.compare(arr[j], arr[j-1]) > 0)
					break;
				SortingUtil.swap(arr, j, j-1);
			}
		}
	}
}
