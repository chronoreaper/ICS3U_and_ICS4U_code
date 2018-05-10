import java.util.Scanner;
public class U3A7_righttriangle {
	/**
	 *Christopher Duong
	 *Right-angle Triangle
	 *Create a right angled triangle 
	 */
	public static void main(String[] args) {
		//Variable Declarations, and Initializations
		double sideOne=0, sideTwo=0, sideThree=0;
		//user input
		Scanner user_input = new Scanner(System.in);
		System.out.println("Input sideThree numbers to see if it would make a right angle triangle.");
		System.out.print("Input number sideOne: ");
		//input of number 1
		sideOne= Double.parseDouble (user_input.next());
		System.out.print("Input number sideTwo: ");
		//input of number 2
		sideTwo= Double.parseDouble (user_input.next());
		System.out.print("Input number sideThree: ");
		//input of number 3
		sideThree= Double.parseDouble (user_input.next());
		//check for right angle triangle
		sideOne*=sideOne;
		sideTwo*=sideTwo;
		sideThree*=sideThree;
		if (sideOne+sideTwo==sideThree||sideThree+sideTwo==sideOne||sideOne+sideThree==sideTwo)
		{
			System.out.print("Right angle triangle! ");
		}//end if
		//if not a right angle triangle
		else 
		{
			System.out.print("Not right angle triangle!");
		}//end else
	}//end main
}//end class
