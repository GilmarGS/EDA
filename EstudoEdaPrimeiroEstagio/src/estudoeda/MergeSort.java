package estudoleda;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] v = {7, 5, 2, 10, 4, 6, 3, 1, 8, 0, 9};
		int left = 0;
		int right = v.length-1;
		mergeSort(v, left, right);
		System.out.println(Arrays.toString(v));
	}

	private static void mergeSort(int[] v, int left, int right) {
		if (left < right) {
			int mid = (left + right)/2;
			mergeSort(v, left, mid);
			mergeSort(v, mid+1, right);
			merge(v, left, mid, right);
		}
		
	}

	private static void merge(int[] v, int left, int mid, int right) {
		int[] helper = new int[v.length];
		
		for (int i = 0; i < helper.length; i++) {
			helper[i] = v[i];
		}
		
		int i = left;
		int j = mid+1;
		int k = left;
		
		while (i  <= mid && j <= right) {
			if (helper[i] <= helper[j]) {
				v[k] = helper[i];
				i++;
			}else {
				v[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while(i <= mid) {
			v[k++] = helper[i++];
		}
		
		while (j <= right) {
			v[k++] = helper[j++];
		}
	}
}
