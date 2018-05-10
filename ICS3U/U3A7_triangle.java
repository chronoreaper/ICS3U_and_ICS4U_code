import java.util.Scanner;
public class U3A7_triangle {
	/**
	 * Christopher Duong
	 * Triangle
	 *Create a triangle
	 */
	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		double one=0, two=0, three=0;
		//user input
		Scanner user_input = new Scanner(System.in);
		System.out.println("Input three numbers. If one number is greater than the sum of the other two numbers, it is not a triangle.");
		System.out.print("Input number one: ");
		//input for number 1
		one= Double.parseDouble (user_input.next());
		System.out.print("Input number two: ");
		//input for number 2
		two= Double.parseDouble (user_input.next());
		System.out.print("Input number three: ");
		//input for number 3
		three= Double.parseDouble (user_input.next());
		//check if the pair is greater than the other number 
		if (one+two>three && two+three>one && three+one>two)
		{
			System.out.print("Triangle! ");
		}
		else  
		{
			System.out.print("Not triangle!");
		}//end if
	}//end main
}//end class
