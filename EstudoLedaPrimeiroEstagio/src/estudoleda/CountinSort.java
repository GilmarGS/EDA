package estudoleda;

import java.util.Arrays;

public class CountinSort {
	public static void main(String[] args) {
		
	int[] v = {7, 5, 2, 10, 3, 1, 8, 9};
	int maior = 0;
	for (int i = 0; i < v.length; i++) {
		if (v[i] > maior) {
			maior = v[i];
		}
	}
	countingSort(v, maior);
	System.out.println(Arrays.toString(v));
	}

	private static void countingSort(int[] v, int maior) {
		int[] c = new int[maior];
		
		for (int i = 0; i < v.length; i++) {
			c[v[i]-1] += 1;
		}
		
		for (int i = 1; i < c.length; i++) {
			c[i] += c[i-1];
		}
		
		int[] copy = new int[v.length];
		for(int i = v.length-1; i >=0 ; i--) {
			c[v[i]-1] --;
			copy[c[v[i]-1]] = v[i];
			
		}
		for (int i = 0; i < copy.length; i++) {
			v[i] = copy[i];
		}
	}

}
