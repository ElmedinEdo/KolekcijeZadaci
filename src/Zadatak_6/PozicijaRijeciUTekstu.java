package Zadatak_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class PozicijaRijeciUTextu.
 */
public class PozicijaRijeciUTekstu {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "J hocu da ucim programiranje ";
		String wordToFind = "ucim";
		
		Pattern word = Pattern.compile(wordToFind);
		Matcher match = word.matcher(text);

		while (match.find()) {
		     System.out.println("Rijec ucim se nalazi u tekstu na poziciji:  "+ match.start() +" - "+ (match.end()-1));
		}
        
    }
}
	


