import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OwnerDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	Owner owner;
	
	OwnerDatabase(Owner owner){
		this.owner = owner;
	}
	
	public void insert(){
		String query = "INSERT INTO owner(name, address, zipcode, phone, city,"
				+ "state, emailAddress)  VALUES ( ?, ? , ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
			prepareStatement.setString(1, owner.getName());
			prepareStatement.setString(2, owner.getAddress());
			prepareStatement.setInt(3, owner.getZip());
			prepareStatement.setString(4, owner.getPhoneNumber());
			prepareStatement.setString(5, owner.getCity());
			prepareStatement.setString(6, owner.getState());
			prepareStatement.setString(7, owner.getEmail());
			
			prepareStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
