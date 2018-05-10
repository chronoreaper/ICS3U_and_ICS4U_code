import java.util.Scanner;
/**
 * Christopher Duong
 * Animal Experiment simulator
 * This program simulates an animal experiment
 */
public class U3A8_AnimalControl {

	public static void main(String[] args) {
		//Variable Declaration, and Initialization
		int hour=0, animal=0, food=0, foodPlus=0,foodAfter=0, animalEnd=0;
		//space format for chart to make it neater
		String spaceAnimal= "\t\t\t", spaceFood="\t\t", spaceFoodPlus="\t\t";
		//user input
		Scanner user_input=new Scanner (System.in);
		System.out.println("Welcome to Animal Control Center. Every hour, the animal population will double and the food supply will increase by x ammount. \n The animal will only eat in a 1:1 ratio. This program will determine the hour at which the animal population is greater than the food supply.");
		System.out.print("Enter the inital animal population: ");
		//animal at start
		animal=(int) Double.parseDouble (user_input.next());
		System.out.print("Enter the inital food supply: ");
		//food supply at start
		food= (int) Double.parseDouble (user_input.next());
		System.out.print("Enter the food supply gained every hour: ");
		//food gained every hour
		foodPlus= (int) Double.parseDouble (user_input.next());
		//chart format
		System.out.println("Hour	|Animals at Start	|Food at start	|Food after	|Animals at end");
		//as long as the animals are not greater than the food supply
		while (animalEnd<=foodAfter)
		{
			//animals are doubled
			animalEnd=animal*2;
			//gaining food and losing some to the animals
			foodAfter=foodPlus+foodAfter-animal;
			//chart print out
			System.out.println(hour+"	|"+animal+spaceAnimal+"|"+food+spaceFood+"|"+foodAfter+spaceFoodPlus+"|"+animalEnd);
			//hours increase
			hour++;
			animal=animalEnd;
			food=foodAfter;
		}//end while
		//conclusion sentence
		System.out.println("At the "+hour+"th hour, the animals will overporulate the food.");
	}//end main
}//end class