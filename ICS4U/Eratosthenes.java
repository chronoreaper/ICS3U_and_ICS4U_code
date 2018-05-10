/**
 * Christopher Duong
 * Erathosthenes
 *This program will find all the prime numbers from 1-1000
 */
public class Eratosthenes {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		int divideNumb=0;
		Boolean numbers[] = new Boolean[1000];
		for (int i=1; i<numbers.length; i++)
		{
			divideNumb=0;
			for (int j=1; j<=i; j++)
			{
				if (i%j==0)
				{
					divideNumb++;
				}//end if
			}//end for j
			if (divideNumb==2)
			{
				numbers[i]=true;
			}
			else
			{
				numbers[i]=false;
			}//end if
		}//end for i
		System.out.println("The prime numbers up to 1000 are: ");
		for (int k=1; k<numbers.length; k++)
		{
			if (numbers[k]==true)
			{
				System.out.print(k+", ");
			}//end if
		}//end for
	}//end main
}//end class
