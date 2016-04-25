/*
 * Name: Stewart Wallace
 * Date:
 * email: swallace3644@g.fmarion.edu
 * Purpose: The purpose of this class is to find a pet in the pet table by either 
 * petID or cageCardNumber.
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DispositionSearchDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	Pet pet;
	
	/*
	 * Default constructor for the class and it sets the pet to null.
	 */
	DispositionSearchDatabase(){
		pet = null;
	}
	
	/*
	 * This method searches the pet table for a pet by the pet id number. It 
	 * returns a type Pet.
	 */
	public Pet searchIDNumber(int idNumber){
		String query = "Select * from pet where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, idNumber);
			
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
				boolean altered = rs.getBoolean("altered");
				boolean vaccinations = rs.getBoolean("vaccinations");
				boolean microchip = rs.getBoolean("microchip");
				
				pet = new Pet(eyeColor, name, sex, breed, type, height, weight, furColor,
						age, altered, microchip, vaccinations);
				
				return pet;
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return pet;
	}
	
	/*
	 * This method finds the cage card number in cagecard table. It returns 
	 * an the cageCard number as an int. If the petID can't be found it returns -1.
	 */
	public int findCageNumber(int idNumber){
		String query = "Select * from cagecard where petID = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, idNumber);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				int cageNumber = rs.getInt("cageNumber");
				
				return cageNumber;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
