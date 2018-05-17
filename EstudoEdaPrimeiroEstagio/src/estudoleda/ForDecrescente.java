package estudoleda;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

public class ForDecrescente {

	public static void main(String[] args) {
		
		int[] v = {2, 3, 4, 6, 12, 5, 13, 19};
		int leftIndex = 0;
		int rightIndex = v.length-1;
		
		int maior = 0;
		int menor = 0;
		boolean troca = false;
		while (leftIndex < rightIndex) {
			
			for (int i = rightIndex; i > leftIndex; i--) {
				if (v[i] < v[i-1]) {
					maior = i-1;
					menor = i;
					troca = true;					
				}
			}
			if(troca) {
			int aux = v[menor];
			v[menor] = v[maior];
			v[maior] = aux;
			}
			troca = false;
			rightIndex--;
		}
		System.out.println(Arrays.toString(v));
	}
}