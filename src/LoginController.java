/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/20/2016
 * Email
 * Purpose: The purpose of this class is to controller the events that are produced by 
 * the LoginGUI.fxml. This class can either login in the user or clear the text fields.
 */

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML private TextField usernameField;
	@FXML private PasswordField passwordField;
	@FXML private Label loginLabel;
	@FXML private CheckBox checkBox;
	@FXML private TextField textField;
	
	
    @FXML
	public void handleClearButton(ActionEvent event){
		usernameField.clear();
		passwordField.clear();
		loginLabel.setText("");
	}
	
	@FXML
	public void handleLoginButton(ActionEvent event){
		
		usernameField.getText();
		passwordField.getText();
		
		String username = usernameField.getText();
		String password = passwordField.getText();
		
		User user = new User(username, password);
		UserDatabase userDB = new UserDatabase(user);
		
		
		if(userDB.userExists()){
			Parent rootMain;
			
			
		    try {
				Stage stage = (Stage) usernameField.getScene().getWindow();
			    stage.close();
				rootMain = FXMLLoader.load(getClass().getClassLoader().getResource("MainMenuGUI.fxml"));
				Scene mainMenuScene = new Scene(rootMain,800,800);
				Stage secondaryStage = new Stage();
				
				secondaryStage.setScene(mainMenuScene);
				secondaryStage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else{
			loginLabel.setText("Sorry username or password is wrong. Please, try again.");
		}
	}
	
	
}
