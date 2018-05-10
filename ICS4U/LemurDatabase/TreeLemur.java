package LemurDatabase;
public class TreeLemur extends Lemur{
	private String food=null;
	private String colour=null;
	private String packSize=null;
	public TreeLemur(){
		//calls parent class
		super();
		food="Fruit";
		colour="Red";
		packSize="Large Groups";
	}//end object initialization
	public String toString(){
		String output="";
		output+="-------TREE LEMUR------";
		output+=super.toString();
		output+="\nFood = "+food;
		output+="\nColour = "+colour;
		output+="\nPack Size = "+packSize+"\n";
		return output;
	}//end to string
}//end class
