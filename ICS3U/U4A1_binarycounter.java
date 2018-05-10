import javax.swing.*;
public class U4A1_binarycounter {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int binNum=0;//Variable Declaration
		String binary=null;
		//USer input
		JFrame frame=new JFrame("imput Dialog");
		String input1 = JOptionPane.showInputDialog(frame,"This is a Binary converter. Binary numbers are 8 digits long containing only 1s and 0s. Type in a binary number: ");
		binary=input1;
		binNum=(Character.getNumericValue(binary.charAt(0))*(int)Math.pow(2, 7)+Character.getNumericValue(binary.charAt(1))*(int)Math.pow(2, 6)+Character.getNumericValue(binary.charAt(2))*(int)Math.pow(2, 5)+Character.getNumericValue(binary.charAt(3))*(int)Math.pow(2, 4)+Character.getNumericValue(binary.charAt(4))*(int)Math.pow(2, 3)+Character.getNumericValue(binary.charAt(5))*(int)Math.pow(2, 2)+Character.getNumericValue(binary.charAt(6))*(int)Math.pow(2, 1)+Character.getNumericValue(binary.charAt(7))*(int)Math.pow(2, 0));
		//the decimal binary number equals the first digit times 2 to the power of 7 plus the second digit times 2 to the power of 6... plus the eight digit times 2 to the power of 0
		//system print out
		System.out.println("Binary number: "+binary+" = "+binNum);
	}//end main
}//end class
