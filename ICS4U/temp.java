import java.util.Scanner;
public class temp {

	public static void main(String[] args) {
		String word[]=new String[4];
		Scanner userInput = new Scanner (System.in);
		int vowel=0;
		char characterWord=0;
		int longestVowel=0;
		int numberOfName=0;
		String longestVowelWord="a";
		String longestName="a";
		System.out.println("# of words");
		numberOfName=Integer.parseInt(userInput.next());
		word= new String[numberOfName];
		for (int k=0; k<numberOfName; k++)
		{
			System.out.println("entername");
			word[k]=userInput.next();
		}
		for (int l=0; l<numberOfName; l++)
		{
			if (word[l].length()>=longestName.length())
			{
				longestName=word[l];
			}
		}
		for (int j=0; j<word.length; j++)
		{
			for (int i=0; i<word[j].length(); i++)
			{
				characterWord=0;
				vowel=0;
				if (word[j].charAt(i)=='a'||word[j].charAt(i)=='e'||word[j].charAt(i)=='i'||
						word[j].charAt(i)=='o'||word[j].charAt(i)=='u')
				{
					vowel++;
				}
				if (vowel>=longestVowel)
				{
					longestVowel=vowel;
					longestVowelWord=word[j];
				}
			}
		}
		System.out.println("Longest name is "+longestName+" longest vowel is "+longestVowelWord);
	}
}
