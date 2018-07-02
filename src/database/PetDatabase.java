import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Name: Stewart Wallace
 * Date: 2/17/2016
 * email: swallace3644@g.fmarion.edu
 * 
 * Purpose: Boundary class to interact with the database for the pet class.
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
	
	PetDatabase(){
		
	}
	public void insert(){
		String query = "INSERT INTO pet(name, eyeColor, sex, type, breed, height, weight, "
				+ "age, furColor, cageCardNumber, altered, microchip, vaccinations)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
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
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public Pet searchID(int petID){
		String query = "Select * from pet where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, petID);
			
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
	
	public void deletePet(int petID){
		String query = "Delete from users where username = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, petID);
			ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
