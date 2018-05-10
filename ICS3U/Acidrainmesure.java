import java.util.Scanner;
/**
 *Christopher Duong
 *PH level measure
 *Tells if the Ph level of the water is safe or not
 */
public class Acidrainmesure {

	public static void main(String[] args) {
		//Variable declaration, and Initialization
		double num=0;
		//user input
		Scanner user_input = new Scanner(System.in);
		System.out.print("Write a Ph level to measure if the water is safe or not: ");
		num=Double.parseDouble ( user_input.next());
		//if greater than 7.5
		if (num > 7.5)
		{
			System.out.println("Water is too Alkaline.");
		}
		// if number is less than 6.5
		else if (num <6.5)
		{
			System.out.println("Water is too Acidic.");
		}
		//if number is in between 6.5 and 7.5
		else
		{
			System.out.println("Water is safe.");
		}//end if
	}//end main
}//end class
