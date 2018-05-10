import java.io.IOException;
import java.util.Scanner;
public class U4A3_Standardtime {
	//will hold am/pm for standard time 
	static String amPM;
	//will store traditional time from user
	static String traditionalTime;
	//will store hours and minutes
	static int mins1, mins2, hours;
	public static void main(String[] args) throws IOException {
		Scanner userin=new Scanner (System.in);
		//will initial do-while loop
		int tryAgain=1;
		System.out.println("Standard Time to Traditional Time Converter");
		System.out.println("===========================================");
		do{
			System.out.println();
			System.out.println("Input a time in Standard Form (HH:MM:SS):");
			//user inputs time in standard form
			String standardTime=userin.next();
			System.out.println();
			do{
				if ((standardTime.length())!=8){
					System.out.println("Invalid time entered.");
					System.out.println("Input a time in Standard Form that has this form HH:MM:SS ...");
					//user inputs time in standard form
					standardTime=userin.next();
					System.out.println();
				}//end if
			}//end loop
			while((standardTime.length())!=8);
			convertToTraditional(standardTime);
			System.out.println(standardTime+" is equivalent to "+traditionalTime+" "+amPM);
			System.out.println();
			System.out.println("Enter 1 to try again.");
			//user decides to try again
			tryAgain=Integer.parseInt(userin.next());
		}//end loop
		//will repeat if user enters 1
		while(tryAgain==1);
	}//closes main body
	public static void convertToTraditional(String standardTime)
	{
		int first=0,second=0;
		int hour=0;
		String min=null;
		first=standardTime.charAt(0);
		second=standardTime.charAt(1);
		first=Character.getNumericValue(first);
		second=Character.getNumericValue(second);
		hour=first*10+second;
		if (hour>=13)
		{
			hour-=12;
			amPM= "PM";
		}
		else if (hour<=0)
		{
			hour=12;
			amPM="AM";
		}
		else if (hour==12)
		{
			amPM= "PM";
		}
		else
		{
			amPM= "AM";
		}//end if
		min=standardTime.substring(3,5);
		traditionalTime=hour+":"+min;
	}//end main
}//end class
