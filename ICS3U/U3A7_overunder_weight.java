import java.util.Scanner;
import java.text.*;
public class U3A7_overunder_weight {
	/**
	 * Christopher Duong
	 * Weight Tracker
	 * Calculates your body mass index
	 */
	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int option=0;
		double bodyMass=0;
		//user input
		Scanner user_input = new Scanner (System.in);
		//Decimal format
		DecimalFormat twoDigit = new DecimalFormat ("#,##0.00");
		System.out.print("This is a Body mass index. Input 1 for Metric, 2 for Imperial: ");
		//check if you want metric system or imperial
		option= (int) Double.parseDouble (user_input.next());
		//metric
		if (option==1)
		{
			System.out.print("Enter your weight(Kg): ");
			//check weight
			bodyMass= Double.parseDouble (user_input.next());
			System.out.print("Enter your height(m): ");
			//calculations
			bodyMass= bodyMass/Math.pow((Double.parseDouble (user_input.next())), 2);
			//results
			System.out.println("Your BMI is: "+twoDigit.format (bodyMass));
			if (bodyMass<=14)
				System.out.println("You are Starving!");
			else if (bodyMass<=18.5)
				System.out.println("You are Underweight.");
			else if (bodyMass<=25)
				System.out.println("You are Ideal.");
			else if (bodyMass<=30)
				System.out.println("You are Overweight.");
			else if (bodyMass<=40)
				System.out.println("You are Obese.");
			else 
				System.out.println("You are Morbidly Obese!");
			//end if
		}//end metric system
		//imperial system
		else if (option==2)
		{
			System.out.print("Enter your weight(Lbs): ");
			//check weight
			bodyMass= Double.parseDouble (user_input.next());
			System.out.print("Enter your height(in): ");
			//calculations
			bodyMass=(bodyMass*703)/Math.pow((Double.parseDouble (user_input.next())), 2);
			//results
			System.out.println("Your BMI is: "+twoDigit.format (bodyMass));
			if (bodyMass<=14)
				System.out.println("You are Starving!");
			else if (bodyMass<=18.5)
				System.out.println("You are Underweight.");
			else if (bodyMass<=25)
				System.out.println("You are Ideal.");
			else if (bodyMass<=30)
				System.out.println("You are Overweight.");
			else if (bodyMass<=40)
				System.out.println("You are Obese.");
			else 
				System.out.println("You are Morbidly Obese!");
			//end if
		}//end imperial
	}//end main
}//end class
