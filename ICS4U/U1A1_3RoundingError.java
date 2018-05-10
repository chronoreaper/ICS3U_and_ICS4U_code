import javax.swing.*;
public class U1A1_3RoundingError {
	/**
	 * Christopher Duong
	 * Rounding Errors
	 * Compares the square of the square root of a number
	 */
	public static void main(String[] args) {
		//variable declaration and initialization
		int numb=0;
		double roundOff=0;
		double diffOfSquare=0;
		String userInput = JOptionPane.showInputDialog("Enter a number to compair the number to it's square of it's square root");
		numb = Integer.parseInt(userInput);
		roundOff= Math.pow(Math.sqrt(numb), 2);
		diffOfSquare=numb-roundOff;
		System.out.println("The square of the square root is "+roundOff);
		System.out.println("The diffrence of square for "+numb+" is "+diffOfSquare);
	}//end main
}//end class
