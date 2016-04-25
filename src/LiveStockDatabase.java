/*
 * Name: Stewart Wallace
 * Date: 
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class is a boundary class for the liveStock table. This class inserts 
 * a live stock object into the livestock table. This class also retrieves a livestock 
 * object from the liveStock table. 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LiveStockDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	LiveStock liveStock;
	
	/*
	 * Constructor accepts a liveStock object.
	 */
	LiveStockDatabase(LiveStock liveStock){
		this.liveStock = liveStock;
	}
	
	/*
	 * Default constructor sets the liveStock to null.
	 */
	LiveStockDatabase(){
		liveStock = null;
	}
	
	/*
	 * This method inserts a liveStock object into the liveStock table. 
	 */
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
	
	/*
	 * This method retrieves a liveStock object from a liveStock from the liveStock
	 * table. This method searches the table by the livestockID. It returns a liveStock
	 * object.
	 */
	public LiveStock searchID(int liveStockID){
		String query = "Select * from livestock where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, liveStockID);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				String name = rs.getString("name");
				String eyeColor = rs.getString("eyecolor");
				String sex = rs.getString("sex");
				String type = rs.getString("type");
				String breed = rs.getString("breed");
				String height = rs.getString("height");
				String weight = rs.getString("weight");
				int age = rs.getInt("age");
				String furColor = rs.getString("furColor");
				
				
				liveStock = new LiveStock( name, eyeColor, sex, type, breed,  height, weight,
						age, furColor);
				
				return liveStock;
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return liveStock;
	}
	
}
