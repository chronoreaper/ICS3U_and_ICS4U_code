import java.util.Scanner;
/**
 * Christopher Duong
 *	U5A1 Psalms
 *	This program will search through the book of psalms and return the book name.
 */
public class U5A1_psalms {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int[]psalmsList={1,2,4,7,8,12,15,18,22,23,26,29,33,37,40,44,49,58,63,68,71,81,86,94};
		int psalmsNumber=0;
		int foundPsalms=0;
		String psalmsName=null;
		Scanner userInput=new Scanner(System.in);
		System.out.println("Which psalms number would you like to see? (1-99)");
		psalmsNumber=userInput.nextInt();
		//call the searcher to see if this psalms exist in the database
		foundPsalms=psalmsSearcher(psalmsList,psalmsNumber,0,psalmsList.length-1);
		//check the name of the psalms
		if (foundPsalms>=0)
		{
			psalmsName=psalmsNameFinder(foundPsalms);
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
	private static String psalmsNameFinder(int psalmsNumber) {
		//Variable Declaration and Initialization
		String[]psalmsName={"The two ways",
				"The messianic drama",
				"Evening prayer",
				"Prayer of the virtuous under persecution",
				"The munificence of the creator",
				"Against a deceitful world",
				"Yahweh, my heritage",
				"Song of triumph for the king",
				"The sufferings and hope of the virtuous man",
				"The good shepherd",
				"Prayer of the blameless",
				"Hymn to the lord of the storm",
				"Hymn to Providence",
				"The fate of the virtuous and the wicked",
				"Song of praise and prayer for help",
				"National lament",
				"The futility of riches",
				"The Judge of earthly judges",
				"Desire for God",
				"National song of triumph",
				"An old man's prayer",
				"For the feast of Tabernacles",
				"Prayer in ordeal",
				"The justice of God"};
		return psalmsName[psalmsNumber];
	}//end psalms name finder
}//end class
