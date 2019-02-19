package Zadatak_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

import java.util.Scanner;

/**
 * The Class BrojUnikatnihRijeciUFailu.
 */
public class BrojUnikatnihRijeciUFailu {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("text.txt");
		HashSet<String> words = getWordsFromFile(file);
		System.out.println(" <= Broj rijeci u failu");
		printWords(words);
						
		}

	/**
	 * Prints the words.
	 *
	 * @param words the words
	 */
	private static void printWords(HashSet<String> words) {
		for (String word : words) {
			System.out.println(word);
			
		}
	}
		
	/**
	 * Gets the words from file.
	 *
	 * @param file the file
	 * @return the words from file
	 */
	private static HashSet<String> getWordsFromFile(File file) {
		HashSet<String> words = new HashSet<>();
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()) {
				System.out.print(" "+words.size());
				words.add(scanner.next());
				
				}
		} catch (FileNotFoundException e) {
			System.out.println("Error reading from file");
			System.exit(2);
		}
		return words;
	}

		
		
	     
	}


