import javax.swing.*;
/**
 * Christopher Duong
 * Check for Palindrome
 */
public class U4A1_Palindrome {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		String word=null;
		int count=0;
		//user input
		JFrame frame = new JFrame("input Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"Type a word to see if it is a Palindrome(A word that is the same spelt same backwords): ");
		//input
		word = input1;
		// i will never be longer than the length of the word and it will check all the letters in the word
		for (int i=0; i<word.length(); i++){
			//check all the letters starting from the start
			char ch=word.charAt(i);
			//checking all the letters starting form the back
			char rch=word.charAt(word.length()-i-1);
			//count all the letters that are the same for both start and end of the word
			if (ch==rch)
			{
				count++;
			}
		}//end for	 
		//if all the letters are the same both forwards and backwards
		if (count==word.length())
			System.out.println("This word is a palindrome."); 
		else
			System.out.println("This word is not a palindrome.");  
	}//end main
}//end class
