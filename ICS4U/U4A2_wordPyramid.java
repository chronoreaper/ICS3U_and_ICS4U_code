import java.util.Scanner;
/**
 * Christopher Duong
 * Word Pyramid
 * This program will create a word pyramid by removing the first and last letter of a word
 *
 */
public class U4A2_wordPyramid {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		String word=null;
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter a word to be made into a word pyramid");
		word=userInput.next();
		pyramid(word);	
	}//end main
	public static void pyramid(String s)
	{
		//prints out the word
		System.out.println(s);
		if (s.length()==0||s.length()==1)
		{
			//do nothing
		}
		else
		{
			//remove the first and last letter
			s=s.substring(1, s.length()-1);
			//recursive call itself 
			pyramid(s);	
		}//end if
	}//end pyramid
}//end class
