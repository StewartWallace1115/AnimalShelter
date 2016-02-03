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
	String animalNumber;
	
	Pet(){
		
	}
	
	Pet(boolean spayedNeutered, String animalNumber){
		this.animalNumber = animalNumber;
		this.spayedNeutered = spayedNeutered;
	}

	public boolean isSpayedNeutered() {
		return spayedNeutered;
	}

	public void setSpayedNeutered(boolean spayedNeutered) {
		this.spayedNeutered = spayedNeutered;
	}

	public String getAnimalNumber() {
		return animalNumber;
	}

	public void setAnimalNumber(String animalNumber) {
		this.animalNumber = animalNumber;
	}
	
	
}
