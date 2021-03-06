/*
 * Name: Stewart Wallace
 * Date: 3/15/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class models the real life cage card. It contains information about the 
 * pet, the arrival data, cage number and when he or she is avalible for adoption.
 */

import java.util.Calendar;
import java.util.Date;

public class CageCard {
	Pet pet;
	Date arrivalDate;
	int cageNumber;
	Date dateAvalibleForAdoption ;
	int petID;
	CageCard(){
		pet = new Pet();
		
	}
	
	CageCard(Date arrivalDate, int cageNumber, int petID){
		this.arrivalDate = arrivalDate;
		this.cageNumber = cageNumber;
		this.petID = petID;
		setDateAvalibleForAdoption(arrivalDate);
	}
	
	public void setPetID(int petID){
		this.petID = petID;
	}
	
	public int getPetID(){
		return petID;
	}
	
	
	/*
	 * Returns the pet object.
	 */
	public Pet getPet() {
		return pet;
	}
	
	/*
	 * Sets the pet object. It takes in a Pet obejct as a parameter.
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	/*
	 * Returns a arrivalDate as Calendar data type.
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}
	
	/*
	 * Sets the arrival data. The parameter is arrivalDatae of Calander type.
	 */
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	/*
	 * Returns the cageNumber as an int.
	 */
	public int getCageNumber() {
		return cageNumber;
	}
	
	/*
	 * Sets the cage number. It accepts a int parameter called cageNumber.
	 */
	public void setCageNumber(int cageNumber) {
		this.cageNumber = cageNumber;
	}
	
	/*
	 * Returns the data avalible for adoption.
	 */
	public Date getDateAvalibleForAdoption() {
		return dateAvalibleForAdoption;
	}

	/*
	 * Sets the data avalible for adoption. It takes one parameter as Calender data type.
	 */
	public void setDateAvalibleForAdoption(Date dateAvalibleForAdoption) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateAvalibleForAdoption);
		
		cal.add(Calendar.DATE, 30);
		
		dateAvalibleForAdoption = cal.getTime();
		
		this.dateAvalibleForAdoption = dateAvalibleForAdoption;
	}
}
