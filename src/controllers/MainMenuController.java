/*
 * Name: Stewart Wallace
 * Date: 1/31/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class controls the mainmenu GUI. It calls different GUI class depending 
 * on what the user selects. 
 */

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainMenuController {
	
	ImageView image = new ImageView("rsz_1animaldisposition.jpg");
	
	Image disposition = new Image(getClass().getResourceAsStream("rsz_1animaldisposition.jpg"));
	
	
	@FXML
	void handleDispositionForm(ActionEvent event){
		Stage disposition = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("DispositionSearchGUI.fxml"));
			Scene scene = new Scene(root,800,800);
			disposition.setScene(scene);
			disposition.show();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML 
	void handleReclaimationFormButton(ActionEvent event){
		Stage reclaimation = new Stage();
		
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ReclaimationFormGUI.fxml"));
			Scene scene = new Scene(root, 800,800);
			reclaimation.setScene(scene);
			reclaimation.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	void handleIntakeFormButton(ActionEvent event){
		Stage intake = new Stage();
		
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("IntakeFormGUI.fxml"));
			Scene scene = new Scene(root,740,600);
			intake.setScene(scene);
			intake.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	void handleUserManagementButton(ActionEvent ae){
		Stage userManagement = new Stage();
		
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("UserManagementGUI.fxml"));
			Scene scene = new Scene(root,740,600);
			userManagement.setScene(scene);
			userManagement.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
