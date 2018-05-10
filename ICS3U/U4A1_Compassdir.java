import java.util.Scanner;
/**
 * Christopher Duong
 * Compass direction translator
 * Changes compass direction into words.
 */
public class U4A1_Compassdir {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		String compass=null,dir1=null,dir2=null,dirDeg=null;
		Boolean playAgain=null;
		//Variable Assignment
		playAgain=true;
		//user input
		Scanner userin=new Scanner (System.in);
		//loop 
		while (playAgain==true)
		{
			System.out.print("Enter a compass direction (eg S34E): ");
			//compass direction
			compass=userin.next();
			//check what the first letter is for North, South, East, or West
			char ch = compass.charAt(0);
			if (ch=='N'||ch=='n')
				dir1="North";
			if (ch=='E'||ch=='e')
				dir1="East";
			if (ch=='S'||ch=='s')
				dir1="South";
			if (ch=='W'||ch=='w')
				dir1="West";
			//check the last letter for North, South, East, or West
			char chl = compass.charAt(compass.length()-1);
			if (chl=='N'||ch=='n')
				dir2="North";
			if (chl=='E'||ch=='e')
				dir2="East";
			if (chl=='S'||ch=='s')
				dir2="South";
			if (chl=='W'||ch=='w')
				dir2="West";
			//check for number 
			if (compass.length()==3)
				dirDeg=compass.substring(1,2);
			//check for number 
			if (compass.length()==4)
				dirDeg=compass.substring(1,3);
			//tells you what direction to face and turn
			System.out.println("Face "+dir1+". Turn "+dirDeg+" degrees "+dir2+".");
			playAgain=false;
			//ask you if you want to loop the program
			System.out.print("type 1 to continue: ");
			playAgain=((int)Integer.parseInt(userin.next())!=0);
		}//end while
	}//end main
}//end class


