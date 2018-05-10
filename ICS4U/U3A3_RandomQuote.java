import java.io.*;
import java.util.*;
/**
 * Christopher Duong
 * Random Quote
 * Prints out one random quote from a txt
 */
public class U3A3_RandomQuote {
	public static void main(String[] args) throws IOException {
		//Variable Declaration and Initialization
		String fileLocation = null;
		String line = null;
		String quote = null;
		int randomNumb = 0;
		ArrayList<String> stringList = new ArrayList<String>();
		Scanner userInput = new Scanner(System.in);
		BufferedReader readFile;
		System.out.println("Enter File name with the .txt: ");
		fileLocation = userInput.next();
		readFile = new BufferedReader(
				new FileReader("C:/Personal/"+fileLocation));
		//puts each line into the string list
		while ((line = readFile.readLine()) != null) {
			stringList.add(line);
		}//end printing the txt file
		//selects and prints a random quote
		randomNumb = (int) (Math.random() * stringList.size());
		quote = stringList.get(randomNumb);
		System.out.println("Quote of the day: \n"+quote);
	}//end main
}//end class
