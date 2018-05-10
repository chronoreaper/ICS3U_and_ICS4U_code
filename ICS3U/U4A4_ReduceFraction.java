import java.util.Scanner;
public class U4A4_ReduceFraction {
	static int num=0,den=0;
	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int numerator=0,denominator=0;
		Scanner ui=new Scanner (System.in);
		System.out.println("This system will print the fraction in the lowest term.\n Enter Numerator");
		//input for numerator
		numerator=Integer.parseInt(ui.next());
		System.out.println("Enter Denominator");
		//input forDenominatior
		denominator=Integer.parseInt(ui.next());
		//call the reducing fraction method
		gcf(numerator, denominator);
		System.out.println("The lowest term for the fraction: "+numerator+"/"+denominator+" is "+num+"/"+den);
	}//end main
	public static void gcf(int numerator, int denominator)
	{
		//if numerator is smaller or equal to the denominator
		if (numerator<=denominator)
		{
			for (int i=numerator; i>0; i--)
			{
				//check for all the possibility for the greatest common factor
				if (numerator%i==0&&denominator%i==0)				
				{
					//divide by GCF
					numerator=numerator/i;denominator=denominator/i;
					num=numerator; den=denominator;
					return;
				}//end if
			}//end loop
		}//end if
		else if (denominator<numerator)
			//if the numerator is greater than the denominator
		{	
			for (int i=denominator; i>0; i--)
			{
				//check for all the possibility for the greatest common factor
				if (numerator%i==0&&denominator%i==0)
				{
					//divide by GCF
					numerator=numerator/i;denominator=denominator/i;
					num=numerator; den=denominator;
					return;
				}//end if
			}//end loop	
		}//end else
	}//end greater common factor
}//end class

