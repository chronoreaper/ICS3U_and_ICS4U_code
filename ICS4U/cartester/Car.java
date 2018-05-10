package cartester;
import java.util.Scanner;
/**
 * Christopher Duong
 * Car Tester
 * This is the car class
 */
public class Car {
	//Variable Declaration and Initilization
	private String make=null,model=null,colour=null,licencePlate=null;
	private int year=0,price=0;
	//default car
	public Car() {
		make="Unknown";
		model="Unknown";
		year=2016;
		price=1000000;
		colour="White";
		licencePlate="ABCD 123";
	}//end car
	public Car(String mk,String mdl,int yr, int prc, String clr, String lcncPlt){
		make=mk;
		model=mdl;
		year=yr;
		price=prc;
		colour=clr;
		licencePlate=lcncPlt;
	}//end car
	public Car(String mk,String mdl,int yr, int prc){
		make=mk;
		model=mdl;
		year=yr;
		price=prc;
		colour="White";
		licencePlate="ABCD 123";
	}//end car
	public void honkTheHorn() {
		System.out.println("BEEEEEEEEP!");
	}//end honk
	public String toString(){
		String output=null;
		output="Make: "+make+"\n";
		output += "Model: "+model+"\n";
		output += "Year: "+year+"\n";
		output += "Price: "+price+"\n";
		output += "Colour: "+colour+"\n";
		output += "Licence Plate: "+licencePlate;
		//returns all the data
		return output;
	}//end to String
}//end class
