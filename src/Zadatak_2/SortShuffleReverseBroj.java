package Zadatak_2;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;


/**
 * The Class SortShuffleReverseBroj.
 */
public class SortShuffleReverseBroj {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koliko zelite brojeva u listi: ");
		int broj = input.nextInt();

		System.out.println("Brojevi: ");

		for (int i = 0; i < broj; i++) {

			list.add(input.nextInt());

		}
		Collections.shuffle(list);
		System.out.println("Promjesa brojeve"+list);

		Collections.sort(list);
		System.out.println("Sortira brojeve"+list);

		Collections.reverse(list);
		System.out.println("Reverse sort"+list);
	}

	/**
	 * Sort.
	 *
	 * @param list the list
	 */
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);

	}

	/**
	 * Reverse.
	 *
	 * @param list the list
	 */
	public static void reverse(ArrayList<Integer> list) {
		Collections.reverse(list);
	}

	/**
	 * Shuffle.
	 *
	 * @param list the list
	 */
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}

}
