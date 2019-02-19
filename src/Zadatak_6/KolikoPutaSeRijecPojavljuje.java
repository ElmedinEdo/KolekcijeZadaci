package Zadatak_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The Class KolikoPutaSeRijecPojavljuje.
 */
public class KolikoPutaSeRijecPojavljuje {

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws FileNotFoundException the file not found exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner txt;
        File file = null;
      
        try {
            txt = new Scanner(System.in);
            System.out.println("Molimo unesite ime fajla(text.txt): ");
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
   
        
        txt = new Scanner(file);
		Scanner in = new Scanner(System.in);
		in.nextLine();
		System.out.print("Molimo da unesete rijec koju zelite pretrazivati. ");
		String wordInput = in.next();
      
		        //Ovdje se radi pretrazivanje rijeci
		int count = 0;
		while (txt.hasNextLine()) 
		{
		    String line = txt.nextLine();
		    for (int index = line.indexOf(wordInput); 
		             index != -1; 
		             index = line.indexOf(wordInput, index + 1)) {
		        count++;
		    }        
		}
		System.out.println(count);
    } 
}








