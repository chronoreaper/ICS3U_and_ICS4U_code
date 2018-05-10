import java.io.IOException; 
import java.util.Scanner;
/**
 * Christopher Duong
 *
 */
public class U4A3_GrossWage {
	//gross wage that will be calculated in the calculateGrossWage method, and printed in main method
	static double grossWage;
	public static void main(String[] args) throws IOException 
	{
		// user input
		Scanner ui=new Scanner(System.in);
		System.out.println("Gross Wage Calculator");
		System.out.println("=====================");
		System.out.println();
		System.out.println("Enter the number of hours worked:");
		//user inputs hours
		double hours = Double.parseDouble(ui.next());
		System.out.println();
		System.out.println("Enter the hourly rate of pay (in $):");
		//user inputs hourly rate
		double rate = Double.parseDouble(ui.next());
		System.out.println();
		//calls method to calculate gross wage
		calculateGrossWages(rate, hours);
		//displays gross wage to user
		System.out.println("Gross wage: $"+grossWage);
	}//closes main body

	static void calculateGrossWages(double rate, double hours){
		if (hours<=40)
		{
			grossWage=rate*hours;
		}
		else if (hours>=41)
		{
			grossWage=rate*40;
			hours-=40;
			grossWage+=rate*hours*1.5;
		}//end if
	}//closes calculateGrossWages
}//end class
