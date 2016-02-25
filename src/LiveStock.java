
public class LiveStock extends Animal
{
	String liveStockNumber;
	String vetNumber;
	
	
	public LiveStock()
	{
		this.liveStockNumber = null;
		this.vetNumber = null;
	}
	
	public LiveStock(String liveStockNumber, String vetNumber) 
	{
		this.liveStockNumber = liveStockNumber;
		this.vetNumber = vetNumber;
	}
	
	
	public LiveStock(String eyeColor, String name, String sex, String animalIDNumber,
					 String animalType, String height,String weight) 
	{
		super(eyeColor, name, sex, animalIDNumber, animalType, height, weight);
	}



	public String getLiveStockNumber() 
	{
		return liveStockNumber;
	}
	
	public void setLiveStockNumber(String liveStockNumber) 
	{
		this.liveStockNumber = liveStockNumber;
	}
	
	public String getVetNumber() 
	{
		return vetNumber;
	}
	
	public void setVetNumber(String vetNumber) 
	{
		this.vetNumber = vetNumber;
	}
	
	
	
}
