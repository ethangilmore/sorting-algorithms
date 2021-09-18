package sortingAlgorithms;

import java.util.Comparator;

public class SelectionSort implements Sorter {
	public <T> void sort(T[] arr, Comparator<T> cmp) {
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
