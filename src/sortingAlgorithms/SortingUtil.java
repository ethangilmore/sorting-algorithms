package sortingAlgorithms;

import java.util.Comparator;
import java.util.Random;

public class SortingUtil {
	public static <T> void swap(T[] arr, int a, int b) {
		if(a<0 || b<0 || a>arr.length || b>arr.length)
			throw new IllegalArgumentException("index is out of bounds");
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static Integer[] randomIntegerArray(int length, int bound) {
		Random r = new Random();
		Integer[] ints = new Integer[length];
		for(int i = 0; i < length; i++) {
			ints[i] = r.nextInt(bound);
		}
		return ints;
	}
	
	public static <T> boolean isSorted(T[] arr, Comparator<T> cmp) {
		for(int i = 0; i < arr.length-1; i++) {
			if(cmp.compare(arr[i], arr[i+1]) > 0) {
				return false;
			}
		}
		return true;
	}
}
