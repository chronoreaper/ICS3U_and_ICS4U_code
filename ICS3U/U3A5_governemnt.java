import java.text.*;
/**
 * Christopher Duong
 *Government debt
 *Calculates the debt of the government from 2007 to 2010
 */
public class U3A5_governemnt {

	public static void main(String[] args)
	{
		//Variable Declaration, and Initialization
		double debt=481.5;
		//Decimal format
		DecimalFormat oneDigit = new DecimalFormat ("#,##0.0");
		//print out
		System.out.println("Canadian government debt in 2007 was $481.5 billion dollar. The government hopes to lower it by 3% each year.");
		System.out.println("Year 2008 debt: $"+ oneDigit.format (debt/1.03)+" billion dollar.");
		debt=debt/1.03;
		System.out.println("Year 2009 debt: $"+ oneDigit.format (debt/1.03)+" billion dollar.");
		debt=debt/1.03;
		System.out.println("Year 2010 debt: $"+ oneDigit.format (debt/1.03)+" billion dollar.");
	}//end main
}//end class
