import java.util.Scanner;
/**
 * Christopher Duong
 * Counting Vowels
 * Counts vowels in a word
 */
public class U4A1_CountingVowels {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int count=0;
		String word=null;
		Scanner user_input=new Scanner (System.in);
		System.out.print("Type a word to see how many vowels are in there: ");
		word=user_input.next();
		// i will never be longer than the length of the word and it will check all the letters in the word
		for (int i=0; i<word.length(); i++)
		{
			//check all letter
			char ch = word.charAt(i);
			//if there is a vowel
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				//add one to count
				count++; 
			}//end if
		}//end loop
		// there are x vowels in this word
		System.out.println("There are "+count+" vowels in this word.");
	}//end main
}//end class
