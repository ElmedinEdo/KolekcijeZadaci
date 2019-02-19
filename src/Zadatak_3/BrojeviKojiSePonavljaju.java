package Zadatak_3;

import java.util.Scanner;

/**
* The Class BrojeviKojiSePonavljaju.
*/
public class BrojeviKojiSePonavljaju {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = getInput(4);
		System.out.println("Broj ili brojevi koji se ponavljaju: ");
		int[] distinctNumbers = findDupicateInArray(numbers);
		System.out.println("Brojevi koji su u listi: ");
		printNumbers(distinctNumbers);

	}

	/**
	 * Gets the input.
	 *
	 * @param size the size
	 * @return the input
	 */
	public static int[] getInput(int size) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[size];
		System.out.print("Unesite " + size + " brojeve: ");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		return numbers;
	}

	/**
	 * Prints the numbers.
	 *
	 * @param array the array
	 */
	public static void printNumbers(int[] array) {
	for (int i : array) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Find dupicate in array.
	 *
	 * @param list the list
	 * @return the int[]
	 */
	public static int[] findDupicateInArray(int[] list) {
		int count = 0;
		for (int j = 0; j < list.length; j++) {
			for (int k = j + 1; k < list.length; k++) {
				if (list[j] == list[k]) {
					count++;
				}
			}
			if (count == 1)
				System.out.println(list[j]);
			count = 0;
		}
		return list;
	}

}
