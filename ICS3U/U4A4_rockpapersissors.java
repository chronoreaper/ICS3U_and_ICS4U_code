import java.util.Scanner;
/**
 * Christopher Duong
 *Rock paper scissors
 */
public class U4A4_rockpapersissors {
	public static void main(String[] args) {
		//variable decoration
		int win=0,lose=0,tie=0,you=0,comNum=0;
		boolean loop=true;
		//user input
		Scanner userInput=new Scanner (System.in);
		System.out.println("Welcome to Rock Paper scissors! Type 1 for Rock, 2 for Paper, and 3 For scissors!");
		//forever loop
		while (loop==true){
			//user chooses a number 
			you=Integer.parseInt(userInput.next());
			//check random number
			comNum=comran();
			//tie
			if (you==comNum)
			{
				if (you==1)
				{
				System.out.println("You Tied.You both had rock."); 
				tie++;
				}
				if (you==2)
				{
				System.out.println("You Tied.You both had paper."); 
				tie++;
				}
				if (you==3)
				{
				System.out.println("You Tied.You both had sissor."); 
				tie++;
				}
			}
			//win
			else if (you==1&&comNum==3)
			{
				System.out.println("You chose rock and computer chose scissors. You win!"); 
				win++;
			}
			//win
			else if (you==2&&comNum==1)
			{
				System.out.println("You chose paper and computer chose rock. You win!"); 
				win++;
			}
			//win
			else if (you==3&&comNum==2)
			{
				System.out.println("You chose scissors and computer chose paper. You win!"); 
				win++;
			}
			//lose
			else if (you==1&&comNum==2)
			{
				System.out.println("You chose rock and computer chose paper. You lose."); 
				lose++;
			}
			//lose
			else if (you==2&&comNum==3)
			{
				System.out.println("You chose paper and computer chose scissors. You lose."); 
				lose++;
			}
			//lose
			else if (you==3&&comNum==1)
			{
				System.out.println("You chose scissors and computer chose rock. You lose."); 
				lose++;
			}
			System.out.println("Win: "+win+" Loss: "+lose+" Ties: "+tie+"\n Type 1 for Rock, 2 for Paper, and 3 For scissors!");
		}
	}//end main
	public static int comran()
	{
		int ranNum=0;
		//resets random number
		ranNum=0;
		//generates and returns a random number within user's range
		ranNum=(int) ((Math.random()*3)+1); 
		return (ranNum);
	}
}//end class
