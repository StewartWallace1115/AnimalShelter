/*
 * Name:  Jordan Powell
 * Date:  2/25/2016
 * email: Jordan Powell   - jpowell3617@g.fmarion.edu
 * 
 * Purpose: The purpose of this class is to create and store information for 
 * 			all transactions in the animal shelter and serve as a receipt. 
 */

public class FeesChargedForm {
	int total = 0, animalID;
	boolean dogOrCat, noRabies, unaltered;
	int numberOfAnimals;
	boolean adoptionFee, liveStockRecoveryFee;
	int days, transportFee;
	String reason;
	String name, date, address, city, state, zip, phoneNumber, email;
	

	public int calculateRecoveryFee() 
	{
		if (dogOrCat)
			total += 25;
		if (noRabies)
			total += 10;
		if (unaltered)
			total += 25;

		return total;
	}

	public int calculateAdoptionFee()
	{
		total = 0;
		
		if(adoptionFee)
			total += 85 * numberOfAnimals;
		
		return total;
	}
	
	public int calculateLiveStockRecoveryFee()
	{
		total = 0;
		
		if(liveStockRecoveryFee)
			total += 15 * days * numberOfAnimals;
		
		return total;
	}

	
	
	
	public FeesChargedForm(int total, String name, String date, String address,
						   String city, String state, String zip, 
						   String phoneNumber, String email) {
		this.total = total;
		this.name = name;
		this.date = date;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public FeesChargedForm()
	{
		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isDogOrCat() {
		return dogOrCat;
	}

	public void setDogOrCat(boolean dogOrCat) {
		this.dogOrCat = dogOrCat;
	}

	public boolean isNoRabies() {
		return noRabies;
	}

	public void setNoRabies(boolean noRabies) {
		this.noRabies = noRabies;
	}

	public boolean isUnaltered() {
		return unaltered;
	}

	public void setUnaltered(boolean unaltered) {
		this.unaltered = unaltered;
	}

	public int getNumberOfAnimals() {
		return numberOfAnimals;
	}

	public void setNumberOfAnimals(int numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
	}

	public boolean isAdoptionFee() {
		return adoptionFee;
	}

	public void setAdoptionFee(boolean adoptionFee) {
		this.adoptionFee = adoptionFee;
	}

	public boolean isLiveStockRecoveryFee() {
		return liveStockRecoveryFee;
	}

	public void setLiveStockRecoveryFee(boolean liveStockRecoveryFee) {
		this.liveStockRecoveryFee = liveStockRecoveryFee;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(int transportFee) {
		this.transportFee = transportFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
