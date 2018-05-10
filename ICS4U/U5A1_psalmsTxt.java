import java.util.Scanner;
import java.io.*;
/**
 * Christopher Duong
 *	U5A1 Psalms
 *	This program will search through the book of psalms and return the book name.
 */
public class U5A1_psalmsTxt {
	public static void main(String[] args) throws IOException{
		// Variable Declaration and Initialization
		BufferedReader readFile=new BufferedReader(
				new FileReader("C:/Personal/psalms.txt"));
		int[]psalmsList;
		int psalmsNumber=0;
		int foundPsalms=0;
		String[] psalmsArray=null;
		String[] psalmsNameList=null;
		String line=null;
		String readNumb="";
		String readName="";
		String psalmsName=null;
		Scanner userInput=new Scanner(System.in);
		//read the psalms from the txt file
		while ((line = readFile.readLine()) != null) {
			readNumb+=line+" ";
			//skips the next line
			line=readFile.readLine();
			readName+=line+"/";
		}//end loop
		//stores the number in a string array
		psalmsArray=readNumb.split(" ");
		psalmsList=new int[psalmsArray.length];
		System.out.println(psalmsList);
		//changes string into int
		for (int i=0;i<psalmsArray.length;i++)
		{
			psalmsList[i]=Integer.parseInt(psalmsArray[i]);
		}//end loop
		//adds the name to an array
		psalmsNameList=readName.split("/");
		System.out.println("Which psalms number would you like to see? (1-99)");
		psalmsNumber=userInput.nextInt();
		//call the searcher to see if this psalms exist in the database
		foundPsalms=psalmsSearcher(psalmsList,psalmsNumber,0,psalmsList.length-1);
		//check the name of the psalms
		if (foundPsalms>=0)
		{
			psalmsName=psalmsNameList[foundPsalms];
			System.out.println("psalms "+psalmsNumber);
			System.out.println(psalmsName);
		}
		else
		{
			System.out.println("Could not find the psalms");
		}//end if statment
	}//end main
	public static int psalmsSearcher(int[] psalmsList, int search,int left,int right)
	{
		//Variable Declaration and initialization
		int middle=0;
		//prints out what is being searched for
		System.out.print("Searching: ");
		for (int i=left; i<=right;i++)
		{
			System.out.print("["+psalmsList[i]+"]");
		}
		System.out.println("for "+search);
		//set middle
		middle=(int)((left+right)/2);
		//check if beyond the list
		if (left>right)
		{
			return -1;
		}
		//checks if search is found
		if (psalmsList[middle]==search)
		{
			return middle;
		}
		//check if middle is greater or less than the search number
		if (psalmsList[middle]>search)
		{
			//set middle to right
			return psalmsSearcher(psalmsList,search,left,middle-1);
		}
		else
		{
			//set middle to left
			return psalmsSearcher(psalmsList,search,middle+1,right);
		}//end if statement
	}//end psalms Search
}//end class
