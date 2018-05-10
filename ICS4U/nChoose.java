import java.util.Scanner;
/**
 * Christopher Duong
 *N Choose R
 *This program will calculate the possibilities of taking n blocks from x total
number of blocks
 */
public class nChoose {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int totalBlocks=0, chosenBlock=0, combo=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will choose r blocks from n number of"
				+"blocks. \nEnter the number of blocks you want to choose.");
				chosenBlock=sc.nextInt();
				System.out.println("Enter the total number of blocks.");
				totalBlocks=sc.nextInt();
				combo=totalCombo(chosenBlock, totalBlocks);
				System.out.println("There are "+combo+" ways to choose "+chosenBlock
						+"blocks from "+totalBlocks+" blocks.");
	}//end main
	public static int totalCombo(int r, int n)
	{
		return fact(n)/(fact(r)*(fact(n-r)));
	}//end totalCombo
	public static int fact(int n){
		if((n == 0) || (n == 1)) {
			return 1;
		}
		else {
			return n * fact(n - 1);
		}//end else
	}//end facto
}