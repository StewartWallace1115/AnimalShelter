
/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/16/2016
 * email: swallace3644@g.fmarion.edu
 * 
 * Purpose: Create a superclass for database classes. 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public Connection connecting() {
		try {

			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306" + "/?user=root&password=cs313drive&useSSL=false");
			return conn;

		} catch (SQLException ex) {

			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return null;
	}

}
