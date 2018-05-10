/**
 * Christopher Duong
 * Ounce to grams converter
 * converts Ounces to grams
 */
import java.text.*;
public class U3A8_OnceToGram {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		double ounce=0; 
		int gram=0;
		//variable assignment
		ounce=1;
		DecimalFormat twodigit= new DecimalFormat ("#0.00");
		System.out.println("This is an Ounce to grams unit converter.");
		//chart print
		System.out.println("Ounce			Grams");
		// calculate for the first 15 ounces
		while (ounce<=15)
		{
			//one gram equals ounces times 28.35
			gram=(int) (ounce*28.35);
			//chart print out
			System.out.println(ounce+"			"+twodigit.format(gram));
			//next ounce
			ounce++;
		}//end while
	}//end main
}//end class