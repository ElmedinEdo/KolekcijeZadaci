package Zadatak_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The Class UkupanBrojRijeciUFailu.
 */
public class UkupanBrojRijeciUFailu {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void main(String[] args) throws FileNotFoundException {

		try {

			System.out.print("Unesite ime faila( text.txt ) : ");

			Scanner input = new Scanner(System.in);
			File file = new File(input.nextLine());
			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				int count = 0;
				while (input.hasNextLine()) {
					String line1 = input.nextLine();
					for (int index = line.indexOf(line); index != -1; index = line.indexOf(line, index + 1)) {
						count++;

					}
				}
				System.out.println("Ukupan broj rijeci: "+count);

			}

			input.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
