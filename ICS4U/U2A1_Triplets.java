import java.util.ArrayList;
/**
 * Christopher Duong
 *Triplets
 *This program will make a AAA triplet poem.
 */
public class U2A1_Triplets {
	public static void main(String[] args) {
		//Variable Declaration and Initialization
		String noun=null;
		String verb1=null, verb2=null;
		String rhymingNoun1=null, rhymingNoun2=null, rhymingNoun3=null;
		int randomNum=0;
		//This program will use a dynamic arrays
		//nouns
		ArrayList<String> nouns = new ArrayList<String>();
		nouns.add("cat");
		nouns.add("dog");
		nouns.add("horse");
		nouns.add("goat");
		nouns.add("eagle");
		nouns.add("lion");
		nouns.add("giraffe");
		//verbs
		ArrayList<String> verbs = new ArrayList<String>();
		verbs.add("ate");
		verbs.add("slept");
		verbs.add("jumped");
		verbs.add("raced");
		verbs.add("ran");
		verbs.add("tripped");
		verbs.add("guessed");
		verbs.add("tapped");
		//rhyming nouns
		ArrayList<String> rhymingNouns = new ArrayList<String>();
		rhymingNouns.add("mouse");
		rhymingNouns.add("blouse");
		rhymingNouns.add("grouse");
		rhymingNouns.add("house");
		rhymingNouns.add("spouse");
		rhymingNouns.add("doghouse");
		rhymingNouns.add("beachhouse");
		rhymingNouns.add("treehouse");
		//get a random noun from the nouns array
		//use .size() to get the # of elements
		randomNum = (int) (Math.random() * nouns.size());
		noun = nouns.get(randomNum);
		//get the first random verb from the verbs array &
		// remove from ArrayList
		randomNum = (int) (Math.random() * verbs.size());
		verb1 = verbs.get(randomNum);
		verbs.remove(randomNum);
		//get the second random verb from verbs array and remove it
		randomNum = (int) (Math.random() * verbs.size());
		verb2 = verbs.get(randomNum);
		verbs.remove(randomNum);
		//get the first rhyming noun and remove it
		randomNum = (int) (Math.random() * rhymingNouns.size());
		rhymingNoun1 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);
		//get the second rhyming noun and remove it
		randomNum = (int) (Math.random() * rhymingNouns.size());
		rhymingNoun2 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);
		//get the third rhyming noun and remove it
		randomNum = (int) (Math.random() * rhymingNouns.size());
		rhymingNoun3 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);
		//Display the poem
		System.out.println("The " + noun + " " + verb1 + " the " + 
				rhymingNoun1 + "\n" + "but it " + verb2 + " on the " + rhymingNoun2+"\n"+
				"And it became a " + rhymingNoun3);
	}//end main
}//end class
