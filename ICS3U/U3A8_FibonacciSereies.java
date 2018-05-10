/**
 * Christopher Duong
 * Fibonacci Series
 */
public class U3A8_FibonacciSereies {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int A=0, B=0,term =0;
		//Variable assignment
		A=1;
		System.out.println("This program will print out the Fibonacci Sereies for the first twenty terms");
		//to count the terms that are less than 20
		while (term<20)
		{
			//print out the first number
			System.out.println(A);
			//first number plus previous number
			A=A+B;
			//the previous number
			B=A-B;
			//term number
			term++;
		}//end while
	}//end main
}//end class
