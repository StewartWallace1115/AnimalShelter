/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/1/2016
 * Email: swallace3644@g.fmarion.edu
 * 		
 * Purpose:This program implements the animal shelter project that was designed in CS313.
 */
 

	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class AnimalShelterDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("LoginGUI.fxml"));
			
		    Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
