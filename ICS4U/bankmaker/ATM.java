package bankmaker;
import java.text.*;
/**
 * Christopher Duong
 * U3A1 ATM
 * This is the ATM Object
 */
public class ATM {
	// Variable Declaration and Initialization
	DecimalFormat hundrethDigit = new DecimalFormat("0.00");
	private double balance=0,interestRate=0;
	private String bankName=null;
	public ATM(double blnce,String bnkNm,double intrstRt){
		balance=blnce;
		bankName=bnkNm;
		interestRate=intrstRt;
	}//end ATM
	public  void deposit(double money){
		balance=money+balance;
	}//end deposit
	public  void withdraw(double money){
		balance=balance-money;
	}//end withdraw
	public  void interest(int period){
		balance=(double) (balance*Math.pow((1+interestRate),period));
	}//end interest
	public double getBalance()
	{
		return balance;
	}
	public  String toString(){
		String output=null;
		output="Bank Name:"+bankName+"\n";
		output+="Balance:$"+hundrethDigit.format(balance)+"\n";
		output+="Intrest rate:"+interestRate+"\n";
		return output;
	}//end display
}//end class
