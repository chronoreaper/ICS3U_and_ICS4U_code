import java.util.Scanner;
/**
 *Christopher Duong
 *Simple Encryption
 *This Program will be able to encrypt and decrypt a phrase
 */
public class U1A2_SimpleEncription {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		String word=null, encryptWord=null;
		int encryptionCycle=0,choice=0;
		//Variable Assignment
		encryptWord="";
		String[] wordEncrypt=new String[0];
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a phrase to be encrypted: ");
		word=userInput.nextLine();
		System.out.println("Enter How many letters to be cycled.");
		encryptionCycle=userInput.nextInt();
		System.out.println("Encryption 1, Decryption 2");
		choice=userInput.nextInt();
		wordEncrypt=new String[word.length()];
		//changes all to lower case
		word=word.toUpperCase();
		//changes all the letters to numbers
		for (int i=0;i<word.length(); i++)
		{
			wordEncrypt[i]=encryptDecrypter(word.charAt(i),choice,encryptionCycle);
			//combines it all into a word
			encryptWord+=wordEncrypt[i];
		}//end for
		System.out.println("Original Phrase is "+word);
		System.out.println("New Phrase is "+encryptWord);
	}//end main
	private static String encryptDecrypter(char c, int choice, int encryptionCycle) {
		char newLetter=0;
		String returnLetter=null;
		//checks for space
		if (c==' ')
		{
			return " ";
		}
		//checks for encryption or decryption
		if (choice==1)
		{
			//cycles through the letters
			newLetter=(char)(c+encryptionCycle);
			if (newLetter>90)
			{
				newLetter-=26;
			}
		}//end if
		else
		{
			//cycles through the letters
			newLetter=(char)(c-encryptionCycle);
			if (newLetter<65)
			{
				newLetter+=26;
			}
		}//end else
		returnLetter=Character.toString(newLetter);
		return returnLetter;
	}//end letter to Numb
}//end class
