import java.util.Scanner;
/**
 * Christopher Duong
 *Morse Code Translator
 *Translates your word into morse code
 */
public class U1A2_MorseCode {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		String wordInput=null,morseWord=null;
		//Variable Assignment
		morseWord="";
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter a word to be translated to morse code: ");
		wordInput=userInput.nextLine();
		//puts the word to caps
		wordInput=wordInput.toUpperCase();
		for (int i=0; i<wordInput.length(); i++)
		{
			morseWord+=morseTranslator(wordInput.charAt(i));
			morseWord+="  ";
		}
		System.out.println("The word in morse is: "+morseWord);
	}//end main
	private static String morseTranslator(char charAt) {
		// Variable Declaration and Initialization
		String morse=null;
		if (charAt=='A')
		{
			morse=".-";
		}
		else if (charAt=='B')
		{
			morse="-...";
		}
		else if (charAt=='C')
		{
			morse="-.-.";
		}
		else if (charAt=='D')
		{
			morse="-..";
		}
		else if (charAt=='E')
		{
			morse=".";
		}
		else if (charAt=='F')
		{
			morse="..-.";
		}
		else if (charAt=='G')
		{
			morse="--.";
		}
		else if (charAt=='H')
		{
			morse="....";
		}
		else if (charAt=='I')
		{
			morse="..";
		}
		else if (charAt=='J')
		{
			morse=".---";
		}
		else if (charAt=='K')
		{
			morse="-.-";
		}
		else if (charAt=='L')
		{
			morse=".-..";
		}
		else if (charAt=='M')
		{
			morse="--";
		}
		else if (charAt=='N')
		{
			morse="-.";
		}
		else if (charAt=='O')
		{
			morse="---";
		}
		else if (charAt=='P')
		{
			morse=".--.";
		}
		else if (charAt=='Q')
		{
			morse="--.-";
		}
		else if (charAt=='R')
		{
			morse=".-.";
		}
		else if (charAt=='S')
		{
			morse="...";
		}
		else if (charAt=='T')
		{
			morse="-";
		}
		else if (charAt=='U')
		{
			morse="..-";
		}
		else if (charAt=='V')
		{
			morse="...-";
		}
		else if (charAt=='W')
		{
			morse=".--";
		}
		else if (charAt=='X')
		{
			morse="-..-";
		}
		else if (charAt=='Y')
		{
			morse="-.--";
		}
		else if (charAt=='Z')
		{
			morse="--..";
		}
		else if (charAt=='1')
		{
			morse=".----";
		}
		else if (charAt=='2')
		{
			morse="..---";
		}
		else if (charAt=='3')
		{
			morse="...--";
		}
		else if (charAt=='4')
		{
			morse="....-";
		}
		else if (charAt=='5')
		{
			morse=".....";
		}
		else if (charAt=='6')
		{
			morse="-....";
		}
		else if (charAt=='7')
		{
			morse="--...";
		}
		else if (charAt=='8')
		{
			morse="---..";
		}
		else if (charAt=='9')
		{
			morse="----.";
		}
		else if (charAt=='0')
		{
			morse="-----";
		}
		else
		{
			morse=" ";
		}
		return morse;
	}
}//end class
