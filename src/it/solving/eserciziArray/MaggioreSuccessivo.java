package it.solving.eserciziArray;

public class MaggioreSuccessivo {

	public static boolean verificaMaggioreSuccessivo(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] < input[i + 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arrayProva = { 3, 7, 5, 1 };

		System.out.println(MaggioreSuccessivo.verificaMaggioreSuccessivo(arrayProva));
	}

}
