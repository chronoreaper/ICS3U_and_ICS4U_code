import java.io.IOException;
import java.util.Scanner;
public class U5A2_temperaturestats {
	/**
	 * Christopher Duong
	 *Temperatures stats
	 */
	public static void main(String[] args) throws IOException{
		//Variable declaration and initialization
		int total=0;
		//array decoration
		int temp[]=new int[7];
		//array decoration
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
			System.out.println("Enter the tempurature for "+day[i]+ "(°c).");
			temp[i]=Integer.parseInt(ui.next());
		}
		//cycle through all the days of the week
		for (int i=0; i<7; i++)
		{
			System.out.println(day[i]+":"+temp[i]);
		}
		//calculates average
		total=avr(temp);
		System.out.println("Average temp: "+total); 
	}//end main
	public static int avr(int temp[])
	{
		int total=0;
		for (int i=0; i<temp.length; i++)
			//adds all the value of the days	
		{
			total+=temp[i];
		}
		//returns average
		return (total=total/temp.length);
	}
}//end class
