/*
 * Name: Stewart Wallace
 * Date: 4/11/16
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class creates the modifyUserGUI form.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ModifyUserController {
	@FXML TextField oldUsernameText;
	@FXML TextField oldPasswordText;
	@FXML TextField newUsernameText;
	@FXML TextField newPasswordText;
	@FXML TextField reenterNewPasswordText;
	
	@FXML 
	public void handleModifyButtonClick(ActionEvent ae){
		String oldUsername        = oldUsernameText.getText();
		String oldPassword        = oldPasswordText.getText();
		String newUsername        = newUsernameText.getText();
		String newPassword 		  = newPasswordText.getText();
		String reenterNewPassword = reenterNewPasswordText.getText();
		
		if(reenterNewPassword.equals(newPassword)){
			User oldUser = new User(oldUsername, oldPassword);
			User newUser = new User(newUsername, newPassword);
			
			UserDatabase userDB = new UserDatabase(oldUser);
			userDB.modifyUser(newUser);
		}
	}
}
