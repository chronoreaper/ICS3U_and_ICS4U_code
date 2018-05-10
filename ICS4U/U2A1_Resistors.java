import java.util.Scanner;
/**
 * Christopher Duong
 * Resistors
 * This program will determine the resistance of a resistor
 */
public class U2A1_Resistors {
	public static void main(String[] args) {
		//Variable Declaration And Initialization
		String resistCode=null;
		String[] colour= new String[3];
		int[] resistValu= new int[3];
		int resistance=0;
		Scanner userInput = new Scanner (System.in);
		System.out.println("Enter the Resistor code colour. Seperate each colour by a hyphen.");
		resistCode=userInput.next();
		resistCode=resistCode.replace("-"," ");
		resistCode=resistCode.toUpperCase();
		colour = resistCode.split("\\s+");
		for (int i=0; i<3;i++)
		{
			if (colour[i].equals("BLACK"))
			{
				resistValu[i]=0;
			}
			else if (colour[i].equals("BROWN"))
			{
				resistValu[i]=1;
			}
			else if (colour[i].equals("RED"))
			{
				resistValu[i]=2;
			}
			else if (colour[i].equals("ORANGE"))
			{
				resistValu[i]=3;
			}
			else if (colour[i].equals("YELLOW"))
			{
				resistValu[i]=4;
			}
			else if (colour[i].equals("GREEN"))
			{
				resistValu[i]=5;
			}
			else if (colour[i].equals("BLUE"))
			{
				resistValu[i]=6;
			}
			else if (colour[i].equals("VIOLET"))
			{
				resistValu[i]=7;
			}
			else if (colour[i].equals("GREY"))
			{
				resistValu[i]=8;
			}
			else if (colour[i].equals("WHITE"))
			{
				resistValu[i]=9;
			}//END ELSE
		}//end for
		resistance = (int) (((resistValu[0]*10)+resistValu[1])*Math.pow(10,resistValu[2]));
		System.out.println("The resistance value is:"+resistance);
	}//end class
}//end main
