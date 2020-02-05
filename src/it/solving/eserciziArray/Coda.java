package it.solving.eserciziArray;

public class Coda {

	public static int[] aggiungiInCoda(int[] input, int numero) {
		int[] arrayLungo = new int[input.length + 1];
		for (int i = 0; i <= input.length; i++) {
			if (i < input.length)
				arrayLungo[i] = input[i];
			else
				arrayLungo[i] = numero;
		}

		return arrayLungo;
	}

	public static void main(String[] args) {

		int[] arrayProva = { 1, 2, 3, 4 };
		int numeroProva = 5;
		
		int[] arrayLungo = new int [arrayProva.length+1];
		
		arrayLungo = Coda.aggiungiInCoda(arrayProva, numeroProva);
		for (int i = 0; i < arrayProva.length + 1; i++) {
			System.out.println(arrayLungo[i]);
		}
	}

}
