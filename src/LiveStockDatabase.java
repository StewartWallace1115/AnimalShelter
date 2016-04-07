import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LiveStockDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	LiveStock liveStock;
	
	LiveStockDatabase(LiveStock liveStock){
		this.liveStock = liveStock;
	}
	
	public void insert(){
		String query = "INSERT INTO liveStock(name, eyeColor, sex, type, breed, "
				+ "height, weight, age, furColor, vetNumber) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
			prepareStatement.setString(1, liveStock.getName());
			prepareStatement.setString(2, liveStock.getEyeColor());
			prepareStatement.setString(3, liveStock.getSex());
			prepareStatement.setString(4, liveStock.getAnimalType());
			prepareStatement.setString(5, liveStock.getAnimalBreed());
			prepareStatement.setString(6, liveStock.getHeight());
			prepareStatement.setString(7, liveStock.getWeight());
			prepareStatement.setInt(8, liveStock.getAge());
			prepareStatement.setString(9, liveStock.getFurColor());
			prepareStatement.setInt(10, liveStock.getVetNumber());
			
			prepareStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
