/*
 * Name: Stewart Wallace
 * Date: 4/11/16
 * Email: swallace3644@g.fmarion.edu
 * Purpose: This class controls addusergui. It allows users to insert new users
 * into system.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddUserController {
	@FXML TextField usernameText;
	@FXML TextField passwordText;
	@FXML TextField reenterPasswordText;
	
	@FXML
	public void handleAddButtonClick(ActionEvent ae){
		String userName 	   = usernameText.getText();
		String password		   = passwordText.getText();
		String reenterPassword = reenterPasswordText.getText();
		
		if(password.equals(reenterPassword)){
			User user = new User(userName, password);
			
			UserDatabase userDb = new UserDatabase(user);
			userDb.addUser();
		}
	}
	
}
