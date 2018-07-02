/*
 * Name: Stewart Wallace
 * Date: 4/10/15
 * Purpose: The class controls the user manager gui. It can bring up add user gui, 
 * delete user gui or modify user gui.
 */

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class UsersManagerController{
	@FXML TableView<User> tableUser;
	
	@FXML
	public void handleAddUserButtonClick(ActionEvent ae){
		
		Stage addUser = new Stage();
		
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("addUserGUI.fxml"));
			Scene scene = new Scene(root,740,600);
			addUser.setScene(scene);
			addUser.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	public void handleDeleteUserButtonClick(ActionEvent ae){
		
		Stage deleteUser = new Stage();
		
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("deleteUserGUI.fxml"));
			Scene scene = new Scene(root,740,600);
			deleteUser.setScene(scene);
			deleteUser.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	public void handleModifyUserButtonClick(ActionEvent ae){
		
		Stage modifyUser = new Stage();
		
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("modifyUserGUI.fxml"));
			Scene scene = new Scene(root,740,600);
			modifyUser.setScene(scene);
			modifyUser.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	public void handleDisplayUsersButton(ActionEvent ae){
		
		Stage displayUser = new Stage();

		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("displayUserGUI.fxml"));
			Scene scene = new Scene(root, 740, 600);
			displayUser.setScene(scene);
			displayUser.show();
			
			//tableUser.getItems().setAll(col)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated catch block
			
		
	}
	
}
