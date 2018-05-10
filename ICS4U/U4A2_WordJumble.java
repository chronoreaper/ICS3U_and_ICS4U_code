import java.util.Scanner;
/**
 * Christopher Duong
 * Word Jumble
 * This Program will out put a jumble of words that the user inputed
 */
public class U4A2_WordJumble {
	public static void main(String[] args) {
		// Variable Declaration and Initalization
		String word=null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a word to be scrambled");
		word=userInput.next();
		jumbleWords(word,"");
		
	}//end main
	public static void jumbleWords(String word, String jumbLet) {
		int pos;
		String remainingLetters;
		String origWord = word;
		String origJumbledLetters = jumbLet;
		if (word.length() == 1) {
			System.out.println(jumbLet + word);
		} else {
			//scrambles the word
			for (pos = 0; pos < origWord.length(); pos++) {
				remainingLetters = origWord.substring(0, pos)
						+ origWord.substring(pos + 1, origWord.length());
				//recursive call to jumbleWords()
				jumbleWords(remainingLetters, 
						origJumbledLetters + origWord.charAt(pos));
			}//end word scramble loop
		}//end recursion if
	}//end jumble words
}//end class
