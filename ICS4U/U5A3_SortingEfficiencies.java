import java.util.Scanner;
/**
 * Christopher Duong
 * U5A2 Sorting Efficiencies
 * This program will calculate the efficiencies of the sorting methods
 */
public class U5A3_SortingEfficiencies {
	public static int shifts=0,compare=0,loops=0;
	public static long time=0;
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int numbOfRand=0;
		int[] randomNumb = null;
		int[] randomNumbCopy = null;
		Scanner userInput= new Scanner(System.in);
		System.out.println("How many random numbers would you like to sort?");
		numbOfRand=userInput.nextInt();
		//makes the array the length of the input
		randomNumb=new int[numbOfRand];
		randomNumbCopy=new int[numbOfRand];
		//calls the random number generator and fills in the array
		randomNumbGenerator(numbOfRand,randomNumb);
		//creates a copy of the array
		copyArray(randomNumbCopy,randomNumb);
		//prints out the unsorted numbers
		System.out.println("Unsorted Numbers");
		for (int print:randomNumb)
		{
			System.out.println(print);
		}//end print
		/**selection Sort*/
		//sets global variable to zero
		time=System.currentTimeMillis();
		compare=0;
		loops=0;
		shifts=0;
		selectionSort(randomNumb);
		time=System.currentTimeMillis()-time;
		printData("Selection Sort");
		copyArray(randomNumb,randomNumbCopy);
		/**bubble sort*/
		//sets global variable to zero
		time=System.currentTimeMillis();
		compare=0;
		loops=0;
		shifts=0;
		bubbleSort(randomNumb);
		time=System.currentTimeMillis()-time;
		printData("Bubble Sort");
		copyArray(randomNumb,randomNumbCopy);
		/**insertion Sort*/
		//sets global variable to zero
		time=System.currentTimeMillis();
		compare=0;
		loops=0;
		shifts=0;
		insertionSort(randomNumb);
		time=System.currentTimeMillis()-time;
		printData("Insertion Sort");
		copyArray(randomNumb,randomNumbCopy);
		/**quick sort*/
		//sets global variable to zero
		time=System.currentTimeMillis();
		compare=0;
		loops=0;
		shifts=0;
		quickSort(randomNumb,0,randomNumb.length-1);
		time=System.currentTimeMillis()-time;
		printData("Quick Sort");
		copyArray(randomNumb,randomNumbCopy);
		//prints out the sorted numbers
		System.out.println("Sorted Numbers");
		for (int print:randomNumb)
		{
			System.out.print(print+",");
		}//end print
	}//end class
	private static void copyArray(int[]data1, int[]data2)
	{
		for (int i=0;i<data2.length;i++)
		{
			data1[i]=data2[i];
		}//end loop
	}//end copying the array
	private static void printData(String string) {
		System.out.println("===========================");
		System.out.println("Sort Method: "+string);
		System.out.println("Loops: "+loops);
		System.out.println("Shifts: "+shifts);
		System.out.println("Compare: "+compare);
		System.out.println("Time: "+time+"ms");
	}//end data printer
	private static void quickSort(int[] randomNumb,int low, int high) {
		// Variable Declaration and Initialization
		int middleNumb=0;
		compare++;
		if (low<high)
		{
			middleNumb=findMiddle(randomNumb,low,high);
			quickSort(randomNumb,low,middleNumb-1);
			quickSort(randomNumb,middleNumb+1,high);
		}//end if statement
	}//end quick sort
	private static int findMiddle(int []data2, int left, int right)	{
		boolean moveLeft = true;
		int middle=0;
		//set the middle to left
		middle=data2[left];
		while (left<right)
		{
			loops++;
			//check if moving left
			compare++;
			if (moveLeft==true)
			{
				//moves the right side of the list to find a number that is less than the left most number
				while(data2[right]>=middle&&left<right)
				{
					loops++;
					right--;
				}
				shifts++;
				data2[left]=data2[right];
				moveLeft=false;
			}
			//move right
			else
			{
				//moves along the left side to see if the number is greater than the current number
				while(data2[left]<=middle&&left<right)
				{
					loops++;
					left++;
				}
				shifts++;
				data2[right]=data2[left];
				moveLeft=true;
			}//end if
		}//end the loop to find the middle	
		data2[left]=middle;
		return left;
	}//end find middle
	private static void insertionSort(int[] randomNumb) {
		// Variable Declaration and Initialization
		int moveItem=0,insert=0;
		for (int i=1; i<randomNumb.length;i++)
		{
			loops++;
			moveItem=i;
			insert=randomNumb[i];
			//sorts the item in the list
			while (moveItem>0&&randomNumb[moveItem-1]>insert)
			{
				loops++;
				randomNumb[moveItem]=randomNumb[moveItem-1];
				shifts++;
				moveItem--;
			}//end switcher
			shifts++;
			randomNumb[moveItem]=insert;
		}//end switching for each number
	}//end insertion sort
	private static void bubbleSort(int[] randomNumb) {
		// Variable Declaration and Initialization
		for (int i=1; i<randomNumb.length;i++)
		{
			loops++;
			for (int j=0;j<randomNumb.length-1;j++)
			{
				loops++;
				//checks if number is smaller than the number next to it
				compare++;
				if (randomNumb[j]>randomNumb[j+1])
				{
					shifts++;
					swap(randomNumb,j,j+1);
				}//end swapper
			}//end sort
		}//end for smallest
	}//end bubbleSort
	private static void selectionSort(int[] randomNumb) {
		// Variable Declaration and Initialization
		int smallest=0;
		for (int i=0; i<randomNumb.length-1;i++)
		{
			loops++;
			smallest=i;
			for (int j=i+1;j<randomNumb.length;j++)
			{
				loops++;
				//checks if number is smaller than the 'smallest' number on the left most side
				compare++;
				if (randomNumb[smallest]>randomNumb[j])
				{
					shifts++;
					swap(randomNumb,smallest,j);
				}//end swapper	
			}//end sort
		}//end for smallest
	}//end selection sort
	private static void swap(int[] randomNumb, int i, int j) {
		// Variable Declaration and Initialization
		int hold=0;
		hold=randomNumb[i];
		randomNumb[i]=randomNumb[j];
		randomNumb[j]=hold;		
	}//end swapper
	private static void randomNumbGenerator(int numbOfRand, int[] randomNumb) {
		// Variable Declaration and Initialization
		for (int i=0;i<numbOfRand;i++)
		{
			//generates random numbers
			randomNumb[i]=(int) (Math.random()*1000)+1;
		}//end loop
	}//end random number generator
}//end class
