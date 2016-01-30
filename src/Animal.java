
public class Animal {
	private String eyeColor;
	private String name;
	private String sex;
	private String animalIDNumber;
	private String animalType;
	private String height;
	private String weight;
	
	Animal(){
		
	}
	
	Animal(String eyeColor, String name){
		this.eyeColor = eyeColor;
		this.name = name;
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
