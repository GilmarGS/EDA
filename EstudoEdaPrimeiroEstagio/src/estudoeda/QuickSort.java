package estudoleda;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] v = {7, 5, 2, 10, 4, 6, 3, 1, 8, 0, 9};
		int left = 0;
		int right = v.length-1;
		quickSort(v, left, right);
		System.out.println(Arrays.toString(v));
	}

	private static void quickSort(int[] v, int left, int right) {
		if (left < right) {
			int indexPivot = partition(v, left, right);
			quickSort(v, left, indexPivot);
			quickSort(v, indexPivot+1, right);
		}
		
	}

	private static int partition(int[] v, int left, int right) {
		int indexPivot = left;
		int pivot = v[indexPivot];
		
		for (int i = left+1; i < v.length; i++) {
			if (v[i] < pivot) {
				indexPivot += 1;
				swap(v, indexPivot, i);
			}
		}
		swap(v, left, indexPivot);
		return pivot;
	}

	private static void swap(int[] v, int first, int second) {
		int aux = v[first];
		v[first] = v[second];
		v[second] = aux;
		
	}
}
