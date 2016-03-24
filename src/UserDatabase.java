import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Name: Stewart Walalce
 * Date: 3/2/2016
 * Purpose: This class is the boundary class for the user's table. It retrieves 
 * the userName and password. It also checks if the username exist.
 */
public class UserDatabase {
	Database database = new Database();
	Connection con = database.MySqlConnection();
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
			PreparedStatement st = con.prepareStatement(query);
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
}
