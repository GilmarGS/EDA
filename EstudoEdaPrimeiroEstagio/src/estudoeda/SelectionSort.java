package estudoleda;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {02, 05, 06, 04, 13, 03, 12, 19};
		selectionSort(array);
		System.out.println(Arrays.toString(array));

	}

	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int menor = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[menor] > array[j]) {
					menor = j;
				}
			}
			int aux = array[menor];
			array[menor] = array[i];
			array[i] = aux;
		}
		
	}

}
