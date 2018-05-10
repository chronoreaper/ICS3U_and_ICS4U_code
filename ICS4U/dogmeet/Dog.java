package dogmeet;
/**
 * Christopher Duong
 * U3A2 Dog
 * This is the dog Object
 */
public class Dog {
	//variables for characteristics
	private String dogName, dogBreed;
	private int aggression, hunger, age;
	//constructors
	public Dog(String dgName, String dgBreed, int agg, int hung, int ag){
		dogName = dgName;
		dogBreed = dgBreed;
		aggression = agg;
		hunger = hung;
		age = ag;
	}//end dog
	//Alternate constructor
	public Dog(String dgName, String dgBreed){
		//This constructor only uses the name and breed
		//Set the aggression, hunger and age to random #s
		dogName = dgName;
		dogBreed = dgBreed;
		aggression = (int)(Math.random()*10) + 1;
		hunger = (int)(Math.random()*10) + 1;
		age = (int)(Math.random()*20) + 1;
	}//end dog
	//Accessor Methods
	public String getName() {
		return dogName;
	}//end get name
	public void setName(String dgName){
		dogName = dgName;
	}//end set name
	public String getBreed() {
		return dogBreed;
	}//end get breed
	public void setBreed(String dgBreed){
		dogBreed = dgBreed;
	}//end set breed
	public int getAggression() {
		return aggression;
	}//end get aggression
	public void setAggression(int dogAgg){
		aggression = dogAgg;
	}//end aggression
	public int getHunger() {
		return hunger;
	}//end get hung
	public void setHunger(int dogHung){
		hunger = dogHung;
	}//end set hung
	public int getAge() {
		return age;
	}//end get hung
	public void setAge(int dogAge){
		age = dogAge;
	}//end set hung
	//barking
	public void barkFriendly() {
		System.out.println("Arf! Arf!");
	}//end barkfriendly
	public void barkAngry() {
		System.out.println("GRR! RRRFFF!");
	}//end bark angry
	public void barkHungry() {
		System.out.println("GRR! SLURP!");
	}//end bark hungry
	public void barkScared() {
		System.out.println("*wimpers*");
	}//end bark hungry
	//method to display all info of the Dog
	public String toString() {
		String output = "Name: " + dogName + "\n";
		output += "Breed: " + dogBreed + "\n";
		output += "Aggression: " + aggression + "\n";
		output += "Hunger: " + hunger + "\n";
		output += "Age: " + age;
		//output string is complete, return it
		return output;
	}//end to string
}//end class
