import java.io.*;
import java.util.Scanner;
/**
 * Christopher Duong
 * Textfile reader
 * Reads a .txt file
 */
public class U3A3_TextFileReader {
	public static void main(String[] args) throws IOException {
		//Variable Declaration and Initialization
		String fileLocation = null;
		String line = null;
		Scanner userInput = new Scanner(System.in);
		BufferedReader readFile;
		System.out.println("Enter File name with the .txt: ");
		fileLocation = userInput.next();
		readFile = new BufferedReader(
				new FileReader("C:/Personal/"+fileLocation));
		//prints out the content of the txt file
		System.out.println(fileLocation);
		while ((line = readFile.readLine()) != null) {
			System.out.println(line);
		}//end printing the txt file
	}//end main
}//end class
