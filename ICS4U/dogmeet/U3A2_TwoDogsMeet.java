package dogmeet;
import java.util.Scanner;
/**
 * Christopher Duong
 * U3A2 Two dogs meet
 * Simulates two dogs encountering each other.
 */
public class U3A2_TwoDogsMeet {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		Dog dog1 = new Dog("Rover", "Spaniel", 3, 4, 9);
		Dog dog2 = new Dog("Spot", "Border Collie");
		//Print out the details of each dog
		System.out.println(dog1);
		System.out.println("--------------------------");
		System.out.println(dog2);
		System.out.println("--------------------------");
		//change each of the dog'stat
		changeDog1(dog1);
		changeDog2(dog2);
		//Print out the details of each dog
		System.out.println(dog1);
		System.out.println("--------------------------");
		System.out.println(dog2);
		System.out.println("--------------------------");
		dogMeet(dog1,dog2);
	}//end main
	private static void dogMeet(Dog dog1, Dog dog2) {
		//checks first dog aggression
		//dog responds to dog
		if (dog1.getAggression()>5)
		{
			//dog1 is aggressive
			System.out.print(dog1.getName() + ": ");
			dog1.barkAngry();
			//checks if dog2 is aggressive
			if (dog2.getAggression()>5)
			{
				System.out.print(dog2.getName() + ": ");
				dog2.barkAngry();
				System.out.println("Not a friendly meeting.It looks like this won't end well...");
			}
			else if (dog2.getAggression()<=5)
			{
				//check dog 2 hunger
				if (dog2.getHunger()>7)
				{
					System.out.print(dog2.getName() + ": ");
					dog2.barkHungry();
					System.out.println("Not a friendly meeting.It looks like this won't end well...");
				}
				else
				{
				System.out.print(dog2.getName() + ": ");
				dog2.barkScared();
				System.out.println("Poor "+dog2.getName()+".");
				}//end dog 2 hunger
			}//end if dog 2 aggressive
		}
		else if (dog1.getAggression()<=5)
		{
			if (dog1.getHunger()>7)
			{
				System.out.print(dog1.getName() + ": ");
				dog1.barkHungry();
				//check dog 2 aggressive
				if (dog2.getAggression()>5)
				{
					System.out.print(dog2.getName() + ": ");
					dog2.barkAngry();
					System.out.println("Not a friendly meeting.It looks like this won't end well...");
				}
				else if (dog2.getAggression()<=5)
				{
					//check dog 2 hunger
					if (dog2.getHunger()>7)
					{
						System.out.print(dog2.getName() + ": ");
						dog2.barkHungry();
						System.out.println("Not a friendly meeting.It looks like this won't end well...");
					}
					else
					{
					System.out.print(dog2.getName() + ": ");
					dog2.barkScared();
					System.out.println("Poor "+dog2.getName()+".");
					}//end dog 2 hunger
				}//end if dog 2 aggressive
			}//end dog 1 hunger
			else
			{
				System.out.print(dog1.getName() + ": ");
				dog1.barkFriendly();
				//check dog 2 aggressive
				if (dog2.getAggression()>5)
				{
					System.out.print(dog2.getName() + ": ");
					dog2.barkAngry();
					System.out.print(dog1.getName() + ": ");
					dog1.barkScared();
					System.out.println("Poor "+dog1.getName()+".");
				}
				else if (dog2.getAggression()<=5)
				{
					//check dog 2 hunger
					if (dog2.getHunger()>7)
					{
						System.out.print(dog2.getName() + ": ");
						dog2.barkHungry();
						System.out.print(dog1.getName() + ": ");
						dog1.barkScared();
						System.out.println("Poor "+dog1.getName()+".");
					}
					else
					{
					System.out.print(dog2.getName() + ": ");
					dog2.barkFriendly();
					System.out.println("A friendly meeting.");
					}//end dog 2 hunger
				}//end if dog 2 aggressive
			}//end dog 1 hunger
		}//end dog 1 aggressive
	}//end dog meeting
	public static void changeDog1(Dog dog1)
	{
		//Variable Declaration and Initialization
		boolean changeStat=false;
		int input=0;
		Scanner userInput = new Scanner (System.in);
		//change dog1 name
		System.out.println("Do you want to change "+dog1.getName()+"'s name? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog1.setName(userInput.next());
		}//end if
		System.out.println("Dog1's name is now: " 
				+ dog1.getName());
		//breed
		System.out.println("Do you want to change "+dog1.getName()+"'s breed? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog1.setBreed(userInput.next());
		}//end if
		System.out.println(dog1.getName()+"'s breed is now: " 
				+ dog1.getBreed());
		//aggression
		System.out.println("Do you want to change "+dog1.getName()+"'s aggression? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog1.setAggression(userInput.nextInt());
		}//end if
		System.out.println(dog1.getName()+"'s aggression is now: " 
				+ dog1.getAggression());
		//hunger
		System.out.println("Do you want to change "+dog1.getName()+"'s hunger? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog1.setHunger(userInput.nextInt());
		}//end if
		System.out.println(dog1.getName()+"'s hunger is now: " 
				+ dog1.getHunger());
		//age
		System.out.println("Do you want to change "+dog1.getName()+"'s age? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog1.setAge(userInput.nextInt());
		}//end if
		System.out.println(dog1.getName()+"'s age is now: " 
				+ dog1.getAge());
	}//end change Dog1
	public static void changeDog2(Dog dog2)
	{
		//Variable Declaration and Initialization
		boolean changeStat=false;
		int input=0;
		Scanner userInput = new Scanner (System.in);
		//change dog2 name
		System.out.println("Do you want to change "+dog2.getName()+"'s name? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog2.setName(userInput.next());
		}//end if
		System.out.println("Dog2's name is now: " 
				+ dog2.getName());
		//breed
		System.out.println("Do you want to change "+dog2.getName()+"'s breed? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog2.setBreed(userInput.next());
		}//end if
		System.out.println(dog2.getName()+"'s breed is now: " 
				+ dog2.getBreed());
		//aggression
		System.out.println("Do you want to change "+dog2.getName()+"'s aggression? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog2.setAggression(userInput.nextInt());
		}//end if
		System.out.println(dog2.getName()+"'s aggression is now: " 
				+ dog2.getAggression());
		//hunger
		System.out.println("Do you want to change "+dog2.getName()+"'s hunger? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog2.setHunger(userInput.nextInt());
		}//end if
		System.out.println(dog2.getName()+"'s hunger is now: " 
				+ dog2.getHunger());
		//age
		System.out.println("Do you want to change "+dog2.getName()+"'s age? Type 1 to change.");
		input=userInput.nextInt();
		changeStat=(input==1);
		if (changeStat)
		{
			dog2.setAge(userInput.nextInt());
		}//end if
		System.out.println(dog2.getName()+"'s age is now: " 
				+ dog2.getAge());
	}//end change Dog2
}//end class

