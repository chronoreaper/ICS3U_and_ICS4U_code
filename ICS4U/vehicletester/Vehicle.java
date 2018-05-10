package vehicletester;
public class Vehicle {
	public double gasKilometrage=0;
	public double fuelTankSize=0;
	public double fuelAvailable=0;
	public double kilometresTravelled=0;
	public double passengers=0;
	public double fairCost=0;
	public double fuelCost=0;
	public double tripRevenue=0;
	public double tripCost=0;
	public double tripProfit=0;
	public Vehicle() {
		//Default Constructor
		gasKilometrage = 0;
		fuelTankSize = 0;
		fuelAvailable = 0;
		kilometresTravelled = 0;
		passengers=0;
		fairCost=0;
		fuelCost=0;
	}//end default
	public Vehicle(double gK, double fTS, double fA, double kT, double pS, double faC, double fuC){
		gasKilometrage = gK;
		fuelTankSize = fTS;
		fuelAvailable = fA;
		kilometresTravelled = kT;
		passengers=pS;
		fairCost=faC;
		fuelCost=fuC;
	}//end new vehicle
	public void addFuel(double gas){
		if((fuelTankSize - fuelAvailable) >= gas)
		{
			fuelAvailable += gas;
			System.out.println("Added " + gas + 
					"L of gas to the tank.");
		}
		else 
		{
			System.out.println("You tried to add "+gas+"L of gas.");
			System.out.println("There is only room for " + 
					(fuelTankSize - fuelAvailable) + "L.");
		}//end else
	}//end add fuel
	public void driveVehicle(double kms){
		//Drive the vehicle
		//ex.  If the vehicle uses 9.5L/100 km then
		//litresNeeded = kms * 9.5 / 100
		System.out.println("Drive " + kms + "kms.  Start with " + 
				fuelAvailable + "L of gas.");
		double litresNeeded=(kms*gasKilometrage)/100.0;
		if(fuelAvailable >= litresNeeded)
		{
			fuelAvailable -= litresNeeded;
			kilometresTravelled += kms;
			System.out.println("Used " + litresNeeded + "L of gas.");
		}
		else 
		{
			System.out.println("Ran out of fuel!");
			//Calculate how many kms were driven
			double kmsThisDrive=(fuelAvailable*100.0)/gasKilometrage;
			kilometresTravelled += kmsThisDrive;
			fuelAvailable = 0;
			System.out.println("The vehicle drove " + kmsThisDrive +
					" before running out of gas.");
		}//end else
	}//end drive vehicle
	public void totalCost() {
		//calaculate the cost of the trip
		tripCost=(kilometresTravelled*gasKilometrage)/100*fuelCost;
	}//end total cost
	public void profit() {
		//passengers by fair cost to get the revenue
		tripRevenue=passengers*fairCost;
		//subtract the revenue by the cost of the trip
		tripProfit=tripRevenue-tripCost;
		System.out.println("Revenue = $"+tripRevenue);
		System.out.println("Cost = $"+tripCost);
		System.out.println("Profit = $"+tripProfit);
	}//end profit
	public String toString() {
		String output = "Gas Kilometrage = " + gasKilometrage+"\n";
		output += "Fuel Tank Size = " + fuelTankSize + "\n";
		output += "Fuel Available = " + fuelAvailable + "\n";
		output += "Kilometres Driven = "+kilometresTravelled+"\n";
		output += "Passengers = "+passengers+"\n";
		output += "Fair = $"+fairCost+"\n";
		output += "Fuel Cost = $"+fuelCost+"/L\n";		
		return output;
	}//end to string
}//end class