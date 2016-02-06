/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/1/2016
 * Email: swallace3644@g.fmarion.edu
 * 		
 * Purpose:This program implements the animal shelter project that was designed in CS313.
 */
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
