package view;

import controller.OrdenacaoController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {2,0,1,3,7,8,5,4,9,6};
//		int[] vetor = {9,8,7,6,5,4,3,2,1,0};
		
		OrdenacaoController oCont = new OrdenacaoController();
//		vetor = oCont.bubbleSort(vetor);
		vetor = oCont.mergeSort(vetor, 0, vetor.length - 1);
		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");

	}

}
