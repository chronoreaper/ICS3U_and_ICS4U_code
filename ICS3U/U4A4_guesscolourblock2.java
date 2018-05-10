import java.io.IOException;
import java.util.Scanner;
/**
 * Christopher Duong
 *Guess Colour Blocks
 *creates a program that the player must guess three blocks
 */
public class U4A4_guesscolourblock2 {
	//Variable Declaration, and Initialization
	static int colour=0,right=0;
	public static void main(String[] args) throws IOException{
		//Variable Declaration, and Initialization
		char one=0,two=0,three=0,randomOne=0,randomTwo=0,randomThree=0;
		int  again=1;
		//user input
		Scanner user_input =new Scanner (System.in);
		System.out.println("The computer has three blocks of either rgby.");
		//randomizing first number
		randomOne=randomLetter();
		//randomizing second number
		randomTwo=randomLetter();
		//randomizing third number
		randomThree=randomLetter();
		while (again==1)
		{
			//reset your right place
			right=0;
			//reset your right colour
			colour=0;
			System.out.println("Enter the first letter:");
			one=user_input.next().charAt(0);
			System.out.println("Enter the second letter:");
			two=user_input.next().charAt(0);
			System.out.println("Enter the third letter:");
			three=user_input.next().charAt(0);
			//call to check colour
			checkColoursCorrect(one,two,three,randomOne,randomTwo,randomThree);
			//call to check place
			checkPositionsCorrect(one,two,three,randomOne,randomTwo,randomThree);
			System.out.println("Your Colour: 	 "+one+" "+two+" "+three);			
			System.out.println("Computer Colour: "+randomOne+" "+randomTwo+" "+randomThree);
			System.out.println("Right Colour: "+colour+" Right Position: "+right);
			again=0;
			System.out.println("Press 1 to play again");	
			again=Integer.parseInt(user_input.next());
			//loops again
			if (again==1)
			{
				//randomizing first number
				randomOne=randomLetter();
				//randomizing second number
				randomTwo=randomLetter();
				//randomizing third number
				randomThree=randomLetter();
			}//end if
		}
	}//end main
	//check colour
	public static void checkColoursCorrect(char one,char two,char three,char randomOne,char randomTwo,char randomThree){
		int count1=0,count2=0,count3=0;
		if (one==randomOne)
		{
			colour++;
			//to make sure this letter is not used again
			count1++;
		}
		else if (one==randomTwo)
		{
			colour++;
			//to make sure this letter is not used again
			count2++;
		}
		else if (one==randomThree)
		{
			colour++;
			//to make sure this letter is not used again
			count3++;
		}
		//check the second letter and translate to number
		if (two==randomOne&&count1==0)
		{
			colour++;
			//to make sure this letter is not used again
			count1++;
		}
		else if (two==randomTwo&&count2==0)
		{
			colour++;
			//to make sure this letter is not used again
			count2++;
		}
		else if (two==randomThree&&count3==0)
		{
			colour++;
			//to make sure this letter is not used again
			count3++;
		}
		//check the third letter and translate to number
		if (three==randomOne&&count1==0)
			colour++;

		else if (three==randomTwo&&count2==0)
			colour++;

		else if (three==randomThree&&count3==0)
			colour++;
	}//end check colour
	//check position
	public static void checkPositionsCorrect(char one,char two,char three,char randomOne,char randomTwo,char randomThree){
		int count1=0,count2=0,count3=0;
		//check first letter and translate to number
		if (one==randomOne)
		{
			right++;
			//to make sure this letter is not used again
			count1++;
		}
		//check the second letter and translate to number
		if (two==randomTwo&&count2==0)
		{
			right++;
			//to make sure this letter is not used again
			count1++;
		}

		//check the third letter and translate to number
		if (three==randomThree&&count3==0)
		{
			right++;
			//to make sure this letter is not used again
			count1++;
		}
	}//end position checker
	//randomize a number
	public static int randomWholeNumber(){
		//randomizer
		return (int) (Math.random()*4+1);
	}//end randomizer
	//reads the number to letter
	public static char randomLetter(){
		int  randomNum=0;
		char randomChar=0;
		randomNum=randomWholeNumber();
		if (randomNum==1)
		{
			randomChar='r';
		}
		else if (randomNum==2)
		{
			randomChar='g';

		}
		else if (randomNum==3)
		{
			randomChar='b';
		}
		else if (randomNum==4)
		{
			randomChar='y';
		}
		return randomChar;
	}//end number converter
}//end class

