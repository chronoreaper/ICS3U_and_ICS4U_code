import java.io.IOException;
import javax.swing.*;
/**
 * Christopher Duong
 * SIN Number Checker
 * Checks the sin number
 */
public class U4A1_SINchecker {

	public static void main(String[] args)  throws IOException{
		//Variable Declaration, and Initialization
		String sin=null;
		//Variable Declaration
		int num[]=new int[9],numtemp=0,numtotal1=0,numtotal2=0;
		JFrame frame = new JFrame("input Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"This is a SIN checker. SIN numbers are nine digits. Type a SIN number.(eg 130692544)");
		sin=input1;
		//remembering the numbers and convert string to number
		for (int i=0; i<9; i++)
		{
			num[i]=Character.getNumericValue(sin.charAt(i));
		}//end loop
		//calculation for even side numbers
		for (int i=1; i<8; i+=2)
		{
			num[i]=num[i]*2;
			//if the number is a two digit number, add the two digits together
			if (num[i]>10){
				numtemp=(int)num[i]/10;
				num[i]=num[i]-10+numtemp;
			}//end if
		}//end loop
		//add all the even side number
		numtotal1=num[1]+num[3]+num[5]+num[7];
		//add all the odd side number
		numtotal2=num[0]+num[2]+num[4]+num[6];
		//add both of the numbers
		numtotal1=numtotal1+numtotal2;
		//check for next highest digit ending in a zero
		numtotal2=((int)numtotal1/10)*10+10;
		//check if the next highest digit minus the sum off the other digits equals the last number
		if (numtotal2-numtotal1==num[8])
			System.out.println("This is a SIN number.");
		else
			System.out.println("This is a Not SIN number.");
	}//end main
}//end class
