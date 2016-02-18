import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Name: Stewart Wallace
 * Date: 2/17/2016
 * email: swallace3644@g.fmarion.edu
 * 
 * Purpose: Boundary class to interact with the database for the animal class.
 */
public class PetDatabaseClass {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	Pet pet;
	
	PetDatabaseClass(Pet pet){
		this.pet = pet;
	}
	public void insert(){
		String query = "INSERT INTO pet(eyeColor, sex, height, weight, furColor,"
				+ "animalType, microChip, altered) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
			prepareStatement.setString(1, pet.getEyeColor());
			prepareStatement.setString(2, pet.getSex());
			prepareStatement.setString(3, pet.getHeight());
			prepareStatement.setString(4, pet.getWeight());
			prepareStatement.setString(5, pet.getFurColor());
			prepareStatement.setString(6, pet.getAnimalType());
			prepareStatement.setBoolean(7, pet.haveMicrochip());
			prepareStatement.setBoolean(8, pet.isSpayedNeutered());
			
			prepareStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
