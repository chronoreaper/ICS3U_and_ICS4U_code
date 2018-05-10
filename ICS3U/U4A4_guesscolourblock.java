import java.io.IOException;
import java.util.Scanner;
/**
 * Christopher Duong
 *Guess Colour Blocks
 */
public class U4A4_guesscolourblock {
	//Variable Declaration, and Initialization
	static int colour=0,right=0;
	public static void main(String[] args) throws IOException{
		//Variable Declaration, and Initialization
		String one=null,two=null,three=null;
		int  ranOne=0,ranTwo=0,ranThree=0,again=1;
		//user input
		Scanner user_input =new Scanner (System.in);
		System.out.println("The computer has three blocks of either rgby.");
		//randomizing first number
		ranOne=randomWholeNumber();
		//randomizing second number
		ranTwo=randomWholeNumber();
		//randomizing third number
		ranThree=randomWholeNumber();
		//to loop
		while (again==1)
		{
			//reset your right place
			right=0;
			//reset your right colour
			colour=0;
			System.out.println("Enter the first letter:");
			one=user_input.next();
			System.out.println("Enter the second letter:");
			two=user_input.next();
			System.out.println("Enter the third letter:");
			three=user_input.next();
			//call to check colour
			checkColoursCorrect(one,two,three,ranOne,ranTwo,ranThree);
			//call to check place
			checkPositionsCorrect(one,two,three,ranOne,ranTwo,ranThree);
			System.out.println("Your Colour: 	 "+one+" "+two+" "+three);
			//check computer colour first
			if (ranOne==1)
			{
				one="r";
			}
			if (ranOne==2)
				one="g";
			if (ranOne==3)
				one="b";
			if (ranOne==4)
				one="y";
			//check computer colour second
			if (ranTwo==1)
				two="r";
			if (ranTwo==2)
				two="g";
			if (ranTwo==3)
				two="b";
			if (ranTwo==4)
				two="y";
			//check computer colour third
			if (ranThree==1)
				three="r";
			if (ranThree==2)
				three="g";
			if (ranThree==3)
				three="b";
			if (ranThree==4)
				three="y";
			System.out.println("Computer Colour: "+one+" "+two+" "+three);
			System.out.println("Right Colour: "+colour+" Right Position: "+right);
			again=0;
			System.out.println("Press 1 to play again");	
			again=Integer.parseInt(user_input.next());
			//loops again
			if (again==1)
			{
				//randomizing first number
				ranOne=newGame();
			//randomizing second number
			ranTwo=newGame();
			//randomizing third number
			ranThree=newGame();
			}
		}
	}//end main
	//check colour
	public static void checkColoursCorrect(String one,String two,String three,int ranOne,int ranTwo,int ranThree){
		char ch=0;
		int letter=0,count1=0,count2=0,count3=0;
		ch=one.charAt(0);
		//check first letter and translate to number
		if (ch=='r')
			letter=1;
		else if (ch=='g')
			letter=2;
		else if (ch=='b')
			letter=3;
		else if (ch=='y')
			letter=4;
		if (letter==ranOne)
		{
			colour++;
			//to make sure this letter is not used again
			count1++;
		}
		else if (letter==ranTwo)
		{
			colour++;
			//to make sure this letter is not used again
			count2++;
		}
		else if (letter==ranThree)
		{
			colour++;
			//to make sure this letter is not used again
			count3++;
		}
		//check the second letter and translate to number
		ch=two.charAt(0);
		if (ch=='r')
			letter=1;
		else if (ch=='g')
			letter=2;
		else if (ch=='b')
			letter=3;
		else if (ch=='y')
			letter=4;
		if (letter==ranOne&&count1==0)
		{
			colour++;
			//to make sure this letter is not used again
			count1++;
		}
		else if (letter==ranTwo&&count2==0)
		{
			colour++;
			//to make sure this letter is not used again
			count2++;
		}
		else if (letter==ranThree&&count3==0)
		{
			colour++;
			//to make sure this letter is not used again
			count3++;
		}
		//check the third letter and translate to number
		ch=three.charAt(0);
		if (ch=='r')
			letter=1;
		else if (ch=='g')
			letter=2;
		else if (ch=='b')
			letter=3;
		else if (ch=='y')
			letter=4;
		if (letter==ranOne&&count1==0)
			colour++;

		else if (letter==ranTwo&&count2==0)
			colour++;

		else if (letter==ranThree&&count3==0)
			colour++;
	}
	public static void checkPositionsCorrect(String one,String two,String three,int ranOne,int ranTwo,int ranThree){//check position
		char ch=0;
		int letter=0,count1=0,count2=0,count3=0;
		ch=one.charAt(0);
		//check first letter and translate to number
		if (ch=='r')
			letter=1;
		else if (ch=='g')
			letter=2;
		else if (ch=='b')
			letter=3;
		else if (ch=='y')
			letter=4;
		if (letter==ranOne)
		{
			right++;
			//to make sure this letter is not used again
			count1++;
		}
		//check the second letter and translate to number
		ch=two.charAt(0);
		if (ch=='r')
			letter=1;
		else if (ch=='g')
			letter=2;
		else if (ch=='b')
			letter=3;
		else if (ch=='y')
			letter=4;
		if (letter==ranTwo&&count2==0)
		{
			right++;
			//to make sure this letter is not used again
			count1++;
		}
		//check the third letter and translate to number
		ch=three.charAt(0);
		if (ch=='r')
			letter=1;
		else if (ch=='g')
			letter=2;
		else if (ch=='b')
			letter=3;
		else if (ch=='y')
			letter=4;
		if (letter==ranThree&&count3==0)
		{
			right++;
			//to make sure this letter is not used again
			count1++;
		}
	}
	public static int randomWholeNumber(){
		//randomizer
		return (int) (Math.random()*4+1);
	}
	public static int newGame(){
		//randomizer
		return (int) (Math.random()*4+1);
	}
}//end class

