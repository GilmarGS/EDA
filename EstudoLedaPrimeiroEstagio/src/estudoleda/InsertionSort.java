package estudoleda;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {02, 05, 06, 04, 13, 03, 12, 19};
		insertionSort(array);
		System.out.println(Arrays.toString(array));


	}

	private static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = i + 1;
			while (j > 0 && j < array.length-1) {
				if (array[j] < array[j-1]) {
					int aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;
				}
				j--;
			}
		}
		
	}

}
