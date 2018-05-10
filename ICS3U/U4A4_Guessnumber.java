import java.util.Scanner;
public class U4A4_Guessnumber {
	//Variable Declaration, and Initialization
	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int highVal=0,lowVal=0,yourNum=0,error=1,right=0,count=0,loop=1,randomNum=0;
		Scanner ui=new Scanner (System.in);//user input
		System.out.println("The computer will randomly generate a number between two number of your choosing and you will have to guess that number.");
		//loops the program
		while (loop==1){
			highVal=0;lowVal=0;yourNum=0;right=0;count=0;error=1;//loops the program
			while (error==1)
			{
				System.out.print("Enter the low value of your range: ");
				//low Val
				lowVal=Integer.parseInt(ui.next());
				System.out.print("Enter the high value of your range: ");
				//high Val
				highVal=Integer.parseInt(ui.next());
				error=0;
				//check if it is possible to solve
				if (lowVal>=highVal||lowVal==highVal||lowVal==highVal+1||highVal==lowVal+1)
				{
					System.out.print("Please reEnter Value.");
					error=1;
				}
			}//end while
			randomNum=rng(highVal,lowVal);
			System.out.println("The computer has generated a number between "+lowVal+" and "+highVal+". \n Guess the number.");
			//loops until you get the answer
			while (right==0)
			{
				yourNum=Integer.parseInt (ui.next());
				//check if right
				if (yourNum==randomNum)
					right=1;
				//check if greater
				else if (yourNum>randomNum)
				{
					System.out.println("Too high. Try again.");
					count++;
				}	
				//check if less
				else if (yourNum<randomNum)
				{
					System.out.println("Too low. Try again.");
					count++;
				}	
			}
			System.out.println("In "+count+" trys, you got the number. \n Press 1 to try again.");
			loop=Integer.parseInt(ui.next());
		}
	}//end main
	public static int rng(int highVal, int lowVal){
		int randomNum=0;
		do{
			//reset random num
			randomNum=0;
			randomNum=(int)(Math.random()*highVal);
		}
		while (randomNum<=lowVal||randomNum>=highVal);
		//returns value
		return (randomNum);
	}
}//end class
