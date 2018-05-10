import java.io.IOException;
import java.util.Scanner;
public class U4A3_GrossWage2 {
	static double grossWage,grossWageBan,grossWageChi,grossWageDom,grossWageHai;;//gross wage that will be calculated in the calculateGrossWage method, and printed in main method
	public static void main(String[] args) throws IOException 
	{
		Scanner ui=new Scanner(System.in);// user input


		System.out.println("Gross Wage Calculator II");
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
		System.out.println("Gross wage Canada: $"+grossWage+"\n"+"Gross wage Bangladesh: $"+grossWageBan+"\n"+"Gross wage China: $"+grossWageChi+"\n"+"Gross wage Dominican Republic: $"+grossWageDom+"\n"+"Gross wage Haiti: $"+grossWageHai );//displays gross wage to user

	}//closes main body

	static void calculateGrossWages(double rate, double hours){
		//calculates the gross wages for other country
		grossWageBan=0.15*hours; 
		grossWageChi=0.48*hours; 
		grossWageDom=1.6*hours; 
		grossWageHai=0.55*hours;
		if (hours<=40)
		{
			grossWage=rate*hours;
		}
		else if (hours>=41)
		{
			grossWage=rate*40;
			hours-=40;
			grossWage+=rate*hours*1.5;
		}
 
	}//closes calculateGrossWages
}//end class
