import javax.swing.JOptionPane;
public class Quiz2 {
/**
 * Christopher Duong
 * Total Amount
 * Calculates you total purchase amount with tax(15%)
 */
	public static void main(String[] args) {
		//variable declaration and initialization
		double totalPurchase=0;
		//user input
		String PurchasePrice=JOptionPane.showInputDialog(null,"Enter the total amount to be taxed by 15%.",JOptionPane.QUESTION_MESSAGE);
		totalPurchase=Double.parseDouble(PurchasePrice);
		//calculate tax
		totalPurchase=totalPurchase*1.15;
		//end statement
		System.out.println("The total price of your purchase is "+totalPurchase+". Have a great day!");
	}//end main
}//end class
