package ComboLocker;
import java.util.Scanner;
/**
 *Christopher Duong
 *Combo Locker Driver
 *Simulates a combanation Lock
 */
public class U3A2_ComboLockDriver {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		boolean gotLockCode=false;
		int guessTime=0;
		ComboLock lock1=new ComboLock();
		ComboLock lock2;
		Scanner userInput=new Scanner (System.in);
		//setting combo lock
		System.out.println("Do you want to set the lock to a new number? Type 1 to change.");
		if (userInput.nextInt()==1)
		{
			System.out.println("Type the number for the new first number");
			lock1.setNumb1(userInput.nextInt());
			System.out.println("Type the number for the new second number");
			lock1.setNumb2(userInput.nextInt());
			System.out.println("Type the number for the new third number");
			lock1.setNumb3(userInput.nextInt());
		}//end if
		System.out.println("Enter the 3 numbers to unlock the code");
		//check for number 1
		System.out.println("Enter the first number:");
		if(userInput.nextInt()==lock1.getNumb1())
		{
			gotLockCode=true;
		}//end if
		//check number 2
		System.out.println("Enter the second number:");
		if(userInput.nextInt()==lock1.getNumb2())
		{
			gotLockCode=true;
		}
		else
		{
			gotLockCode=false;
		}//end if
		//check number 3
		System.out.println("Enter the third number:");
		if(userInput.nextInt()==lock1.getNumb3())
		{
			gotLockCode=true;
		}
		else
		{
			gotLockCode=false;
		}//end if
		//checks if you got it right.
		if (gotLockCode==false)
		{
			System.out.println("You got the wrong code.");
		}
		else
		{
			System.out.println("*Click* The lock unlocked");
		}//end if
		System.out.println("Creating a random Lock...");
		lock2 = new ComboLock();
		//randomize the lock
		lock2.randomizeLock();
		gotLockCode=false;
		while (gotLockCode==false)
		{
			System.out.println("Enter the 3 numbers to unlock the code");
			//check for number 1
			System.out.println("Enter the first number:");
			if(userInput.nextInt()==lock2.getNumb1())
			{
				gotLockCode=true;
			}//end if
			//check number 2
			System.out.println("Enter the second number:");
			if(userInput.nextInt()==lock2.getNumb2())
			{
				gotLockCode=true;
			}
			else
			{
				gotLockCode=false;
			}//end if
			//check number 3
			System.out.println("Enter the third number:");
			if(userInput.nextInt()==lock2.getNumb3())
			{
				gotLockCode=true;
			}
			else
			{
				gotLockCode=false;
			}//end if
			//checks if you got it right.
			if (gotLockCode==false)
			{
				System.out.println("You got the wrong code.");
				guessTime++;
				if (guessTime>=2)
				{
					System.out.println("Your out of trys");
					//prints out the correct answer
					System.out.println("The correct code is: "+lock2.getNumb1()+" "+lock2.getNumb2()+" "+lock2.getNumb3());
					break;
				}//end if
			}
			else
			{
				System.out.println("*Click* The lock unlocked");
				gotLockCode=true;
			}//end if
		}//end unlocking code
	}//end main
}//end class
