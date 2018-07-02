/*
 * Name: Stewart Wallace
 * Date: 3/28/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class models the 
 */

public class Owner {
	private String 	 name;
	private String 	 address;
	private int 	 zip;
	private String   phoneNumber;
	private String   city;
	private String   state;
	private String   email;
	
	Owner(String name, String address, int zip, String phoneNumber, String city,
			String state, String email){
		this.name = name;
		this.address = address;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state; 
		this.email = email;
	}
	
	Owner(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
