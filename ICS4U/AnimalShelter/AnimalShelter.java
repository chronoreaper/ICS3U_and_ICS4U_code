package AnimalShelter;
/**
 * Christopher Duong
 * U6A4 Animal Shelter Tester
 * This is the animal shelter object
 */
import java.util.ArrayList;
public class AnimalShelter {
	ArrayList<Dog> dogList = new ArrayList<Dog>();
	public static void addDog()
	{
		
	}//end add dog
	public String toString()
	{
		String output="";
		output+="Dog List---------------\n";
		output+=dogList;
		return output;
	}//end to string
}//end class
