import javax.swing.*;
public class U1A1_2EasterVariation2 {
	/**
	 * Christopher Duong
	 * Easter Variation 2
	 * Calculates the day easter will be on from the year
	 */
	public static void main(String[] args) {
		//Variable declaration and Initialization
		int a, b, c, d, f, g, h, j, k, n, p, q;
		int month;  //Easter month
		int day;    //Easter day
		int year;   //Easter's year
		String monthStr;
		//Ask user for year
		String yearStr = JOptionPane.showInputDialog("Easter Date Calculator\nPlease enter a year");
		//Convert the year from a String to an int
		year = Integer.parseInt(yearStr);
		//Calculations
		a = year / 100;
		b = year % 100;
		c = (3*(a+25))/4;
		d = (3*(a+25))%4;
		q = (8*(a+11))/25;
		f = (5*a+b)%19;
		g = (19*f+c-q)%30;
		h = (f+11*g)/319;
		j = (60*(5-d)+b)/4;
		k = (60*(5-d)+b)%4;
		n = (2*j - k - g + h)%7;
		month = (g - h + n + 114)/31;
		p = (g - h + n + 114)%31;
		day = (p+1)/1;

		//determine the month in String format
		if(month == 3){
			monthStr = "March";
		} else {
			monthStr = "April";
		}
		//Display the results
		JOptionPane.showMessageDialog(null, "Easter will fall on Sunday, "+monthStr+" "+day+", "+year);
	}//end main
}//end class
