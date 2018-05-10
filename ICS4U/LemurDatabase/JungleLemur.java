package LemurDatabase;
public class JungleLemur extends Lemur{
	private String colour;
	private String food;
	private String packSize;
	public JungleLemur(){
		//calls parent class
		super();
		food="Mice, Snails, and Insects";
		colour="Black or Blue";
		packSize="Small groups";
	}//end desert lemer
	public String toString(){
		String output="";
		output+="-------JUNGLE LEMUR------";
		output+=super.toString();
		output+="\nFood = "+food;
		output+="\nColour = "+colour;
		output+="\nPack Size = "+packSize+"\n";
		return output;
	}//end to string
}//end class
