package LemurDatabase;

public class Mammal {
  private int age=0;
  private double weight=0;
  protected String gender=null;


  public Mammal() {
	  int randNumb=0;
	  age=(int)(Math.random()*12+1);
	  weight=Math.random()*4;
	  //randomize gender
	  randNumb=(int)(Math.random()*2);
	  if (randNumb==0)
	  {
		  gender="Male";
	  }
	  else
	  {
		  gender="Female";
	  }//end if
  }//end mammal
  public int getAge(){
	  return age;
  }//end return age
  public double getWeight(){
	  return weight;
  }//end return weight
  public String toString(){
	  String output="";
	  output+="\nAge = "+age;
	  output+="\nWeight = "+weight;
	  output+="\nGender = "+gender;
	  return output;
  }//end return string
}//end class