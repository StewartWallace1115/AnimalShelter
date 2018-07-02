/*
 * Name: Stewart Wallace
 * email: swallace3644@g.fmarion.edu
 * 
 * Purpose: This class models the real life object, disposition form.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AnimalDispositionForm {
	Pet pet;
	private String name;
	private String exitReason;
	private String phoneNumber;
	private String date;
	
	/*
	 * Default constructor. It initializes date to the current date.
	 */
	AnimalDispositionForm(){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		date = dateFormat.format(cal.getTime());
	}
	
	/*
	 * Returns name as String type.
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Accepts a String called name and sets object's name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Returns exitReason as String type.
	 */
	public String getExitReason() {
		return exitReason;
	}
	
	/*
	 * Sets the exitReason and accepts exitReason type String.
	 */
	public void setExitReason(String exitReason) {
		this.exitReason = exitReason;
	}
	
	/*
	 * Returns the phoneNumber as a String.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/*
	 * Sets the phoneNumber and accepts a String
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * Returns the data as String.
	 */
	public String getDate() {
		return date;
	}
	
	/*
	 * Sets the data as a String. 
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
