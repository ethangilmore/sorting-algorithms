package sortingAlgorithms;

import java.util.Comparator;

public class InsertionSort implements Sorter{
	public <T> void sort(T[] arr, Comparator<T> cmp) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(cmp.compare(arr[j], arr[j-1]) > 0)
					break;
				SortingUtil.swap(arr, j, j-1);
			}
		}
	}
}
