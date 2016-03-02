/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/20/2016
 * Email
 * Purpose: The purpose of this class is to controller the events that are produced by 
 * the LoginGUI.fxml. This class can either login in the user or clear the text fields.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML private TextField usernameField;
	@FXML private PasswordField passwordField;
		 
	
	@FXML
	public void handleClearButton(ActionEvent event){
		usernameField.clear();
		passwordField.clear();
	}
	
	@FXML
	public void handleLoginButton(ActionEvent event){
		usernameField.getText();
		passwordField.getText();
		
		System.out.println("You loged in.");
	}
	/*
	public boolean searchDbUsername(){
		
	}
	*/
}
