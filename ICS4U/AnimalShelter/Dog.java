package AnimalShelter;
/**
 * Christopher Duong
 * U6A4 Animal Shelter Tester
 * This is the dog Object
 */
public class Dog {
	//variables for characteristics
	private String dogName, dogBreed;
	private int age;
	public Dog(){
		age=(int)(Math.random()*10);
		dogName=getRandomName();
	}
	private String getRandomName()
	{
		String name=null;
		int random=0;
		random= (int) (Math.random()*3);
		return name;
	}
}//end class
