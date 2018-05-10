import java.util.Scanner;
/**
 * Christopher Duong
 * U5A3 Search Efficiencies
 * This program will determine the efficiencies of the three search types
 */
public class U5A3_SearchEfficiencies {
	public static long time=0,loops=0,compare=0;
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int numbOfRand=0, findNumb=0;
		int[] randomNumb = null;
		boolean foundNumb=false;
		Scanner userInput= new Scanner(System.in);
		System.out.println("How many random numbers would you like to create?");
		numbOfRand=userInput.nextInt();
		//makes the array the length of the input
		randomNumb=new int[numbOfRand];
		//calls the random number generator and fills in the array
		randomNumbGenerator(numbOfRand,randomNumb);
		//prints out the sorted numbers
		for (int i:randomNumb)
		{
			System.out.println(i);
		}//end loop
		//ask what number to find
		System.out.println("What Number Do you want to search for?");
		findNumb=userInput.nextInt();
		//sets global variable to zero
		time=System.currentTimeMillis();
		compare=0;
		loops=0;
		//unsorted linear search
		foundNumb=linearSearch(randomNumb,findNumb);
		time=System.currentTimeMillis()-time;
		//prints the data
		printData("linear Search", foundNumb);
		//sorts the numbers for the last two searching methods
		insertionSort(randomNumb);
		//sets global variable to zero
		time=System.currentTimeMillis();
		compare=0;
		loops=0;
		//Do a linear search
		foundNumb=linearSortedSearch(randomNumb,findNumb);
		time=System.currentTimeMillis()-time;
		//prints the data
		printData("Sorted linear Search", foundNumb);
		//sets global variable to zero
		time=System.currentTimeMillis();
		compare=0;
		loops=0;
		//do a binary search
		foundNumb=binarySearch(randomNumb,findNumb,0,randomNumb.length-1);
		time=System.currentTimeMillis()-time;
		//prints the data
		printData("Binary Search", foundNumb);
	}//end main
	private static void printData(String string, boolean foundNumb) {
		System.out.println("===========================");
		System.out.println("Search Method: "+string);
		System.out.println("Return: "+foundNumb);
		System.out.println("Loops: "+loops);
		System.out.println("Compare: "+compare);
		System.out.println("Time: "+time+"ms");
	}//end data printer
	private static void insertionSort(int[] randomNumb) {
		// Variable Declaration and Initialization
		int moveItem=0,insert=0;
		for (int i=1; i<randomNumb.length;i++)
		{
			moveItem=i;
			insert=randomNumb[i];
			//sorts the item in the list
			while (moveItem>0&&randomNumb[moveItem-1]>insert)
			{
				randomNumb[moveItem]=randomNumb[moveItem-1];
				moveItem--;
			}//end switcher
			randomNumb[moveItem]=insert;
		}//end switching for each number
	}//end insertion sort
	public static boolean binarySearch(int[] data, int search,int left,int right)
	{
		loops++;
		//Variable Declaration and initialization
		int middle=0;
		//set middle
		middle=(int)((left+right)/2);
		//check if beyond the list
		compare++;
		if (left>right)
		{
			return false;
		}//end if
		//checks if search is found
		compare++;
		if (data[middle]==search)
		{
			return true;
		}//end if
		//check if middle is greater or less than the search number
		compare++;
		if (data[middle]>search)
		{
			//set middle to right
			return binarySearch(data,search,left,middle-1);
		}
		else
		{
			//set middle to left
			return binarySearch(data,search,middle+1,right);
		}//end if statement
	}//end binarySearch Search
	public static boolean linearSearch(int[]data, int searchFor)
	{
		for (int i=0;i<data.length; i++)
		{
			loops++;
			//if found number return true
			compare++;
			if (data[i]==searchFor)
			{
				return true;
			}//end if
		}//end loop
		//return false if not found
		return false;
	}//end linear search
	public static boolean linearSortedSearch(int[]data, int searchFor)
	{
		for (int i=0;i<data.length; i++)
		{
			loops++;
			//if found number return true
			compare++;
			if (data[i]==searchFor)
			{
				return true;
			}//end if
			//if beyond the number
			compare++;
			if(data[i]>searchFor)
			{
				return false;
			}//end if
		}//end loop
		//return false if not found
		return false;
	}//end linear search sorted
	private static void randomNumbGenerator(int numbOfRand, int[] randomNumb) {
		// Variable Declaration and Initialization
		for (int i=0;i<numbOfRand;i++)
		{
			//generates random numbers
			randomNumb[i]=(int) (Math.random()*1000)+1;
		}//end loop
	}//end random number generator
}//end class
