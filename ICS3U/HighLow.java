import javax.swing.JOptionPane;
public class HighLow {
	/**
	 * Christopher Duong
	 * High Low program
	 * Makes the user guess a number between 1 and 100
	 */
	public static void main(String[] args) {
		//variable declaration and initilization
		int ranNum=0, userNum=0, guess=0, again=0;
		//variable assignment
		again=1;
		//loop the game
		while (again==1)
		{
			again=0;
			guess=1;
			//random number
			ranNum=1+(int)(Math.random()*100);
			//for debugging purposes
			System.out.println(ranNum);
			String input=JOptionPane.showInputDialog(null,"Guess a number between 1 and 100");
			userNum=Integer.parseInt(input);
			//check if not equal
			while (userNum!=ranNum)
			{
				//check if number is higher
				if (userNum>ranNum)
				{
					System.out.println(userNum+" is too high. Guess again. :P");
					guess++;
					input=JOptionPane.showInputDialog(null,"Number too high. Guess again.");
					userNum=Integer.parseInt(input);
				}
				//check if lower
				else if (userNum<ranNum)
				{
					System.out.println(userNum+" is too low. Guess again. :P");
					guess++;
					input=JOptionPane.showInputDialog(null,"Number too low. Guess again.");
					userNum=Integer.parseInt(input);
				}
			}
			System.out.println("You got the right number in "+guess+" trys!");
			input=JOptionPane.showInputDialog(null,"Press 1 to try again.");
			again=Integer.parseInt(input);
		}
	}
}