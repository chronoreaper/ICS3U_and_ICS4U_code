import java.util.Scanner;
/**
 * Christopher Duong
 * Word Rectangle Creator
 * Creates a rectangle from your word
 */
public class U4A1_WordRec {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int count=0;
		String word=null;
		//user input
		Scanner user_input=new Scanner (System.in);
		System.out.print("Write a word to turn it into a word rectangle: ");
		//word
		word=user_input.next();
		for (int i=0; i<word.length(); i++)
		{
			//print out the word, for the next line, print out the word minus the first letter to be added at the end
			System.out.println(word.substring(i)+word.substring(0,i));
			//for keeping track of which letter to add or remove
			count++;
		}//end loop
	}//end main
}//end class
