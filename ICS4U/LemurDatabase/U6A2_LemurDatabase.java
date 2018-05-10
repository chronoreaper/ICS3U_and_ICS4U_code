package LemurDatabase;
import java.util.ArrayList;
import javax.swing.*;
public class U6A2_LemurDatabase {
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int userInput=0;
		boolean addMore=true;
		ArrayList<TreeLemur> treeList = new ArrayList<TreeLemur>();
		ArrayList<DesertLemur> desertList = new ArrayList<DesertLemur>();
		ArrayList<JungleLemur> jungleList = new ArrayList<JungleLemur>();
		while (addMore)
		{
			userInput=Integer.parseInt(JOptionPane.showInputDialog("PleaseEnter the type of Lemur to add:"
					+"\n1-Tree Lemur"
					+"\n2-Desert Lemur"
					+"\n3-Jungle Lemur"));
			if (userInput==1)
			{
				System.out.println("Created Tree Lemur");
				treeList.add(new TreeLemur());
			}
			else if (userInput==2)
			{
				System.out.println("Created Desert Lemur");
				desertList.add(new DesertLemur());
			}
			else if (userInput==3)
			{
				System.out.println("Created Jungle Lemur");
				jungleList.add(new JungleLemur());
			}
			else 
			{
				addMore=false;
			}
		}//ends loop
		//prints out the lemurs
		System.out.println(treeList);
		System.out.println(desertList);
		System.out.println(jungleList);
	}//end main
}//end class
