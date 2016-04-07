import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainMenuController {
	
	ImageView image = new ImageView("rsz_1animaldisposition.jpg");
	
	Image disposition = new Image(getClass().getResourceAsStream("rsz_1animaldisposition.jpg"));
	private Button searchByButton = new Button("animal diposition",new ImageView(disposition));
	
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
	
}
