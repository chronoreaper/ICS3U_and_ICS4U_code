package vehicletester;
import javax.swing.*;
public class U6A1_Main {
  public static void main(String[] args) {
	double fuelCost=0,fairCost=0,passengers=0;
    Vehicle car1;
    passengers=Double.parseDouble(JOptionPane.showInputDialog("How many passangers are there?"));
    fairCost=Double.parseDouble(JOptionPane.showInputDialog("How much does the fair cost?"));
    fuelCost=Double.parseDouble(JOptionPane.showInputDialog("What is the price of gas in $/L"));
    car1= new Vehicle(7.5, 60.0, 60.0, 0.0,passengers,fairCost,fuelCost);
    //Show Vehicle Info
    System.out.println(car1);
    //Drive car for 300km
    car1.driveVehicle(300.0); 
    System.out.println(car1);
    //Drive car for 225.0 kms
    car1.driveVehicle(225.0);
    System.out.println(car1);
    car1.totalCost();
    car1.profit();
  }//end main
}//end class