package Zadatak_1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * The Class RijeciDuplikati.
 */
public class RijeciDuplikati {

	

		/**
		 * The main method.
		 *
		 * @param args the arguments
		 */
		public static void main(String[] args) {
			

			File f = new File("text.txt");
	        BufferedInputStream bis = null;
	        FileInputStream  fis= null;
	        try
	        {
	         
	            fis = new FileInputStream(f);

	           
	            bis = new BufferedInputStream(fis);

	         
	            while( bis.available() > 0 ){             	
	                System.out.print((char)bis.read());
	            }

	         }catch(FileNotFoundException fnfe)
	          {
	              System.out.println("The specified file not found" + fnfe );
	          }
	          catch(IOException ioe)
	          {
	              System.out.println("I/O Exception: " + ioe); 
	          }
	          finally
	          {
	              try{
	                 if(bis != null && fis!=null)
	                 {
	         	          fis.close();
	                    bis.close();
	                 }      
	               }catch(IOException ioe)
	                {
	                    System.out.println("Error in InputStream close(): " + ioe);
	                        
	                }	
	          }	    
	        
	        System.out.println(); 	
	        System.out.print("Lista rijeci iz faila: "); 			
			File file = new File("text.txt");
			HashSet<String> words = getWordsFromFile(file);
			System.out.println();
			
			System.out.println("..........................");
			System.out.println("");
			printWords(words);
			System.out.println("..........................");
			System.out.print("Lista rijeci bez duplikata: "); 		
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
					words.add(scanner.next());
				}
			} catch (FileNotFoundException e) {
				System.out.println("Error reading from file");
				System.exit(2);
			}
			return words;
		}
		}



