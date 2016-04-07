
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
	
	public int getVetNumber() 
	{
		return vetNumber;
	}
	
	public void setVetNumber(int vetNumber) 
	{
		this.vetNumber = vetNumber;
	}
	
	
	
}
