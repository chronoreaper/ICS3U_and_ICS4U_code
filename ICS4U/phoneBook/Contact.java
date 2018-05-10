package phoneBook;
/**
 * Christopher Duong
 * The contact Object
 */
public class Contact 
{	
	String name,phoneNumber,email,address;
	public Contact()
	{
		name="";
		phoneNumber="";
		email="";
		address="";
	}//end default constructor
	public Contact(String na,String pH, String em, String ad)
	{
		name=na;
		phoneNumber=pH;
		email=em;
		address=ad;
	}//end constructor
	public void reSet()
	{
		name="";
		phoneNumber="";
		email="";
		address="";
	}//ed reset
	public void setName(String s)
	{
		name=s;
	}//end set name
	public void setPhoneNumber(String s)
	{
		phoneNumber=s;
	}//end set phonenumber
	public void setEmail(String s)
	{
		email=s;
	}//end set email
	public void setAddress(String s)
	{
		address=s;
	}//end set Address
	public String getName()
	{
		return name;
	}//end get name
	public String getPhoneNumber()
	{
		return phoneNumber;
	}//end get phonenumber
	public String getEmail()
	{
		return email;
	}//end get email
	public String getAddress()
	{
		return address;
	}//end get address
	public String toString()
	{
		String string="\n";
		string+="NAME: "+name+"\n";
		string+="PHONE NUMBER: "+phoneNumber+"\n";
		string+="EMAIL: "+email+"\n";
		string+="ADDRESS: "+address+"\n";
		return string;
	}
}//end class
