package phone;
/**
 * Christopher Duong
 * U6 A4 PhoneTester
 * Encapsulates the phone tester program
 */
public class PhoneTester {
	  public static void main(String [] args){
	    CellPhone p1 = new CellPhone();
	    p1.carrier = "Rogers";
	    p1.type = "IPhone";
	    p1.speed = 1.2;
	    p1.memory = 64.0;
	    p1.numApps = 10;

	    System.out.println("Carrier = " + p1.carrier);
	    System.out.println("Type of phone = " + p1.type);
	    System.out.println("Speed of phone = " + p1.speed+"Ghz");
	    System.out.println("Memory = "+p1.memory+"Gb");
	    System.out.println("Number of Apps = "+p1.numApps);
	  }
	}