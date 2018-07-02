/*
 * Name: Jordan Powell
 * Date: 2/8/2016
 * email: 	jpowell3617@g.fmarion.edu
 * 			
 * Purpose: This class holds the information for the County Registration Form. 
 */

import java.util.*;

public class CountyRegistrationForm 
{
	private int fee;
	private Date dateRegistered;
	private String tag;
	private boolean certified;
	private int petID;
	private int vetID;
	private boolean vaccinations;
	private Date vaccinationsDate;
	
	public int getPetID() {
		return petID;
	}

	public void setPetID(int petID) {
		this.petID = petID;
	}

	public int getVetID() {
		return vetID;
	}

	public void setVetID(int vetID) {
		this.vetID = vetID;
	}

	public boolean isVaccinations() {
		return vaccinations;
	}

	public void setVaccinations(boolean vaccinations) {
		this.vaccinations = vaccinations;
	}

	public Date getVaccinationsDate() {
		return vaccinationsDate;
	}

	public void setVaccinationsDate(Date vaccinationsDate) {
		this.vaccinationsDate = vaccinationsDate;
	}

	CountyRegistrationForm(){
		 Calendar cal = Calendar.getInstance();
		 dateRegistered = cal.getTime();
		
	}
	
	public int getFee() 
	{
		return fee;
	}

	public void setFee(int fee) 
	{
		this.fee = fee;
	}

	public Date getDateRegistered() 
	{
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) 
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
		Calendar nextYear = Calendar.getInstance();
		nextYear.setTime(getDateRegistered());
		nextYear.add(Calendar.YEAR, 1);
		
		Date newDate = nextYear.getTime();
		if(dateRegistered.compareTo(newDate)>=0){
			return true;
		}else{
			return false;
		}
	}
}
