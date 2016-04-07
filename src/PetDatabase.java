import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Name: Stewart Wallace
 * Date: 2/17/2016
 * email: swallace3644@g.fmarion.edu
 * 
 * Purpose: Boundary class to interact with the database for the animal class.
 */
public class PetDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	Pet pet;
	CageCard cageCard;
	PetDatabase(Pet pet, CageCard cageCard){
		this.pet = pet;
		this.cageCard = cageCard;
	}
	public void insert(){
		String query = "INSERT INTO pet(name, eyeColor, sex, type, breed, height, weight, "
				+ "age, furColor, cageCardNumber, altered, microchip, vaccinations)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			
			prepareStatement.setString(1, pet.getName());
			prepareStatement.setString(2, pet.getEyeColor());
			prepareStatement.setString(3, pet.getSex());
			prepareStatement.setString(4, pet.getAnimalType());
			prepareStatement.setString(5, pet.getAnimalBreed());
			prepareStatement.setString(6, pet.getHeight());
			prepareStatement.setString(7, pet.getWeight());
			prepareStatement.setInt(8, pet.getAge());
			prepareStatement.setString(9, pet.getFurColor());
			prepareStatement.setInt(10, cageCard.getCageNumber());
			prepareStatement.setBoolean(11, pet.isSpayedNeutered());
			prepareStatement.setBoolean(12, pet.haveMicrochip());
			prepareStatement.setBoolean(13, pet.isVaccinationsCurrent());
			
			
			prepareStatement.execute();
			 
			ResultSet rset = prepareStatement.getGeneratedKeys();
			 int i = 0;
	           while (rset.next()) {

	           i = rset.getInt(1);

	           System.out.println("key=" + i);

	            }
	           cageCard.setPetID(i);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
