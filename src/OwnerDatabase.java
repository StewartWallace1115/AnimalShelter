import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OwnerDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	Owner owner;
	
	OwnerDatabase(Owner owner){
		this.owner = owner;
	}
	
	OwnerDatabase(){
		
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
	
	public void insertReason(String reason){
		String query = "INSERT INTO owner(name, address, zipcode, phone, city,"
				+ "state, emailAddress, reason)  VALUES ( ?, ? , ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
			prepareStatement.setString(1, owner.getName());
			prepareStatement.setString(2, owner.getAddress());
			prepareStatement.setInt(3, owner.getZip());
			prepareStatement.setString(4, owner.getPhoneNumber());
			prepareStatement.setString(5, owner.getCity());
			prepareStatement.setString(6, owner.getState());
			prepareStatement.setString(7, owner.getEmail());
			prepareStatement.setString(8, reason);
			
			prepareStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Owner lastOwner(){
		String query = "Select * from owner order by id desc limit 1";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				String name = rs.getString("name");
				String address = rs.getString("address");
				int zip = rs.getInt("zipcode");
				String phone = rs.getString("phone");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String email = rs.getString("emailAddress");
				
				
				owner = new Owner(name, address, zip, phone,city, state,email);
				
				return owner;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return owner;
		
	}
}
