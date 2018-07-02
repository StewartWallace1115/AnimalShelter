
/*
 * Name: Stewart Wallace
 * Date: 2/16/2016
 * email: swallace3644@g.fmarion.edu
 * 
 * Purpose: Create a general database class that connects to the database. Other 
 * database boundary classes will use this class to connect to the database.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	  private String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	  private String MYSQL_URL = "jdbc:mysql://localhost:3306/animalshelter?useSSL=false";
	  private String user = "root";
	  private String password = "cs313drive";
	  private Connection con;
	  

	  public Connection MySqlConnection() {

	    try {
	      Class.forName(MYSQL_DRIVER);
	      
	      con = DriverManager.getConnection(MYSQL_URL,user,password);
	      
	      return con;
	      

	    } catch(ClassNotFoundException ex) {
	       System.out.println("ClassNotFoundException:\n"+ex.toString());
	       ex.printStackTrace();

	    } catch(SQLException ex) {
	        System.out.println("SQLException:\n"+ex.toString());
	        ex.printStackTrace();
	    }
		return con;
	  }
}
