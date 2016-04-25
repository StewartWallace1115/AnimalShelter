/*
 * Name: Stewart Walalce
 * Date: 3/2/2016
 * Purpose: This class is the boundary class for the user's table. It retrieves 
 * the userName and password. It also checks if the username exist.
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	User user;
	
	UserDatabase(User user){
		this.user = user;
	}
	
	/*
	 * This method checks to see if the user exists in the database. If the user
	 * exists then the it returns true else it returns false.
	 */
	boolean userExists(){
		String username = user.getUserName();
		String password = user.getPassword();
		try {
			String query = "SELECT username from user WHERE username=? and password = ?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1,username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
				return true;
			
			else return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public void addUser(){
		String query = "INSERT INTO user(username, password) VALUES (?, ?)";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
			prepareStatement.setString(1, user.getUserName());
			prepareStatement.setString(2, user.getPassword());
			
			
			prepareStatement.execute();
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteUser(){
		String query = "Delete from user where username = ?";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
			prepareStatement.setString(1, user.getUserName());
			
			prepareStatement.execute();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modifyUser(User newUser){
		String query = "Update user set username = ?, password = ? where username = ?";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(query);
			
			prepareStatement.setString(1, newUser.getUserName());
			prepareStatement.setString(2, newUser.getPassword());
			prepareStatement.setString(3, user.getUserName());
			
			prepareStatement.execute();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
