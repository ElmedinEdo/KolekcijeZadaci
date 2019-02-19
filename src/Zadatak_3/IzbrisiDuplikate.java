package Zadatak_3;

import java.util.Scanner;

/**
* The Class IzbrisiDuplikate.
*/
public class IzbrisiDuplikate {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

				    		   
				    int[] numbers = getInput(5);
			        int[] distinctNumbers = eliminateDuplicates(numbers);
			        printNumbers(distinctNumbers);
			    }

			    /**
 			 * Gets the input.
 			 *
 			 * @param size the size
 			 * @return the input
 			 */
 			public static int[] getInput(int size){
			        Scanner scanner = new Scanner(System.in);
			        int[] numbers = new int[size];
			        System.out.print("Unesite " + size + " brojeve: ");
			        for (int i = 0; i < size; i++) {
			            numbers[i] = scanner.nextInt();
			        }
			        return numbers;
			    }

			    /**
 			 * Eliminate duplicates.
 			 *
 			 * @param list the list
 			 * @return the int[]
 			 */
 			public static int[] eliminateDuplicates(int[] list) {
			        int[] distinctList = new int[getDistinctCount(list)];
			        int index = 0;
			        for (int i : list) {
			            if (!hasNumber(distinctList, index, i)) {
			                distinctList[index] = i;
			                index++;
			            }
			        }
			        return distinctList;
			    }

			    /**
 			 * Gets the distinct count.
 			 *
 			 * @param list the list
 			 * @return the distinct count
 			 */
 			public static int getDistinctCount(int[] list) {
			        int distinctCount = 1;
			        boolean exists;
			        for (int i = 1; i < list.length; i++) {
			            exists = false;
			            for (int j = 0; j < i; j++) {
			                if (list[j] == list[i]) {
			                    exists= true;
			                    break;
			                }
			            }
			            if (!exists) distinctCount++;
			        }
			        return distinctCount;
			    }

			    /**
 			 * Checks for number.
 			 *
 			 * @param array the array
 			 * @param index the index
 			 * @param number the number
 			 * @return true, if successful
 			 */
 			public static boolean hasNumber(int[] array, int index, int number){
			        for (int i = 0; i < index; i++) {
			            if (array[i] == number) return true;
			        }
			        return false;
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
			}


				
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
			   
				
			   
		   

	


