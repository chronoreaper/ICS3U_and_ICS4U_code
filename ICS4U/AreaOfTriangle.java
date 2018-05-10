import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Christopher Duong
 * Area of Triangle
 * Calculates the area of a triangle
 */
public class AreaOfTriangle {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		double sideA=0,sideB=0,sideC=0,areaTri=0,heronSide=0;
		DecimalFormat hundredsDigit = new DecimalFormat ("#.##");
		Scanner userInput=new Scanner(System.in);
		System.out.println("This program will calculate the area of a triangle.");
		System.out.println("Lenght of side A:");
		sideA=userInput.nextDouble();
		System.out.println("Lenght of side B:");
		sideB=userInput.nextDouble();
		System.out.println("Lenght of side C:");
		sideC=userInput.nextDouble();
		heronSide=(sideA+sideB+sideC)/2;
		//calculates the area of the triangle
		areaTri=Math.sqrt(heronSide*(heronSide-sideA)*(heronSide-sideB)*(heronSide-sideC));	
		System.out.println("The area of the trianlgle is "+hundredsDigit.format(areaTri));
	}//end main
}//end class
