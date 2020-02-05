package it.solving.eserciziArray;

public class ArrayUnito {

	public static int[] creaUnione(int[] input1, int[] input2) {
		int[] unioneArray = new int[input1.length + input2.length];
		for (int i = 0; i < input1.length; i++) {
			unioneArray[i] = input1[i];
		}

		for (int i = input1.length; i < unioneArray.length; i++) {
			unioneArray[i] = input2[i - input1.length];
		}
		return unioneArray;
	}

	public static void main(String[] args) {

		int[] primoArray = { 1, 2, 3, 4 };
		int[] secondoArray = { 5, 6, 7, 8 };

		for (int i = 0; i < primoArray.length + secondoArray.length; i++) {
			System.out.println(ArrayUnito.creaUnione(primoArray, secondoArray)[i]);
		}

	}

}
