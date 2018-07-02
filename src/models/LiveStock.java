/*
 * Name:Jordan Powell
 */

public class LiveStock extends Animal
{
	String liveStockNumber;
	int vetNumber;
	
	
	public LiveStock()
	{
		this.liveStockNumber = null;
		this.vetNumber = 0;
	}
	
	public LiveStock(String liveStockNumber, int vetNumber) 
	{
		this.liveStockNumber = liveStockNumber;
		this.vetNumber = vetNumber;
	}
	
	public LiveStock(String name, String eyeColor, String sex, String  animalType,
			String animalBreed, String height, String weight, int age, String furColor){
		super(eyeColor, name, sex, animalBreed, animalType, height, weight, furColor, age);
	}
	
	
	public LiveStock(String eyeColor, String name, String sex,String animalBreed
			   ,String animalType, String height, String weight, String furColor, int age) 
	{
		super(eyeColor, name, sex, animalBreed, animalType, height, weight, furColor, age);
	}



	public String getLiveStockNumber() 
	{
		return liveStockNumber;
	}
	
	public void setLiveStockNumber(String liveStockNumber) 
	{
		this.liveStockNumber = liveStockNumber;
	}
	
	public int getVetNumber() 
	{
		return vetNumber;
	}
	
	public void setVetNumber(int vetNumber) 
	{
		this.vetNumber = vetNumber;
	}
	
	
	
}
