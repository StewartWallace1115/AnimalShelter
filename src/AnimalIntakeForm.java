
/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/8/2016
 * email: 	jpowell3617@g.fmarion.edu
 * 
 * Purpose: This class holds the information for the animal's intake form. 
 */


public class AnimalIntakeForm {

	private String owner;
	private String location;
	
	AnimalIntakeForm()
	{
	}
	
	AnimalIntakeForm(String owner, String location)
	{
		this.owner = owner;
		this.location = location;
	}

	public String getOwner() 
	{
		return owner;
	}

	public void setOwner(String owner) 
	{
		this.owner = owner;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public void newOperation()
	{
		//This was in our UML diagram but i'm not sure what it does. 
	}
}

