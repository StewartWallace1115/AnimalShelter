/*
 * Name:  Jordan Powell, Stewart Wallace
 * Date:  1/29/2016
 * email: Jordan Powell   - 
 *        Stewart Wallace - swallace3644@g.fmarion.edu
 * 
 * Purpose: The purpose of this class is to be a generalization for both pet and
 * 			livestock. This class stores eye color, name, sex, animal ID number, 
 * 			animal type, height, weight, altered and altered detail of the animal. 
 * 			Class also contains setters and getters for the attributes. 
 */
public class Animal {
		private String eyeColor;
		private String name;
		private String sex;
		private String animalIDNumber;
		private String animalType; 		// Examples are cat, dog, and etc.
		private String height;
		private String weight;
		private String animalBreed;		// Examples are beagle, calico and etc.
		
	
	/*
	 * The default constructor for Animal class.
	 */
	Animal(){
		this.eyeColor = null;
		this.name = null;
		this.sex = null;
		this.animalIDNumber = null;
		this.animalType = null;
		this.weight = null;
		this.height = null;
	}
	
	/*
	 * Constructor that accepts all of the attributes parameters for the class.
	 * The parameters are all string and they're eyeColor, name, sex, animalType, 
	 * weight, and height. animalIDNumber is set to null.
	 */
	Animal(String eyeColor, String name, String sex,String animalBreed
		   ,String animalType, String height, String weight){
		this.eyeColor = eyeColor;
		this.name = name;
		this.sex = sex;
		this.animalType= animalType;
		this.weight = weight;
		this.height = height;
		this.animalBreed = animalBreed;
		this.animalIDNumber = null;
	}
	/*
	 * Constructor that accepts all of the attributes parameters for the class.
	 * The parameters are all string and they're eyeColor, name, sex, animalIDNumber,
	 * animalType, weight, and height.
	 */
	Animal(String eyeColor, String name, String sex, String animalIDNumber,
		   String animalType, String height, String weight, String animalBreed){
		this.eyeColor = eyeColor;
		this.name = name;
		this.sex = sex;
		this.animalIDNumber = animalIDNumber;
		this.animalType= animalType;
		this.weight = weight;
		this.height = height;
		this.animalBreed = animalBreed;
	}
	
	/*
	 * Returns eye color of the animal as a string.
	 */
	public String getEyeColor(){
		return eyeColor;
	}
	
	/*
	 * Sets the eye color of the animal takes a string called 
	 * eyeColor as the parameter.
	 */
	public void setEyeColor(String eyeColor){
		this.eyeColor = eyeColor;
	}
	
	/*
	 * Returns the name of the animal as a string.
	 */
	public String getName(){
		return name;
	}
	
	/*
	 * Sets the name of the animal. It accepts a String called name.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/*
	 * Returns the sex of the animal as a String.
	 */
	public String getSex(){
		return sex;
	}

	/*
	 * Sets the sex of the animal as a String. It accepts a String called sex.
	 */
	public void setSex(String sex){
		this.sex = sex;
	}
	
	/*
	 * Returns the animal ID number as a String.
	 */
	public String getAnimalIDNumber(){
		return animalIDNumber;
	}
	
	/*
	 * Sets the animal ID Number. It accepts a string called animalIDNumber. 
	 */
	public void setAnimalIDNumber(String animalIDNumber){
		this.animalIDNumber = animalIDNumber;
	}
	
	/*
	 * Returns the animal type as a string.
	 */
	public String getAnimalType(){
		return animalType;
	}
	
	/*
	 * Sets animal type. It accepts a String called animalType
	 */
	public void setAnimalType(String animalType){
		this.animalType = animalType;
	}
	
	/*
	 * Returns the animal's height as a string.
	 */
	public String getHeight(){
		return height;
	}
	
	/*
	 * Sets animal's height. Accepts a string called height.
	 */
	public void setHeight(String height){
		this.height = height;
	}
	
	/*
	 * Returns the animal's weight as a string.
	 */
	public String getWeight(){
		return weight;
	}
	
	/*
	 * Sets animal's weight. Accepts a string called weight.
	 */
	public void setWeight(String weight){
		this.weight = weight;
	}
	
	/*
	 * Returns the animal's animal breed.
	 */
	public String getAnimalBreed(){
		return animalBreed;
	}
	/*
	 * Sets animal's breed. Accepts a string called breed.
	 */
	public void setAnimalBreed(String animalBreed){
		this.animalBreed = animalBreed;
	}
}
