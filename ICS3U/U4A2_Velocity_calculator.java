import java.io.IOException;
import java.util.Scanner;
/**
 * Christopher Duong
 *Velocity Calculator
 */
public class U4A2_Velocity_calculator {


	//will store the calculated velocity in the subroutine velocityCalculator
	static double velocity;

	public static void main(String[] args) throws IOException {
		// user input
		Scanner userinput=new Scanner (System.in);
		//initiates do-while loop for the first time
		int tryAgain = 1;

		System.out.println("VELOCITY CALCULATOR");
		do {
			System.out.println("===================");
			System.out.println();
			System.out.println("Enter a distance (metres):");
			//user inputs a distance in metres
			double distance = Integer.parseInt(userinput.next());
			System.out.println();
			System.out.println("Enter a time (seconds):");
			//user inputs a time in seconds
			double time = Integer.parseInt(userinput.next());
			System.out.println();

			//Call the velocity Calculator method
			velocityCalculator(distance, time);

			//Output the answer
			System.out.println("The velocity is " + velocity + " m/s.");
			System.out.println();
			System.out.println("Press 1 to try again.");
			//user inputs whether or not they want to try again
			tryAgain = Integer.parseInt(userinput.next());
		} while (tryAgain == 1);

	}//end main
	//this subroutine will calculate the velocity and print it
	public static void velocityCalculator(double distance, double time)
	{
		velocity=distance/time;//calculates the velocity
	}//closes velocityCalculator method
}//end class