import java.util.ArrayList;
import javax.swing.*;
public class Hangman {
	/**
	 * Christopher Duong
	 * U2A2 Hangman
	 *  Creates a game of Hangman
	 */
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int lives=0, gotWord=0, catagory=0;
		boolean [] guess = new boolean[0];
		boolean gotLetter=false;
		boolean solved=false;
		boolean hasUsed=false;
		String word=null;
		String letter=null;
		ArrayList<String> guessLetters=new ArrayList<String>();
		catagory=(int) Math.floor(Math.random()*3);
		//selects a random word
		word = getRandomWord(catagory,(int) Math.floor(Math.random()*7));
		guess = new boolean [word.length()];
		//loops until you solved it
		while (solved==false)
		{
			//prints out the mystery word and what you know of it
			System.out.println("");
			System.out.println("Mystery word");
			//prints out the category
			switch(catagory)
			{
			case 0:System.out.println("Movies");
			break;
			case 1:System.out.println("Video Games");
			break;
			case 2:System.out.println("Anime");
			break;
			}//end category printer
			//prints out used letters
			System.out.print("Used Letters:");
			for (String s:guessLetters)
			{
				System.out.print(s);
			}
			System.out.println("");
			for (int i=0;i<word.length();i++)
			{
				//removes spaces
				if (word.charAt(i)==' ')
				{
					guess[i]=true;
				}//end space remover
				if (guess[i]==false)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print(word.charAt(i));
				}//end if
			}//end for
			System.out.println("");
			//prints the hanged man and checks if you did not lose yet
			hangmanPrint(lives);
			if (lives>6)
			{
				System.out.println("");
				System.out.println("You lose");
				System.out.println("The word was "+word);
				System.exit(0);
			}
			letter=JOptionPane.showInputDialog("Guess a letter");
			//takes the first letter
			letter=letter.substring(0,1);
			letter=letter.toUpperCase();
			//checks if you used the letter
			do
			{
				hasUsed=false;
				//checks all the used letters
				for (String s:guessLetters)
				{
					if (letter.equals(s))
					{
						hasUsed=true;
					}
				}
				//saves the new letter
				if (hasUsed==false)
				{
					guessLetters.add(letter);
					break;
				}
				letter=JOptionPane.showInputDialog("Letter Has been used. Guess a letter");
				letter=letter.substring(0,1);
				letter=letter.toUpperCase();
			}while (hasUsed==true);
			//checks if you got the letter right
			for (int j=0;j<guess.length; j++)
			{
				//sets both the letter and the word to caps
				word=word.toUpperCase();
				if (letter.charAt(0)==word.charAt(j))
				{
					guess[j]=true;
					gotLetter=true;
				}
			}//end for
			//makes you lose lives if you guess incorrectly
			if (gotLetter==false)
			{
				lives++;
			}//end if
			gotLetter=false;
			//check if you solved it
			for (int k=0; k<guess.length; k++)
			{
				if (guess[k]==true)
				{
					gotWord++;
				}//end if 
			}//end letter checker
			if (gotWord==word.length())
			{
				solved=true;
				System.out.println("");
				System.out.println("You got the word!");
				for (int i=0;i<word.length();i++)
				{
					//prints out every letter
					System.out.print(word.charAt(i));
				}//end word printer
			}//end got word check
			gotWord=0;
		}//end loop
	}//end main
	private static void hangmanPrint(int lives)
	{
		if (lives>0)
		{
			System.out.print(" O ");
		}//end if
		if (lives>1)
		{
			System.out.println("");
			System.out.print("/");
		}//end if
		if (lives>2)
		{
			System.out.print("|");
		}//end if
		if (lives>3)
		{
			System.out.print("\\");
		}//end if
		if (lives>4)
		{
			System.out.println("");
			System.out.print(" | ");
		}//end if
		if (lives>5)
		{
			System.out.println("");
			System.out.print("/");
		}//end if
		if (lives>6)
		{
			System.out.print(" \\");
		}//end if
	}//end hangman printer
	private static String getRandomWord(int c,int r)
	{
		//Variable declaration and initialization
		String[][] randomArray=new String[3][6];
		//movies
		randomArray[0][0]="transformers";
		randomArray[0][1]="Star Wars";
		randomArray[0][2]="Superman";
		randomArray[0][3]="Batman";
		randomArray[0][4]="Avengers";
		randomArray[0][5]="Star Trek";
		randomArray[0][5]="Fantastic Beast and where to find them";
		//video games
		randomArray[1][0]="Super Smash Bros";
		randomArray[1][1]="Pokemon";
		randomArray[1][2]="Mario Kart";
		randomArray[1][3]="Call of Duty";
		randomArray[1][4]="Leauge of legends";
		randomArray[1][5]="undertale";
		randomArray[1][5]="Legend of zelda";
		//anime
		randomArray[2][0]="Sword art Online";
		randomArray[2][1]="Pokemon";
		randomArray[2][2]="Naruto";
		randomArray[2][3]="One Piece";
		randomArray[2][4]="Assassination Classroom";
		randomArray[2][5]="Re Zero";
		randomArray[2][5]="Fate Stay Night";
		return randomArray[c][r];
	}//end get random word
}//end class
