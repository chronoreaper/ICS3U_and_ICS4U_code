package cartester;
import java.util.Scanner;
/**
 * Christopher Duong
 * Car Tester
 * This is the car creator class
 */
public class U3A1_Cartester {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		String make=null,model=null,colour=null,licencePlate=null;
		int year=0,price=0;
		Car car1;
		Car car2;
		Car car3;
		Scanner userInput = new Scanner(System.in);
		System.out.println("This program will create three cars. One default, one with all componemnts, and one with some.");
		//create default car
		System.out.println("Creating first car");
		car1 = new Car();
		System.out.println("First car created");
		System.out.println("Creating second car");
		//creating custom car
		System.out.println("Enter the make of the car:");
		make=userInput.next();
		System.out.println("Enter the model of the car:");
		model=userInput.next();
		System.out.println("Enter the year of the car:");
		year=userInput.nextInt();
		System.out.println("Enter the price of the car:");
		price=userInput.nextInt();
		System.out.println("Enter the colour of the car:");
		colour=userInput.next();
		System.out.println("Enter the licence plate of the car:");
		licencePlate=userInput.next();
		//creates second car
		car2 = new Car(make,model,year,price,colour,licencePlate);
		System.out.println("Second car created");
		System.out.println("Creating third car");
		//creating third car
		System.out.println("Enter the make of the car:");
		make=userInput.next();
		System.out.println("Enter the model of the car:");
		model=userInput.next();
		System.out.println("Enter the year of the car:");
		year=userInput.nextInt();
		System.out.println("Enter the price of the car:");
		price=userInput.nextInt();
		//creates third car
		car3 = new Car(make,model,year,price);
		System.out.println("Third car created");
	    //Print the details of each car
	    System.out.println(car1);
	    System.out.println("--------------------------");
	    System.out.println(car2.toString());
	    System.out.println("--------------------------");
	    System.out.println(car3.toString());
	    System.out.println("--------------------------");
	    car2.honkTheHorn();
	}//end main
}//end class
