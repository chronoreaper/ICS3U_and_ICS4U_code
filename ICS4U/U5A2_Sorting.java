import java.util.Scanner;
/**
 * Christopher Duong
 * U5A2 Sorting Routines
 * This program will sort randomly generated numbers using different methods
 */
public class U5A2_Sorting {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int numbOfRand=0, sortType=0, AscendDescend=0;
		int[] randomNumb = null;
		Scanner userInput= new Scanner(System.in);
		System.out.println("How many random numbers would you like to sort?");
		numbOfRand=userInput.nextInt();
		//makes the array the length of the input
		randomNumb=new int[numbOfRand];
		//calls the random number generator and fills in the array
		randomNumbGenerator(numbOfRand,randomNumb);
		System.out.println("What type of sorting method would you like to see?"
				+"\n1-Selection Sort"
				+"\n2-Bubble Sort"
				+"\n3-Insertion Sort"
				+"\n4-Quick Sort");
		sortType=userInput.nextInt();
		System.out.println("Do you want to sort Ascending (1) or Descending (2)?");
		AscendDescend=userInput.nextInt();
		//prints out the unsorted numbers
		System.out.println("Unsorted Numbers");
		for (int print:randomNumb)
		{
			System.out.print(print+",");
		}//end print
		System.out.println("");
		//sort by the selected sorted type
		if (sortType==1)
		{
			System.out.println("Selection Sort");
			selectionSort(randomNumb,AscendDescend);
		}
		else if (sortType==2)
		{
			System.out.println("Bubble Sort");
			bubbleSort(randomNumb,AscendDescend);
		}
		else if (sortType==3)
		{
			System.out.println("Insertion Sort");
			insertionSort(randomNumb,AscendDescend);
		}
		else if (sortType==4)
		{
			System.out.println("quick Sort");
			quickSort(randomNumb,0,randomNumb.length-1,AscendDescend);
		}//end if
		//prints out the sorted numbers
		System.out.println("Sorted Numbers");
		for (int print:randomNumb)
		{
			System.out.print(print+",");
		}//end print
	}//end class
	private static void quickSort(int[] randomNumb,int low, int high, int ascendDescend) {
		// Variable Declaration and Initialization
		int middleNumb=0;
		if (low<high)
		{
			middleNumb=findMiddle(randomNumb,low,high,ascendDescend);
			quickSort(randomNumb,low,middleNumb-1,ascendDescend);
			quickSort(randomNumb,middleNumb+1,high,ascendDescend);
		}//end if statement
	}//end quick sort
	private static int findMiddle(int []data2, int left, int right, int ascendDescend)	{
		boolean moveLeft = true;
		int middle=0;
		//set the middle to left
		middle=data2[left];
		if (ascendDescend==1)
		{
			while (left<right)
			{
				//check if moving left
				if (moveLeft==true)
				{
					//moves the right side of the list to find a number that is less than the left most number
					while(data2[right]>=middle&&left<right)
					{
						right--;
					}
					data2[left]=data2[right];
					moveLeft=false;
				}
				//move right
				else
				{
					//moves along the left side to see if the number is greater than the current number
					while(data2[left]<=middle&&left<right)
					{
						left++;
					}
					data2[right]=data2[left];
					moveLeft=true;
				}//end if
			}//end the loop to find the middle	
		}//end ascend
		else if (ascendDescend==2)
		{
			while (left<right)
			{
				//check if moving left
				if (moveLeft==true)
				{
					//moves the right side of the list to find a number that is greater than the left most number
					while(data2[right]<=middle&&left<right)
					{
						right--;
					}
					data2[left]=data2[right];
					moveLeft=false;
				}
				//move right
				else
				{
					//moves along the left side to see if the number is less than the current number
					while(data2[left]>=middle&&left<right)
					{
						left++;
					}
					data2[right]=data2[left];
					moveLeft=true;
				}//end if
			}//end the loop to find the middle	
		}//end check if ascend or descend
		data2[left]=middle;
		return left;
	}//end find middle
	private static void insertionSort(int[] randomNumb, int ascendDescend) {
		// Variable Declaration and Initialization
		int moveItem=0,insert=0;
		if (ascendDescend==1)
		{
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
		}//end ascending
		else if (ascendDescend==2)
		{
			for (int i=randomNumb.length-1; i>=0;i--)
			{
				moveItem=i;
				insert=randomNumb[i];
				//sorts the item in the list
				while (moveItem<randomNumb.length-1&&randomNumb[moveItem+1]>insert)
				{
					randomNumb[moveItem]=randomNumb[moveItem+1];
					moveItem++;
				}//end switcher
				randomNumb[moveItem]=insert;
			}//switching for each number
		}//end descending
	}//end insertion sort
	private static void bubbleSort(int[] randomNumb, int ascendDescend) {
		// Variable Declaration and Initialization
		if (ascendDescend==1)
		{
			for (int i=0; i<randomNumb.length;i++)
			{
				for (int j=0;j<randomNumb.length-1;j++)
				{
					//checks if number is smaller than the number next to it
					if (randomNumb[j]>randomNumb[j+1])
					{
						swap(randomNumb,j,j+1);
					}//end swapper
				}//end sort
			}//end for smallest
		}//end ascending
		else if (ascendDescend==2)
		{
			for (int i=randomNumb.length; i>=0;i--)
			{
				for (int j=randomNumb.length;j>0;j--)
				{
					//checks if number is smaller than the number next to it
					if (randomNumb[j]>randomNumb[j-1])
					{
						swap(randomNumb,j,j-1);
					}//end swapper
				}//end sort
			}//end for smallest
		}//end descending
	}//end bubbleSort
	private static void selectionSort(int[] randomNumb, int ascendDescend) {
		// Variable Declaration and Initialization
		int smallest=0;
		if (ascendDescend==1)
		{
			for (int i=0; i<randomNumb.length-1;i++)
			{
				smallest=i;
				for (int j=i+1;j<randomNumb.length;j++)
				{
					//checks if number is smaller than the 'smallest' number on the left most side
					if (randomNumb[smallest]>randomNumb[j])
					{
						swap(randomNumb,i,j);
					}//end swapper
				}//end sort
			}//end for smallest
		}//end ascending
		else if (ascendDescend==2)
		{
			for (int i=randomNumb.length-1; i>0;i--)
			{
				smallest=i;
				for (int j=i-1;j>=0;j--)
				{
					//checks if number is smaller than the 'smallest' number on the left most side
					if (randomNumb[smallest]>randomNumb[j])
					{
						swap(randomNumb,i,j);
					}//end swapper
				}//end sort
			}//end for smallest
		}//end descending
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
