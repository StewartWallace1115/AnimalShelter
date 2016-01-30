import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnimalShelterDemo {

	public static void main(String[] args) {
		try {
		    @SuppressWarnings("unused")
			Connection conn;
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306"
		    		+ "/?user=root&password=cs313drive&useSSL=false");


		  
		} catch (SQLException ex) {
		   
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}


	}

}
