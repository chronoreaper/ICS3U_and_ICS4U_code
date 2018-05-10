import javax.swing.*;
import java.io.*;
/**
 * Christopher Duong
 * Customer List
 * This program will store and read customers info
 */
public class U3A4_CustomerList {
	public static void main(String[] args)throws IOException {
		// Variable declaration and Initialization
		String line=null, input=null, customerInfo=null;
		String[] addressCheck=null;
		String[] postalCheck=new String[7];
		int errorCheckInt=0;
		boolean errorCheck = false;
		PrintWriter fileOut = new PrintWriter(new FileWriter(
				"Customers.txt",true));
		//trys to read the txt file
			BufferedReader readFile = new BufferedReader(
					new FileReader("C:/Personal/Chris/Computer_Science2/Customers.txt"));
			//Initializes the txt for the first time
			if (readFile.readLine()==null){
				fileOut.println("Name	|Address	|City	|Province	|Postal Code");
			}
			//prints out each line
			System.out.println("Name	|Address	|City	|Province	|Postal Code");
			while ((line = readFile.readLine()) != null) {
				System.out.println(line);
			}//end loop
		//adds name
		input=JOptionPane.showInputDialog("Enter new Customer's name.");
		input=input.toUpperCase();
		customerInfo=input+"	|";
		//adds address
		do{
			input=JOptionPane.showInputDialog("Enter the address of the Customer.");
			addressCheck= input.split(" ");
			//checks for the number in the address
			try {
				errorCheckInt = Integer.parseInt(addressCheck[0]);
				errorCheck = false;
			} catch (NumberFormatException e) {
				System.out.println("Error. Please re enter the address.");
				errorCheck = true;
			}//end check if not numeric
		}//end address
		while (errorCheck==true);
		input=input.toUpperCase();
		customerInfo+=input+"	|";
		//enter the city
		input=JOptionPane.showInputDialog("Enter new Customer's city.");
		input=input.toUpperCase();
		customerInfo+=input+"	|";
		//enter the province
		input=JOptionPane.showInputDialog("Enter new Customer's province.");
		input=input.toUpperCase();
		customerInfo+=input+"	|";
		//enter the postal code
		do{
			input=JOptionPane.showInputDialog("Enter the postal code of the Customer. (L#L #L#)");
			errorCheck=false;
			//checks if the postal code is greater than 7
			if (input.length()>7){
				errorCheck=true;
				System.out.println("Error. Incorrect format. Please re enter the postal code.");
			}
			if (errorCheck==false)
			for (int i=0; i<7; i++)
			{
				postalCheck[i]=input.substring(i,i+1);
			}
			//checks for the number in the postal code
			if (errorCheck==false)
			try {
				//checks the third fourth and sixth number in the postal code to see if they are numbers
				errorCheckInt = Integer.parseInt(postalCheck[1]);
				errorCheckInt = Integer.parseInt(postalCheck[4]);
				errorCheckInt = Integer.parseInt(postalCheck[6]);
				errorCheck = false;
			} catch (NumberFormatException e) {
				System.out.println("Error. Incorrect format. Please re enter the postal code.");
				errorCheck = true;
			}//end check if not numeric
			//check the letter
		}//end address
		while(errorCheck==true);
		input=input.toUpperCase();
		customerInfo+=input;
		fileOut.println(customerInfo);
		fileOut.close();
		System.out.println("Newly Stored Information");
		System.out.println(customerInfo);
	}//end main
}//end class
