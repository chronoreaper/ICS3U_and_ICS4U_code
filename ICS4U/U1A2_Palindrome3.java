import javax.swing.*;
/**
 * Christopher Duong
 * Check for Palindrome
 */
public class U1A2_Palindrome3 {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		String word=null,wordCheck=null,reverse="";
		//user input
		JFrame frame = new JFrame("input Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"Type a sentence to see if it is a Palindrome(A word that is the same spelt same backwords): ");
		//input
		word = input1;
		//removes all spaces
		wordCheck=word;
		wordCheck=wordCheck.replace(" ","");
		wordCheck=wordCheck.toLowerCase();
		//reverser
		for (int i=wordCheck.length()-1; i>=0; i--){
			reverse+=wordCheck.charAt(i);
		}//end for	
		//if all the letters are the same both forwards and backwards
		if (reverse.equalsIgnoreCase(wordCheck))
			System.out.println(word+" is a palindrome."); 
		else
			System.out.println(word+" is not a palindrome.");  
	}//end main
}//end class
