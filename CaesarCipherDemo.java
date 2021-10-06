import java.util.Scanner;

/**
 * Demonstrates the CaesarCipher class
 *
 * @author gcschmit
 * @version 21 September 2018
 */
public class CaesarCipherDemo
{
    public static void main(String[] args)
    {
        /*
         * A Scanner object parses primitive types and Strings from a stream.
         * 
         *  A stream is a sequence of characters from a file, String, terminal,
         *      network connection, etc.
         *      
         *  Parsing is separating a sequence of characters into tokens based on
         *      delimeters.
         *      
         *      A token is a meaningful sequence of characters (e.g., word).
         *      Delimiters are characters that separate tokens
         *          (by default, whitespace (space, tab, newline))
         *          
         *  When we create a Scanner object, we have to specify the input stream
         *      (e.g., System.in which is the terminal input).
         */
        Scanner s = new Scanner(System.in);
        
        /*
         * Best practices:
         *      1. prompt the user for what you want them to input
         *      2. use print, not println such that the cursor is at the end
         *          of the prompt and not on a new line
         *      3. leave a space after the prompt
         */
        System.out.print("Enter the text to encrypt: ");
        
        /*
         * The nextLine method returns all characters up to the end of the line
         *      (e.g., where the user typed enter).
         */
        String text = s.nextLine();
        text = text.toUpperCase();
        
        System.out.print("Enter the keyphrase (no spaces): ");
        
        /*
         * The next method returns the next token in the stream as a String
         */
        String keyphrase = s.next();
        keyphrase = keyphrase.toUpperCase();
        
        CaesarCipher cipher = new CaesarCipher(keyphrase);
        
        
    }
}


