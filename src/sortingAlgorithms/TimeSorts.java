package sortingAlgorithms;

public class TimeSorts {
	public static void main(String[] args) {
		InsertionSort sorter = new InsertionSort();
		
		for(int n = 1000; n <= 25000; n += 1000) {
			long time = SortingUtil.timeSort(sorter, n, 1000);
			System.out.println(n+"\t"+time);
		}
	}
}
