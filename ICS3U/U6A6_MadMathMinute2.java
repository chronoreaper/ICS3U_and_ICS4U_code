import java.io.IOException;
import java.util.Scanner;
/*
 * Christopher Duong
 * Mad Math Minute
 * This program will run a game where you will have to answer random question.
 */

public class U6A6_MadMathMinute2 {

	static int place=0, level=0;
	static Scanner ui = new Scanner (System.in); // user input

	public static void main (String args[]) throws IOException
	{
		//variable declaration and initialization
		int menuChoice=0, prevScore[]=new int[10],points=0;
		String prevScoreName[]= new String[10],newName=null;
		//variable assignment
		for (int i=0; i<10; i++)
		{
			prevScore[i]=0;
			prevScoreName[i]= "level: 0	|John Doe";
		}
		while (menuChoice!=5)
		{
			menuChoice=0;
			System.out.println("Type 1 to start the game. \nType 2 to see the instructions. \nType 3 to see the score.");
			menuChoice=Integer.parseInt(ui.next());
			if (menuChoice==1)
			{
				points=startGame ();
				newName = endGame (points);
				prevScore = scoreChange (prevScore, points);
				prevScoreName = nameChange (prevScoreName, newName);
				System.out.println("Your score is "+points+"\nTop Score: "+prevScoreName[9]+", Score:"+prevScore[9]);
				menuChoice=4;
			}
			if (menuChoice== 2)
			{
				printInstructions();
				menuChoice=4;
			}
			if (menuChoice==3)
			{
				printScores (prevScore,prevScoreName) ;
				menuChoice=4;
			}
			if (menuChoice != 4)
			{
				System.out.println("error restart game");
			}
		}
	} //main method


	public static int startGame() throws IOException //a method that initializes a new game
	{
		//variable declaration and initialization
		int lives=0, points=0, correct=0; 
		double userAnswer=0;
		//variable assignment
		lives=3;
		System.out.println("Type 1 for Level 1 (0 to 10), 2 for level 2(-12 to 12), and 3 for level 3(-20 to 20).");
		level=Integer.parseInt(ui.next());
		while (lives>=0)
		{
			System.out.println("points "+points);
			System.out.println("lives "+lives);
			correct =displayNewQuestion();
			userAnswer=Double.parseDouble(ui.next());
			if (userAnswer==correct)
			{
				points++;
				System.out.println("correct");
			}
			else
			{
				lives--;
				System.out.println("incorrect");
			}
		}

		return (points);

	} //closes the startGame method
	public static String endGame (int points) throws IOException // a method that tells the user the game is over
	{
		//variable declaration and initialization
		String newName=null;
		System.out.println("game over");
		System.out.println("Enter your name");
		newName="level: "+level+"|	"+ui.next();
		return (newName);

	} 

	public static int[] scoreChange (int prevScore[], int points)
	{  
		if (points>=prevScore[0])
			prevScore[0]=0;
		for (int l=1;l<=9;l++)
		{
			if (points>=prevScore[l])
			{
				prevScore[l-1]=prevScore[l];
				prevScore[l]=points;
				place=l;
			}
		}

		return (prevScore);
	}

	public static String[] nameChange (String prevScoreName[], String newName)
	{
		if (place>0)
		{
			for (int k=1;k<10;k++)
			{
				if (place>=k)
				{
					prevScoreName[k-1]=prevScoreName[k];
					prevScoreName[k]=newName;
				}
			}	
		}
		else if (place==0)
			prevScoreName[0]=newName;
		return (prevScoreName);
	}

	public static void printInstructions ()  //a method that will print the instructions to the user
	{
		System.out.println("To play Mad Math a question will apear on the screen. Answer the question. \n If you get it wrong, you lose a life. If you lose all you lives, you lose your lfe... I mean the game.");
	} //printInstructions method 


	public static void printScores (int prevScore[], String prevScoreName[])  //a method that prints high scores
	{
		for (int j=9; j>0; j--)
			System.out.println(10-j+"	|"+prevScore[j]+("	|")+ prevScoreName[j]);
	}//highScore method
	// a method that displays a random arithmetic question
	public static int displayNewQuestion ()  // a method that displays a random arithmetic question
	{
		//variable declaration and initialization
		double correctAnswer=0;
		int num1=0,num2=0,operator=0;
		//variable assignment
		if (level==1)
		{
			num1 = randomWholeNumber (10,0);
			num2 = randomWholeNumber (10,0);
			}
		else if (level==2)
		{
			num1 = randomWholeNumber (12, -12);
			num2 = randomWholeNumber (12, -12);
			}
		else if (level==3)
		{
			num1 = randomWholeNumber (20, -20);
			num2 = randomWholeNumber (20, -20);
			}
		else
		{
			num1 = randomWholeNumber (666, -666);
			num2 = randomWholeNumber (666, -666);
		}
		operator = randomWholeNumber (4, 1);
		if (operator == 1)
		{
			System.out.println(num1+"+"+num2+"=");
			correctAnswer=num1 + num2;
		}
		if (operator == 2)
		{
			System.out.println(num1+"-"+num2+"=");
			correctAnswer=num1 - num2;
		}
		if (operator == 3)
		{
			System.out.println(num1+"x"+num2+"=");
			correctAnswer =num1 *num2;
		}
		if (operator == 4)
		{
			while (num2 == 0)
			{
				num2 =randomWholeNumber(12, -12);
			}
			System.out.println(num1+"/"+num2+"=");
			correctAnswer =(int)(num1 / num2);
		}

		return	(int) ( correctAnswer );

	} //closes the displayNewQuestion method

	public static int randomWholeNumber (int u, int l)  //a method that makes a random number between the upper and lower ranges
	{
		//variable declaration and initialization
		int randomNum=0;
		do{

			randomNum=(int)(Math.random()*u);
		}
		while (randomNum<=l||randomNum>=u);
		return (randomNum);//returns value
	}//randomWholeNumber method
} //end class





