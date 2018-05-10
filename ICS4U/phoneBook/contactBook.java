package phoneBook;
import javax.swing.*;
import java.util.*;
/**
 * Phone book Simulator
 * Christopher Duong
 * This programs simulates a electronic phone book
 */
public class contactBook {
	public static void main(String[] args) {
		//variable declaration and initialization
		ArrayList<Contact> phoneBook=new ArrayList<Contact>();
		int option=0,selected=0,choice=0;
		do
		{
			option=Integer.parseInt(JOptionPane.showInputDialog("ENTER A COMMAND"
					+ "\n1.Add Contact"
					+ "\n2.Remove Contact"
					+ "\n3.Edit Contact"
					+ "\n4.Show Contacts"
					+ "\n5.Exit"));
			switch (option)
			{
			case 1:
				phoneBook.add(new Contact(
						JOptionPane.showInputDialog("Enter the name of contact"),
						JOptionPane.showInputDialog("Enter the phone number of contact"),
						JOptionPane.showInputDialog("Enter the email of contact"),
						JOptionPane.showInputDialog("Enter the address of contact")
						));
				break;
			case 2:
				selected=Integer.parseInt(JOptionPane.showInputDialog("Enter the index you wish to remove"));
			phoneBook.get(selected).reSet();
				break;
			case 3:
				selected=Integer.parseInt(JOptionPane.showInputDialog("Which contact do you want to edit?"));
				choice=Integer.parseInt(JOptionPane.showInputDialog("What do you want to edit?"
						+ "\n1.Name"
						+ "\n2.Phone number"
						+ "\n3.Email"
						+ "\n4.Address"));
				switch (choice)
				{
				case 1:
					phoneBook.get(selected).setName(JOptionPane.showInputDialog("Enter New Name"));
					break;
				case 2:
					phoneBook.get(selected).setPhoneNumber(JOptionPane.showInputDialog("Enter New Phone Number"));
					break;
				case 3:
					phoneBook.get(selected).setEmail(JOptionPane.showInputDialog("Enter New Email"));
					break;
				case 4:
					phoneBook.get(selected).setAddress(JOptionPane.showInputDialog("Enter New address"));
					break;
				}//end switch choice
				break;
			case 4:
				System.out.println(phoneBook);
				break;
			}//end switch option
		}//end loop
		while (option!=5);
	}//end main
}//end class
