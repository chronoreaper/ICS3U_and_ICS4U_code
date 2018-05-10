/**
 * Christopher Duong
 * U2A2 Fund Raising
 * Creates a fundraising chart
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class U2A2_FundRaising {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		double [][] fundRaisingChart = new double [8][4];
		double [] total= new double [5];
		int school=0, donationAmount=0, population=0;
		double moneyMultiplyer=0;
		String[] schoolName={"0.Catholic Central","1.Holy Cross","2.John Paul II","3.Mother Teresa","4.Regina Mundi",
				"4.St. Joeseph","5.St. Mary","6.St. Thomas Aquinas","7.EXIT"};
		String[] donationList={"0. 25 cent","1. 50 cent","2. 1 dollar","3. 2 dollars"};
		boolean loop = true;
		Scanner userInput = new Scanner (System.in);
		while (loop==true)
		{
			school = Integer.valueOf(((String) JOptionPane.showInputDialog(null,
					"Select a School", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					schoolName, null)).substring(0,1));
			//checks if the user chose exit
			if (school==9)
				break;
			donationAmount = Integer.valueOf(((String) JOptionPane.showInputDialog(null,
					"What is the donation ammount?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					donationList, null)).substring(0,1));;
					System.out.println("What is the poulation");
					population=Integer.parseInt(JOptionPane.showInputDialog("What is the population?"));
					//Multiply the amount by the population
					switch(donationAmount)
					{
					case 0: moneyMultiplyer=0.25;
					break;
					case 1: moneyMultiplyer=0.5;
					break;
					case 2: moneyMultiplyer=1;
					break;
					case 3: moneyMultiplyer=2;
					break;
					default: moneyMultiplyer=0;
					break;
					}//end switch
					fundRaisingChart[school][donationAmount]=population*moneyMultiplyer;
					System.out.println("\tCathCen|Holy C|JP II|Mother T|ReginaM|St. Joe|St. Mary|St. Thom|TOTAL");
					for (int i=0; i<4; i++)
					{
						switch(i)
						{
						case 0: System.out.print("0.25-	");
						break;
						case 1: System.out.print("0.50-	");
						break;
						case 2: System.out.print("1.00-	");
						break;
						case 3: System.out.print("2.00-	");
						break;
						}//end money printer
						for (int j=0; j<8; j++)
						{
							total[i]+=fundRaisingChart[j][i];
							System.out.print(fundRaisingChart[j][i]+"	 ");
						}//end for
						System.out.print(total[i]);
						System.out.println("");
					}//end loop for printing
					total[4]=0;
					for (int k=0; k<4; k++)
					{
						total[4]+=total[k];
					}//end for
					System.out.println("						  			 "+total[4]);
		}//end loop for program
	}//end main
}//end class
