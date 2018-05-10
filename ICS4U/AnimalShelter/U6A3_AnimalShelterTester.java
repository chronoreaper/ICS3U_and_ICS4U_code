package AnimalShelter;
/**
 * Christopher Duong
 * U6A3 Animal Shelter Tester
 * This program Simulates an animal shelter
 */
import javax.swing.JOptionPane;
public class U6A3_AnimalShelterTester {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		String myInput = "";
		AnimalShelter shelterOne = new AnimalShelter();
		while(!myInput.equals("5")) {
		  myInput = JOptionPane.showInputDialog(
		    "Please choose from the following menu:\n" +
		    "1 – Display list of dogs\n" +
		    "2 - Add a dog to the shelter\n" +
		    "3 - Remove a dog from the shelter\n" +
		    "4 - Display the operating cost of the shelter\n" +
		    "5 - Exit the program");
		  if(myInput.equals("1")) {
		    //Display the list of dogs
		  }
		  else if(myInput.equals("2")) {
		    //Add a dog object
		  }
		  else if(myInput.equals("3")) {
		    //Remove a dog object
		  }
		  else if(myInput.equals("4")) {
		    //Display the operating cost
		  }
		  else {
		    //Display invalid input
		  }//end if statement
		}//end while
	}//end main
}//end class
