import java.io.IOException;
import java.util.Scanner;
public class U5A1_temperatures {
	/**
	 * Christopher Duong
	 *Temperatures
	 */
	public static void main(String[] args) throws IOException{
		//array declaration
		String temp[]=new String[7];
		//array declaration
		String day[]=new String[7];
		day[0]="Monday";
		day[1]="Tuesday";
		day[2]="Wedsday";
		day[3]="Thursday";
		day[4]="Friday";
		day[5]="Saturday";
		day[6]="Sunday";
		//user input
		Scanner ui=new Scanner(System.in);
		//cycle through all the days of the week
		for (int i=0; i<7; i++)
		{
			System.out.println("Enter the tempurature for "+day[i]+ ".");
			temp[i]=ui.next();
		}
		//cycle through all the days of the week
		for (int i=0; i<7; i++)
		{
			System.out.println("The tempurature for "+day[i]+" is "+temp[i]+".");
		}
	}//end main
}//end class
