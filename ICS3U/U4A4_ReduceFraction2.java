import java.util.Scanner;
public class U4A4_ReduceFraction2 {
	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int numerator=0,denominator=0,greatestFactor=0;
		Scanner userInput=new Scanner (System.in);
		System.out.println("This system will print the fraction in the lowest term.\nEnter Numerator");
		//input for numerator
		numerator=Integer.parseInt(userInput.next());
		System.out.println("Enter Denominator");
		//input for denominator
		denominator=Integer.parseInt(userInput.next()); 
		//call the reducing fraction method
		System.out.println("The lowest term for the fraction: "+numerator+"/"+denominator+" is ");
		greatestFactor=gcf(numerator, denominator);
		//calculate GCF
		numerator=numerator/greatestFactor;
		denominator=denominator/greatestFactor;
		System.out.print(numerator+"/"+denominator);
	}//end main
	public static int gcf(int numerator, int denominator)
	{
		//variable decoration and initialization
		int factor=0;
		//if numerator is smaller or equal to the denominator
		if (numerator<=denominator)
		{
			for (int i=numerator; i>0; i--)
			{
				//check for all the possibility for the greatest common factor
				if (numerator%i==0&&denominator%i==0)				
				{
					//return GCF
					factor=i; 
					return factor;
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
					//return GCF
					factor=i; 
					return factor;
				}//end if
			}//end loop	
		}//end else
		return factor;
	}//end greater common factor
}//end class

