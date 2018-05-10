import javax.swing.*;
public class U4A1_binarycounter2 {
	/**
	 * Christopher Duong
	 * Binary Counter
	 * Converts binary number into numbers
	 */

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		String binary=null;
		int num[]= new int[7],binNum=0;
		JFrame frame=new JFrame("imput Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"This is a Binary converter. Binary numbers are 8 digits long containing only 1s and 0s. Type in a binary number: ");
		binary=input1;
		for (int i=0; i<8; i++)
		{
			//the decimal binary number equals the first digit times 2 to the power of 7 plus the second digit times 2 to the power of 6... plus the eight digit times 2 to the power of 0
			binNum+=(Character.getNumericValue(binary.charAt(i))*(int)Math.pow(2, 7-i));
		}//end loop
		//system print out
		System.out.println("Binary number: "+binary+" = "+binNum);
	}//end main
}//end class
