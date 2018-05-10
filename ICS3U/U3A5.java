import java.util.Scanner;
public class U3A5 {
	/**
	 * Christopher Duong
	 * RECTANGLE CALCULATOR
	 * Calculates the area and perimeter of a rectangle
	 */
	public static void main(String[] args) {
		//Variable decoration, and Initialization
		int length=0, width=0;
		//user input
		Scanner userinput=new Scanner (System.in);
		System.out.println("Rectangle Calculation");
		System.out.println("Enter rectangle width: ");
		width=Integer.parseInt (userinput.next());
		System.out.println("Enter rectangle length: ");
		length=Integer.parseInt (userinput.next());
		System.out.println("Rectangle perimeter is "+ (2*(length+width)) +" and Rectangle area is "+ (length*width));
	}
}
