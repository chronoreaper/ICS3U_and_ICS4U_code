package bankmaker;
import java.util.Scanner;
/**
 * Christopher Duong
 * U3A1 My Bank Machine
 * This program will simulate an atm
 */
public class MyBankMachine {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int choice=0,period=0;
		double balance=0,intrestRate=0,money=0;
		boolean errorEnter=false, exit=false;
		String bankName=null;
		Scanner userInput = new Scanner(System.in);
		ATM account1;
		System.out.println("Creating account \nEnter initial amount:");
		balance=userInput.nextFloat();
		//checks for errors
		if (balance<0)
		{
			errorEnter=true;
		}//end if
		while (errorEnter==true)
		{
			System.out.println("Error, Please enter a positive number:");
			balance=userInput.nextFloat();
			if (balance<0)
			{
				errorEnter=true;
			}
			else
			{
				errorEnter=false;
			}//end if
		}//end while loop
		System.out.println("Choose Bank name:");
		bankName=userInput.next();
		System.out.println("Enter interest rate:");
		intrestRate=userInput.nextFloat();
		//checks for errors
		if (intrestRate<0)
		{
			errorEnter=true;
		}//end if
		while (errorEnter==true)
		{
			System.out.println("Error, Please enter a positive number:");
			intrestRate=userInput.nextFloat();
			if (intrestRate<0)
			{
				errorEnter=true;
			}
			else
			{
				errorEnter=false;
			}//end if
		}//end while loop
		account1 = new ATM(balance,bankName,intrestRate);
		while (exit==false)
		{
			System.out.println("Menu----------");
			System.out.println("Please make your selection:");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Add Interest");
			System.out.println("4. View Account");
			System.out.println("5. Exit");
			choice=userInput.nextInt();
			//error check selection
			if (choice<0||choice>5)
			{
				errorEnter=true;
			}//end if
			while (errorEnter==true)
			{
				System.out.println("Error, Please enter a diffrent number:");
				balance=userInput.nextFloat();
				if (choice<0||choice>5)
				{
					errorEnter=true;
				}
				else
				{
					errorEnter=false;
				}//end if
			}//end error loop check
			//Deposit Money
			if (choice==1)
			{
				System.out.println("Please enter the amount you would like to deposit:");
				money=userInput.nextFloat();
				//checks for errors
				if (money<0)
				{
					errorEnter=true;
				}//end if
				while (errorEnter==true)
				{
					System.out.println("Error, Please enter a positive number:");
					money=userInput.nextFloat();
					if (money<0)
					{
						errorEnter=true;
					}
					else
					{
						errorEnter=false;
					}//end if
				}//end while loop
				account1.deposit(money);
			}
			//withdraw
			else if (choice==2)
			{
				System.out.println("Please enter the amount you would like to withdraw:");
				money=userInput.nextFloat();
				//checks for errors
				if (money<0)
				{
					errorEnter=true;
				}//end if
				while (errorEnter==true)
				{
					System.out.println("Error, Please enter a positive number:");
					money=userInput.nextFloat();
					if (money<0)
					{
						errorEnter=true;
					}
					else
					{
						errorEnter=false;
					}//end if
				}//end while loop
				balance=account1.getBalance();
				//checks if you withdraw more that you have
				if (money>balance)
				{
					errorEnter=true;
				}//end if
				while (errorEnter==true)
				{
					System.out.println("Error, You do not have that much money:");
					money=userInput.nextFloat();
					if (money>balance)
					{
						errorEnter=true;
					}
					else
					{
						errorEnter=false;
					}//end if
				}//end while loop
				account1.withdraw(money);
			}
			//Interest
			else if (choice==3)
			{
				System.out.println("Enter number of Periods that passes:");
				period=userInput.nextInt();
				//checks for errors
				if (period<1)
				{
					errorEnter=true;
				}//end if
				while (errorEnter==true)
				{
					System.out.println("Error, Please enter a number greater that 1:");
					period=userInput.nextInt();
					if (period<1)
					{
						errorEnter=true;
					}
					else
					{
						errorEnter=false;
					}//end if
				}//end while loop
				account1.interest(period);
			}
			//Account view
			else if (choice==4)
			{
				System.out.println(account1.toString());
			}
			//exit
			else if (choice==5)
			{
				exit=true;
			}//end if
		}//end while
	}//end main
}//end class
