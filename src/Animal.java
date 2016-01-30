/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 1/29/2016
 * email: Jordan Powell   - 
 *        Stewart Wallace - swallace3644@g.fmarion.edu
 * 
 * Purpose: 
 */
public class Animal {
		private String eyeColor;
		private String name;
		private String sex;
		private String animalIDNumber;
		private String animalType;
		private String height;
		private String weight;
	
	Animal(){
		this.eyeColor = null;
		this.name = null;
		this.sex = null;
		this.animalIDNumber = null;
		this.animalType = null;
		this.weight = null;
		this.height = null;
	}
	
	Animal(String eyeColor, String name, String sex, String animalIDNumber,
		   String animalType, String height, String weight){
		this.eyeColor = eyeColor;
		this.name = name;
		this.sex = sex;
		this.animalIDNumber = animalIDNumber;
		this.animalType= animalType;
		this.weight = weight;
		this.height = height;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public void setEyeColor(String eyeColor){
		this.eyeColor = eyeColor;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getSex(){
		return sex;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getAnimalIDNumber(){
		return animalIDNumber;
	}

	public void setAnimalIDNumber(String animalIDNumber){
		this.animalIDNumber = animalIDNumber;
	}

	public String getAnimalType(){
		return animalType;
	}

	public void setAnimalType(String animalType){
		this.animalType = animalType;
	}

	public String getHeight(){
		return height;
	}

	public void setHeight(String height){
		this.height = height;
	}

	public String getWeight(){
		return weight;
	}

	public void setWeight(String weight){
		this.weight = weight;
	}
}
