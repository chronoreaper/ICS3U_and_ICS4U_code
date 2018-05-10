import java.text.*;

/**
 * Christopher Duong
 * Compound Investing
 * Calculates compound interest
 */
import java.util.Scanner;
public class U3A8_CompoundInvesting {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int year=0,maxyear=0;
		double startAmount=0, amount=0, intrest=0, total=0,intrestAmount=0;
		//Variable assignment
		year=1;
		amount=150;
		//space format
		String space="\t", spacein="\t",spaceto="\t" ;
		//decimal format
		DecimalFormat twodigit= new DecimalFormat ("#0.00");
		DecimalFormat zerodigit= new DecimalFormat ("#,#0");
		//user input
		Scanner user_input = new Scanner (System.in);
		System.out.print("This is a compound invester calculator. Enter your starting amount($): ");
		//starting amount of money
		startAmount=Double.parseDouble(user_input.next());
		System.out.print("Enter the intrest your yearly intrest(%): ");
		//yearly interest
		intrestAmount=Double.parseDouble(user_input.next());
		System.out.print("Enter the years to calculate: ");
		//years that you want to calculate
		maxyear=(int)Double.parseDouble(user_input.next());
		//chart
		System.out.println("Year	|Amount		|Intrest	|Total		|");
		//how much money you gain
		intrest=intrestAmount/100*amount;
		//total money
		total=intrest+amount;
		//loop space formating
		while (year<=maxyear)
		{
			if (amount <=1000)
			{
				space = "\t\t";
			}
			else
			{
				space = "\t";
			}
			if (intrest <=1000)
			{
				spacein = "\t\t";
			}
			else
			{
				spacein = "\t";
			}
			if (total <=1000)
			{
				spaceto = "\t\t";
			}
			else
			{
				spaceto = "\t";
			}
			System.out.println(zerodigit.format(year)+"\t|"+twodigit.format(amount)+space+"|"+twodigit.format(intrest)+spacein+"|"+twodigit.format(total)+spaceto+"|");
			//year plus 1
			year++;
			//amount for the next year
			amount=startAmount+total;
			//money gained
			intrest=(intrestAmount/100)*amount;
			//total money
			total=intrest+amount;
		}//end loop
	}//end main
}//end class
