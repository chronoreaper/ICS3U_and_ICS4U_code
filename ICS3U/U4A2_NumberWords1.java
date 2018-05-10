import java.io.IOException;
import java.util.Scanner;

/**
 * Christopher Duong
 *NumberWords 1
 */

public class U4A2_NumberWords1 {
	public static void main(String[] args)throws IOException {
		// user input
		Scanner userin=new Scanner(System.in);
		//Variable Declaration, and Initialization
		System.out.println("Numbers to Words (10-99 Edition)");
		System.out.println("================================");
		//will initiate the first do-while loop of the program.
		int tryAgain=1;
		do
		{
			System.out.println();
			System.out.println("Input a number (10-99) and this program will repeat it to you with words.");
			//user inputs number  
			double numInput=Integer.parseInt(userin.next());
			System.out.println();
			//will initiate error check
			int error=1;
			do
			{
				//if the user enters an invalid number
				if(numInput<10 || numInput>99)
				{
					System.out.println("Invalid number. Enter a number between 10 and 99.");
					//user must re-enter a number if they entered an invalid one
					numInput=Integer.parseInt(userin.next());
					System.out.println();
				}//end if
				else
				{
					error=0;
				}//will end error loop if the number is correct
			}//end loop
			while(error==1);
			System.out.println();
			double tensDigit = Math.floor((numInput % 100) / 10);
			double onesDigit = numInput % 10;
			System.out.print("Your number in words is: ");
			//will initiate the teens subroutine
			if((numInput>=10)&&(numInput<=19))
			{
				teens(numInput);
			}//end if for teens
			//will initiate the tens and ones subroutine
			if((numInput>=20)&&(numInput<=99))
			{
				tens(tensDigit);
				//puts a space between the tens and ones
				System.out.print(" ");
				ones(onesDigit);
			}//end if
			System.out.println();
			System.out.println();
			System.out.println("Press 1 to try again.");
			//user decides to try again
			tryAgain=Integer.parseInt(userin.next());
			System.out.println();    
		}//end main loop
		//will repeat program if user chooses to enter another number
		while(tryAgain==1);
	}//closes main body
	public static void tens(double tensDigit){
		//check for ten digit
		if(tensDigit==2)
			System.out.print("twenty");
		if(tensDigit==3)
			System.out.print("thirty");
		if(tensDigit==4)
			System.out.print("fourty");
		if(tensDigit==5)
			System.out.print("fifty");
		if(tensDigit==6)
			System.out.print("sixty");
		if(tensDigit==7)
			System.out.print("seventy");
		if(tensDigit==8)
			System.out.print("eighty");
		if(tensDigit==9)
			System.out.print("ninety");
	}//closes tens method
	public static void teens(double numInput){
		//check for teens digit
		if (numInput==10)
			System.out.println("ten");
		if (numInput==11)
			System.out.println("eleven");   
		if (numInput==12)
			System.out.println("twelve");
		if (numInput==13)
			System.out.println("thirteen");
		if (numInput==14)
			System.out.println("fourteen");
		if (numInput==15)
			System.out.println("fifteen");
		if (numInput==16)
			System.out.println("sixteen");
		if (numInput==17)
			System.out.println("seventeen");
		if (numInput==18)
			System.out.println("eighteen");
		if (numInput==19)
			System.out.println("nineteen");
	}//closes teens method
	public static void ones(double onesDigit){
		//check for one digits
		if(onesDigit==1)
			System.out.print("one");
		if(onesDigit==2)
			System.out.print("two");
		if(onesDigit==3)
			System.out.print("three");
		if(onesDigit==4)
			System.out.print("four");
		if(onesDigit==5)
			System.out.print("five");
		if(onesDigit==6)
			System.out.print("six");
		if(onesDigit==7)
			System.out.print("seven");
		if(onesDigit==8)
			System.out.print("eight");
		if(onesDigit==9)
			System.out.print("nine");
	}//closes ones method
} //end class