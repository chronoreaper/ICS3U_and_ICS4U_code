package LemurDatabase;
public class DesertLemur extends Lemur{
	private String food;
	private String colour;
	private double babyDeath;
	public DesertLemur(){
		//calls parent class
		super();
		food="Cacti";
		colour="White";
		babyDeath=0.66;
	}//end desert lemer
	public String toString(){
		String output="";
		output+="-------DESERT LEMUR------";
		output+=super.toString();
		output+="\nFood = "+food;
		output+="\nColour = "+colour;
		output+="\nBaby Death rate = "+babyDeath+"\n";
		return output;
	}//end to string
}//end class
