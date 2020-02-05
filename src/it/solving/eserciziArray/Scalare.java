package it.solving.eserciziArray;

public class Scalare {

	public static int calcolaScalare(int numero, int[] input) {
		int appoggio = 0;
		for (int i = 0; i < input.length; i++) {
			appoggio = appoggio + (input[i] * numero);
		}
		return appoggio;
	}

	public static void main(String[] args) {

		int numeroProva = 2;
		int[] arrayProva = { 3, 4, 5, 6 };

		System.out.println(Scalare.calcolaScalare(numeroProva, arrayProva));
	}

}
