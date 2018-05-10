package LemurDatabase;
public class Lemur extends Mammal {
	private String location=null;
	private String classification=null;
	private String coat=null;
	public Lemur(){
		super();
		location="Madagascar";
		classification="Prosimian";
		coat="fur";
	}//end lemur
	public String toString(){
		String output="";
		output+=super.toString();
		output+="\nLocation = "+location;
		output+="\nClassification = "+classification;
		output+="\nCoat = "+coat;
		  if (gender.equals("Female"))
			  output+="\nGemale Lemur = Dominant Role";
		return output; 
	}//end to string
}//end class
