import javax.swing.*;
/**
 * Christopher Duong
 * Check for Palindrome
 */
public class U1A2_Palindrome1 {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		String word=null, reverse="";
		//user input
		JFrame frame = new JFrame("input Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"Type a word to see if it is a Palindrome(A word that is the same spelt same backwords): ");
		//input
		word = input1;
		//reverser
		for (int i=word.length()-1; i>=0; i--)
		{
			reverse+=word.charAt(i);
		}//end for	 
		//if all the letters are the same both forwards and backwards
		System.out.print(word+" backwards is "+reverse);
		System.out.println("");
		if (reverse.equalsIgnoreCase(word))
			System.out.println("This word is a palindrome."); 
		else
			System.out.println("This word is not a palindrome.");  
	}//end main
}//end class
