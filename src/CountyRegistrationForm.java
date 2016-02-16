
import java.util.*;

/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/8/2016
 * email: 	jpowell3617@g.fmarion.edu
 * 			swallace3644@g.fmarion.edu
 * Purpose: This class holds the information for the County Registration Form. 
 */

public class CountyRegistrationForm 
{
	private int fee;
	private Calendar dateRegistered;
	private String tag;
	private boolean certified;
	
	CountyRegistrationForm(){
		dateRegistered = Calendar.getInstance();
		
	}
	
	public int getFee() 
	{
		return fee;
	}

	public void setFee(int fee) 
	{
		this.fee = fee;
	}

	public Calendar getDateRegistered() 
	{
		return dateRegistered;
	}

	public void setDateRegistered(Calendar dateRegistered) 
	{
		this.dateRegistered = dateRegistered;
	}

	public String getTag() 
	{
		return tag;
	}

	public void setTag(String tag) 
	{
		this.tag = tag;
	}

	public boolean isCertified()
	{
		return certified; 
	}
	
	public boolean isRegistrationComplete()
	{
		return this.certified;
	}
	
	public boolean isRegistrationOutdated()
	{
		Calendar nextYear = dateRegistered;
		nextYear.add(Calendar.YEAR, 1);
		
		if(dateRegistered.compareTo(nextYear)>=0){
			return true;
		}else{
			return false;
		}
	}
}
