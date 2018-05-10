import javax.swing.*;
/**
 * Christopher Duong
 * SIN Number Checker
 * Checks the sin number
 */
public class U4A1_SINchecker2 {

	public static void main(String[] args) {
		String sin=null;//Variable Declaration, and Initialization
		int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0,numtemp=0,numtotal1=0,numtotal2=0;//Variable Declaration
		JFrame frame = new JFrame("input Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"This is a SIN checker. SIN numbers are nine digits. Type a SIN number.(eg 130692544)");
		sin=input1;
		num1=sin.charAt(0);//remember the first number
		num2=sin.charAt(1);
		num3=sin.charAt(2);
		num4=sin.charAt(3);
		num5=sin.charAt(4);
		num6=sin.charAt(5);
		num7=sin.charAt(6);
		num8=sin.charAt(7);
		num9=sin.charAt(8);//remember the last number
		num1=Character.getNumericValue(num1);//change the string to a number
		num2=Character.getNumericValue(num2);
		num3=Character.getNumericValue(num3);
		num4=Character.getNumericValue(num4);
		num5=Character.getNumericValue(num5);
		num6=Character.getNumericValue(num6);
		num7=Character.getNumericValue(num7);
		num8=Character.getNumericValue(num8);
		num9=Character.getNumericValue(num9);
		num2=num2*2;//calculation
		num4=num4*2;
		num6=num6*2;
		num8=num8*2;
		if (num2>10){//if the number is a two digit number, add the two digits together
			numtemp=(int)num2/10;
			num2=num2-10+1;
		}
		if (num4>10){//if the number is a two digit number, add the two digits together
			num4=num4-10+1;
		}
		if (num6>10){//if the number is a two digit number, add the two digits together
			num6=num6-10+1;}
		if (num8>10){//if the number is a two digit number, add the two digits together
			num8=num8-10+1;}
		numtotal1=num2+num4+num6+num8;//add all the even side number
		numtotal2=num1+num3+num5+num7;//add all the odd side number
		numtotal1=numtotal1+numtotal2;//add both of them
		numtotal2=((int)numtotal1/10)*10+10;//check for next highest digit ending in a zero
		if (numtotal2-numtotal1==num9)//check if the next highest digit minus the sum off the other digits equals the last number
			System.out.println("This is a SIN number.");
		else
			System.out.println("This is a Not SIN number.");

	}//end main

}//end class
