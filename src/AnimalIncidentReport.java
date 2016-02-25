/*
 * Name:  Jordan Powell, Stewart Wallace
 * Date:  2/25/2016
 * email: Jordan Powell   - jpowell3617@g.fmarion.edu
 *        Stewart Wallace - swallace3644@g.fmarion.edu
 * 
 * Purpose: The purpose of this class is to create and store information for 
 * 			animal incident reports for the animal shelter. 
 */
public class AnimalIncidentReport {
	String ACOBadge;
	String intakeNumber;
	String date;
	String time;
	String weather;
	String typeOfAnimal;
	String gender;
	String color;
	String owner;
	String phoneNumber;
	String address, city, state, zip;
	String description;
	
	public AnimalIncidentReport(String aCOBadge, String intakeNumber, String date, String time, String weather,
							    String typeOfAnimal, String gender, String color, String owner, String phoneNumber, 
							    String address,	String city, String state, String zip, String description) 
	{
		ACOBadge = aCOBadge;
		this.intakeNumber = intakeNumber;
		this.date = date;
		this.time = time;
		this.weather = weather;
		this.typeOfAnimal = typeOfAnimal;
		this.gender = gender;
		this.color = color;
		this.owner = owner;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.description = description;
	}

	public String getACOBadge() {
		return ACOBadge;
	}

	public void setACOBadge(String aCOBadge) {
		ACOBadge = aCOBadge;
	}

	public String getIntakeNumber() {
		return intakeNumber;
	}

	public void setIntakeNumber(String intakeNumber) {
		this.intakeNumber = intakeNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
