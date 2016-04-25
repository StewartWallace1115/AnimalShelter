/*
 * Name: Stewart Wallace
 * Date: 4/11/16
 * email: swallace3644@g.fmarion.edu
 * Purpose: The creates the deleteUserGUI form.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DeleteUserController {
	@FXML TextField usernameText;
	@FXML TextField passwordText;
	@FXML TextField reenterPasswordText;
	
	@FXML
	public void handleDeleteButtonClick(ActionEvent ae){
		String userName 	   = usernameText.getText();
		String password		   = passwordText.getText();
		String reenterPassword = reenterPasswordText.getText();
		
		if(password.equals(reenterPassword)){
			User user = new User(userName, password);
			UserDatabase userDb = new UserDatabase(user);
			if(userDb.userExists()){
				userDb.deleteUser();
			}
		}
		
		
	}
}
