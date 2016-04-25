import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReclaimationDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	Pet pet = new Pet();
	ReclaimationDatabase(){
		
	}
	
	public Pet searchIDPet(int idNumber){
		
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
	
	public Pet searchCageNumber(int cageCardNumber){
		String query = "select * from cagecard where cageNumber = ?";
		int petID = -1;		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, cageCardNumber);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				petID = rs.getInt("petID");
				
			}
			
			pet = searchIDPet(petID);
			
			return pet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pet;
		
	}
	
	public Pet searchName(String name){
		String query = "select * from pet where name = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			
				while(rs.next()){
					
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
	
	public Pet dataAvaible(String date){
		String query = "Select * from cagecard where arrivalData = ?";
		int id = -1;	
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				id = rs.getInt("petID");
			}
			
			return searchIDPet(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pet;
		
	}
	
	public LiveStock searchVetID(int vetNumber){
		String query = "Select * from liveStock where vetID = ?";
		
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				String name 	= rs.getString("name");
				String eyeColor = rs.getString("eyeColor");
				String sex		= rs.getString("sex");
				String type 	= rs.getString("type");
				String breed 	= rs.getString("breed");
				String height 	= rs.getString("height");
				String weight 	= rs.getString("weight");
				int    age	    = rs.getInt("age");
				String furColor = rs.getString("furColor");
				
				LiveStock liveStock = new LiveStock(name, eyeColor, sex, type, breed, height, weight, age, furColor);
				return liveStock;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
