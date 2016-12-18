/*
 * Name: Stewart Wallace
 * Date: 3/23/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class is a boundry class for the cagecard table. This class can insert
 * data into the table, gets the last petID and returns cagecard number.
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CageCardDatabase {
	Database database = new Database();
	Connection conn = database.MySqlConnection();
	CageCard cageCard;
	
	/*
	 * Constructor that accepts a CageCard object.
	 */
	CageCardDatabase(CageCard cageCard){
		this.cageCard = cageCard;
	}
	
	/*
	 * Default constructor for the class. Sets cageCard to null.
	 */
	CageCardDatabase(){
		cageCard = null;
	}
	
	/*
	 * This method inserts a CageCard object into the cagecard table.
	 */
	public void insert(){
		String query = "Insert into cagecard (petID, cageNumber, arrivalDate, avalibleForAdoption) VALUES"
				+ "(?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, cageCard.getPetID());
			ps.setInt(2, cageCard.getCageNumber());
			
			ps.setDate(3, new java.sql.Date(cageCard.getArrivalDate().getTime()));
			ps.setDate(4, new java.sql.Date(cageCard.getDateAvalibleForAdoption().getTime()));
			
			
			ps.execute();
		} catch (SQLException e) {
			Parent rootMain;
			
			try {
				
				rootMain = FXMLLoader.load(getClass().getClassLoader().getResource("SQLExceptionGUI.fxml"));
				Scene mainMenuScene = new Scene(rootMain,800,800);
				Stage secondaryStage = new Stage();
				
				secondaryStage.setScene(mainMenuScene);
				secondaryStage.show();
			} catch (IOException ex) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * This method returns the id of the last row in the pet class.
	 */
	public int getPetId(){
		PreparedStatement ps;
		String query = "select * from pet";
		try {
			ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			ResultSet rset = ps.executeQuery();
			 ArrayList<Integer> petID = new ArrayList<>();
	          while (rset.next()) {
	        	  int id = rset.getInt("id");
	        	  petID.add(id);
	          }
	          
	          return petID.get(petID.size()-1);
		} catch (SQLException e) {
			Parent rootMain;
			
			try {
				
				rootMain = FXMLLoader.load(getClass().getClassLoader().getResource("SQLExceptionGUI.fxml"));
				Scene mainMenuScene = new Scene(rootMain,800,800);
				Stage secondaryStage = new Stage();
				
				secondaryStage.setScene(mainMenuScene);
				secondaryStage.show();
			} catch (IOException ex) {
				e.printStackTrace();
			}
		}
		return -1;
				
	}
	
	/*
	 * This method returns the cageCard from the pet class.
	 */
	public int getCageCardNumber(){
		PreparedStatement ps;
		String query = "select * from pet";
		try {
			ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			ResultSet rset = ps.executeQuery();
			 ArrayList<Integer> petID = new ArrayList<>();
	          while (rset.next()) {
	        	  int cageCardNumber = rset.getInt("cageCardNumber");
	        	  petID.add(cageCardNumber);
	          }
	          
	          return petID.get(petID.size()-1);
		} catch (SQLException e) {
			Parent rootMain;
			
			try {
				
				rootMain = FXMLLoader.load(getClass().getClassLoader().getResource("SQLExceptionGUI.fxml"));
				Scene mainMenuScene = new Scene(rootMain,800,800);
				Stage secondaryStage = new Stage();
				
				secondaryStage.setScene(mainMenuScene);
				secondaryStage.show();
			} catch (IOException ex) {
				e.printStackTrace();
			}
		}
		return -1;
		
	}
}
