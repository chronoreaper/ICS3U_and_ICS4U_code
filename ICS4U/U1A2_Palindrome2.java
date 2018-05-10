import javax.swing.*;
/**
 * Christopher Duong
 * Check for Palindrome
 */
public class U1A2_Palindrome2 {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		String sentence= null;
		String[] words = null;
		String[] palWords=null;
		int count=0, palCount=0;
		char ch=0,rch=0;
		//user input
		JFrame frame = new JFrame("input Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"Type a sentence to find all Palindroms in it: ");
		//input
		sentence = input1;
		words = sentence.split(" ");
		palWords = new String[words.length];		
		//loops for every word in the sentence
		for (int j=0;j<words.length;j++)
		{
			//resets the word counter
			count=0;
			for (int i=0; i<words[j].length(); i++){
				//check all the letters starting from the start
				ch=words[j].charAt(i);
				//checking all the letters starting form the back
				rch=words[j].charAt(words[j].length()-i-1);
				//count all the letters that are the same for both start and end of the word
				if (ch==rch)
				{
					count++;
				}
			}//end for	
			if (count==words[j].length())
			{
				palWords[palCount]=words[j];
				palCount++;
			}//end if
		}//end for
		System.out.println("There are "+palCount+" Palindrome in this sentence.");
		System.out.println("They are:");
		for (int k=0; k<palCount; k++)
		{
			System.out.println(palWords[k]);
		}//end for
	}//end main
}//end class
