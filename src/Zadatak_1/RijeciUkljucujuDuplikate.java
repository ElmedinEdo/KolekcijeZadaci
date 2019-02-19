package Zadatak_1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * The Class RijeciUkljucujuDuplikate.
 */
public class RijeciUkljucujuDuplikate {

    	/**
		 * The main method.
		 *
		 * @param args the arguments
		 */
		public static void main(String[] args) {

			Scanner txt;
			File file = null;
			try {
				txt = new Scanner(System.in);
				System.out.println("Molimo unesite ime fajla( text.txt ): ");
				file = new File(txt.nextLine());
				txt = new Scanner(file);
				while (txt.hasNextLine()) {
					String line = txt.nextLine();
					System.out.println(line);
				}
				txt.close();
			} catch (Exception ex) {
				ex.printStackTrace();

			}
			File file1 = new File("text.txt");
			List<String> words = getWordsFromFile(file1);
			System.out.println("....................");
			System.out.println("Sortirana lista: ");
			System.out.println("");
			Collections.sort(words);
			printWords(words);
		}

		/**
		 * Prints the words.
		 *
		 * @param words the words
		 */
		private static void printWords(List<String> words) {
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
		private static List<String> getWordsFromFile(File file) {
			List<String> words = new ArrayList<>();
			try (Scanner scanner = new Scanner(file)) {
				while (scanner.hasNext()) {
					words.add(scanner.next());
				}
			} catch (FileNotFoundException e) {
				System.out.println("Error reading from file");
				System.exit(2);
			}
			return words;
		}

	}

