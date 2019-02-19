package Zadatak_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class SamoglasniciSuglasniciUFailu.
 */
public class SamoglasniciSuglasniciUFailu {

	/** The Constant CONSONANTS. */
	private static final int CONSONANTS = 0;
	
	/** The Constant VOWELS. */
	private static final int VOWELS = 1;
	
	/** The Constant vowels. */
	private static final Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
	
	/** The counts. */
	private static int[] counts;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite ime faila(text.txt): ");
		String filePath = scanner.nextLine();
		String text = getTextFromFilePath(filePath);
		counts = countLetters(text);

		System.out.println("Consonants = " + counts[CONSONANTS]);
		System.out.println("Vowels = " + counts[VOWELS]);
	}

	/**
	 * Count letters.
	 *
	 * @param text the text
	 * @return the int[]
	 */
	private static int[] countLetters(String text) {
		counts = new int[2];
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (vowels.contains(Character.toUpperCase(ch))) {
					counts[VOWELS]++;
				} else {
					counts[CONSONANTS]++;
				}
			}
		}
		return counts;
	}

	/**
	 * Gets the text from file path.
	 *
	 * @param filePath the file path
	 * @return the text from file path
	 */
	private static String getTextFromFilePath(String filePath) {
		Path path = Paths.get(filePath);
		byte[] bytes = new byte[0];
		try {
			bytes = Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(bytes);
	}
}
