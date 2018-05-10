import java.util.Scanner;
public class U5A2_RandomNum {
	public static void main(String[] args) {
		//variable decoration
		int high=0,low=0,randnum=0,valid=0,average=0,again=1;
		//array decoration
		int ranNum[];
		//user input
		Scanner ui=new Scanner(System.in);
		//loop
		while (again==1){
			//resets value
			high=0;low=0;randnum=0;valid=0;average=0;
			System.out.println("Enter the number of random numbers to be generated");
			//number of random number to be created
			randnum=Integer.parseInt(ui.next());
			while (valid==0){
				//highest value
				System.out.println("Enter the highest number");
				high=Integer.parseInt(ui.next());
				//lowest value
				System.out.println("Enter the lowest number");
				low=Integer.parseInt(ui.next());
				//check if valid
				if (low>=high)
					System.out.println("Higher number must be greater than the lower number");
				else valid=1;}
			System.out.println("Random Generated Numbers:");
			ranNum=new int[randnum];
			//loops for random number
			for (int i=0; i<randnum; i++)
			{
				ranNum[i]=rng(high,low,randnum);
				System.out.
				//check for average
				println(ranNum[i]);
			}
			average=avr(ranNum);
			System.out.println("Average is "+average);
			System.out.println("Press 1 to try again");
			again=Integer.parseInt(ui.next());
		}


	}//end main
	private static int avr(int ranNum[]) {
		int total=0;
		for (int i=0;i<ranNum.length;i++)
			//adds all the value together
			total+=ranNum[i];
		//divide the total by the number of random number created
		return (total=total/ranNum.length);
	}
	public static int rng(int high, int low, int randnum) {
		int number=0;
		do{
			//random number generator
			number=(int) (Math.random()*high+low);
		}while (number<low||number>high);
		return (number);
	}
}//end class
