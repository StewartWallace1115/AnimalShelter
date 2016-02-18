/*
 * Name:  Jordan Powell, Stewart Wallace
 * Date:  1/29/2016
 * email: Jordan Powell   - 
 *        Stewart Wallace - swallace3644@g.fmarion.edu
 * 
 * Purpose: This class models a real life pet. This class is a subclass of Animal.
 * 			This class contains the animals cage number, and spayed or neurtered.
 */
public class Pet extends Animal{
	//CageCard cageCard = null;
	boolean spayedNeutered;
	boolean microchip;
	String animalNumber;
	
	/*
	 * Default constructor the class. It sets all attributes to null or false for
	 * boolean values. 
	 */
	Pet(){
		this.spayedNeutered = false;
		this.animalNumber = null;
	}
	
	/*
	 * Initialization constructor. It initializes the class attributes with values 
	 * provided as arguments for the constructor.
	 */
	Pet(boolean spayedNeutered, String animalNumber){
		this.animalNumber = animalNumber;
		this.spayedNeutered = spayedNeutered;
	}
	
	Pet(String eyeColor, String name, String sex, String animalType, String height, 
			String weight, boolean spayedNeutered, String animalBreed){
		
		super(eyeColor, name, sex, animalBreed,animalType, height, weight);
		this.spayedNeutered = spayedNeutered;
	}
	
	/*
	 * Returns a boolean value if the animal is either spayed or neutered. 
	 */
	public boolean isSpayedNeutered() {
		return spayedNeutered;
	}
	
	/*
	 * Sets the boolean attribute spaytedNeutered. Accepts a boolean called 
	 * spayedNeutered.
	 */
	public void setSpayedNeutered(boolean spayedNeutered) {
		this.spayedNeutered = spayedNeutered;
	}
	
	/*
	 * Returns the animalNumber as a String.
	 */
	public String getAnimalNumber() {
		return animalNumber;
	}
	
	/*
	 * Sets the animal's number. Accepts a String called animalNumber.
	 */
	public void setAnimalNumber(String animalNumber) {
		this.animalNumber = animalNumber;
	}
	
	public boolean haveMicrochip(){
		return microchip;
	}
	
	
}
